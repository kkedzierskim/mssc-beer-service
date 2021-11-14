package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<BeerDto, UUID> {
}
