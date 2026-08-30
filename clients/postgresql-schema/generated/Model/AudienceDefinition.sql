--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceDefinition' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_definition'
--
SELECT "date", "scope", "type" FROM audience_definition WHERE 1=1;

--
-- INSERT template for table 'audience_definition'
--
INSERT INTO audience_definition ("date", "scope", "type") VALUES (?, ?, ?);

--
-- UPDATE template for table 'audience_definition'
--
UPDATE audience_definition SET "date" = ?, "scope" = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'audience_definition'
--
DELETE FROM audience_definition WHERE 1=2;

