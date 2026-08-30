--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsAudienceCreate' definition.
--


--
-- SELECT template for table `AdAccountsAudienceCreate`
--
SELECT `ad_account_id`, `audience_type`, `description`, `name`, `rule` FROM `AdAccountsAudienceCreate` WHERE 1;

--
-- INSERT template for table `AdAccountsAudienceCreate`
--
INSERT INTO `AdAccountsAudienceCreate`(`ad_account_id`, `audience_type`, `description`, `name`, `rule`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsAudienceCreate`
--
UPDATE `AdAccountsAudienceCreate` SET `ad_account_id` = ?, `audience_type` = ?, `description` = ?, `name` = ?, `rule` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsAudienceCreate`
--
DELETE FROM `AdAccountsAudienceCreate` WHERE 0;

