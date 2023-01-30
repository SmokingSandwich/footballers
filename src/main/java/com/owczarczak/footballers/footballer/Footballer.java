package com.owczarczak.footballers.footballer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//TODO Przerobić na listę klubów w któych grał, i niech to będzie encja, i od kiedy do kiedy grał w tych klubach (kontrakt encja)
//TODO DTO - Data Transfer Object
// REpository(wypycha Encję) -> Service(wypycha DTO'sa) ->  Controller(wypycha REsponseEntity z DTO'sem
// Controllery do kontraktu i do klubu
// Dołożyć obsługę meczy (mecz drużyny obie, lista zawodników obu drużyn, lista goli(kto strzelił),
// metody na dodawanie meczu w trakcie meczu, informacja czy był walkover w meczu)
// Dodać metody do Footballera kto strzelił najwięcej bramek, najwięcej bramek dla danego zespołu, lista zespołów które strzelił najwięcej bramek

@Entity
@Table(name = "footballers")
@Getter
@Setter
@AllArgsConstructor
public class Footballer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotBlank
    String pesel;
    @NotBlank
    String name;
    @NotBlank
    String club;
    @NotNull
    int goals;
    @NotNull
    @Min(value = 1, message = "Height of the footballer must be higher than zero !")
    int height;

    public Footballer(final String pesel, final String name, final String club, final int height) {
        this.pesel = pesel;
        this.name = name;
        this.club = club;
        this.height = height;
    }

    public Footballer() {

    }

    public int getId() {
        return id;
    }

    public String getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getClub() {
        return club;
    }

    public int getGoals() {
        return goals;
    }

    public int getHeight() {
        return height;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "id=" + id +
                ", pesel='" + pesel + '\'' +
                ", name='" + name + '\'' +
                ", club='" + club + '\'' +
                ", goals=" + goals +
                ", height=" + height +
                '}';
    }
}
