--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceSubcategory' definition.
--


--
-- SELECT template for table `AudienceSubcategory`
--
SELECT `key`, `name`, `ratio`, `index`, `id` FROM `AudienceSubcategory` WHERE 1;

--
-- INSERT template for table `AudienceSubcategory`
--
INSERT INTO `AudienceSubcategory`(`key`, `name`, `ratio`, `index`, `id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceSubcategory`
--
UPDATE `AudienceSubcategory` SET `key` = ?, `name` = ?, `ratio` = ?, `index` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `AudienceSubcategory`
--
DELETE FROM `AudienceSubcategory` WHERE 0;

