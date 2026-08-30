--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ImageDetails' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'image_details'
--
SELECT height, url, width FROM image_details WHERE 1=1;

--
-- INSERT template for table 'image_details'
--
INSERT INTO image_details (height, url, width) VALUES (?, ?, ?);

--
-- UPDATE template for table 'image_details'
--
UPDATE image_details SET height = ?, url = ?, width = ? WHERE 1=2;

--
-- DELETE template for table 'image_details'
--
DELETE FROM image_details WHERE 1=2;

