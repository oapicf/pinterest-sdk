--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SupplementalItemsBatchResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'supplemental_items_batch_response'
--
SELECT batch_id, completed_time, created_time, operation_results, status FROM supplemental_items_batch_response WHERE 1=1;

--
-- INSERT template for table 'supplemental_items_batch_response'
--
INSERT INTO supplemental_items_batch_response (batch_id, completed_time, created_time, operation_results, status) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'supplemental_items_batch_response'
--
UPDATE supplemental_items_batch_response SET batch_id = ?, completed_time = ?, created_time = ?, operation_results = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'supplemental_items_batch_response'
--
DELETE FROM supplemental_items_batch_response WHERE 1=2;

