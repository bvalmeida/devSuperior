package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;

import java.util.List;

public interface GameService {

    List<GameMinDTO> findAllGames();

    GameDTO findById(Long id);

    List<GameMinDTO> findByList(Long listId);

}
