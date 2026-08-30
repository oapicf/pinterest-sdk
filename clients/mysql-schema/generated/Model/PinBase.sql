--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinBase' definition.
--


--
-- SELECT template for table `PinBase`
--
SELECT `ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics` FROM `PinBase` WHERE 1;

--
-- INSERT template for table `PinBase`
--
INSERT INTO `PinBase`(`ai_disclosures`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_product`, `is_standard`, `media`, `parent_pin_id`, `pin_metrics`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinBase`
--
UPDATE `PinBase` SET `ai_disclosures` = ?, `board_id` = ?, `board_owner` = ?, `board_section_id` = ?, `created_at` = ?, `creative_type` = ?, `dominant_color` = ?, `has_been_promoted` = ?, `id` = ?, `is_owner` = ?, `is_product` = ?, `is_standard` = ?, `media` = ?, `parent_pin_id` = ?, `pin_metrics` = ? WHERE 1;

--
-- DELETE template for table `PinBase`
--
DELETE FROM `PinBase` WHERE 0;

