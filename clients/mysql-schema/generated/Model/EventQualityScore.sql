--
-- Pinterest REST API.
-- Prepared SQL queries for 'EventQualityScore' definition.
--


--
-- SELECT template for table `EventQualityScore`
--
SELECT `ingestion_source`, `lookback_period`, `overall_status`, `quality_components`, `source_platform` FROM `EventQualityScore` WHERE 1;

--
-- INSERT template for table `EventQualityScore`
--
INSERT INTO `EventQualityScore`(`ingestion_source`, `lookback_period`, `overall_status`, `quality_components`, `source_platform`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `EventQualityScore`
--
UPDATE `EventQualityScore` SET `ingestion_source` = ?, `lookback_period` = ?, `overall_status` = ?, `quality_components` = ?, `source_platform` = ? WHERE 1;

--
-- DELETE template for table `EventQualityScore`
--
DELETE FROM `EventQualityScore` WHERE 0;

