package com.example.steamclone.Repository;

import com.example.steamclone.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepository extends JpaRepository<Games,Long>
{

}
