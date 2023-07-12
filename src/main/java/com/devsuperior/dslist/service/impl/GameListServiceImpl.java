package com.devsuperior.dslist.service.impl;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entity.GameList;
import com.devsuperior.dslist.repository.GameListRepository;
import com.devsuperior.dslist.service.GameListService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListServiceImpl implements GameListService {

    private final GameListRepository gameListRepository;

    public GameListServiceImpl(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameListAll = this.gameListRepository.findAll();
        return gameListAll.stream().map(gameList -> new GameListDTO(gameList)).toList();
    }
}
