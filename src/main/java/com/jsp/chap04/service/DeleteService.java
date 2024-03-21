package com.jsp.chap04.service;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerRepositrory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class DeleteService implements IDancerService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String name = request.getParameter("name");
        DancerRepositrory.delete(name);

        // 삭제가 완료된 후에 삭제가 적용된 댄서 목록을 list.jsp에 보여주고 싶어요
        List<Dancer> dancerList = DancerRepositrory.findAll();

        // list.jsp를 그대로 활용할 예정이므로 dl이라는 이름을 똑같이 지정해야 합니다.
        request.setAttribute("dl", dancerList);

    }
}
