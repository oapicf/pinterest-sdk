--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionApiResponse_events_inner' definition.
--


--
-- SELECT template for table `ConversionApiResponse_events_inner`
--
SELECT `error_message`, `status`, `warning_message` FROM `ConversionApiResponse_events_inner` WHERE 1;

--
-- INSERT template for table `ConversionApiResponse_events_inner`
--
INSERT INTO `ConversionApiResponse_events_inner`(`error_message`, `status`, `warning_message`) VALUES (?, ?, ?);

--
-- UPDATE template for table `ConversionApiResponse_events_inner`
--
UPDATE `ConversionApiResponse_events_inner` SET `error_message` = ?, `status` = ?, `warning_message` = ? WHERE 1;

--
-- DELETE template for table `ConversionApiResponse_events_inner`
--
DELETE FROM `ConversionApiResponse_events_inner` WHERE 0;

