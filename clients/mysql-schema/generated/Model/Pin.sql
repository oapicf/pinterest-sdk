--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pin' definition.
--


--
-- SELECT template for table `Pin`
--
SELECT `id`, `created_at`, `link`, `title`, `description`, `dominant_color`, `alt_text`, `creative_type`, `board_id`, `board_section_id`, `board_owner`, `is_owner`, `media`, `media_source`, `parent_pin_id`, `is_standard`, `has_been_promoted`, `note`, `pin_metrics` FROM `Pin` WHERE 1;

--
-- INSERT template for table `Pin`
--
INSERT INTO `Pin`(`id`, `created_at`, `link`, `title`, `description`, `dominant_color`, `alt_text`, `creative_type`, `board_id`, `board_section_id`, `board_owner`, `is_owner`, `media`, `media_source`, `parent_pin_id`, `is_standard`, `has_been_promoted`, `note`, `pin_metrics`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Pin`
--
UPDATE `Pin` SET `id` = ?, `created_at` = ?, `link` = ?, `title` = ?, `description` = ?, `dominant_color` = ?, `alt_text` = ?, `creative_type` = ?, `board_id` = ?, `board_section_id` = ?, `board_owner` = ?, `is_owner` = ?, `media` = ?, `media_source` = ?, `parent_pin_id` = ?, `is_standard` = ?, `has_been_promoted` = ?, `note` = ?, `pin_metrics` = ? WHERE 1;

--
-- DELETE template for table `Pin`
--
DELETE FROM `Pin` WHERE 0;

