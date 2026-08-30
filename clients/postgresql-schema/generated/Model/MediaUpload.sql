--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MediaUpload' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'media_upload'
--
SELECT media_id, media_type, upload_parameters, upload_url FROM media_upload WHERE 1=1;

--
-- INSERT template for table 'media_upload'
--
INSERT INTO media_upload (media_id, media_type, upload_parameters, upload_url) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'media_upload'
--
UPDATE media_upload SET media_id = ?, media_type = ?, upload_parameters = ?, upload_url = ? WHERE 1=2;

--
-- DELETE template for table 'media_upload'
--
DELETE FROM media_upload WHERE 1=2;

