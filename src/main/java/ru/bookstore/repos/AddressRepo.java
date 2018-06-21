package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.AddressEntity;

public interface AddressRepo extends CrudRepository<AddressEntity, Long> {
    AddressEntity findFirstByOrderByIdDesc();
}
