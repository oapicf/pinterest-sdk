--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BulkDownload' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'bulk_download'
--
SELECT request_id FROM bulk_download WHERE 1=1;

--
-- INSERT template for table 'bulk_download'
--
INSERT INTO bulk_download (request_id) VALUES (?);

--
-- UPDATE template for table 'bulk_download'
--
UPDATE bulk_download SET request_id = ? WHERE 1=2;

--
-- DELETE template for table 'bulk_download'
--
DELETE FROM bulk_download WHERE 1=2;

