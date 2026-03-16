package com.restaurant.menuservice.service;

import com.restaurant.menuservice.dto.MenuResponse;

import java.util.List;

/**
 * Business contract for menu operations.
 */

public interface MenuService {

    MenuResponse getMenu(Long id);

    List<MenuResponse> getAllMenus();

}