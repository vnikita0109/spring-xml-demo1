package com.stackroute.domain;

public class Movie {

    private String movieName;
    private Actor actor;
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Movie() {
    }
    public Movie(Actor actor){
        this.actor=actor;
    }
    public Movie(String movieName, Actor actor) {
        this.movieName = movieName;
        this.actor = actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }
}
