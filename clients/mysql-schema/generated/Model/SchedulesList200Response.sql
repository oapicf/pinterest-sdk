--
-- Pinterest REST API.
-- Prepared SQL queries for 'schedules_list_200_response' definition.
--


--
-- SELECT template for table `schedules_list_200_response`
--
SELECT `bookmark`, `items` FROM `schedules_list_200_response` WHERE 1;

--
-- INSERT template for table `schedules_list_200_response`
--
INSERT INTO `schedules_list_200_response`(`bookmark`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `schedules_list_200_response`
--
UPDATE `schedules_list_200_response` SET `bookmark` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `schedules_list_200_response`
--
DELETE FROM `schedules_list_200_response` WHERE 0;

