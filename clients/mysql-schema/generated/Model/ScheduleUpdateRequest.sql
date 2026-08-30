--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleUpdateRequest' definition.
--


--
-- SELECT template for table `ScheduleUpdateRequest`
--
SELECT `entity_id`, `entity_type`, `id`, `delta_value`, `end_timestamp`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp` FROM `ScheduleUpdateRequest` WHERE 1;

--
-- INSERT template for table `ScheduleUpdateRequest`
--
INSERT INTO `ScheduleUpdateRequest`(`entity_id`, `entity_type`, `id`, `delta_value`, `end_timestamp`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleUpdateRequest`
--
UPDATE `ScheduleUpdateRequest` SET `entity_id` = ?, `entity_type` = ?, `id` = ?, `delta_value` = ?, `end_timestamp` = ?, `name` = ?, `schedule_action` = ?, `schedule_status` = ?, `schedule_type` = ?, `start_timestamp` = ? WHERE 1;

--
-- DELETE template for table `ScheduleUpdateRequest`
--
DELETE FROM `ScheduleUpdateRequest` WHERE 0;

