--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionApiResponseEventsItems' definition.
--


--
-- SELECT template for table `ConversionApiResponseEventsItems`
--
SELECT `error_message`, `status`, `warning_message` FROM `ConversionApiResponseEventsItems` WHERE 1;

--
-- INSERT template for table `ConversionApiResponseEventsItems`
--
INSERT INTO `ConversionApiResponseEventsItems`(`error_message`, `status`, `warning_message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ConversionApiResponseEventsItems`
--
UPDATE `ConversionApiResponseEventsItems` SET `error_message` = ?, `status` = ?, `warning_message` = ? WHERE 1;

--
-- DELETE template for table `ConversionApiResponseEventsItems`
--
DELETE FROM `ConversionApiResponseEventsItems` WHERE 0;

