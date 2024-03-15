--
-- Pinterest REST API.
-- Prepared SQL queries for 'BillingProfilesResponse' definition.
--


--
-- SELECT template for table `BillingProfilesResponse`
--
SELECT `id`, `card_type`, `status`, `advertiser_id`, `payment_method_brand` FROM `BillingProfilesResponse` WHERE 1;

--
-- INSERT template for table `BillingProfilesResponse`
--
INSERT INTO `BillingProfilesResponse`(`id`, `card_type`, `status`, `advertiser_id`, `payment_method_brand`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `BillingProfilesResponse`
--
UPDATE `BillingProfilesResponse` SET `id` = ?, `card_type` = ?, `status` = ?, `advertiser_id` = ?, `payment_method_brand` = ? WHERE 1;

--
-- DELETE template for table `BillingProfilesResponse`
--
DELETE FROM `BillingProfilesResponse` WHERE 0;

