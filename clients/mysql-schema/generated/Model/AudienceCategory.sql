--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceCategory' definition.
--


--
-- SELECT template for table `AudienceCategory`
--
SELECT `key`, `name`, `ratio`, `index`, `id`, `subcategories` FROM `AudienceCategory` WHERE 1;

--
-- INSERT template for table `AudienceCategory`
--
INSERT INTO `AudienceCategory`(`key`, `name`, `ratio`, `index`, `id`, `subcategories`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceCategory`
--
UPDATE `AudienceCategory` SET `key` = ?, `name` = ?, `ratio` = ?, `index` = ?, `id` = ?, `subcategories` = ? WHERE 1;

--
-- DELETE template for table `AudienceCategory`
--
DELETE FROM `AudienceCategory` WHERE 0;

