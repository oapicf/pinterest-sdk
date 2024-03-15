--
-- Pinterest REST API.
-- Prepared SQL queries for 'Interest' definition.
--


--
-- SELECT template for table `Interest`
--
SELECT `canonical_url`, `id`, `key`, `name` FROM `Interest` WHERE 1;

--
-- INSERT template for table `Interest`
--
INSERT INTO `Interest`(`canonical_url`, `id`, `key`, `name`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `Interest`
--
UPDATE `Interest` SET `canonical_url` = ?, `id` = ?, `key` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `Interest`
--
DELETE FROM `Interest` WHERE 0;

