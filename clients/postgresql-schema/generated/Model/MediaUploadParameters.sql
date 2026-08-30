--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MediaUploadParameters' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'media_upload_parameters'
--
SELECT content_type, "key", "policy", x_amz_algorithm, x_amz_credential, x_amz_date, x_amz_security_token, x_amz_signature FROM media_upload_parameters WHERE 1=1;

--
-- INSERT template for table 'media_upload_parameters'
--
INSERT INTO media_upload_parameters (content_type, "key", "policy", x_amz_algorithm, x_amz_credential, x_amz_date, x_amz_security_token, x_amz_signature) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'media_upload_parameters'
--
UPDATE media_upload_parameters SET content_type = ?, "key" = ?, "policy" = ?, x_amz_algorithm = ?, x_amz_credential = ?, x_amz_date = ?, x_amz_security_token = ?, x_amz_signature = ? WHERE 1=2;

--
-- DELETE template for table 'media_upload_parameters'
--
DELETE FROM media_upload_parameters WHERE 1=2;

