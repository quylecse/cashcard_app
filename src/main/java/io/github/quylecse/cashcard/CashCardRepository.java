package io.github.quylecse.cashcard;

import org.springframework.data.repository.CrudRepository;

interface CashCardRepository extends CrudRepository<CashCard, Long> {
    // This interface is intentionally left blank. It inherits all CRUD operations from CrudRepository.
}