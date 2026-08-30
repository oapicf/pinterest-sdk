--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Board' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board'
--
SELECT board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count, privacy FROM board WHERE 1=1;

--
-- INSERT template for table 'board'
--
INSERT INTO board (board_pins_modified_at, collaborator_count, created_at, description, follower_count, "id", is_ads_only, media, "name", "owner", pin_count, privacy) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'board'
--
UPDATE board SET board_pins_modified_at = ?, collaborator_count = ?, created_at = ?, description = ?, follower_count = ?, "id" = ?, is_ads_only = ?, media = ?, "name" = ?, "owner" = ?, pin_count = ?, privacy = ? WHERE 1=2;

--
-- DELETE template for table 'board'
--
DELETE FROM board WHERE 1=2;

