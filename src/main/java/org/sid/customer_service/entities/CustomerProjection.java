package org.sid.customer_service.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="fullCustomer",types = Customer.class)
/*TODO: add restcontrolller ou graphql*/
public interface CustomerProjection {
    public Long getId();
    public String getName();
    public String getEmail();

}
