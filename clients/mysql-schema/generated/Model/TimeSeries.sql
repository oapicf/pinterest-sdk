--
-- Pinterest REST API.
-- Prepared SQL queries for 'TimeSeries' definition.
--


--
-- SELECT template for table `TimeSeries`
--
SELECT `date` FROM `TimeSeries` WHERE 1;

--
-- INSERT template for table `TimeSeries`
--
INSERT INTO `TimeSeries`(`date`) VALUES (?);

--
-- UPDATE template for table `TimeSeries`
--
UPDATE `TimeSeries` SET `date` = ? WHERE 1;

--
-- DELETE template for table `TimeSeries`
--
DELETE FROM `TimeSeries` WHERE 0;

