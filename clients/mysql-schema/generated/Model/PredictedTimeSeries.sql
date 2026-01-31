--
-- Pinterest REST API.
-- Prepared SQL queries for 'PredictedTimeSeries' definition.
--


--
-- SELECT template for table `PredictedTimeSeries`
--
SELECT `date` FROM `PredictedTimeSeries` WHERE 1;

--
-- INSERT template for table `PredictedTimeSeries`
--
INSERT INTO `PredictedTimeSeries`(`date`) VALUES (?);

--
-- UPDATE template for table `PredictedTimeSeries`
--
UPDATE `PredictedTimeSeries` SET `date` = ? WHERE 1;

--
-- DELETE template for table `PredictedTimeSeries`
--
DELETE FROM `PredictedTimeSeries` WHERE 0;

