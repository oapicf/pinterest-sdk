--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdGroupAudienceSizingResponse' definition.
--


--
-- SELECT template for table `AdGroupAudienceSizingResponse`
--
SELECT `audience_size_lower_bound`, `audience_size_upper_bound` FROM `AdGroupAudienceSizingResponse` WHERE 1;

--
-- INSERT template for table `AdGroupAudienceSizingResponse`
--
INSERT INTO `AdGroupAudienceSizingResponse`(`audience_size_lower_bound`, `audience_size_upper_bound`) VALUES (?, ?);

--
-- UPDATE template for table `AdGroupAudienceSizingResponse`
--
UPDATE `AdGroupAudienceSizingResponse` SET `audience_size_lower_bound` = ?, `audience_size_upper_bound` = ? WHERE 1;

--
-- DELETE template for table `AdGroupAudienceSizingResponse`
--
DELETE FROM `AdGroupAudienceSizingResponse` WHERE 0;

