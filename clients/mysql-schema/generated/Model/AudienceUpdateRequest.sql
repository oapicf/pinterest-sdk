--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceUpdateRequest' definition.
--


--
-- SELECT template for table `AudienceUpdateRequest`
--
SELECT `ad_account_id`, `name`, `rule`, `description`, `operation_type` FROM `AudienceUpdateRequest` WHERE 1;

--
-- INSERT template for table `AudienceUpdateRequest`
--
INSERT INTO `AudienceUpdateRequest`(`ad_account_id`, `name`, `rule`, `description`, `operation_type`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceUpdateRequest`
--
UPDATE `AudienceUpdateRequest` SET `ad_account_id` = ?, `name` = ?, `rule` = ?, `description` = ?, `operation_type` = ? WHERE 1;

--
-- DELETE template for table `AudienceUpdateRequest`
--
DELETE FROM `AudienceUpdateRequest` WHERE 0;

