--
-- "Pinterest REST API"
-- Prepared SQL queries for 'ConversionMSOTEventsCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'conversion_msot_events_create'
--
SELECT action_timestamps, ad_group_id, attribution_model, attribution_scope, attribution_score, campaign_id, click_window, currency, event_id, event_name, event_timestamp, total_event_touchpoints, total_events, total_events_fractional, "value", view_window FROM conversion_msot_events_create WHERE 1=1;

--
-- INSERT template for table 'conversion_msot_events_create'
--
INSERT INTO conversion_msot_events_create (action_timestamps, ad_group_id, attribution_model, attribution_scope, attribution_score, campaign_id, click_window, currency, event_id, event_name, event_timestamp, total_event_touchpoints, total_events, total_events_fractional, "value", view_window) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'conversion_msot_events_create'
--
UPDATE conversion_msot_events_create SET action_timestamps = ?, ad_group_id = ?, attribution_model = ?, attribution_scope = ?, attribution_score = ?, campaign_id = ?, click_window = ?, currency = ?, event_id = ?, event_name = ?, event_timestamp = ?, total_event_touchpoints = ?, total_events = ?, total_events_fractional = ?, "value" = ?, view_window = ? WHERE 1=2;

--
-- DELETE template for table 'conversion_msot_events_create'
--
DELETE FROM conversion_msot_events_create WHERE 1=2;

