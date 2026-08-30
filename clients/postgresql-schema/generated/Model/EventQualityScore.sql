--
-- "Pinterest REST API"
-- Prepared SQL queries for 'EventQualityScore' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'event_quality_score'
--
SELECT ingestion_source, lookback_period, overall_status, quality_components, source_platform FROM event_quality_score WHERE 1=1;

--
-- INSERT template for table 'event_quality_score'
--
INSERT INTO event_quality_score (ingestion_source, lookback_period, overall_status, quality_components, source_platform) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table 'event_quality_score'
--
UPDATE event_quality_score SET ingestion_source = ?, lookback_period = ?, overall_status = ?, quality_components = ?, source_platform = ? WHERE 1=2;

--
-- DELETE template for table 'event_quality_score'
--
DELETE FROM event_quality_score WHERE 1=2;

