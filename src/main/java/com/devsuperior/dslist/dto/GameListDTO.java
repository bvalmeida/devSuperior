package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entity.GameList;
import lombok.Getter;

@Getter
public class GameListDTO {

    private Long id;

    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList gameList){
        this.id = gameList.getId();
        this.name = gameList.getName();
    }
}
