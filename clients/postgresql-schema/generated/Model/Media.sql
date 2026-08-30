--
-- "Pinterest REST API"
-- Prepared SQL queries for 'Media' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'media'
--
SELECT media_id, media_type, status FROM media WHERE 1=1;

--
-- INSERT template for table 'media'
--
INSERT INTO media (media_id, media_type, status) VALUES (?, ?, ?);

--
-- UPDATE template for table 'media'
--
UPDATE media SET media_id = ?, media_type = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'media'
--
DELETE FROM media WHERE 1=2;

