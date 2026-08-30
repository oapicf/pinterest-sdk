--
-- "Pinterest REST API"
-- Prepared SQL queries for 'LinkedBusiness' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'linked_business'
--
SELECT image_large_url, image_medium_url, image_small_url, image_xlarge_url, username FROM linked_business WHERE 1=1;

--
-- INSERT template for table 'linked_business'
--
INSERT INTO linked_business (image_large_url, image_medium_url, image_small_url, image_xlarge_url, username) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'linked_business'
--
UPDATE linked_business SET image_large_url = ?, image_medium_url = ?, image_small_url = ?, image_xlarge_url = ?, username = ? WHERE 1=2;

--
-- DELETE template for table 'linked_business'
--
DELETE FROM linked_business WHERE 1=2;

