package com.jw2018.money.manager.MoneyManager;

import com.jw2018.money.manager.MoneyManager.entities.Position;
import com.jw2018.money.manager.MoneyManager.repository.PositionsRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

/**
 * MoneyManager application
 * Test commit 2
 * only dev branch local
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MoneyManagerApplicationTests {

    @Autowired
    PositionsRepo positionsRepo;

    @Test
    public void RepositoryTest() {

        // BigDecimal b = new BigDecimal("100000.12").
        //          add(new BigDecimal("100000.31"));
        // String euro = NumberFormat.getCurrencyInstance
        //       ().format(b) //Richtig:  20.000,43 €

        // Amount1
        BigDecimal a = new BigDecimal("10.50");
        BigDecimal b = new BigDecimal("5.50");

        // String eur = NumberFormat.getCurrencyInstance().format(a);

        Position p1 = new Position();
        p1.setAmount(a);

        Position p2 = new Position();
        p2.setAmount(b);

        positionsRepo.save(p1);
        positionsRepo.save(p2);


        List<Position> positionsFromRepo = positionsRepo.findAll();

        for (Position x : positionsFromRepo) {
            System.out.println(x.getId() + " => " + x.getAmount());
            System.out.println(NumberFormat.getCurrencyInstance().format(x.getAmount()));
        }

    }

}
