package com.devsuperior.dslist.service.impl;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.repository.GameRepository;
import com.devsuperior.dslist.service.GameService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        try {
            List<Game> allGames = this.gameRepository.findAll();
            List<GameMinDTO> gameMinDTOList = allGames.stream().map(gameEntity -> new GameMinDTO(gameEntity)).toList();

            return gameMinDTOList;
        }catch(Exception exception){
            throw new RuntimeException("Error when try find all games {} " + exception);
        }

    }

    @Override
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        try{
            Game byId = gameRepository.findById(id).get();
            GameDTO gameDTO = new GameDTO(byId);
            return gameDTO;
        }catch (Exception e){
            throw new RuntimeException("Algum error ocorreu ao buscar o Game por ID {} " + id);
        }
    }
}
