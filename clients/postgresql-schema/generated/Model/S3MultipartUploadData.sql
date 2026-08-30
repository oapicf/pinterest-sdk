--
-- "Pinterest REST API"
-- Prepared SQL queries for 'S3MultipartUploadData' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 's3_multipart_upload_data'
--
SELECT file_parts FROM s3_multipart_upload_data WHERE 1=1;

--
-- INSERT template for table 's3_multipart_upload_data'
--
INSERT INTO s3_multipart_upload_data (file_parts) VALUES (?);

--
-- UPDATE template for table 's3_multipart_upload_data'
--
UPDATE s3_multipart_upload_data SET file_parts = ? WHERE 1=2;

--
-- DELETE template for table 's3_multipart_upload_data'
--
DELETE FROM s3_multipart_upload_data WHERE 1=2;

