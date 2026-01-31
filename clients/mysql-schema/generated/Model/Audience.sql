--
-- Pinterest REST API.
-- Prepared SQL queries for 'Audience' definition.
--


--
-- SELECT template for table `Audience`
--
SELECT `ad_account_id`, `audience_type`, `created_by_company_name`, `created_timestamp`, `description`, `id`, `name`, `rule`, `size`, `status`, `type`, `updated_timestamp` FROM `Audience` WHERE 1;

--
-- INSERT template for table `Audience`
--
INSERT INTO `Audience`(`ad_account_id`, `audience_type`, `created_by_company_name`, `created_timestamp`, `description`, `id`, `name`, `rule`, `size`, `status`, `type`, `updated_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Audience`
--
UPDATE `Audience` SET `ad_account_id` = ?, `audience_type` = ?, `created_by_company_name` = ?, `created_timestamp` = ?, `description` = ?, `id` = ?, `name` = ?, `rule` = ?, `size` = ?, `status` = ?, `type` = ?, `updated_timestamp` = ? WHERE 1;

--
-- DELETE template for table `Audience`
--
DELETE FROM `Audience` WHERE 0;

