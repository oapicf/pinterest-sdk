--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinResult' definition.
--


--
-- SELECT template for table `QuizPinResult`
--
SELECT `organic_pin_id`, `android_deep_link`, `ios_deep_link`, `destination_url`, `result_id` FROM `QuizPinResult` WHERE 1;

--
-- INSERT template for table `QuizPinResult`
--
INSERT INTO `QuizPinResult`(`organic_pin_id`, `android_deep_link`, `ios_deep_link`, `destination_url`, `result_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `QuizPinResult`
--
UPDATE `QuizPinResult` SET `organic_pin_id` = ?, `android_deep_link` = ?, `ios_deep_link` = ?, `destination_url` = ?, `result_id` = ? WHERE 1;

--
-- DELETE template for table `QuizPinResult`
--
DELETE FROM `QuizPinResult` WHERE 0;

