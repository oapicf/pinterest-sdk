--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleCreate' definition.
--


--
-- SELECT template for table `ScheduleCreate`
--
SELECT `delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp` FROM `ScheduleCreate` WHERE 1;

--
-- INSERT template for table `ScheduleCreate`
--
INSERT INTO `ScheduleCreate`(`delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `name`, `schedule_action`, `schedule_status`, `schedule_type`, `start_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleCreate`
--
UPDATE `ScheduleCreate` SET `delta_value` = ?, `end_timestamp` = ?, `entity_id` = ?, `entity_type` = ?, `name` = ?, `schedule_action` = ?, `schedule_status` = ?, `schedule_type` = ?, `start_timestamp` = ? WHERE 1;

--
-- DELETE template for table `ScheduleCreate`
--
DELETE FROM `ScheduleCreate` WHERE 0;

