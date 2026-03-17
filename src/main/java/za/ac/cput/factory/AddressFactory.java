package za.ac.cput.factory;

import za.ac.cput.domain.Address;

public class AddressFactory
{
    public static Address CreateFactory(String addressId,String streetName,String suburb,String city,String postalCode){
        return new Address.Builder().
                AddressId(addressId).
                StreetName(streetName).
                Suburb(suburb).
                City(city)
                .postalCode(postalCode).build();
    }

}

