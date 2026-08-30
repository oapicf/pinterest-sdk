--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinsSaveRequestCreate' definition.
--


--
-- SELECT template for table `PinsSaveRequestCreate`
--
SELECT `board_id`, `board_section_id` FROM `PinsSaveRequestCreate` WHERE 1;

--
-- INSERT template for table `PinsSaveRequestCreate`
--
INSERT INTO `PinsSaveRequestCreate`(`board_id`, `board_section_id`) VALUES (?, ?);

--
-- UPDATE template for table `PinsSaveRequestCreate`
--
UPDATE `PinsSaveRequestCreate` SET `board_id` = ?, `board_section_id` = ? WHERE 1;

--
-- DELETE template for table `PinsSaveRequestCreate`
--
DELETE FROM `PinsSaveRequestCreate` WHERE 0;

