package jobsite.repository;

import java.util.List;

import jobsite.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customers")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(@Param("lastName") String lastName);
}
