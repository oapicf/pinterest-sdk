--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinUpdate' definition.
--


--
-- SELECT template for table `PinUpdate`
--
SELECT `ai_disclosures`, `alt_text`, `board_id`, `board_section_id`, `carousel_slots`, `description`, `link`, `title` FROM `PinUpdate` WHERE 1;

--
-- INSERT template for table `PinUpdate`
--
INSERT INTO `PinUpdate`(`ai_disclosures`, `alt_text`, `board_id`, `board_section_id`, `carousel_slots`, `description`, `link`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinUpdate`
--
UPDATE `PinUpdate` SET `ai_disclosures` = ?, `alt_text` = ?, `board_id` = ?, `board_section_id` = ?, `carousel_slots` = ?, `description` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `PinUpdate`
--
DELETE FROM `PinUpdate` WHERE 0;

