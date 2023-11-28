package services;

import models.Stone;

import java.util.List;

public interface PlayerService {
    Stone generateMove(List<Stone> prevMoves);
}
