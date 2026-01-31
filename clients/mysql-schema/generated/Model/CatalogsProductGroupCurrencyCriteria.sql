--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupCurrencyCriteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupCurrencyCriteria`
--
SELECT `negated`, `values` FROM `CatalogsProductGroupCurrencyCriteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupCurrencyCriteria`
--
INSERT INTO `CatalogsProductGroupCurrencyCriteria`(`negated`, `values`) VALUES (?, ?);

--
-- UPDATE template for table `CatalogsProductGroupCurrencyCriteria`
--
UPDATE `CatalogsProductGroupCurrencyCriteria` SET `negated` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupCurrencyCriteria`
--
DELETE FROM `CatalogsProductGroupCurrencyCriteria` WHERE 0;

