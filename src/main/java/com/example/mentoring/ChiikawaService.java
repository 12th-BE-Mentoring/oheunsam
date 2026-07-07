package com.example.mentoring;

import org.springframework.stereotype.Service;

@Service
public class ChiikawaService {

    private final ChiikawaRepository chiikawaRepository; // final은 수정을 금지

    public ChiikawaService(ChiikawaRepository chiikawaRepository) {
        this.chiikawaRepository = chiikawaRepository;
    }

    public Chiikawa save(Chiikawa chiikawa) {
        return chiikawaRepository.save(chiikawa);
    }

    public Chiikawa findById(Long id) {
        return chiikawaRepository.findById(id).orElse(null); // 예외 처리 알아오기 (멘토링)
    }
}

// 스프링빈이 뭔지
// @component가 뭔지
// 의존성 주입
