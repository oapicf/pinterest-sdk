--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceInsights' definition.
--


--
-- SELECT template for table `AudienceInsights`
--
SELECT `categories`, `date`, `demographics`, `size`, `size_is_upper_bound`, `type` FROM `AudienceInsights` WHERE 1;

--
-- INSERT template for table `AudienceInsights`
--
INSERT INTO `AudienceInsights`(`categories`, `date`, `demographics`, `size`, `size_is_upper_bound`, `type`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceInsights`
--
UPDATE `AudienceInsights` SET `categories` = ?, `date` = ?, `demographics` = ?, `size` = ?, `size_is_upper_bound` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `AudienceInsights`
--
DELETE FROM `AudienceInsights` WHERE 0;

