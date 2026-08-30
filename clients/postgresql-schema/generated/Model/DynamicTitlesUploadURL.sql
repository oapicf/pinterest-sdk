--
-- "Pinterest REST API"
-- Prepared SQL queries for 'DynamicTitlesUploadURL' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'dynamic_titles_upload_url'
--
SELECT existing_filename, request_id, upload_url FROM dynamic_titles_upload_url WHERE 1=1;

--
-- INSERT template for table 'dynamic_titles_upload_url'
--
INSERT INTO dynamic_titles_upload_url (existing_filename, request_id, upload_url) VALUES (?, ?, ?);

--
-- UPDATE template for table 'dynamic_titles_upload_url'
--
UPDATE dynamic_titles_upload_url SET existing_filename = ?, request_id = ?, upload_url = ? WHERE 1=2;

--
-- DELETE template for table 'dynamic_titles_upload_url'
--
DELETE FROM dynamic_titles_upload_url WHERE 1=2;

