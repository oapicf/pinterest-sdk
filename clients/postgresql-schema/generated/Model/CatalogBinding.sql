--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogBinding' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalog_binding'
--
SELECT catalog_type, "id", "name" FROM catalog_binding WHERE 1=1;

--
-- INSERT template for table 'catalog_binding'
--
INSERT INTO catalog_binding (catalog_type, "id", "name") VALUES (?, ?, ?);

--
-- UPDATE template for table 'catalog_binding'
--
UPDATE catalog_binding SET catalog_type = ?, "id" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalog_binding'
--
DELETE FROM catalog_binding WHERE 1=2;

