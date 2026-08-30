--
-- Pinterest REST API.
-- Prepared SQL queries for 'MetricsResponseDataItems' definition.
--


--
-- SELECT template for table `MetricsResponseDataItems`
--
SELECT `metrics`, `targeting_type`, `targeting_value` FROM `MetricsResponseDataItems` WHERE 1;

--
-- INSERT template for table `MetricsResponseDataItems`
--
INSERT INTO `MetricsResponseDataItems`(`metrics`, `targeting_type`, `targeting_value`) VALUES (?, ?, ?);

--
-- UPDATE template for table `MetricsResponseDataItems`
--
UPDATE `MetricsResponseDataItems` SET `metrics` = ?, `targeting_type` = ?, `targeting_value` = ? WHERE 1;

--
-- DELETE template for table `MetricsResponseDataItems`
--
DELETE FROM `MetricsResponseDataItems` WHERE 0;

