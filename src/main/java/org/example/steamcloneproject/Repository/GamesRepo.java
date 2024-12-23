package org.example.steamcloneproject.Repository;

import org.example.steamcloneproject.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepo extends JpaRepository<Games, Long>
{
}
