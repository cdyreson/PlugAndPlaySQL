SELECT employee_id, COUNT(order_id) AS TotalOrders
FROM orders 
GROUP BY employee_id