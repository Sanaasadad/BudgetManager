package com.Budget.Manager.app.Mapper;



import com.Budget.Manager.app.DTO.TransactionsDto;
import com.Budget.Manager.app.Entity.Transactions;

import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionsDto toDTO(Transactions transaction);

    @Mapping(target = "categorie.idCategorie", source = "idCategorie")
    Transactions toEntity(TransactionsDto dto);
}


