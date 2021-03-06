package com.odhiambopaul.beer.inventory.service.web.mappers;

import com.odhiambopaul.beer.inventory.service.domain.BeerInventory;
import com.odhiambopaul.beer.inventory.service.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
