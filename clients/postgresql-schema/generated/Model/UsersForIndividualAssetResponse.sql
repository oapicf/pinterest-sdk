--
-- "Pinterest REST API"
-- Prepared SQL queries for 'UsersForIndividualAssetResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'users_for_individual_asset_response'
--
SELECT asset_id, member_id, permissions FROM users_for_individual_asset_response WHERE 1=1;

--
-- INSERT template for table 'users_for_individual_asset_response'
--
INSERT INTO users_for_individual_asset_response (asset_id, member_id, permissions) VALUES (?, ?, ?);

--
-- UPDATE template for table 'users_for_individual_asset_response'
--
UPDATE users_for_individual_asset_response SET asset_id = ?, member_id = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'users_for_individual_asset_response'
--
DELETE FROM users_for_individual_asset_response WHERE 1=2;

