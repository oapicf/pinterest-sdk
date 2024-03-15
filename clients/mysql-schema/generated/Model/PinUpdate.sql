--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinUpdate' definition.
--


--
-- SELECT template for table `PinUpdate`
--
SELECT `alt_text`, `board_id`, `board_section_id`, `description`, `link`, `title`, `carousel_slots`, `note` FROM `PinUpdate` WHERE 1;

--
-- INSERT template for table `PinUpdate`
--
INSERT INTO `PinUpdate`(`alt_text`, `board_id`, `board_section_id`, `description`, `link`, `title`, `carousel_slots`, `note`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinUpdate`
--
UPDATE `PinUpdate` SET `alt_text` = ?, `board_id` = ?, `board_section_id` = ?, `description` = ?, `link` = ?, `title` = ?, `carousel_slots` = ?, `note` = ? WHERE 1;

--
-- DELETE template for table `PinUpdate`
--
DELETE FROM `PinUpdate` WHERE 0;

