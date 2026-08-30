--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupMultipleStringListCriteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_multiple_string_list_criteria'
--
SELECT negated, "values" FROM catalogs_product_group_multiple_string_list_criteria WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_multiple_string_list_criteria'
--
INSERT INTO catalogs_product_group_multiple_string_list_criteria (negated, "values") VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_product_group_multiple_string_list_criteria'
--
UPDATE catalogs_product_group_multiple_string_list_criteria SET negated = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_multiple_string_list_criteria'
--
DELETE FROM catalogs_product_group_multiple_string_list_criteria WHERE 1=2;

