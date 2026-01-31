--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLogsInvalidLogResponse_rejected_logs_inner' definition.
--


--
-- SELECT template for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner`
--
SELECT `field`, `log_index`, `reason`, `value` FROM `IntegrationLogsInvalidLogResponse_rejected_logs_inner` WHERE 1;

--
-- INSERT template for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner`
--
INSERT INTO `IntegrationLogsInvalidLogResponse_rejected_logs_inner`(`field`, `log_index`, `reason`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner`
--
UPDATE `IntegrationLogsInvalidLogResponse_rejected_logs_inner` SET `field` = ?, `log_index` = ?, `reason` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLogsInvalidLogResponse_rejected_logs_inner`
--
DELETE FROM `IntegrationLogsInvalidLogResponse_rejected_logs_inner` WHERE 0;

