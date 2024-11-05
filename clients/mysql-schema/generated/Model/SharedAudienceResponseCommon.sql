--
-- Pinterest REST API.
-- Prepared SQL queries for 'SharedAudienceResponseCommon' definition.
--


--
-- SELECT template for table `SharedAudienceResponseCommon`
--
SELECT `audience_id`, `permissions` FROM `SharedAudienceResponseCommon` WHERE 1;

--
-- INSERT template for table `SharedAudienceResponseCommon`
--
INSERT INTO `SharedAudienceResponseCommon`(`audience_id`, `permissions`) VALUES (?, ?);

--
-- UPDATE template for table `SharedAudienceResponseCommon`
--
UPDATE `SharedAudienceResponseCommon` SET `audience_id` = ?, `permissions` = ? WHERE 1;

--
-- DELETE template for table `SharedAudienceResponseCommon`
--
DELETE FROM `SharedAudienceResponseCommon` WHERE 0;

