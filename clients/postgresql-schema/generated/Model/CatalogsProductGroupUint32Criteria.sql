--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupUint32Criteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_uint32_criteria'
--
SELECT negated, "operator", "value" FROM catalogs_product_group_uint32_criteria WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_uint32_criteria'
--
INSERT INTO catalogs_product_group_uint32_criteria (negated, "operator", "value") VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalogs_product_group_uint32_criteria'
--
UPDATE catalogs_product_group_uint32_criteria SET negated = ?, "operator" = ?, "value" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_uint32_criteria'
--
DELETE FROM catalogs_product_group_uint32_criteria WHERE 1=2;

