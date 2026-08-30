--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MediaUploadCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'media_upload_create'
--
SELECT media_type FROM media_upload_create WHERE 1=1;

--
-- INSERT template for table 'media_upload_create'
--
INSERT INTO media_upload_create (media_type) VALUES (?);

--
-- UPDATE template for table 'media_upload_create'
--
UPDATE media_upload_create SET media_type = ? WHERE 1=2;

--
-- DELETE template for table 'media_upload_create'
--
DELETE FROM media_upload_create WHERE 1=2;

