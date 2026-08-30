--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardSectionCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_section_create'
--
SELECT "id", "name" FROM board_section_create WHERE 1=1;

--
-- INSERT template for table 'board_section_create'
--
INSERT INTO board_section_create ("id", "name") VALUES (?, ?);

--
-- UPDATE template for table 'board_section_create'
--
UPDATE board_section_create SET "id" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'board_section_create'
--
DELETE FROM board_section_create WHERE 1=2;

