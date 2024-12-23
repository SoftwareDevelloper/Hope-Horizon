package org.example.steamcloneproject.ServiceImplement;

import jakarta.transaction.Transactional;
import org.example.steamcloneproject.Model.Games;
import org.example.steamcloneproject.Repository.GamesRepo;
import org.example.steamcloneproject.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GamesServiceImpl implements GamesService
{
    @Autowired
    private GamesRepo repo;

    @Override
    public Games AddGame(Games game) {
        return repo.save(game);
    }

    @Override
    public Games UpdateGame(Games game) {
        return  repo.save(game);
    }

    @Override
    public void DeleteGame(Games game) {
        repo.delete(game);
    }

    @Override
    public List<Games> GetAllGames() {
        return repo.findAll();
    }

    @Override
    public Games GetGameById(Long id) {
        return repo.findById(id).get();
    }
}
