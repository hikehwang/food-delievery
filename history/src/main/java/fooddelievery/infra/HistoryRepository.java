package fooddelievery.infra;

import fooddelievery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="histories", path="histories")
public interface HistoryRepository extends PagingAndSortingRepository<History, Long> {

    

    
}
