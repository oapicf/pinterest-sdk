--
-- "Pinterest REST API"
-- Prepared SQL queries for 'TrendingPin' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'trending_pin'
--
SELECT color, height, "id", src, vertical_offset, width FROM trending_pin WHERE 1=1;

--
-- INSERT template for table 'trending_pin'
--
INSERT INTO trending_pin (color, height, "id", src, vertical_offset, width) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'trending_pin'
--
UPDATE trending_pin SET color = ?, height = ?, "id" = ?, src = ?, vertical_offset = ?, width = ? WHERE 1=2;

--
-- DELETE template for table 'trending_pin'
--
DELETE FROM trending_pin WHERE 1=2;

