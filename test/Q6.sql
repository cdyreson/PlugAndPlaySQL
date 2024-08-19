SELECT supplier_id, company_name
FROM suppliers S
WHERE EXISTS (SELECT product_id
FROM products
WHERE supplier_id = S.supplier_id AND units_in_stock > 0)