--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupFilterOperatorTypeCriteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_filter_operator_type_criteria'
--
SELECT filter_operator_type, negated, "values" FROM catalogs_product_group_filter_operator_type_criteria WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_filter_operator_type_criteria'
--
INSERT INTO catalogs_product_group_filter_operator_type_criteria (filter_operator_type, negated, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_filter_operator_type_criteria'
--
UPDATE catalogs_product_group_filter_operator_type_criteria SET filter_operator_type = ?, negated = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_filter_operator_type_criteria'
--
DELETE FROM catalogs_product_group_filter_operator_type_criteria WHERE 1=2;

