--
-- "Pinterest REST API"
-- Prepared SQL queries for 'InviteAssetsSummaryItem' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'invite_assets_summary_item'
--
SELECT "id", permissions FROM invite_assets_summary_item WHERE 1=1;

--
-- INSERT template for table 'invite_assets_summary_item'
--
INSERT INTO invite_assets_summary_item ("id", permissions) VALUES (?, ?);

--
-- UPDATE template for table 'invite_assets_summary_item'
--
UPDATE invite_assets_summary_item SET "id" = ?, permissions = ? WHERE 1=2;

--
-- DELETE template for table 'invite_assets_summary_item'
--
DELETE FROM invite_assets_summary_item WHERE 1=2;

