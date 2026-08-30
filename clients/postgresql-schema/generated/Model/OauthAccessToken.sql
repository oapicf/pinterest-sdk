--
-- "Pinterest REST API"
-- Prepared SQL queries for 'OauthAccessToken' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'oauth_access_token'
--
SELECT access_token, expires_in, refresh_token, refresh_token_expires_at, refresh_token_expires_in, response_type, "scope", token_type FROM oauth_access_token WHERE 1=1;

--
-- INSERT template for table 'oauth_access_token'
--
INSERT INTO oauth_access_token (access_token, expires_in, refresh_token, refresh_token_expires_at, refresh_token_expires_in, response_type, "scope", token_type) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'oauth_access_token'
--
UPDATE oauth_access_token SET access_token = ?, expires_in = ?, refresh_token = ?, refresh_token_expires_at = ?, refresh_token_expires_in = ?, response_type = ?, "scope" = ?, token_type = ? WHERE 1=2;

--
-- DELETE template for table 'oauth_access_token'
--
DELETE FROM oauth_access_token WHERE 1=2;

