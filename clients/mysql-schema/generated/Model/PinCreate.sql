--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinCreate' definition.
--


--
-- SELECT template for table `PinCreate`
--
SELECT `ai_disclosures`, `alt_text`, `board_id`, `board_section_id`, `description`, `dominant_color`, `link`, `media_source`, `parent_pin_id`, `sponsor_id`, `title` FROM `PinCreate` WHERE 1;

--
-- INSERT template for table `PinCreate`
--
INSERT INTO `PinCreate`(`ai_disclosures`, `alt_text`, `board_id`, `board_section_id`, `description`, `dominant_color`, `link`, `media_source`, `parent_pin_id`, `sponsor_id`, `title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinCreate`
--
UPDATE `PinCreate` SET `ai_disclosures` = ?, `alt_text` = ?, `board_id` = ?, `board_section_id` = ?, `description` = ?, `dominant_color` = ?, `link` = ?, `media_source` = ?, `parent_pin_id` = ?, `sponsor_id` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `PinCreate`
--
DELETE FROM `PinCreate` WHERE 0;

