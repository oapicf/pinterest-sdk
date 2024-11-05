--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinData' definition.
--


--
-- SELECT template for table `QuizPinData`
--
SELECT `questions`, `results`, `tie_breaker_type`, `tie_breaker_custom_result` FROM `QuizPinData` WHERE 1;

--
-- INSERT template for table `QuizPinData`
--
INSERT INTO `QuizPinData`(`questions`, `results`, `tie_breaker_type`, `tie_breaker_custom_result`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `QuizPinData`
--
UPDATE `QuizPinData` SET `questions` = ?, `results` = ?, `tie_breaker_type` = ?, `tie_breaker_custom_result` = ? WHERE 1;

--
-- DELETE template for table `QuizPinData`
--
DELETE FROM `QuizPinData` WHERE 0;

