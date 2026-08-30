--
-- "Pinterest REST API"
-- Prepared SQL queries for 'RespondToInviteResultItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'respond_to_invite_result_item'
--
SELECT "exception", invite FROM respond_to_invite_result_item WHERE 1=1;

--
-- INSERT template for table 'respond_to_invite_result_item'
--
INSERT INTO respond_to_invite_result_item ("exception", invite) VALUES (?, ?);

--
-- UPDATE template for table 'respond_to_invite_result_item'
--
UPDATE respond_to_invite_result_item SET "exception" = ?, invite = ? WHERE 1=2;

--
-- DELETE template for table 'respond_to_invite_result_item'
--
DELETE FROM respond_to_invite_result_item WHERE 1=2;

