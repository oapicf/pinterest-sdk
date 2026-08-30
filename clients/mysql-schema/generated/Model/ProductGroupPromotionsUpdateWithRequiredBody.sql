--
-- Pinterest REST API.
-- Prepared SQL queries for 'ProductGroupPromotionsUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `ProductGroupPromotionsUpdateWithRequiredBody`
--
SELECT `ad_group_id`, `product_group_promotion` FROM `ProductGroupPromotionsUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `ProductGroupPromotionsUpdateWithRequiredBody`
--
INSERT INTO `ProductGroupPromotionsUpdateWithRequiredBody`(`ad_group_id`, `product_group_promotion`) VALUES (?, ?);

--
-- UPDATE template for table `ProductGroupPromotionsUpdateWithRequiredBody`
--
UPDATE `ProductGroupPromotionsUpdateWithRequiredBody` SET `ad_group_id` = ?, `product_group_promotion` = ? WHERE 1;

--
-- DELETE template for table `ProductGroupPromotionsUpdateWithRequiredBody`
--
DELETE FROM `ProductGroupPromotionsUpdateWithRequiredBody` WHERE 0;

