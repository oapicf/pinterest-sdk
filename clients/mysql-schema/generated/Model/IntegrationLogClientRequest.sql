--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLogClientRequest' definition.
--


--
-- SELECT template for table `IntegrationLogClientRequest`
--
SELECT `method`, `host`, `path`, `request_headers`, `response_headers`, `response_status_code` FROM `IntegrationLogClientRequest` WHERE 1;

--
-- INSERT template for table `IntegrationLogClientRequest`
--
INSERT INTO `IntegrationLogClientRequest`(`method`, `host`, `path`, `request_headers`, `response_headers`, `response_status_code`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLogClientRequest`
--
UPDATE `IntegrationLogClientRequest` SET `method` = ?, `host` = ?, `path` = ?, `request_headers` = ?, `response_headers` = ?, `response_status_code` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLogClientRequest`
--
DELETE FROM `IntegrationLogClientRequest` WHERE 0;

