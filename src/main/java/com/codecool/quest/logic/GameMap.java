package com.codecool.quest.logic;

import com.codecool.quest.logic.actors.Ghost;
import com.codecool.quest.logic.actors.Giant;
import com.codecool.quest.logic.actors.Player;
import com.codecool.quest.logic.actors.Skeleton;
import com.codecool.quest.logic.items.*;

public class GameMap {
    private int width;
    private int height;
    private Cell[][] cells;

    private Player player;
    private Skeleton skeleton;
    private Ghost ghost;
    private Giant giant;
    private Sword sword;
    private Heart heart;
    private DoorKey doorKey;
    private Door door;
    private BlueDoor blueDoor;
    private BlueDoorKey blueDoorKey;

    public GameMap(int width, int height, CellType defaultCellType) {
        this.width = width;
        this.height = height;
        cells = new Cell[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                cells[x][y] = new Cell(this, x, y, defaultCellType);
            }
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setSkeleton(Skeleton skeleton) {
        this.skeleton = skeleton;
    }

    public void setGhost(Ghost ghost) {
        this.ghost = ghost;
    }

    public void setGiant(Giant giant) {
        this.giant = giant;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setDoorKey(DoorKey doorKey) {
        this.doorKey = doorKey;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public void setBlueDoor(BlueDoor blueDoor) {
        this.blueDoor = blueDoor;
    }

    public void setBlueDoorKey(BlueDoorKey blueDoorKey) {
        this.blueDoorKey = blueDoorKey;
    }

    public Player getPlayer() {
        return player;
    }

    public Skeleton getSkeleton() {
        return skeleton;
    }

    public Sword getSword() {
        return sword;
    }

    public Heart getHeart() {
        return heart;
    }

    public DoorKey getDoorKey() {
        return doorKey;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
