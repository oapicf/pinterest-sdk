--
-- Pinterest REST API.
-- Prepared SQL queries for 'Pin' definition.
--


--
-- SELECT template for table `Pin`
--
SELECT `id`, `created_at`, `link`, `title`, `description`, `alt_text`, `board_id`, `board_section_id`, `board_owner`, `media`, `media_source` FROM `Pin` WHERE 1;

--
-- INSERT template for table `Pin`
--
INSERT INTO `Pin`(`id`, `created_at`, `link`, `title`, `description`, `alt_text`, `board_id`, `board_section_id`, `board_owner`, `media`, `media_source`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Pin`
--
UPDATE `Pin` SET `id` = ?, `created_at` = ?, `link` = ?, `title` = ?, `description` = ?, `alt_text` = ?, `board_id` = ?, `board_section_id` = ?, `board_owner` = ?, `media` = ?, `media_source` = ? WHERE 1;

--
-- DELETE template for table `Pin`
--
DELETE FROM `Pin` WHERE 0;

