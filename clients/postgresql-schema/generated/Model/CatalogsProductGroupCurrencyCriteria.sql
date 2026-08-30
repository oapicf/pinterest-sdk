--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupCurrencyCriteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_currency_criteria'
--
SELECT negated, "values" FROM catalogs_product_group_currency_criteria WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_currency_criteria'
--
INSERT INTO catalogs_product_group_currency_criteria (negated, "values") VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_product_group_currency_criteria'
--
UPDATE catalogs_product_group_currency_criteria SET negated = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_currency_criteria'
--
DELETE FROM catalogs_product_group_currency_criteria WHERE 1=2;

