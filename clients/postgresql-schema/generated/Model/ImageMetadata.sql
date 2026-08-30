--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ImageMetadata' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'image_metadata'
--
SELECT description, images, item_type, "link", title FROM image_metadata WHERE 1=1;

--
-- INSERT template for table 'image_metadata'
--
INSERT INTO image_metadata (description, images, item_type, "link", title) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'image_metadata'
--
UPDATE image_metadata SET description = ?, images = ?, item_type = ?, "link" = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'image_metadata'
--
DELETE FROM image_metadata WHERE 1=2;

