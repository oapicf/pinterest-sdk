--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RecordCounts' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'record_counts'
--
SELECT invalid, processed, "valid" FROM record_counts WHERE 1=1;

--
-- INSERT template for table 'record_counts'
--
INSERT INTO record_counts (invalid, processed, "valid") VALUES (?, ?, ?);

--
-- UPDATE template for table 'record_counts'
--
UPDATE record_counts SET invalid = ?, processed = ?, "valid" = ? WHERE 1=2;

--
-- DELETE template for table 'record_counts'
--
DELETE FROM record_counts WHERE 1=2;

