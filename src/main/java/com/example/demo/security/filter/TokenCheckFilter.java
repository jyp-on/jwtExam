package com.example.demo.security.filter;

import com.example.demo.util.JWTUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Log4j2
@RequiredArgsConstructor
public class TokenCheckFilter extends OncePerRequestFilter {
    // OncePerRequestFilter는 하나의 요청에 대해서 한번씩 동작하는 필터
    // JWT 토큰을 검사하는 역할을 하는 필터 (로그인 했는지)
    private final JWTUtil jwtUtil;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

        String path = request.getRequestURI();

        if(!path.startsWith("/api/")) {
            filterChain.doFilter(request, response);
            return;
        }

        log.info("Token check Filter....");
        log.info("JWTUtil: " + jwtUtil);

        filterChain.doFilter(request, response);
    }
}
