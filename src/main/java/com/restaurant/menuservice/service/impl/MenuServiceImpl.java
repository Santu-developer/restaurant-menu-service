package com.restaurant.menuservice.service.impl;

import com.restaurant.menuservice.dto.MenuResponse;
import com.restaurant.menuservice.mapper.MenuMapper;
import com.restaurant.menuservice.model.MenuItem;
import com.restaurant.menuservice.repository.MenuRepository;
import com.restaurant.menuservice.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implements Menu business logic.
 */

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapper menuMapper;

    @Override
    public MenuResponse getMenu(Long id) {

        MenuItem menuItems = menuRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu item not found"));

        return menuMapper.toResponse(menuItems);
    }

    @Override
    public List<MenuResponse> getAllMenus() {

        return menuRepository.findAll()
                .stream()
                .map(menuMapper::toResponse)
                .collect(Collectors.toList());
    }
}