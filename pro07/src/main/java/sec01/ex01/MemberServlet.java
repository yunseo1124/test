package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member070101")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html'charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		//MemberDAO 객체를 생성합니다.
		MemberDAO dao = new MemberDAO();
		//MemberDAO dao = new MemberDAOP();
		
		//MemberDAO.listMember()메소드로 회원 정보를 조회합니다.
		List<MemberVO> list = dao.listMember();
		
		out.print("<html><head><meta charset='utf-8'></head>"
				+"<body>"
				+"<table style ='margin:auto;text-align:center;' border=1>"
				+"<tr align='center' bgcolor='lightgreen'>"
				+"<td>아이디</td>"
				+"<td>비밀번호</.td>"
				+"<td>이름</td>"
				+"<td>이메일</td>"
				+"<td>가입일</td>"
				+"</tr>");
		
		for(int i=0; i<list.size(); i++) {
		
			//조회한 회원 정보를 for문과 <tr>태그를 이요해 리스트로 출력합니다.
			MemberVO memberVO = (MemberVO) list.get(i);
			
			String id = memberVO.getId();
			String password = memberVO.getPassword();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date joinDate = memberVO.getJoinDate();
			
			out.print("<tr>"
					+"<td>" + id+ "</td>"
					+"<td>" + password +"</td>"
					+"<td>"+name+"</td>"
					+"<td>"+email+"</td>"
					+"<td>"+joinDate+"</td>"
					+"</tr>"
					);		
		}
		out.print("</table>" + "</body>" + "</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
