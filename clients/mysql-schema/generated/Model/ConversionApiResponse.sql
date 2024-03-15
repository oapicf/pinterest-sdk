--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionApiResponse' definition.
--


--
-- SELECT template for table `ConversionApiResponse`
--
SELECT `num_events_received`, `num_events_processed`, `events` FROM `ConversionApiResponse` WHERE 1;

--
-- INSERT template for table `ConversionApiResponse`
--
INSERT INTO `ConversionApiResponse`(`num_events_received`, `num_events_processed`, `events`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ConversionApiResponse`
--
UPDATE `ConversionApiResponse` SET `num_events_received` = ?, `num_events_processed` = ?, `events` = ? WHERE 1;

--
-- DELETE template for table `ConversionApiResponse`
--
DELETE FROM `ConversionApiResponse` WHERE 0;

