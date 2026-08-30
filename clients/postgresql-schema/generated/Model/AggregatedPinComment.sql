--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AggregatedPinComment' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'aggregated_pin_comment'
--
SELECT ai_disclosures, alt_text, board_id, board_owner, board_section_id, created_at, creative_type, description, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, "link", media, parent_pin_id, pin_metrics, title FROM aggregated_pin_comment WHERE 1=1;

--
-- INSERT template for table 'aggregated_pin_comment'
--
INSERT INTO aggregated_pin_comment (ai_disclosures, alt_text, board_id, board_owner, board_section_id, created_at, creative_type, description, dominant_color, has_been_promoted, "id", is_owner, is_product, is_standard, "link", media, parent_pin_id, pin_metrics, title) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'aggregated_pin_comment'
--
UPDATE aggregated_pin_comment SET ai_disclosures = ?, alt_text = ?, board_id = ?, board_owner = ?, board_section_id = ?, created_at = ?, creative_type = ?, description = ?, dominant_color = ?, has_been_promoted = ?, "id" = ?, is_owner = ?, is_product = ?, is_standard = ?, "link" = ?, media = ?, parent_pin_id = ?, pin_metrics = ?, title = ? WHERE 1=2;

--
-- DELETE template for table 'aggregated_pin_comment'
--
DELETE FROM aggregated_pin_comment WHERE 1=2;

