package com.restaurant.menuservice.mapper;

import com.restaurant.menuservice.dto.MenuResponse;
import com.restaurant.menuservice.model.MenuItem;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper {

    MenuResponse toResponse(MenuItem menuItem);

}