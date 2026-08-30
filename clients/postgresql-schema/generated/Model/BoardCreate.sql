--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BoardCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'board_create'
--
SELECT description, is_ads_only, "name", privacy FROM board_create WHERE 1=1;

--
-- INSERT template for table 'board_create'
--
INSERT INTO board_create (description, is_ads_only, "name", privacy) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'board_create'
--
UPDATE board_create SET description = ?, is_ads_only = ?, "name" = ?, privacy = ? WHERE 1=2;

--
-- DELETE template for table 'board_create'
--
DELETE FROM board_create WHERE 1=2;

