--
-- "Pinterest REST API"
-- Prepared SQL queries for 'MediaTypeFilter' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'media_type_filter'
--
SELECT media_type FROM media_type_filter WHERE 1=1;

--
-- INSERT template for table 'media_type_filter'
--
INSERT INTO media_type_filter (media_type) VALUES (?);

--
-- UPDATE template for table 'media_type_filter'
--
UPDATE media_type_filter SET media_type = ? WHERE 1=2;

--
-- DELETE template for table 'media_type_filter'
--
DELETE FROM media_type_filter WHERE 1=2;

