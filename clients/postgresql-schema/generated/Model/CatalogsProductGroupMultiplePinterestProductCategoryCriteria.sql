--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogsProductGroupMultiplePinterestProductCategoryCriteria' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalogs_product_group_multiple_pinterest_product_category_crit'
--
SELECT negated, "values" FROM catalogs_product_group_multiple_pinterest_product_category_crit WHERE 1=1;

--
-- INSERT template for table 'catalogs_product_group_multiple_pinterest_product_category_crit'
--
INSERT INTO catalogs_product_group_multiple_pinterest_product_category_crit (negated, "values") VALUES (?, ?);

--
-- UPDATE template for table 'catalogs_product_group_multiple_pinterest_product_category_crit'
--
UPDATE catalogs_product_group_multiple_pinterest_product_category_crit SET negated = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'catalogs_product_group_multiple_pinterest_product_category_crit'
--
DELETE FROM catalogs_product_group_multiple_pinterest_product_category_crit WHERE 1=2;

