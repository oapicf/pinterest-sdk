--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalog_update'
--
SELECT catalog_type, "name" FROM catalog_update WHERE 1=1;

--
-- INSERT template for table 'catalog_update'
--
INSERT INTO catalog_update (catalog_type, "name") VALUES (?, ?);

--
-- UPDATE template for table 'catalog_update'
--
UPDATE catalog_update SET catalog_type = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalog_update'
--
DELETE FROM catalog_update WHERE 1=2;

