package com.ddd_bootcamp.threetier.controller.resource;

import com.ddd_bootcamp.domain.Customer;

import java.util.UUID;

public class CustomerResource {
    private UUID customerId;
    private AddressData addressData;

    public CustomerResource() {
    }

    public static CustomerResource from(Customer customer) {
        CustomerResource customerResource = new CustomerResource();
        customerResource.setCustomerId(customer.getCustomerId());

        customerResource.setAddressData(AddressData.from(customer.getAddress()));
        return customerResource;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public AddressData getAddressData() {
        return addressData;
    }

    public void setAddressData(AddressData addressData) {
        this.addressData = addressData;
    }

}
