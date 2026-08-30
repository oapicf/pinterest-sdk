--
-- "Pinterest REST API"
-- Prepared SQL queries for 'PinBase' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'pin_base'
--
SELECT ai_disclosures, board_id, board_owner, board_section_id, created_at, creative_type, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, media, parent_pin_id, pin_metrics FROM pin_base WHERE 1=1;

--
-- INSERT template for table 'pin_base'
--
INSERT INTO pin_base (ai_disclosures, board_id, board_owner, board_section_id, created_at, creative_type, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, media, parent_pin_id, pin_metrics) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'pin_base'
--
UPDATE pin_base SET ai_disclosures = ?, board_id = ?, board_owner = ?, board_section_id = ?, created_at = ?, creative_type = ?, dominant_color = ?, has_been_promoted = ?, "id" = ?, is_owner = ?, is_product = ?, is_standard = ?, media = ?, parent_pin_id = ?, pin_metrics = ? WHERE 1=2;

--
-- DELETE template for table 'pin_base'
--
DELETE FROM pin_base WHERE 1=2;

