--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CatalogCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalog_create'
--
SELECT catalog_type, "name" FROM catalog_create WHERE 1=1;

--
-- INSERT template for table 'catalog_create'
--
INSERT INTO catalog_create (catalog_type, "name") VALUES (?, ?);

--
-- UPDATE template for table 'catalog_create'
--
UPDATE catalog_create SET catalog_type = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'catalog_create'
--
DELETE FROM catalog_create WHERE 1=2;

