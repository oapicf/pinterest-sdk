--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents' definition.
--


--
-- SELECT template for table `ConversionEvents`
--
SELECT `events`, `num_events_processed`, `num_events_received` FROM `ConversionEvents` WHERE 1;

--
-- INSERT template for table `ConversionEvents`
--
INSERT INTO `ConversionEvents`(`events`, `num_events_processed`, `num_events_received`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ConversionEvents`
--
UPDATE `ConversionEvents` SET `events` = ?, `num_events_processed` = ?, `num_events_received` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents`
--
DELETE FROM `ConversionEvents` WHERE 0;

