package lk.ijse.classroom_test.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class FishPastry implements Food{
    @Override
    public void like() {
        System.out.println("fish pastry");
    }
}
