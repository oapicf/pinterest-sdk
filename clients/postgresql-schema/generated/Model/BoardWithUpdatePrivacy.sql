--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardWithUpdatePrivacy' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_with_update_privacy'
--
SELECT board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count, privacy FROM board_with_update_privacy WHERE 1=1;

--
-- INSERT template for table 'board_with_update_privacy'
--
INSERT INTO board_with_update_privacy (board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count, privacy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'board_with_update_privacy'
--
UPDATE board_with_update_privacy SET board_pins_modified_at = ?, collaborator_count = ?, created_at = ?, description = ?, follower_count = ?, "id" = ?, is_ads_only = ?, media = ?, "name" = ?, "owner" = ?, pin_count = ?, privacy = ? WHERE 1=2;

--
-- DELETE template for table 'board_with_update_privacy'
--
DELETE FROM board_with_update_privacy WHERE 1=2;

