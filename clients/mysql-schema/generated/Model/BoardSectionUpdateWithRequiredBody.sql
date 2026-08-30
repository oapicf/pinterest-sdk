--
-- Pinterest REST API.
-- Prepared SQL queries for 'BoardSectionUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `BoardSectionUpdateWithRequiredBody`
--
SELECT `id`, `name` FROM `BoardSectionUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `BoardSectionUpdateWithRequiredBody`
--
INSERT INTO `BoardSectionUpdateWithRequiredBody`(`id`, `name`) VALUES (?, ?);

--
-- UPDATE template for table `BoardSectionUpdateWithRequiredBody`
--
UPDATE `BoardSectionUpdateWithRequiredBody` SET `id` = ?, `name` = ? WHERE 1;

--
-- DELETE template for table `BoardSectionUpdateWithRequiredBody`
--
DELETE FROM `BoardSectionUpdateWithRequiredBody` WHERE 0;

