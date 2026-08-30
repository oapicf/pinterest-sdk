--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Interest' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'interest'
--
SELECT canonical_url, "id", "key", "name" FROM interest WHERE 1=1;

--
-- INSERT template for table 'interest'
--
INSERT INTO interest (canonical_url, "id", "key", "name") VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'interest'
--
UPDATE interest SET canonical_url = ?, "id" = ?, "key" = ?, "name" = ? WHERE 1=2;

--
-- DELETE template for table 'interest'
--
DELETE FROM interest WHERE 1=2;

