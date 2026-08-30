--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_create'
--
SELECT ai_disclosures, alt_text, board_id, board_section_id, description, dominant_color, "link", media_source, parent_pin_id, sponsor_id, title FROM pin_create WHERE 1=1;

--
-- INSERT template for table 'pin_create'
--
INSERT INTO pin_create (ai_disclosures, alt_text, board_id, board_section_id, description, dominant_color, "link", media_source, parent_pin_id, sponsor_id, title) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_create'
--
UPDATE pin_create SET ai_disclosures = ?, alt_text = ?, board_id = ?, board_section_id = ?, description = ?, dominant_color = ?, "link" = ?, media_source = ?, parent_pin_id = ?, sponsor_id = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'pin_create'
--
DELETE FROM pin_create WHERE 1=2;

