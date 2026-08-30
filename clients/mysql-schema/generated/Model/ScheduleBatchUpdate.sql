--
-- Pinterest REST API.
-- Prepared SQL queries for 'ScheduleBatchUpdate' definition.
--


--
-- SELECT template for table `ScheduleBatchUpdate`
--
SELECT `delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `id`, `name`, `schedule_action`, `schedule_id`, `schedule_status`, `schedule_type`, `start_timestamp` FROM `ScheduleBatchUpdate` WHERE 1;

--
-- INSERT template for table `ScheduleBatchUpdate`
--
INSERT INTO `ScheduleBatchUpdate`(`delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `id`, `name`, `schedule_action`, `schedule_id`, `schedule_status`, `schedule_type`, `start_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ScheduleBatchUpdate`
--
UPDATE `ScheduleBatchUpdate` SET `delta_value` = ?, `end_timestamp` = ?, `entity_id` = ?, `entity_type` = ?, `id` = ?, `name` = ?, `schedule_action` = ?, `schedule_id` = ?, `schedule_status` = ?, `schedule_type` = ?, `start_timestamp` = ? WHERE 1;

--
-- DELETE template for table `ScheduleBatchUpdate`
--
DELETE FROM `ScheduleBatchUpdate` WHERE 0;

