--
-- Pinterest REST API.
-- Prepared SQL queries for 'product_group_promotions_list_200_response' definition.
--


--
-- SELECT template for table `product_group_promotions_list_200_response`
--
SELECT `items`, `bookmark` FROM `product_group_promotions_list_200_response` WHERE 1;

--
-- INSERT template for table `product_group_promotions_list_200_response`
--
INSERT INTO `product_group_promotions_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `product_group_promotions_list_200_response`
--
UPDATE `product_group_promotions_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `product_group_promotions_list_200_response`
--
DELETE FROM `product_group_promotions_list_200_response` WHERE 0;

