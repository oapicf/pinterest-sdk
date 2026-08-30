--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardSectionCreate' definition.
--


--
-- SELECT template for table `BoardSectionCreate`
--
SELECT `id`, `name` FROM `BoardSectionCreate` WHERE 1;

--
-- INSERT template for table `BoardSectionCreate`
--
INSERT INTO `BoardSectionCreate`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `BoardSectionCreate`
--
UPDATE `BoardSectionCreate` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `BoardSectionCreate`
--
DELETE FROM `BoardSectionCreate` WHERE 0;

