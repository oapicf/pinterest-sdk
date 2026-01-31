--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinQuestion' definition.
--


--
-- SELECT template for table `QuizPinQuestion`
--
SELECT `options`, `question_id`, `question_text` FROM `QuizPinQuestion` WHERE 1;

--
-- INSERT template for table `QuizPinQuestion`
--
INSERT INTO `QuizPinQuestion`(`options`, `question_id`, `question_text`) VALUES (?, ?, ?);

--
-- UPDATE template for table `QuizPinQuestion`
--
UPDATE `QuizPinQuestion` SET `options` = ?, `question_id` = ?, `question_text` = ? WHERE 1;

--
-- DELETE template for table `QuizPinQuestion`
--
DELETE FROM `QuizPinQuestion` WHERE 0;

