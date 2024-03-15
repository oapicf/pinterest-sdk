--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinOption' definition.
--


--
-- SELECT template for table `QuizPinOption`
--
SELECT `id`, `text` FROM `QuizPinOption` WHERE 1;

--
-- INSERT template for table `QuizPinOption`
--
INSERT INTO `QuizPinOption`(`id`, `text`) VALUES (?, ?);

--
-- UPDATE template for table `QuizPinOption`
--
UPDATE `QuizPinOption` SET `id` = ?, `text` = ? WHERE 1;

--
-- DELETE template for table `QuizPinOption`
--
DELETE FROM `QuizPinOption` WHERE 0;

