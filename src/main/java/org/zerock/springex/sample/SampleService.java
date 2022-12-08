package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
@RequiredArgsConstructor
public class SampleService {

//    // @Autowired 를 이용한 필드 주입
//    @Autowired
//    private SampleDAO sampleDAO;

    // 생성자 주입 방식 : Lombok의 @RequiredArgsConstructor 사용 (final + 생성자 만들기)
    private final SampleDAO sampleDAO;

}
