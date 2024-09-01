package lk.ijse.classroom_test.beans;

import org.springframework.stereotype.Component;

@Component
public class FishBun implements Food{
    @Override
    public void like() {
        System.out.println("fish bun");
    }
}
