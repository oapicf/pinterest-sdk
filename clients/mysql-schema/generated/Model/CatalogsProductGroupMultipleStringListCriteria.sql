--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupMultipleStringListCriteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupMultipleStringListCriteria`
--
SELECT `negated`, `values` FROM `CatalogsProductGroupMultipleStringListCriteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupMultipleStringListCriteria`
--
INSERT INTO `CatalogsProductGroupMultipleStringListCriteria`(`negated`, `values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsProductGroupMultipleStringListCriteria`
--
UPDATE `CatalogsProductGroupMultipleStringListCriteria` SET `negated` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupMultipleStringListCriteria`
--
DELETE FROM `CatalogsProductGroupMultipleStringListCriteria` WHERE 0;

