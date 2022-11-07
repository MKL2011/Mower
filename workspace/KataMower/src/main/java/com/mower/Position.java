package com.mower;

public record Position(Coordinates coordinates, Direction direction) {

    public Position(Coordinates coordinates, com.mower.Direction direction) {
        this.coordinates = coordinates;
        this.direction = direction;
    }

    @Override
    public Coordinates coordinates() {
        return coordinates;
    }

    @Override
    public Direction direction() {
        return direction;
    }

    public void turnRight() {

    }

    public void turnLeft() {
    }

    public void goForward() {

    }
}
