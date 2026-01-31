--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceInsightCategoryCommon' definition.
--


--
-- SELECT template for table `AudienceInsightCategoryCommon`
--
SELECT `id`, `index`, `key`, `name`, `ratio` FROM `AudienceInsightCategoryCommon` WHERE 1;

--
-- INSERT template for table `AudienceInsightCategoryCommon`
--
INSERT INTO `AudienceInsightCategoryCommon`(`id`, `index`, `key`, `name`, `ratio`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceInsightCategoryCommon`
--
UPDATE `AudienceInsightCategoryCommon` SET `id` = ?, `index` = ?, `key` = ?, `name` = ?, `ratio` = ? WHERE 1;

--
-- DELETE template for table `AudienceInsightCategoryCommon`
--
DELETE FROM `AudienceInsightCategoryCommon` WHERE 0;

