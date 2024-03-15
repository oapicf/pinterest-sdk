--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceCommon' definition.
--


--
-- SELECT template for table `AudienceCommon`
--
SELECT `ad_account_id`, `name`, `rule` FROM `AudienceCommon` WHERE 1;

--
-- INSERT template for table `AudienceCommon`
--
INSERT INTO `AudienceCommon`(`ad_account_id`, `name`, `rule`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AudienceCommon`
--
UPDATE `AudienceCommon` SET `ad_account_id` = ?, `name` = ?, `rule` = ? WHERE 1;

--
-- DELETE template for table `AudienceCommon`
--
DELETE FROM `AudienceCommon` WHERE 0;

