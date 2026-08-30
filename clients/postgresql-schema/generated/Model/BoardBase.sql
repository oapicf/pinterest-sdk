--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardBase' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_base'
--
SELECT board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count FROM board_base WHERE 1=1;

--
-- INSERT template for table 'board_base'
--
INSERT INTO board_base (board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'board_base'
--
UPDATE board_base SET board_pins_modified_at = ?, collaborator_count = ?, created_at = ?, description = ?, follower_count = ?, "id" = ?, is_ads_only = ?, media = ?, "name" = ?, "owner" = ?, pin_count = ? WHERE 1=2;

--
-- DELETE template for table 'board_base'
--
DELETE FROM board_base WHERE 1=2;

