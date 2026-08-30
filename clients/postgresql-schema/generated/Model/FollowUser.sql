--
-- "Pinterest REST API"
-- Prepared SQL queries for 'FollowUser' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'follow_user'
--
SELECT "type", username FROM follow_user WHERE 1=1;

--
-- INSERT template for table 'follow_user'
--
INSERT INTO follow_user ("type", username) VALUES (?, ?);

--
-- UPDATE template for table 'follow_user'
--
UPDATE follow_user SET "type" = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'follow_user'
--
DELETE FROM follow_user WHERE 1=2;

