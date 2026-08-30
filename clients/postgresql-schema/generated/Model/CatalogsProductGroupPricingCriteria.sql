--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupPricingCriteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_pricing_criteria'
--
SELECT inclusion, negated, "values" FROM catalogs_product_group_pricing_criteria WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_pricing_criteria'
--
INSERT INTO catalogs_product_group_pricing_criteria (inclusion, negated, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_pricing_criteria'
--
UPDATE catalogs_product_group_pricing_criteria SET inclusion = ?, negated = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_pricing_criteria'
--
DELETE FROM catalogs_product_group_pricing_criteria WHERE 1=2;

