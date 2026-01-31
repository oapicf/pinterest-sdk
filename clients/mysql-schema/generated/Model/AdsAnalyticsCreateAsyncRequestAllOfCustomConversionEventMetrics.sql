--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_metrics' definition.
--


--
-- SELECT template for table `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met`
--
SELECT `custom_event_metrics_type`, `custom_event_name` FROM `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met`
--
INSERT INTO `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met`(`custom_event_metrics_type`, `custom_event_name`) VALUES (?, ?);

--
-- UPDATE template for table `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met`
--
UPDATE `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met` SET `custom_event_metrics_type` = ?, `custom_event_name` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met`
--
DELETE FROM `AdsAnalyticsCreateAsyncRequest_allOf_custom_conversion_event_met` WHERE 0;

