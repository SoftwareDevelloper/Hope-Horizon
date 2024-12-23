package org.example.steamcloneproject.Controlleur;

import org.example.steamcloneproject.Model.Games;
import org.example.steamcloneproject.ServiceImplement.GamesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Games")
public class GameControlleur
{
    @Autowired
    private GamesServiceImpl gamesService;

    @GetMapping("/getAllGames")
    public List<Games> getAllGames()
    {
        return gamesService.GetAllGames();
    }
    @GetMapping("/Getgamesbyid/{id}")
    public  Games getGamesByid(@PathVariable Long id)
    {
        return gamesService.GetGameById( id);
    }
    @PostMapping("/AddGames")
    public Games AddGames(@RequestBody Games games)
    {
        return  gamesService.AddGame(games);
    }
    @PutMapping("/UpdateGame/{id}")
    public ResponseEntity<Games>  updateGames(@RequestBody Games games, @PathVariable Long id)
    {
        Games existinggames = gamesService.GetGameById(id);
       if (existinggames != null)
       {
           existinggames.setTitle(existinggames.getTitle());
           existinggames.setDescription(existinggames.getDescription());
           existinggames.setCategory(existinggames.getCategory());
           existinggames.setDate(existinggames.getDate());
           existinggames.setEdition(existinggames.getEdition());
           existinggames.setDevelopment(existinggames.getDevelopment());
           existinggames.setImage(existinggames.getImage());
           existinggames.setLinkdownload(existinggames.getLinkdownload());
           existinggames.setEvals(existinggames.getEvals());

           Games savedGames = gamesService.UpdateGame(existinggames);

           return ResponseEntity.ok(savedGames);


       }
       else
       {
           return ResponseEntity.notFound().build();
       }
    }
    @DeleteMapping("/DeleteGames/{id}")
    public ResponseEntity<?> deleteGames(@PathVariable Long id)
    {
        Games games = gamesService.GetGameById(id);
        if (games != null)
        {
            return ResponseEntity.ok("Game deleted successfully");
        }
        else
        {
            return ResponseEntity.notFound().build();

        }
    }

}
