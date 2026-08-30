--
-- "Pinterest REST API"
-- Prepared SQL queries for 'FollowUserCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'follow_user_create'
--
SELECT auto_follow FROM follow_user_create WHERE 1=1;

--
-- INSERT template for table 'follow_user_create'
--
INSERT INTO follow_user_create (auto_follow) VALUES (?);

--
-- UPDATE template for table 'follow_user_create'
--
UPDATE follow_user_create SET auto_follow = ? WHERE 1=2;

--
-- DELETE template for table 'follow_user_create'
--
DELETE FROM follow_user_create WHERE 1=2;

