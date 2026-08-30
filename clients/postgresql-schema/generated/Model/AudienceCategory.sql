--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AudienceCategory' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'audience_category'
--
SELECT "id", "index", "key", "name", ratio, subcategories FROM audience_category WHERE 1=1;

--
-- INSERT template for table 'audience_category'
--
INSERT INTO audience_category ("id", "index", "key", "name", ratio, subcategories) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'audience_category'
--
UPDATE audience_category SET "id" = ?, "index" = ?, "key" = ?, "name" = ?, ratio = ?, subcategories = ? WHERE 1=2;

--
-- DELETE template for table 'audience_category'
--
DELETE FROM audience_category WHERE 1=2;

