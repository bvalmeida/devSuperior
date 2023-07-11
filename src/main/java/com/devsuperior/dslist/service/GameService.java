package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entity.Game;

import java.util.List;

public interface GameService {

    List<GameMinDTO> findAllGames();

}
