--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceCreateRequest' definition.
--


--
-- SELECT template for table `AudienceCreateRequest`
--
SELECT `ad_account_id`, `name`, `rule`, `audience_type`, `description` FROM `AudienceCreateRequest` WHERE 1;

--
-- INSERT template for table `AudienceCreateRequest`
--
INSERT INTO `AudienceCreateRequest`(`ad_account_id`, `name`, `rule`, `audience_type`, `description`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceCreateRequest`
--
UPDATE `AudienceCreateRequest` SET `ad_account_id` = ?, `name` = ?, `rule` = ?, `audience_type` = ?, `description` = ? WHERE 1;

--
-- DELETE template for table `AudienceCreateRequest`
--
DELETE FROM `AudienceCreateRequest` WHERE 0;

