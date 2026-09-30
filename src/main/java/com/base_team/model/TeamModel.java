package com.base_team.base_team.model;

import com.base_team.base_team.dto.TeamDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TeamModel
 */
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
@Entity
@Table(name = "team")
public class TeamModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id ;
	@Column(name = "name", columnDefinition = "varchar(80)")
	private String name; 
	@Column(name = "headquarter", columnDefinition = "varchar(80)")
	private String headquarter;
    @Column(name = "playerNumber", columnDefinition = "int")
	private int playerNumber; 
	@Column(name = "coach", columnDefinition = "varchar(80)")
	private String coach;
	@Column(name = "captian", columnDefinition = "varchar(80)") 
	private String captian; 
 public TeamDto toDto() {
        return TeamDto.builder()
            .id(this.id)
            .name(this.name)
            .headquarter(this.headquarter)
            .playerNumber(this.playerNumber)
            .coach(this.coach)
            .captian(this.captian)
            .build();
    }
}