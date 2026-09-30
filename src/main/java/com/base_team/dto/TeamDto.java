package com.base_team.base_team.dto;

import com.base_team.base_team.model.TeamModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class TeamDto {

    private Integer id;
    private String name;
    private String headquarter;
    private int playerNumber;
    private String coach;
    private String captian;

    public TeamModel toModel() {
        return TeamModel.builder()
            .id(this.id)
            .name(this.name)
            .headquarter(this.headquarter)
            .playerNumber(this.playerNumber)
            .coach(this.coach)
            .captian(this.captian)
            .build();
    }
}
