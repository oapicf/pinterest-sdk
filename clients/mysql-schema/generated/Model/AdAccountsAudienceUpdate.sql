--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsAudienceUpdate' definition.
--


--
-- SELECT template for table `AdAccountsAudienceUpdate`
--
SELECT `ad_account_id`, `audience_type`, `description`, `name`, `operation_type`, `rule` FROM `AdAccountsAudienceUpdate` WHERE 1;

--
-- INSERT template for table `AdAccountsAudienceUpdate`
--
INSERT INTO `AdAccountsAudienceUpdate`(`ad_account_id`, `audience_type`, `description`, `name`, `operation_type`, `rule`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsAudienceUpdate`
--
UPDATE `AdAccountsAudienceUpdate` SET `ad_account_id` = ?, `audience_type` = ?, `description` = ?, `name` = ?, `operation_type` = ?, `rule` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsAudienceUpdate`
--
DELETE FROM `AdAccountsAudienceUpdate` WHERE 0;

