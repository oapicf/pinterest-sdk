--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceCategory' definition.
--


--
-- SELECT template for table `AudienceCategory`
--
SELECT `id`, `index`, `key`, `name`, `ratio`, `subcategories` FROM `AudienceCategory` WHERE 1;

--
-- INSERT template for table `AudienceCategory`
--
INSERT INTO `AudienceCategory`(`id`, `index`, `key`, `name`, `ratio`, `subcategories`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceCategory`
--
UPDATE `AudienceCategory` SET `id` = ?, `index` = ?, `key` = ?, `name` = ?, `ratio` = ?, `subcategories` = ? WHERE 1;

--
-- DELETE template for table `AudienceCategory`
--
DELETE FROM `AudienceCategory` WHERE 0;

