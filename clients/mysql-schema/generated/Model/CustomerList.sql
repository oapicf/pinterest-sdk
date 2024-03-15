--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomerList' definition.
--


--
-- SELECT template for table `CustomerList`
--
SELECT `ad_account_id`, `created_time`, `id`, `name`, `num_batches`, `num_removed_user_records`, `num_uploaded_user_records`, `status`, `type`, `updated_time`, `exceptions` FROM `CustomerList` WHERE 1;

--
-- INSERT template for table `CustomerList`
--
INSERT INTO `CustomerList`(`ad_account_id`, `created_time`, `id`, `name`, `num_batches`, `num_removed_user_records`, `num_uploaded_user_records`, `status`, `type`, `updated_time`, `exceptions`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CustomerList`
--
UPDATE `CustomerList` SET `ad_account_id` = ?, `created_time` = ?, `id` = ?, `name` = ?, `num_batches` = ?, `num_removed_user_records` = ?, `num_uploaded_user_records` = ?, `status` = ?, `type` = ?, `updated_time` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `CustomerList`
--
DELETE FROM `CustomerList` WHERE 0;

