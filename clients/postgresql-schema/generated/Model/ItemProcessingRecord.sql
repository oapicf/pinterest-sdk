--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ItemProcessingRecord' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'item_processing_record'
--
SELECT errors, item_id, status, warnings FROM item_processing_record WHERE 1=1;

--
-- INSERT template for table 'item_processing_record'
--
INSERT INTO item_processing_record (errors, item_id, status, warnings) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'item_processing_record'
--
UPDATE item_processing_record SET errors = ?, item_id = ?, status = ?, warnings = ? WHERE 1=2;

--
-- DELETE template for table 'item_processing_record'
--
DELETE FROM item_processing_record WHERE 1=2;

