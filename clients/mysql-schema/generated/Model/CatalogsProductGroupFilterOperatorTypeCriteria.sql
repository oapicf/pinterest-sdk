--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupFilterOperatorTypeCriteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupFilterOperatorTypeCriteria`
--
SELECT `filter_operator_type`, `negated`, `values` FROM `CatalogsProductGroupFilterOperatorTypeCriteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupFilterOperatorTypeCriteria`
--
INSERT INTO `CatalogsProductGroupFilterOperatorTypeCriteria`(`filter_operator_type`, `negated`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupFilterOperatorTypeCriteria`
--
UPDATE `CatalogsProductGroupFilterOperatorTypeCriteria` SET `filter_operator_type` = ?, `negated` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupFilterOperatorTypeCriteria`
--
DELETE FROM `CatalogsProductGroupFilterOperatorTypeCriteria` WHERE 0;

