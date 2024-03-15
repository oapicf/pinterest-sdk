--
-- Pinterest REST API.
-- Prepared SQL queries for 'Paginated' definition.
--


--
-- SELECT template for table `Paginated`
--
SELECT `items`, `bookmark` FROM `Paginated` WHERE 1;

--
-- INSERT template for table `Paginated`
--
INSERT INTO `Paginated`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `Paginated`
--
UPDATE `Paginated` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `Paginated`
--
DELETE FROM `Paginated` WHERE 0;

