package ru.bookstore.repos;

import org.springframework.data.repository.CrudRepository;
import ru.bookstore.domain.DeliveryEntity;

public interface DeliveryRepo extends CrudRepository<DeliveryEntity, Long> {
}
