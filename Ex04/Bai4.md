Request URL:
 /bai4/products?category=chay&limit=10
        ↓
Controller:
 ProductController#getProducts(...)
        ↓
ModelMap:
 category, limit, message
        ↓
View:
 productList
        ↓
JSP:
 /WEB-INF/views/productList.jsp



 Bẫy dữ liệu

Nếu nhập sai:

/bai4/products?category=chay&limit=abc

Spring không thể chuyển "abc" sang kiểu số (int/Integer)

Kết quả:

HTTP 400 Bad Request
(MethodArgumentTypeMismatchException)