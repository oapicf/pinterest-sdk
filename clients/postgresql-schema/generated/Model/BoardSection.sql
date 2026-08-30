--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardSection' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_section'
--
SELECT "id", "name" FROM board_section WHERE 1=1;

--
-- INSERT template for table 'board_section'
--
INSERT INTO board_section ("id", "name") VALUES (?, ?);

--
-- UPDATE template for table 'board_section'
--
UPDATE board_section SET "id" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'board_section'
--
DELETE FROM board_section WHERE 1=2;

