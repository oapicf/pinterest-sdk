--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingRequest_keywords_inner' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingRequest_keywords_inner`
--
SELECT `match_type`, `value` FROM `AdGroupAudienceSizingRequest_keywords_inner` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingRequest_keywords_inner`
--
INSERT INTO `AdGroupAudienceSizingRequest_keywords_inner`(`match_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingRequest_keywords_inner`
--
UPDATE `AdGroupAudienceSizingRequest_keywords_inner` SET `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingRequest_keywords_inner`
--
DELETE FROM `AdGroupAudienceSizingRequest_keywords_inner` WHERE 0;

