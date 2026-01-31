--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsCreditDiscountsResponse' definition.
--


--
-- SELECT template for table `AdsCreditDiscountsResponse`
--
SELECT `active`, `advertiser_id`, `discountCurrency`, `discountInMicroCurrency`, `discountType`, `remainingDiscountInMicroCurrency`, `title` FROM `AdsCreditDiscountsResponse` WHERE 1;

--
-- INSERT template for table `AdsCreditDiscountsResponse`
--
INSERT INTO `AdsCreditDiscountsResponse`(`active`, `advertiser_id`, `discountCurrency`, `discountInMicroCurrency`, `discountType`, `remainingDiscountInMicroCurrency`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdsCreditDiscountsResponse`
--
UPDATE `AdsCreditDiscountsResponse` SET `active` = ?, `advertiser_id` = ?, `discountCurrency` = ?, `discountInMicroCurrency` = ?, `discountType` = ?, `remainingDiscountInMicroCurrency` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `AdsCreditDiscountsResponse`
--
DELETE FROM `AdsCreditDiscountsResponse` WHERE 0;

