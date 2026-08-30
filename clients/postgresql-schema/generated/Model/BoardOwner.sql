--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardOwner' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_owner'
--
SELECT username FROM board_owner WHERE 1=1;

--
-- INSERT template for table 'board_owner'
--
INSERT INTO board_owner (username) VALUES (?);

--
-- UPDATE template for table 'board_owner'
--
UPDATE board_owner SET username = ? WHERE 1=2;

--
-- DELETE template for table 'board_owner'
--
DELETE FROM board_owner WHERE 1=2;

