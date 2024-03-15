--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceInsightCategoryCommon' definition.
--


--
-- SELECT template for table `AudienceInsightCategoryCommon`
--
SELECT `key`, `name`, `ratio`, `index`, `id` FROM `AudienceInsightCategoryCommon` WHERE 1;

--
-- INSERT template for table `AudienceInsightCategoryCommon`
--
INSERT INTO `AudienceInsightCategoryCommon`(`key`, `name`, `ratio`, `index`, `id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceInsightCategoryCommon`
--
UPDATE `AudienceInsightCategoryCommon` SET `key` = ?, `name` = ?, `ratio` = ?, `index` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `AudienceInsightCategoryCommon`
--
DELETE FROM `AudienceInsightCategoryCommon` WHERE 0;

