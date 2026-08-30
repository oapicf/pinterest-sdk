--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleCreateRequest' definition.
--


--
-- SELECT template for table `ScheduleCreateRequest`
--
SELECT `entity_id`, `entity_type`, `delta_value`, `end_timestamp`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp` FROM `ScheduleCreateRequest` WHERE 1;

--
-- INSERT template for table `ScheduleCreateRequest`
--
INSERT INTO `ScheduleCreateRequest`(`entity_id`, `entity_type`, `delta_value`, `end_timestamp`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleCreateRequest`
--
UPDATE `ScheduleCreateRequest` SET `entity_id` = ?, `entity_type` = ?, `delta_value` = ?, `end_timestamp` = ?, `name` = ?, `schedule_action` = ?, `schedule_status` = ?, `schedule_type` = ?, `start_timestamp` = ? WHERE 1;

--
-- DELETE template for table `ScheduleCreateRequest`
--
DELETE FROM `ScheduleCreateRequest` WHERE 0;

