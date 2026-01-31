--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImageBase64' definition.
--


--
-- SELECT template for table `PinMediaSourceImageBase64`
--
SELECT `content_type`, `data`, `is_standard`, `source_type` FROM `PinMediaSourceImageBase64` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImageBase64`
--
INSERT INTO `PinMediaSourceImageBase64`(`content_type`, `data`, `is_standard`, `source_type`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImageBase64`
--
UPDATE `PinMediaSourceImageBase64` SET `content_type` = ?, `data` = ?, `is_standard` = ?, `source_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImageBase64`
--
DELETE FROM `PinMediaSourceImageBase64` WHERE 0;

