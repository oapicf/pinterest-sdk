--
-- Pinterest REST API.
-- Prepared SQL queries for 'AggregatedPinComment' definition.
--


--
-- SELECT template for table `AggregatedPinComment`
--
SELECT `ai_disclosures`, `alt_text`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `description`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `link`, `media`, `parent_pin_id`, `pin_metrics`, `title` FROM `AggregatedPinComment` WHERE 1;

--
-- INSERT template for table `AggregatedPinComment`
--
INSERT INTO `AggregatedPinComment`(`ai_disclosures`, `alt_text`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `description`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `link`, `media`, `parent_pin_id`, `pin_metrics`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AggregatedPinComment`
--
UPDATE `AggregatedPinComment` SET `ai_disclosures` = ?, `alt_text` = ?, `board_id` = ?, `board_owner` = ?, `board_section_id` = ?, `created_at` = ?, `creative_type` = ?, `description` = ?, `dominant_color` = ?, `has_been_promoted` = ?, `id` = ?, `is_owner` = ?, `is_product` = ?, `is_standard` = ?, `link` = ?, `media` = ?, `parent_pin_id` = ?, `pin_metrics` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `AggregatedPinComment`
--
DELETE FROM `AggregatedPinComment` WHERE 0;

