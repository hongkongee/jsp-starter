package com.jsp.chap04.service;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerRepositrory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ListService implements IDancerService{

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // 댄서 목록들 받아오기
        List<Dancer> dancerList = DancerRepositrory.findAll();
        request.setAttribute("dl", dancerList);
    }
}
