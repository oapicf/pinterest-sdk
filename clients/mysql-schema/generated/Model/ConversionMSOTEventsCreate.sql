--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionMSOTEventsCreate' definition.
--


--
-- SELECT template for table `ConversionMSOTEventsCreate`
--
SELECT `action_timestamps`, `ad_group_id`, `attribution_model`, `attribution_scope`, `attribution_score`, `campaign_id`, `click_window`, `currency`, `event_id`, `event_name`, `event_timestamp`, `total_event_touchpoints`, `total_events`, `total_events_fractional`, `value`, `view_window` FROM `ConversionMSOTEventsCreate` WHERE 1;

--
-- INSERT template for table `ConversionMSOTEventsCreate`
--
INSERT INTO `ConversionMSOTEventsCreate`(`action_timestamps`, `ad_group_id`, `attribution_model`, `attribution_scope`, `attribution_score`, `campaign_id`, `click_window`, `currency`, `event_id`, `event_name`, `event_timestamp`, `total_event_touchpoints`, `total_events`, `total_events_fractional`, `value`, `view_window`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionMSOTEventsCreate`
--
UPDATE `ConversionMSOTEventsCreate` SET `action_timestamps` = ?, `ad_group_id` = ?, `attribution_model` = ?, `attribution_scope` = ?, `attribution_score` = ?, `campaign_id` = ?, `click_window` = ?, `currency` = ?, `event_id` = ?, `event_name` = ?, `event_timestamp` = ?, `total_event_touchpoints` = ?, `total_events` = ?, `total_events_fractional` = ?, `value` = ?, `view_window` = ? WHERE 1;

--
-- DELETE template for table `ConversionMSOTEventsCreate`
--
DELETE FROM `ConversionMSOTEventsCreate` WHERE 0;

