--
-- Pinterest REST API.
-- Prepared SQL queries for 'Schedule' definition.
--


--
-- SELECT template for table `Schedule`
--
SELECT `delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `name`, `schedule_action`, `schedule_id`, `schedule_status`, `schedule_type`, `start_timestamp` FROM `Schedule` WHERE 1;

--
-- INSERT template for table `Schedule`
--
INSERT INTO `Schedule`(`delta_value`, `end_timestamp`, `entity_id`, `entity_type`, `name`, `schedule_action`, `schedule_id`, `schedule_status`, `schedule_type`, `start_timestamp`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `Schedule`
--
UPDATE `Schedule` SET `delta_value` = ?, `end_timestamp` = ?, `entity_id` = ?, `entity_type` = ?, `name` = ?, `schedule_action` = ?, `schedule_id` = ?, `schedule_status` = ?, `schedule_type` = ?, `start_timestamp` = ? WHERE 1;

--
-- DELETE template for table `Schedule`
--
DELETE FROM `Schedule` WHERE 0;

