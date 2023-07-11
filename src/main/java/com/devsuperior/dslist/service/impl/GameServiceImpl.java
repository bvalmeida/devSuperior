package com.devsuperior.dslist.service.impl;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.repository.GameRepository;
import com.devsuperior.dslist.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public List<GameMinDTO> findAllGames() {
        try {
            List<Game> allGames = this.gameRepository.findAll();
            List<GameMinDTO> gameMinDTOList = allGames.stream().map(gameEntity -> new GameMinDTO(gameEntity)).toList();

            return gameMinDTOList;
        }catch(Exception exception){
            throw new RuntimeException("Error when try find all games {} " + exception);
        }

    }
}
