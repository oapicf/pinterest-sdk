--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionsCreate' definition.
--


--
-- SELECT template for table `ProductGroupPromotionsCreate`
--
SELECT `ad_group_id`, `product_group_promotion` FROM `ProductGroupPromotionsCreate` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionsCreate`
--
INSERT INTO `ProductGroupPromotionsCreate`(`ad_group_id`, `product_group_promotion`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupPromotionsCreate`
--
UPDATE `ProductGroupPromotionsCreate` SET `ad_group_id` = ?, `product_group_promotion` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionsCreate`
--
DELETE FROM `ProductGroupPromotionsCreate` WHERE 0;

