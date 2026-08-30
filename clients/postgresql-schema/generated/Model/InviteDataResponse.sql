--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteDataResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_data_response'
--
SELECT invite_expiration, invite_status, invite_type, last_updated_time, sent_at FROM invite_data_response WHERE 1=1;

--
-- INSERT template for table 'invite_data_response'
--
INSERT INTO invite_data_response (invite_expiration, invite_status, invite_type, last_updated_time, sent_at) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'invite_data_response'
--
UPDATE invite_data_response SET invite_expiration = ?, invite_status = ?, invite_type = ?, last_updated_time = ?, sent_at = ? WHERE 1=2;

--
-- DELETE template for table 'invite_data_response'
--
DELETE FROM invite_data_response WHERE 1=2;

