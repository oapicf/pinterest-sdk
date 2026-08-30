--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinRead' definition.
--


--
-- SELECT template for table `PinRead`
--
SELECT `ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics`, `alt_text`, `description`, `link`, `title` FROM `PinRead` WHERE 1;

--
-- INSERT template for table `PinRead`
--
INSERT INTO `PinRead`(`ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics`, `alt_text`, `description`, `link`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinRead`
--
UPDATE `PinRead` SET `ai_disclosures` = ?, `board_id` = ?, `board_owner` = ?, `board_section_id` = ?, `created_at` = ?, `creative_type` = ?, `dominant_color` = ?, `has_been_promoted` = ?, `id` = ?, `is_owner` = ?, `is_product` = ?, `is_standard` = ?, `media` = ?, `parent_pin_id` = ?, `pin_metrics` = ?, `alt_text` = ?, `description` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `PinRead`
--
DELETE FROM `PinRead` WHERE 0;

