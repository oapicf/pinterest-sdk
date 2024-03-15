--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdCommon_quiz_pin_data' definition.
--


--
-- SELECT template for table `AdCommon_quiz_pin_data`
--
SELECT `questions`, `results` FROM `AdCommon_quiz_pin_data` WHERE 1;

--
-- INSERT template for table `AdCommon_quiz_pin_data`
--
INSERT INTO `AdCommon_quiz_pin_data`(`questions`, `results`) VALUES (?, ?);

--
-- UPDATE template for table `AdCommon_quiz_pin_data`
--
UPDATE `AdCommon_quiz_pin_data` SET `questions` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `AdCommon_quiz_pin_data`
--
DELETE FROM `AdCommon_quiz_pin_data` WHERE 0;

