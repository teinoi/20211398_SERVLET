<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository"%>

<%! String greeting = "현재 페이지는 CPU 상품 목록입니다.";
	String tagline = "하단 페이지 : 확인";%>
<div class="jumbotron">
<div class="container">
<h1 class="display-3">
<%=greeting%>
</h1>
</div>
</div>

	<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>

	<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                    <div class="card bg-dark text-white">
                    <img src="image/product/<%=product.getFilename()%>" class="card-img" alt="..." style="width: 100px; height: 100px;">
                    <div class="card-img-overlay">
                    <!-- <h5 class="card-title">그래픽 카드 이미지 샘플</h5>
                    <p class="card-text">출처 : 구글 검색</p> -->
                    </div>
                    </div>

				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
                <p><a href="product_detail_ad.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button">상품 상세 정보 &raquo;</a>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>

 <div class="card bg-dark text-black">
         <style>
        h5, p {
            margin-bottom: 20px;
        }
        img {
            display: block;
            margin: 0 auto;
        }
    </style>
    <img src="image/event1.jpeg" class="card-img" alt="..." style="width: 1000px;">
    <div class="card-img-overlay">
    <h5 class="card-title">그래픽 카드 이벤트</h5>
    <p class="card-text">출처 : 다나와</p>
  </div>
  </div>