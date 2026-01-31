--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pin' definition.
--


--
-- SELECT template for table `Pin`
--
SELECT `alt_text`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `description`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_standard`, `link`, `media`, `parent_pin_id`, `pin_metrics`, `title` FROM `Pin` WHERE 1;

--
-- INSERT template for table `Pin`
--
INSERT INTO `Pin`(`alt_text`, `board_id`, `board_owner`, `board_section_id`, `created_at`, `creative_type`, `description`, `dominant_color`, `has_been_promoted`, `id`, `is_owner`, `is_standard`, `link`, `media`, `parent_pin_id`, `pin_metrics`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Pin`
--
UPDATE `Pin` SET `alt_text` = ?, `board_id` = ?, `board_owner` = ?, `board_section_id` = ?, `created_at` = ?, `creative_type` = ?, `description` = ?, `dominant_color` = ?, `has_been_promoted` = ?, `id` = ?, `is_owner` = ?, `is_standard` = ?, `link` = ?, `media` = ?, `parent_pin_id` = ?, `pin_metrics` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `Pin`
--
DELETE FROM `Pin` WHERE 0;

