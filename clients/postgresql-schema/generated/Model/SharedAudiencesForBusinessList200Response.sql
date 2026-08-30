--
-- "Pinterest REST API"
-- Prepared SQL queries for 'shared_audiences_for_business_list_200_response' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'shared_audiences_for_business_list_200_response'
--
SELECT bookmark, items FROM shared_audiences_for_business_list_200_response WHERE 1=1;

--
-- INSERT template for table 'shared_audiences_for_business_list_200_response'
--
INSERT INTO shared_audiences_for_business_list_200_response (bookmark, items) VALUES (?, ?);

--
-- UPDATE template for table 'shared_audiences_for_business_list_200_response'
--
UPDATE shared_audiences_for_business_list_200_response SET bookmark = ?, items = ? WHERE 1=2;

--
-- DELETE template for table 'shared_audiences_for_business_list_200_response'
--
DELETE FROM shared_audiences_for_business_list_200_response WHERE 1=2;

