package blog;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/* リクエストエンコード用のフィルタ */
public class EncodeFilter implements Filter{
	
	public void init(FilterConfig config)
			throws ServletException {
	}
	
	public void doFilter(ServletRequest request,
						 ServletResponse response,
						 FilterChain chain)
			throws IOException, ServletException{
		request.setCharacterEncoding("Windows-31J");
		chain.doFilter(request, response);
	}
	
	public void destroy(){
	}
}