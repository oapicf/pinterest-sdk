--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinData' definition.
--


--
-- SELECT template for table `QuizPinData`
--
SELECT `questions`, `results` FROM `QuizPinData` WHERE 1;

--
-- INSERT template for table `QuizPinData`
--
INSERT INTO `QuizPinData`(`questions`, `results`) VALUES (?, ?);

--
-- UPDATE template for table `QuizPinData`
--
UPDATE `QuizPinData` SET `questions` = ?, `results` = ? WHERE 1;

--
-- DELETE template for table `QuizPinData`
--
DELETE FROM `QuizPinData` WHERE 0;

