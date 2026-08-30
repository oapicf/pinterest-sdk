--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardWithUpdatePrivacyUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_with_update_privacy_update'
--
SELECT description, "name", privacy FROM board_with_update_privacy_update WHERE 1=1;

--
-- INSERT template for table 'board_with_update_privacy_update'
--
INSERT INTO board_with_update_privacy_update (description, "name", privacy) VALUES (?, ?, ?);

--
-- UPDATE template for table 'board_with_update_privacy_update'
--
UPDATE board_with_update_privacy_update SET description = ?, "name" = ?, privacy = ? WHERE 1=2;

--
-- DELETE template for table 'board_with_update_privacy_update'
--
DELETE FROM board_with_update_privacy_update WHERE 1=2;

