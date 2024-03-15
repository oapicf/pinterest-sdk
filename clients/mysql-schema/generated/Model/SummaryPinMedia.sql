--
-- Pinterest REST API.
-- Prepared SQL queries for 'SummaryPin_media' definition.
--


--
-- SELECT template for table `SummaryPin_media`
--
SELECT `media_type` FROM `SummaryPin_media` WHERE 1;

--
-- INSERT template for table `SummaryPin_media`
--
INSERT INTO `SummaryPin_media`(`media_type`) VALUES (?);

--
-- UPDATE template for table `SummaryPin_media`
--
UPDATE `SummaryPin_media` SET `media_type` = ? WHERE 1;

--
-- DELETE template for table `SummaryPin_media`
--
DELETE FROM `SummaryPin_media` WHERE 0;

