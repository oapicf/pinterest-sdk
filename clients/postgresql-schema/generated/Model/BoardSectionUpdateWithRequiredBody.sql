--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardSectionUpdateWithRequiredBody' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_section_update_with_required_body'
--
SELECT "id", "name" FROM board_section_update_with_required_body WHERE 1=1;

--
-- INSERT template for table 'board_section_update_with_required_body'
--
INSERT INTO board_section_update_with_required_body ("id", "name") VALUES (?, ?);

--
-- UPDATE template for table 'board_section_update_with_required_body'
--
UPDATE board_section_update_with_required_body SET "id" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'board_section_update_with_required_body'
--
DELETE FROM board_section_update_with_required_body WHERE 1=2;

