--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ImageSize' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'image_size'
--
SELECT 1200x, 150x150, 400x300, 600x FROM image_size WHERE 1=1;

--
-- INSERT template for table 'image_size'
--
INSERT INTO image_size (1200x, 150x150, 400x300, 600x) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table 'image_size'
--
UPDATE image_size SET 1200x = ?, 150x150 = ?, 400x300 = ?, 600x = ? WHERE 1=2;

--
-- DELETE template for table 'image_size'
--
DELETE FROM image_size WHERE 1=2;

