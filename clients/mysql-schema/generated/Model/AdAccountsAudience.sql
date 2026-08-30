--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsAudience' definition.
--


--
-- SELECT template for table `AdAccountsAudience`
--
SELECT `ad_account_id`, `audience_type`, `created_by_company_name`, `created_timestamp`, `description`, `id`, `is_nca`, `name`, `rule`, `size`, `status`, `type`, `updated_timestamp` FROM `AdAccountsAudience` WHERE 1;

--
-- INSERT template for table `AdAccountsAudience`
--
INSERT INTO `AdAccountsAudience`(`ad_account_id`, `audience_type`, `created_by_company_name`, `created_timestamp`, `description`, `id`, `is_nca`, `name`, `rule`, `size`, `status`, `type`, `updated_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsAudience`
--
UPDATE `AdAccountsAudience` SET `ad_account_id` = ?, `audience_type` = ?, `created_by_company_name` = ?, `created_timestamp` = ?, `description` = ?, `id` = ?, `is_nca` = ?, `name` = ?, `rule` = ?, `size` = ?, `status` = ?, `type` = ?, `updated_timestamp` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsAudience`
--
DELETE FROM `AdAccountsAudience` WHERE 0;

