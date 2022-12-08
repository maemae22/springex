package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// @Repository : 해당 클래스의 객체를 스프링의 빈(Bean)으로 처리되도록 구성함
@Repository
@Qualifier("normal")
public class SampleDAOImpl implements SampleDAO {
}
