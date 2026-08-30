--
-- "Pinterest REST API"
-- Prepared SQL queries for 'S3FilePart' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 's3_file_part'
--
SELECT part_number, presigned_url FROM s3_file_part WHERE 1=1;

--
-- INSERT template for table 's3_file_part'
--
INSERT INTO s3_file_part (part_number, presigned_url) VALUES (?, ?);

--
-- UPDATE template for table 's3_file_part'
--
UPDATE s3_file_part SET part_number = ?, presigned_url = ? WHERE 1=2;

--
-- DELETE template for table 's3_file_part'
--
DELETE FROM s3_file_part WHERE 1=2;

