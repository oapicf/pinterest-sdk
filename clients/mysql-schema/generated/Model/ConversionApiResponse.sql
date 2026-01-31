--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionApiResponse' definition.
--


--
-- SELECT template for table `ConversionApiResponse`
--
SELECT `events`, `num_events_processed`, `num_events_received` FROM `ConversionApiResponse` WHERE 1;

--
-- INSERT template for table `ConversionApiResponse`
--
INSERT INTO `ConversionApiResponse`(`events`, `num_events_processed`, `num_events_received`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ConversionApiResponse`
--
UPDATE `ConversionApiResponse` SET `events` = ?, `num_events_processed` = ?, `num_events_received` = ? WHERE 1;

--
-- DELETE template for table `ConversionApiResponse`
--
DELETE FROM `ConversionApiResponse` WHERE 0;

