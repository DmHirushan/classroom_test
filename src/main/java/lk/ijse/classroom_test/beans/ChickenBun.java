package lk.ijse.classroom_test.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier
@Primary
public class ChickenBun implements Food{
    @Override
    public void like() {
        System.out.println("chicken bun");
    }
}
