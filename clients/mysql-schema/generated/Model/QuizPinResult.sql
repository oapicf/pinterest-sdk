--
-- Pinterest REST API.
-- Prepared SQL queries for 'QuizPinResult' definition.
--


--
-- SELECT template for table `QuizPinResult`
--
SELECT `android_deep_link`, `destination_url`, `ios_deep_link`, `organic_pin_id`, `result_id` FROM `QuizPinResult` WHERE 1;

--
-- INSERT template for table `QuizPinResult`
--
INSERT INTO `QuizPinResult`(`android_deep_link`, `destination_url`, `ios_deep_link`, `organic_pin_id`, `result_id`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `QuizPinResult`
--
UPDATE `QuizPinResult` SET `android_deep_link` = ?, `destination_url` = ?, `ios_deep_link` = ?, `organic_pin_id` = ?, `result_id` = ? WHERE 1;

--
-- DELETE template for table `QuizPinResult`
--
DELETE FROM `QuizPinResult` WHERE 0;

