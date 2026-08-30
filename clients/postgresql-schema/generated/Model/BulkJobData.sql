--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkJobData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_job_data'
--
SELECT result_url, status, workload_id FROM bulk_job_data WHERE 1=1;

--
-- INSERT template for table 'bulk_job_data'
--
INSERT INTO bulk_job_data (result_url, status, workload_id) VALUES (?, ?, ?);

--
-- UPDATE template for table 'bulk_job_data'
--
UPDATE bulk_job_data SET result_url = ?, status = ?, workload_id = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_job_data'
--
DELETE FROM bulk_job_data WHERE 1=2;

