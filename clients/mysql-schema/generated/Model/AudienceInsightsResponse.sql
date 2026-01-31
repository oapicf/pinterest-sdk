--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceInsightsResponse' definition.
--


--
-- SELECT template for table `AudienceInsightsResponse`
--
SELECT `categories`, `date`, `demographics`, `size`, `size_is_upper_bound`, `type` FROM `AudienceInsightsResponse` WHERE 1;

--
-- INSERT template for table `AudienceInsightsResponse`
--
INSERT INTO `AudienceInsightsResponse`(`categories`, `date`, `demographics`, `size`, `size_is_upper_bound`, `type`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceInsightsResponse`
--
UPDATE `AudienceInsightsResponse` SET `categories` = ?, `date` = ?, `demographics` = ?, `size` = ?, `size_is_upper_bound` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `AudienceInsightsResponse`
--
DELETE FROM `AudienceInsightsResponse` WHERE 0;

