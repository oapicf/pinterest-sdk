--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditDiscountsResponse' definition.
--


--
-- SELECT template for table `AdsCreditDiscountsResponse`
--
SELECT `active`, `advertiser_id`, `discountType`, `discountInMicroCurrency`, `discountCurrency`, `title`, `remainingDiscountInMicroCurrency` FROM `AdsCreditDiscountsResponse` WHERE 1;

--
-- INSERT template for table `AdsCreditDiscountsResponse`
--
INSERT INTO `AdsCreditDiscountsResponse`(`active`, `advertiser_id`, `discountType`, `discountInMicroCurrency`, `discountCurrency`, `title`, `remainingDiscountInMicroCurrency`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsCreditDiscountsResponse`
--
UPDATE `AdsCreditDiscountsResponse` SET `active` = ?, `advertiser_id` = ?, `discountType` = ?, `discountInMicroCurrency` = ?, `discountCurrency` = ?, `title` = ?, `remainingDiscountInMicroCurrency` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditDiscountsResponse`
--
DELETE FROM `AdsCreditDiscountsResponse` WHERE 0;

