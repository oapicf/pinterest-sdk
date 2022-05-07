--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardSection' definition.
--


--
-- SELECT template for table `BoardSection`
--
SELECT `id`, `name` FROM `BoardSection` WHERE 1;

--
-- INSERT template for table `BoardSection`
--
INSERT INTO `BoardSection`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `BoardSection`
--
UPDATE `BoardSection` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `BoardSection`
--
DELETE FROM `BoardSection` WHERE 0;

