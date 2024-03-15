--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLogClientError' definition.
--


--
-- SELECT template for table `IntegrationLogClientError`
--
SELECT `cause`, `column_number`, `file_name`, `line_number`, `message`, `message_detail`, `name`, `number`, `stack_trace` FROM `IntegrationLogClientError` WHERE 1;

--
-- INSERT template for table `IntegrationLogClientError`
--
INSERT INTO `IntegrationLogClientError`(`cause`, `column_number`, `file_name`, `line_number`, `message`, `message_detail`, `name`, `number`, `stack_trace`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLogClientError`
--
UPDATE `IntegrationLogClientError` SET `cause` = ?, `column_number` = ?, `file_name` = ?, `line_number` = ?, `message` = ?, `message_detail` = ?, `name` = ?, `number` = ?, `stack_trace` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLogClientError`
--
DELETE FROM `IntegrationLogClientError` WHERE 0;

