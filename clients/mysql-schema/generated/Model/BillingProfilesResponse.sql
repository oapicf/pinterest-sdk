--
-- Pinterest REST API.
-- Prepared SQL queries for 'BillingProfilesResponse' definition.
--


--
-- SELECT template for table `BillingProfilesResponse`
--
SELECT `advertiser_id`, `billing_type`, `card_type`, `id`, `payment_method_brand`, `status` FROM `BillingProfilesResponse` WHERE 1;

--
-- INSERT template for table `BillingProfilesResponse`
--
INSERT INTO `BillingProfilesResponse`(`advertiser_id`, `billing_type`, `card_type`, `id`, `payment_method_brand`, `status`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BillingProfilesResponse`
--
UPDATE `BillingProfilesResponse` SET `advertiser_id` = ?, `billing_type` = ?, `card_type` = ?, `id` = ?, `payment_method_brand` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `BillingProfilesResponse`
--
DELETE FROM `BillingProfilesResponse` WHERE 0;

