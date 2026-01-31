--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUpload' definition.
--


--
-- SELECT template for table `CustomerListUpload`
--
SELECT `ad_account_id`, `creation_time`, `customer_list_id`, `error_counts`, `id`, `operation`, `record_counts`, `state`, `updated_time` FROM `CustomerListUpload` WHERE 1;

--
-- INSERT template for table `CustomerListUpload`
--
INSERT INTO `CustomerListUpload`(`ad_account_id`, `creation_time`, `customer_list_id`, `error_counts`, `id`, `operation`, `record_counts`, `state`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerListUpload`
--
UPDATE `CustomerListUpload` SET `ad_account_id` = ?, `creation_time` = ?, `customer_list_id` = ?, `error_counts` = ?, `id` = ?, `operation` = ?, `record_counts` = ?, `state` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUpload`
--
DELETE FROM `CustomerListUpload` WHERE 0;

