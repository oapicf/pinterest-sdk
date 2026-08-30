--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BaseInviteDataResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'base_invite_data_response'
--
SELECT "id", invite_data, is_received_invite, "user" FROM base_invite_data_response WHERE 1=1;

--
-- INSERT template for table 'base_invite_data_response'
--
INSERT INTO base_invite_data_response ("id", invite_data, is_received_invite, "user") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'base_invite_data_response'
--
UPDATE base_invite_data_response SET "id" = ?, invite_data = ?, is_received_invite = ?, "user" = ? WHERE 1=2;

--
-- DELETE template for table 'base_invite_data_response'
--
DELETE FROM base_invite_data_response WHERE 1=2;

