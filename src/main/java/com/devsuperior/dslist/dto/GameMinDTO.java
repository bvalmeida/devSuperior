package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entity.Game;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

    private Long id;

    private String title;

    private Integer year;

    private String imgUrl;

    private String shortDescription;

    public GameMinDTO(Game entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
