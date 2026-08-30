--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_update'
--
SELECT ai_disclosures, alt_text, board_id, board_section_id, carousel_slots, description, "link", title FROM pin_update WHERE 1=1;

--
-- INSERT template for table 'pin_update'
--
INSERT INTO pin_update (ai_disclosures, alt_text, board_id, board_section_id, carousel_slots, description, "link", title) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_update'
--
UPDATE pin_update SET ai_disclosures = ?, alt_text = ?, board_id = ?, board_section_id = ?, carousel_slots = ?, description = ?, "link" = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'pin_update'
--
DELETE FROM pin_update WHERE 1=2;

