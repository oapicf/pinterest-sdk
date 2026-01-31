--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceSubcategory' definition.
--


--
-- SELECT template for table `AudienceSubcategory`
--
SELECT `id`, `index`, `key`, `name`, `ratio` FROM `AudienceSubcategory` WHERE 1;

--
-- INSERT template for table `AudienceSubcategory`
--
INSERT INTO `AudienceSubcategory`(`id`, `index`, `key`, `name`, `ratio`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceSubcategory`
--
UPDATE `AudienceSubcategory` SET `id` = ?, `index` = ?, `key` = ?, `name` = ?, `ratio` = ? WHERE 1;

--
-- DELETE template for table `AudienceSubcategory`
--
DELETE FROM `AudienceSubcategory` WHERE 0;

