package jobsite.projection;

import jobsite.model.Customer;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by user on 6/13/2016.
 */
@Projection(name="customerProjection", types={Customer.class})
public interface CustomerProjection {
    public Long getId();
    public Long getFirstName();
    public Long getLastName();
}

