--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerListUploadResponse' definition.
--


--
-- SELECT template for table `CustomerListUploadResponse`
--
SELECT `ad_account_id`, `creation_time`, `customer_list_id`, `error_counts`, `id`, `operation`, `record_counts`, `state`, `updated_time` FROM `CustomerListUploadResponse` WHERE 1;

--
-- INSERT template for table `CustomerListUploadResponse`
--
INSERT INTO `CustomerListUploadResponse`(`ad_account_id`, `creation_time`, `customer_list_id`, `error_counts`, `id`, `operation`, `record_counts`, `state`, `updated_time`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerListUploadResponse`
--
UPDATE `CustomerListUploadResponse` SET `ad_account_id` = ?, `creation_time` = ?, `customer_list_id` = ?, `error_counts` = ?, `id` = ?, `operation` = ?, `record_counts` = ?, `state` = ?, `updated_time` = ? WHERE 1;

--
-- DELETE template for table `CustomerListUploadResponse`
--
DELETE FROM `CustomerListUploadResponse` WHERE 0;

