--
-- "Pinterest REST API"
-- Prepared SQL queries for 'page_visit_conversion_tags_get_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'page_visit_conversion_tags_get_200_response'
--
SELECT bookmark, items FROM page_visit_conversion_tags_get_200_response WHERE 1=1;

--
-- INSERT template for table 'page_visit_conversion_tags_get_200_response'
--
INSERT INTO page_visit_conversion_tags_get_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'page_visit_conversion_tags_get_200_response'
--
UPDATE page_visit_conversion_tags_get_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'page_visit_conversion_tags_get_200_response'
--
DELETE FROM page_visit_conversion_tags_get_200_response WHERE 1=2;

