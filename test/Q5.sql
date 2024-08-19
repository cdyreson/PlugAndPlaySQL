SELECT product_name 
FROM products WHERE product_id IN
   (SELECT product_id FROM order_details WHERE quantity > 10)