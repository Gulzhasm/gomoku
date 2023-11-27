package services;

import models.Stone;

import java.util.List;

public interface PlayerService {
    String getName();

    Stone generateMove(List<Stone> prevMoves);
}
