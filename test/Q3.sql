    SELECT C.customer_id, O.order_id 
    FROM customers C INNER JOIN orders O ON C.customer_id = O.customer_id