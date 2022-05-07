--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdsAnalyticsMetricsFilter' definition.
--


--
-- SELECT template for table `AdsAnalyticsMetricsFilter`
--
SELECT `field`, `operator`, `values` FROM `AdsAnalyticsMetricsFilter` WHERE 1;

--
-- INSERT template for table `AdsAnalyticsMetricsFilter`
--
INSERT INTO `AdsAnalyticsMetricsFilter`(`field`, `operator`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdsAnalyticsMetricsFilter`
--
UPDATE `AdsAnalyticsMetricsFilter` SET `field` = ?, `operator` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `AdsAnalyticsMetricsFilter`
--
DELETE FROM `AdsAnalyticsMetricsFilter` WHERE 0;

