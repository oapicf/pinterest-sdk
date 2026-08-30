--
-- Pinterest REST API.
-- Prepared SQL queries for 'CustomConversionEventMetrics' definition.
--


--
-- SELECT template for table `CustomConversionEventMetrics`
--
SELECT `custom_event_metrics_type`, `custom_event_name` FROM `CustomConversionEventMetrics` WHERE 1;

--
-- INSERT template for table `CustomConversionEventMetrics`
--
INSERT INTO `CustomConversionEventMetrics`(`custom_event_metrics_type`, `custom_event_name`) VALUES (?, ?);

--
-- UPDATE template for table `CustomConversionEventMetrics`
--
UPDATE `CustomConversionEventMetrics` SET `custom_event_metrics_type` = ?, `custom_event_name` = ? WHERE 1;

--
-- DELETE template for table `CustomConversionEventMetrics`
--
DELETE FROM `CustomConversionEventMetrics` WHERE 0;

