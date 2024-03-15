--
-- Pinterest REST API.
-- Prepared SQL queries for 'Audience' definition.
--


--
-- SELECT template for table `Audience`
--
SELECT `ad_account_id`, `id`, `name`, `audience_type`, `description`, `rule`, `size`, `status`, `type`, `created_timestamp`, `updated_timestamp` FROM `Audience` WHERE 1;

--
-- INSERT template for table `Audience`
--
INSERT INTO `Audience`(`ad_account_id`, `id`, `name`, `audience_type`, `description`, `rule`, `size`, `status`, `type`, `created_timestamp`, `updated_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Audience`
--
UPDATE `Audience` SET `ad_account_id` = ?, `id` = ?, `name` = ?, `audience_type` = ?, `description` = ?, `rule` = ?, `size` = ?, `status` = ?, `type` = ?, `created_timestamp` = ?, `updated_timestamp` = ? WHERE 1;

--
-- DELETE template for table `Audience`
--
DELETE FROM `Audience` WHERE 0;

