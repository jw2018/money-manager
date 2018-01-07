package com.jw2018.money.manager.MoneyManager.repository;

import com.jw2018.money.manager.MoneyManager.entities.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PositionsRepo extends JpaRepository<Position, Long> {

}
