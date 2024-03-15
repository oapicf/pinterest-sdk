--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLogsInvalidLogResponse' definition.
--


--
-- SELECT template for table `IntegrationLogsInvalidLogResponse`
--
SELECT `rejected_logs` FROM `IntegrationLogsInvalidLogResponse` WHERE 1;

--
-- INSERT template for table `IntegrationLogsInvalidLogResponse`
--
INSERT INTO `IntegrationLogsInvalidLogResponse`(`rejected_logs`) VALUES (?);

--
-- UPDATE template for table `IntegrationLogsInvalidLogResponse`
--
UPDATE `IntegrationLogsInvalidLogResponse` SET `rejected_logs` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLogsInvalidLogResponse`
--
DELETE FROM `IntegrationLogsInvalidLogResponse` WHERE 0;

