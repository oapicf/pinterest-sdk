--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Catalog' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'catalog'
--
SELECT catalog_type, created_at, "id", "name", updated_at FROM "catalog" WHERE 1=1;

--
-- INSERT template for table 'catalog'
--
INSERT INTO "catalog" (catalog_type, created_at, "id", "name", updated_at) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'catalog'
--
UPDATE "catalog" SET catalog_type = ?, created_at = ?, "id" = ?, "name" = ?, updated_at = ? WHERE 1=2;

--
-- DELETE template for table 'catalog'
--
DELETE FROM "catalog" WHERE 1=2;

