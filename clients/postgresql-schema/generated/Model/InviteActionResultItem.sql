--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteActionResultItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_action_result_item'
--
SELECT "exception", invite FROM invite_action_result_item WHERE 1=1;

--
-- INSERT template for table 'invite_action_result_item'
--
INSERT INTO invite_action_result_item ("exception", invite) VALUES (?, ?);

--
-- UPDATE template for table 'invite_action_result_item'
--
UPDATE invite_action_result_item SET "exception" = ?, invite = ? WHERE 1=2;

--
-- DELETE template for table 'invite_action_result_item'
--
DELETE FROM invite_action_result_item WHERE 1=2;

