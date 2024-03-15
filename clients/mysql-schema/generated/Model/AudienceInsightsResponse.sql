--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceInsightsResponse' definition.
--


--
-- SELECT template for table `AudienceInsightsResponse`
--
SELECT `categories`, `demographics`, `type`, `date`, `size`, `size_is_upper_bound` FROM `AudienceInsightsResponse` WHERE 1;

--
-- INSERT template for table `AudienceInsightsResponse`
--
INSERT INTO `AudienceInsightsResponse`(`categories`, `demographics`, `type`, `date`, `size`, `size_is_upper_bound`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceInsightsResponse`
--
UPDATE `AudienceInsightsResponse` SET `categories` = ?, `demographics` = ?, `type` = ?, `date` = ?, `size` = ?, `size_is_upper_bound` = ? WHERE 1;

--
-- DELETE template for table `AudienceInsightsResponse`
--
DELETE FROM `AudienceInsightsResponse` WHERE 0;

