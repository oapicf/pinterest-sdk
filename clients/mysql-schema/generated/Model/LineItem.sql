--
-- Pinterest REST API.
-- Prepared SQL queries for 'LineItem' definition.
--


--
-- SELECT template for table `LineItem`
--
SELECT `product_brand`, `product_category`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_variant`, `product_variant_id` FROM `LineItem` WHERE 1;

--
-- INSERT template for table `LineItem`
--
INSERT INTO `LineItem`(`product_brand`, `product_category`, `product_id`, `product_name`, `product_price`, `product_quantity`, `product_variant`, `product_variant_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `LineItem`
--
UPDATE `LineItem` SET `product_brand` = ?, `product_category` = ?, `product_id` = ?, `product_name` = ?, `product_price` = ?, `product_quantity` = ?, `product_variant` = ?, `product_variant_id` = ? WHERE 1;

--
-- DELETE template for table `LineItem`
--
DELETE FROM `LineItem` WHERE 0;

