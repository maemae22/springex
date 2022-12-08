package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;


// EventSampleDAOImpl을 지금 사용하고 싶다면 @Primary로 지정해줌 ..!
// (SampleDAO를 implements 한 게 2개여서 스프링이 어떤 것을 주입해야 할지 찾지 못할 때 = error 상황)
//@Primary
@Repository
@Qualifier("event")
public class EventSampleDAOImpl implements SampleDAO {
}
