package servlet5;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.net.*;

/**
 * Servlet implementation class SearchEngines
 */
@WebServlet("/SearchEngines")
public class SearchEngines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchEngines() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchString = request.getParameter("searchString");
		if ((searchString == null) ||
		(searchString.length() == 0)) {
		reportProblem(response, "Missing search string");
		return;
		}
		searchString = URLEncoder.encode(searchString);
		String searchEngineName =
		request.getParameter("searchEngine");
		if ((searchEngineName == null) ||
		(searchEngineName.length() == 0)) {
		reportProblem(response, "Missing search engine name");
		return;
		}
		String searchURL =
		SearchUtilities.makeURL(searchEngineName, searchString);
		if (searchURL != null) {
		response.sendRedirect(searchURL);
		} else {
		reportProblem(response, "Unrecognized search engine");
		}
		}
		private void reportProblem(HttpServletResponse response,
		String message)
		throws IOException {
		response.sendError(response.SC_NOT_FOUND, message);
		}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
