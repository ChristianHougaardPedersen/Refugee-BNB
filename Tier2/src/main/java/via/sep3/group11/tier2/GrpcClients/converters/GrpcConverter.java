package via.sep3.group11.tier2.GrpcClients.converters;

import via.sep3.group11.tier2.protobuf.*;
import via.sep3.group11.tier2.shared.domain.*;
import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import java.util.Optional;

public class GrpcConverter {

    public static Host hostFromGrpc(GHost grpcHost) throws ValidationException {
        return new Host(grpcHost.getFirstName(),
                grpcHost.getEmail(),
                grpcHost.getPassword(),
                grpcHost.getGender().charAt(0),
                grpcHost.getNationality(),
                Optional.of(grpcHost.getMiddleName()),
                grpcHost.getLastName(),
                new Date(grpcHost.getDateOfBirth().getDay(),grpcHost.getDateOfBirth().getMonth(),
                grpcHost.getDateOfBirth().getYear()));
                //TODO ADD Housing
    }

    public static GHost hostToGrpc(Host host) {
            return GHost.newBuilder()
                    .setFirstName(host.getFirstName())
                    .setEmail(host.getEmail())
                    .setPassword(host.getPassword())
                    .setGender(String.valueOf(host.getGender()))
                    .setNationality(host.getNationality())
                    .setMiddleName(host.getMiddleName())
                    .setLastName(host.getLastName())
                    .setDateOfBirth(dateToGrpc(host.getDateOfBirth())).build();
                //TODO ADD Housing
    }

    public static GHostDetails HostDetailsToGrpc(Host host) {
        return GHostDetails.newBuilder()
                .setFirstName(host.getFirstName())
                .setEmail(host.getEmail())
                .setPassword(host.getPassword())
                .setGender(String.valueOf(host.getGender()))
                .setNationality(host.getNationality())
                .setMiddleName(host.getMiddleName())
                .setLastName(host.getLastName())
                .setDateOfBirth(dateToGrpc(host.getDateOfBirth()))
                .build();
    }

    public static Host HostDetailsfromGrpc(GHostDetails grpcHostDetails) throws ValidationException
    {
        return new Host(
                grpcHostDetails.getFirstName(),
                grpcHostDetails.getEmail(),
                grpcHostDetails.getPassword(),
                grpcHostDetails.getGender().charAt(0),
                grpcHostDetails.getNationality(),
                Optional.of(grpcHostDetails.getMiddleName()),
                grpcHostDetails.getLastName(),
                DateFromGrpc(grpcHostDetails.getDateOfBirth()));
    }

    public static Refugee refugeeFromGrpc(GRefugee grpcRefugee) throws ValidationException {
        return new Refugee(
                grpcRefugee.getEmail(),
                grpcRefugee.getPassword(),
                grpcRefugee.getGender().charAt(0),
                grpcRefugee.getNationality(),
                grpcRefugee.getFirstName(),
                Optional.of(grpcRefugee.getMiddleName()),
                grpcRefugee.getLastName(),
                dateFromGrpc(grpcRefugee.getDateOfBirth()));
    }

    public static GRefugee refugeeToGrpc(Refugee refugee)
    {
        return GRefugee.newBuilder()
                .setEmail(refugee.getEmail())
                .setPassword(refugee.getPassword())
                .setGender(String.valueOf(refugee.getGender()))
                .setNationality(refugee.getNationality())
                .setFirstName(refugee.getFirstName())
                .setMiddleName(refugee.getMiddleName())
                .setLastName(refugee.getLastName())
                .setDateOfBirth(dateToGrpc(refugee.getDateOfBirth())).build();
    }

    public static GAddress addressToGrpc(Address address)
    {
        return GAddress.newBuilder().setCountry(address.getCountry())
                .setCity(address.getCity()).setStreetName(address.getStreetName())
                .setHouseNumber(address.getHouseNumber()).setRoomNumber(address.getRoomNumber())
                .setPostCode(address.getPostCode()).setId(address.getAddressId()).build();
    }

    public static Address addressFromGrpc(GAddress address) throws ValidationException {
        return new Address(address.getId(), address.getCountry(), address.getCity(),
                address.getStreetName(), address.getHouseNumber(), address.getRoomNumber(),
                address.getPostCode());
    }

    public static Housing housingFromGrpc(GHousing returnedHousing) throws ValidationException {
        return new Housing(returnedHousing.getCapacity(),
                addressFromGrpc(returnedHousing.getAddress()));
    }

    public static GHousing housingToGrpc(Housing housing)
    {
        return  GHousing.newBuilder()
                .setCapacity(housing.getCapacity())
                .setAddress(addressToGrpc(housing.getAddress())).build();
    }

    public static GDateOfBirth dateToGrpc(Date date)
    {
        return GDateOfBirth.newBuilder()
                .setDay(date.getDay())
                .setMonth(date.getMonth())
                .setYear(date.getYear()).build();
    }

    public static Date dateFromGrpc(GDateOfBirth date) throws ValidationException {
        return new Date(date.getDay(), date.getMonth(), date.getYear());
    }

    public static Date DateFromGrpc(GDateOfBirth date) throws ValidationException {
        return new Date(
                date.getDay(),
                date.getMonth(),
                date.getYear());
    }

    public static GAddHousingRequest addHousingRequest(Housing housing, String email)
    {
        return GAddHousingRequest.newBuilder()
                .setHousing(housingToGrpc(housing))
                .setEmail(email).build();
    }

    public static Agreement AgreementWithIdFromGrpc(GAgreement agreement) throws ValidationException {
        return new Agreement(
                agreement.getId(),
                HostDetailsfromGrpc(agreement.getHostDetails()),
                housingFromGrpc(agreement.getHousing()),
                refugeeFromGrpc(agreement.getRefugee()),
                agreement.getStatus());
    }

    public static GAgreement AgreementWithIdToGrpc(Agreement agreement) {
        return GAgreement.newBuilder()
                .setId(agreement.getAgreementId())
                .setHostDetails(HostDetailsToGrpc(agreement.getHost()))
                .setHousing(housingToGrpc(agreement.getHousing()))
                .setRefugee(refugeeToGrpc(agreement.getRefugee()))
                .setStatus(agreement.isAccepted()).build();
    }

    public static GAgreement AgreementToGrpc(Agreement agreement)
    {
        return GAgreement.newBuilder()
                .setRefugee(refugeeToGrpc(agreement.getRefugee()))
                .setHostDetails(HostDetailsToGrpc(agreement.getHost()))
                .setHousing(housingToGrpc(agreement.getHousing()))
                .setStatus(agreement.isAccepted()).build();
    }
}
