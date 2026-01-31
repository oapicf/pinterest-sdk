--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionMSOTEvents' definition.
--


--
-- SELECT template for table `ConversionMSOTEvents`
--
SELECT `action_timestamps`, `ad_group_id`, `attribution_model`, `attribution_scope`, `attribution_score`, `campaign_id`, `currency`, `event_id`, `event_name`, `event_timestamp`, `total_event_touchpoints`, `total_events`, `value` FROM `ConversionMSOTEvents` WHERE 1;

--
-- INSERT template for table `ConversionMSOTEvents`
--
INSERT INTO `ConversionMSOTEvents`(`action_timestamps`, `ad_group_id`, `attribution_model`, `attribution_scope`, `attribution_score`, `campaign_id`, `currency`, `event_id`, `event_name`, `event_timestamp`, `total_event_touchpoints`, `total_events`, `value`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionMSOTEvents`
--
UPDATE `ConversionMSOTEvents` SET `action_timestamps` = ?, `ad_group_id` = ?, `attribution_model` = ?, `attribution_scope` = ?, `attribution_score` = ?, `campaign_id` = ?, `currency` = ?, `event_id` = ?, `event_name` = ?, `event_timestamp` = ?, `total_event_touchpoints` = ?, `total_events` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `ConversionMSOTEvents`
--
DELETE FROM `ConversionMSOTEvents` WHERE 0;

