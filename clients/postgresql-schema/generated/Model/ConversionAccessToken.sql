--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionAccessToken' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_access_token'
--
SELECT access_token, token_type FROM conversion_access_token WHERE 1=1;

--
-- INSERT template for table 'conversion_access_token'
--
INSERT INTO conversion_access_token (access_token, token_type) VALUES (?, ?);

--
-- UPDATE template for table 'conversion_access_token'
--
UPDATE conversion_access_token SET access_token = ?, token_type = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_access_token'
--
DELETE FROM conversion_access_token WHERE 1=2;

