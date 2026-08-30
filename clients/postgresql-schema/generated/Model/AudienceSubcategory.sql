--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceSubcategory' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_subcategory'
--
SELECT "id", "index", "key", "name", ratio FROM audience_subcategory WHERE 1=1;

--
-- INSERT template for table 'audience_subcategory'
--
INSERT INTO audience_subcategory ("id", "index", "key", "name", ratio) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'audience_subcategory'
--
UPDATE audience_subcategory SET "id" = ?, "index" = ?, "key" = ?, "name" = ?, ratio = ? WHERE 1=2;

--
-- DELETE template for table 'audience_subcategory'
--
DELETE FROM audience_subcategory WHERE 1=2;

