package hello;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "order", path = "order")
public interface PersonRepository2 extends PagingAndSortingRepository<Order, Long> {

	List<Person> findByLastName(@Param("name") String name);

}
