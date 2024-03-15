--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionUpdateRequest' definition.
--


--
-- SELECT template for table `ProductGroupPromotionUpdateRequest`
--
SELECT `ad_group_id`, `product_group_promotion` FROM `ProductGroupPromotionUpdateRequest` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionUpdateRequest`
--
INSERT INTO `ProductGroupPromotionUpdateRequest`(`ad_group_id`, `product_group_promotion`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupPromotionUpdateRequest`
--
UPDATE `ProductGroupPromotionUpdateRequest` SET `ad_group_id` = ?, `product_group_promotion` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionUpdateRequest`
--
DELETE FROM `ProductGroupPromotionUpdateRequest` WHERE 0;

