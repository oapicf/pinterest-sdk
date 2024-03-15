--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinCreate' definition.
--


--
-- SELECT template for table `PinCreate`
--
SELECT `id`, `created_at`, `link`, `title`, `description`, `dominant_color`, `alt_text`, `board_id`, `board_section_id`, `board_owner`, `media`, `media_source`, `parent_pin_id`, `note` FROM `PinCreate` WHERE 1;

--
-- INSERT template for table `PinCreate`
--
INSERT INTO `PinCreate`(`id`, `created_at`, `link`, `title`, `description`, `dominant_color`, `alt_text`, `board_id`, `board_section_id`, `board_owner`, `media`, `media_source`, `parent_pin_id`, `note`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinCreate`
--
UPDATE `PinCreate` SET `id` = ?, `created_at` = ?, `link` = ?, `title` = ?, `description` = ?, `dominant_color` = ?, `alt_text` = ?, `board_id` = ?, `board_section_id` = ?, `board_owner` = ?, `media` = ?, `media_source` = ?, `parent_pin_id` = ?, `note` = ? WHERE 1;

--
-- DELETE template for table `PinCreate`
--
DELETE FROM `PinCreate` WHERE 0;

