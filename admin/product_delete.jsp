<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<%@ include file="../db/db_conn.jsp" %>

<%
    String productId = request.getParameter("id");
    if(productId != null){
        String sql = "DELETE FROM product WHERE p_id = ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, productId);
        pstmt.executeUpdate();

        if (pstmt != null)
            pstmt.close();
        if (conn != null)
            conn.close();
    }
    response.sendRedirect("product_edit.jsp?edit=delete");
%>
