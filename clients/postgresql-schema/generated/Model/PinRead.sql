--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinRead' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_read'
--
SELECT ai_disclosures, board_id, board_owner, board_section_id, created_at, creative_type, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, media, parent_pin_id, pin_metrics, alt_text, description, "link", title FROM pin_read WHERE 1=1;

--
-- INSERT template for table 'pin_read'
--
INSERT INTO pin_read (ai_disclosures, board_id, board_owner, board_section_id, created_at, creative_type, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, media, parent_pin_id, pin_metrics, alt_text, description, "link", title) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_read'
--
UPDATE pin_read SET ai_disclosures = ?, board_id = ?, board_owner = ?, board_section_id = ?, created_at = ?, creative_type = ?, dominant_color = ?, has_been_promoted = ?, "id" = ?, is_owner = ?, is_product = ?, is_standard = ?, media = ?, parent_pin_id = ?, pin_metrics = ?, alt_text = ?, description = ?, "link" = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'pin_read'
--
DELETE FROM pin_read WHERE 1=2;

