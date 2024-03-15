--
-- Pinterest REST API.
-- Prepared SQL queries for 'CatalogsProductGroupPricingCriteria' definition.
--


--
-- SELECT template for table `CatalogsProductGroupPricingCriteria`
--
SELECT `inclusion`, `values`, `negated` FROM `CatalogsProductGroupPricingCriteria` WHERE 1;

--
-- INSERT template for table `CatalogsProductGroupPricingCriteria`
--
INSERT INTO `CatalogsProductGroupPricingCriteria`(`inclusion`, `values`, `negated`) VALUES (?, ?, ?);

--
-- UPDATE template for table `CatalogsProductGroupPricingCriteria`
--
UPDATE `CatalogsProductGroupPricingCriteria` SET `inclusion` = ?, `values` = ?, `negated` = ? WHERE 1;

--
-- DELETE template for table `CatalogsProductGroupPricingCriteria`
--
DELETE FROM `CatalogsProductGroupPricingCriteria` WHERE 0;

