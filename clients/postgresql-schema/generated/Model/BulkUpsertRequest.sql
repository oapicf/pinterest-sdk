--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkUpsertRequest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_upsert_request'
--
SELECT "create", "update" FROM bulk_upsert_request WHERE 1=1;

--
-- INSERT template for table 'bulk_upsert_request'
--
INSERT INTO bulk_upsert_request ("create", "update") VALUES (?, ?);

--
-- UPDATE template for table 'bulk_upsert_request'
--
UPDATE bulk_upsert_request SET "create" = ?, "update" = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_upsert_request'
--
DELETE FROM bulk_upsert_request WHERE 1=2;

