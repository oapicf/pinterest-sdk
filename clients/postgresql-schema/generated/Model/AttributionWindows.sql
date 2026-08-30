--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AttributionWindows' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'attribution_windows'
--
SELECT click_window_days, engagement_window_days, view_window_days FROM attribution_windows WHERE 1=1;

--
-- INSERT template for table 'attribution_windows'
--
INSERT INTO attribution_windows (click_window_days, engagement_window_days, view_window_days) VALUES (?, ?, ?);

--
-- UPDATE template for table 'attribution_windows'
--
UPDATE attribution_windows SET click_window_days = ?, engagement_window_days = ?, view_window_days = ? WHERE 1=2;

--
-- DELETE template for table 'attribution_windows'
--
DELETE FROM attribution_windows WHERE 1=2;

