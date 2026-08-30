--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingKeyword' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingKeyword`
--
SELECT `match_type`, `value` FROM `AdGroupAudienceSizingKeyword` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingKeyword`
--
INSERT INTO `AdGroupAudienceSizingKeyword`(`match_type`, `value`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingKeyword`
--
UPDATE `AdGroupAudienceSizingKeyword` SET `match_type` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingKeyword`
--
DELETE FROM `AdGroupAudienceSizingKeyword` WHERE 0;

