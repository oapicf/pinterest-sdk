--
-- Pinterest REST API.
-- Prepared SQL queries for 'Board' definition.
--


--
-- SELECT template for table `Board`
--
SELECT `id`, `name`, `description`, `owner`, `privacy` FROM `Board` WHERE 1;

--
-- INSERT template for table `Board`
--
INSERT INTO `Board`(`id`, `name`, `description`, `owner`, `privacy`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `Board`
--
UPDATE `Board` SET `id` = ?, `name` = ?, `description` = ?, `owner` = ?, `privacy` = ? WHERE 1;

--
-- DELETE template for table `Board`
--
DELETE FROM `Board` WHERE 0;

