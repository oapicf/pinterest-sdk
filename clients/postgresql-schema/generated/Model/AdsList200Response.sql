--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ads_list_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ads_list_200_response'
--
SELECT bookmark, items FROM ads_list_200_response WHERE 1=1;

--
-- INSERT template for table 'ads_list_200_response'
--
INSERT INTO ads_list_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'ads_list_200_response'
--
UPDATE ads_list_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'ads_list_200_response'
--
DELETE FROM ads_list_200_response WHERE 1=2;

