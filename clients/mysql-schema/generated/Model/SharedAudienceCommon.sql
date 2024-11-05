--
-- Pinterest REST API.
-- Prepared SQL queries for 'SharedAudienceCommon' definition.
--


--
-- SELECT template for table `SharedAudienceCommon`
--
SELECT `audience_id`, `operation_type` FROM `SharedAudienceCommon` WHERE 1;

--
-- INSERT template for table `SharedAudienceCommon`
--
INSERT INTO `SharedAudienceCommon`(`audience_id`, `operation_type`) VALUES (?, ?);

--
-- UPDATE template for table `SharedAudienceCommon`
--
UPDATE `SharedAudienceCommon` SET `audience_id` = ?, `operation_type` = ? WHERE 1;

--
-- DELETE template for table `SharedAudienceCommon`
--
DELETE FROM `SharedAudienceCommon` WHERE 0;

