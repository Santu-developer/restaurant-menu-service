package com.restaurant.menuservice.controller;

import com.restaurant.menuservice.dto.MenuResponse;
import com.restaurant.menuservice.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST APIs for Menu Service.
 * These APIs will be consumed by Order Service.
 */

@RestController
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    /**
     * Get menu item by id
     */
    @GetMapping("/{id}")
    public MenuResponse getMenu(@PathVariable Long id) {
        return menuService.getMenu(id);
    }

    /**
     * Get all menu items
     */
    @GetMapping
    public List<MenuResponse> getAllMenus() {
        return menuService.getAllMenus();
    }
}