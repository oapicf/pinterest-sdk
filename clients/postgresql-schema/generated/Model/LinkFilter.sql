--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LinkFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'link_filter'
--
SELECT "link" FROM link_filter WHERE 1=1;

--
-- INSERT template for table 'link_filter'
--
INSERT INTO link_filter ("link") VALUES (?);

--
-- UPDATE template for table 'link_filter'
--
UPDATE link_filter SET "link" = ? WHERE 1=2;

--
-- DELETE template for table 'link_filter'
--
DELETE FROM link_filter WHERE 1=2;

