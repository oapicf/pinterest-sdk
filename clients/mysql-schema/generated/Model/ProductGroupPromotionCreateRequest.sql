--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionCreateRequest' definition.
--


--
-- SELECT template for table `ProductGroupPromotionCreateRequest`
--
SELECT `ad_group_id`, `product_group_promotion` FROM `ProductGroupPromotionCreateRequest` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionCreateRequest`
--
INSERT INTO `ProductGroupPromotionCreateRequest`(`ad_group_id`, `product_group_promotion`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupPromotionCreateRequest`
--
UPDATE `ProductGroupPromotionCreateRequest` SET `ad_group_id` = ?, `product_group_promotion` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionCreateRequest`
--
DELETE FROM `ProductGroupPromotionCreateRequest` WHERE 0;

