package org.example.steamcloneproject.Service;

import jakarta.transaction.Transactional;
import org.example.steamcloneproject.Model.Games;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public interface GamesService
{
    public Games AddGame(Games game);
    public Games UpdateGame(Games game);
    public void DeleteGame(Games game);
    public List<Games> GetAllGames();
    public Games GetGameById(Long id);
}
