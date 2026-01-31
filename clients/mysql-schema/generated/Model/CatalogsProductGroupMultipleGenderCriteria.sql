--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupMultipleGenderCriteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupMultipleGenderCriteria`
--
SELECT `negated`, `values` FROM `CatalogsProductGroupMultipleGenderCriteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupMultipleGenderCriteria`
--
INSERT INTO `CatalogsProductGroupMultipleGenderCriteria`(`negated`, `values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsProductGroupMultipleGenderCriteria`
--
UPDATE `CatalogsProductGroupMultipleGenderCriteria` SET `negated` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupMultipleGenderCriteria`
--
DELETE FROM `CatalogsProductGroupMultipleGenderCriteria` WHERE 0;

