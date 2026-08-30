--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CarouselSlot' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'carousel_slot'
--
SELECT description, "link", title FROM carousel_slot WHERE 1=1;

--
-- INSERT template for table 'carousel_slot'
--
INSERT INTO carousel_slot (description, "link", title) VALUES (?, ?, ?);

--
-- UPDATE template for table 'carousel_slot'
--
UPDATE carousel_slot SET description = ?, "link" = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'carousel_slot'
--
DELETE FROM carousel_slot WHERE 1=2;

