--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkUpsertResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_upsert_response'
--
SELECT request_id FROM bulk_upsert_response WHERE 1=1;

--
-- INSERT template for table 'bulk_upsert_response'
--
INSERT INTO bulk_upsert_response (request_id) VALUES (?);

--
-- UPDATE template for table 'bulk_upsert_response'
--
UPDATE bulk_upsert_response SET request_id = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_upsert_response'
--
DELETE FROM bulk_upsert_response WHERE 1=2;

