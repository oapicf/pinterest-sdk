--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pin' definition.
--


--
-- SELECT template for table `Pin`
--
SELECT `ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics`, `alt_text`, `description`, `link`, `title` FROM `Pin` WHERE 1;

--
-- INSERT template for table `Pin`
--
INSERT INTO `Pin`(`ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics`, `alt_text`, `description`, `link`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Pin`
--
UPDATE `Pin` SET `ai_disclosures` = ?, `board_id` = ?, `board_owner` = ?, `board_section_id` = ?, `created_at` = ?, `creative_type` = ?, `dominant_color` = ?, `has_been_promoted` = ?, `id` = ?, `is_owner` = ?, `is_product` = ?, `is_standard` = ?, `media` = ?, `parent_pin_id` = ?, `pin_metrics` = ?, `alt_text` = ?, `description` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `Pin`
--
DELETE FROM `Pin` WHERE 0;

