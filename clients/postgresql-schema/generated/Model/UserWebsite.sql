--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UserWebsite' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'user_website'
--
SELECT status, verified_at, website FROM user_website WHERE 1=1;

--
-- INSERT template for table 'user_website'
--
INSERT INTO user_website (status, verified_at, website) VALUES (?, ?, ?);

--
-- UPDATE template for table 'user_website'
--
UPDATE user_website SET status = ?, verified_at = ?, website = ? WHERE 1=2;

--
-- DELETE template for table 'user_website'
--
DELETE FROM user_website WHERE 1=2;

