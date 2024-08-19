    SELECT E.last_name, C.category_name, COUNT(P.product_id) AS TotalProducts
    FROM employees E
    JOIN orders O ON E.employee_id = O.employee_id
    JOIN order_details OD ON O.order_id = OD.order_id
    JOIN products P ON OD.product_id = P.product_id
    JOIN categories C ON P.category_id = C.category_id
    WHERE E.country = 'USA'
    GROUP BY E.last_name, C.category_name