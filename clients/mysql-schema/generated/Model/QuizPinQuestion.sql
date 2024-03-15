--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinQuestion' definition.
--


--
-- SELECT template for table `QuizPinQuestion`
--
SELECT `question_id`, `question_text`, `options` FROM `QuizPinQuestion` WHERE 1;

--
-- INSERT template for table `QuizPinQuestion`
--
INSERT INTO `QuizPinQuestion`(`question_id`, `question_text`, `options`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QuizPinQuestion`
--
UPDATE `QuizPinQuestion` SET `question_id` = ?, `question_text` = ?, `options` = ? WHERE 1;

--
-- DELETE template for table `QuizPinQuestion`
--
DELETE FROM `QuizPinQuestion` WHERE 0;

