--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UserWebsiteCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'user_website_create'
--
SELECT verification_method, website FROM user_website_create WHERE 1=1;

--
-- INSERT template for table 'user_website_create'
--
INSERT INTO user_website_create (verification_method, website) VALUES (?, ?);

--
-- UPDATE template for table 'user_website_create'
--
UPDATE user_website_create SET verification_method = ?, website = ? WHERE 1=2;

--
-- DELETE template for table 'user_website_create'
--
DELETE FROM user_website_create WHERE 1=2;

