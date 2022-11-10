package com.example.mower;

public record Position(Coordinates coordinates, Direction direction) {

    public Position(Coordinates coordinates, Direction direction) {
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

    public Position turnRight() {
        return switch (direction) {
            case NORTH -> new Position(this.coordinates,Direction.EAST);
            case EAST -> new Position(this.coordinates,Direction.NORTH);
            case SOUTH -> new Position(this.coordinates,Direction.EAST);
            case WEST -> new Position(this.coordinates,Direction.SOUTH);
        };
    }

    public Position turnLeft() {
        return switch (direction) {
            case NORTH -> new Position(this.coordinates,Direction.WEST);
            case EAST -> new Position(this.coordinates,Direction.NORTH);
            case SOUTH -> new Position(this.coordinates,Direction.EAST);
            case WEST -> new Position(this.coordinates,Direction.SOUTH);
        };
    }

    public void goForward() {

    }
}
