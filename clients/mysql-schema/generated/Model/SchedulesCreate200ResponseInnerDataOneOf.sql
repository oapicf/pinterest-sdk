--
-- Pinterest REST API.
-- Prepared SQL queries for 'schedules_create_200_response_inner_data_oneOf' definition.
--


--
-- SELECT template for table `schedules_create_200_response_inner_data_oneOf`
--
SELECT `id`, `schedule_id`, `exceptions` FROM `schedules_create_200_response_inner_data_oneOf` WHERE 1;

--
-- INSERT template for table `schedules_create_200_response_inner_data_oneOf`
--
INSERT INTO `schedules_create_200_response_inner_data_oneOf`(`id`, `schedule_id`, `exceptions`) VALUES (?, ?, ?);

--
-- UPDATE template for table `schedules_create_200_response_inner_data_oneOf`
--
UPDATE `schedules_create_200_response_inner_data_oneOf` SET `id` = ?, `schedule_id` = ?, `exceptions` = ? WHERE 1;

--
-- DELETE template for table `schedules_create_200_response_inner_data_oneOf`
--
DELETE FROM `schedules_create_200_response_inner_data_oneOf` WHERE 0;

