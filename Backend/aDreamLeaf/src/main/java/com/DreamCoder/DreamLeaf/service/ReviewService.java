package com.DreamCoder.DreamLeaf.service;

import com.DreamCoder.DreamLeaf.dto.*;
import com.DreamCoder.DreamLeaf.repository.ReviewRepository;
import com.DreamCoder.DreamLeaf.req.ReviewDelReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewService {

    private final ReviewRepository reviewRepositoryImpl;

    public ReviewDto create(ReviewCreateDto reviewCreateDto){
        return reviewRepositoryImpl.save(reviewCreateDto);
    }

    public List<ReviewDto> findReviewPage(ReviewSearchDto reviewSearchDto){

        return reviewRepositoryImpl.findReviewPage(reviewSearchDto);
    }

    public String update(ReviewUpDto reviewUpDto) { return reviewRepositoryImpl.update(reviewUpDto);}

    public String delete(ReviewDelDto reviewDelDto){
        return reviewRepositoryImpl.delete(reviewDelDto);
    }


}
