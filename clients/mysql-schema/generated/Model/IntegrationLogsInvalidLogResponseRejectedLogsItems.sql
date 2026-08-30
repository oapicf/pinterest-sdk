--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLogsInvalidLogResponseRejectedLogsItems' definition.
--


--
-- SELECT template for table `IntegrationLogsInvalidLogResponseRejectedLogsItems`
--
SELECT `field`, `log_index`, `reason`, `value` FROM `IntegrationLogsInvalidLogResponseRejectedLogsItems` WHERE 1;

--
-- INSERT template for table `IntegrationLogsInvalidLogResponseRejectedLogsItems`
--
INSERT INTO `IntegrationLogsInvalidLogResponseRejectedLogsItems`(`field`, `log_index`, `reason`, `value`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLogsInvalidLogResponseRejectedLogsItems`
--
UPDATE `IntegrationLogsInvalidLogResponseRejectedLogsItems` SET `field` = ?, `log_index` = ?, `reason` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLogsInvalidLogResponseRejectedLogsItems`
--
DELETE FROM `IntegrationLogsInvalidLogResponseRejectedLogsItems` WHERE 0;

