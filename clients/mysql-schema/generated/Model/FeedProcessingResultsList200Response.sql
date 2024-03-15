--
-- Pinterest REST API.
-- Prepared SQL queries for 'feed_processing_results_list_200_response' definition.
--


--
-- SELECT template for table `feed_processing_results_list_200_response`
--
SELECT `items`, `bookmark` FROM `feed_processing_results_list_200_response` WHERE 1;

--
-- INSERT template for table `feed_processing_results_list_200_response`
--
INSERT INTO `feed_processing_results_list_200_response`(`items`, `bookmark`) VALUES (?, ?);

--
-- UPDATE template for table `feed_processing_results_list_200_response`
--
UPDATE `feed_processing_results_list_200_response` SET `items` = ?, `bookmark` = ? WHERE 1;

--
-- DELETE template for table `feed_processing_results_list_200_response`
--
DELETE FROM `feed_processing_results_list_200_response` WHERE 0;

