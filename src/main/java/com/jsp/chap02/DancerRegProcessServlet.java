package com.jsp.chap02;

import com.jsp.entity.Dancer;
import com.jsp.repository.DancerRepositrory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/chap02/dancer/reg-process")
public class DancerRegProcessServlet extends HttpServlet {

    // 사용자의 입력값 가져오기
    // 가져온 입력값을 토대로 Dancer 객체 생성 -> repository의 save()가 대신 해준다.
    // 정보를 데이터베이스에 저장 -> repository의 save()가 대신 해준다.
    // 결과를 화면으로 응답


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // POST 요청이 전달되면 자동으로 호출되는 메서드.
        // POST 요청에만 호출됩니다. -> GET요청에는 반응하지 않습니다.

        // post방식에서 전달된 한글 데이터의 깨짐 방지 메서드
        request.setCharacterEncoding("UTF-8");

        // 제공된 form에 작성된 사용자의 입력값 가져오기
        String name = request.getParameter("name");
        String crewName = request.getParameter("crewName");
        String danceLevel = request.getParameter("danceLevel");
        // checkbox와 같이 여러 값을 전달받는 경우에는 getParameterValues를 사용 -> String 배열로 리턴됩니다
        String[] genresArray = request.getParameterValues("genres");

        /*
        System.out.println("name = " + name);
        System.out.println("crewName = " + crewName);
        System.out.println("danceLevel = " + danceLevel);
        System.out.println("Arrays.toString(genresArray) = " + Arrays.toString(genresArray));
         */

        // 얻어온 입력값을 save()에게 전달 -> 객체 생성 및 Map에 저장까지 일괄 처리
        DancerRepositrory.save(name, crewName, danceLevel, genresArray);

        // 화면으로 결과를 응답해 주기
        // 결과 출력
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter w = response.getWriter();

        w.write("<!DOCTYPE html>\n");
        w.write("<html>\n");
        w.write("<head>\n");
        w.write("</head>\n");
        w.write("<body>\n");

        w.write("<ul>");

        for (Dancer dancer : DancerRepositrory.findAll()) {
            w.write(String.format("<li># 이름 : %s, 크루명: %s, 수준: %s, 공연당페이: %d원, 장르: %s</li>\n"
                    ,  dancer.getName(), dancer.getCrewName(),
                    dancer.getDanceLevel().getLevelDescription(),
                    dancer.getDanceLevel().getPayPerEvent(),
                    dancer.getGenres()));
        }

        w.write("</ul>");

        w.write("<a href=\"/chap02/dancer/register\">새로운 등록하기</a>");

        w.write("</body>\n");
        w.write("</html>");

        w.flush();
        w.close();



    }
}
