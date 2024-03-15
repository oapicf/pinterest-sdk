--
-- Pinterest REST API.
-- Prepared SQL queries for 'pins_save_request' definition.
--


--
-- SELECT template for table `pins_save_request`
--
SELECT `board_id`, `board_section_id` FROM `pins_save_request` WHERE 1;

--
-- INSERT template for table `pins_save_request`
--
INSERT INTO `pins_save_request`(`board_id`, `board_section_id`) VALUES (?, ?);

--
-- UPDATE template for table `pins_save_request`
--
UPDATE `pins_save_request` SET `board_id` = ?, `board_section_id` = ? WHERE 1;

--
-- DELETE template for table `pins_save_request`
--
DELETE FROM `pins_save_request` WHERE 0;

