--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImageBase64' definition.
--


--
-- SELECT template for table `PinMediaSourceImageBase64`
--
SELECT `source_type`, `content_type`, `data` FROM `PinMediaSourceImageBase64` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImageBase64`
--
INSERT INTO `PinMediaSourceImageBase64`(`source_type`, `content_type`, `data`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImageBase64`
--
UPDATE `PinMediaSourceImageBase64` SET `source_type` = ?, `content_type` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImageBase64`
--
DELETE FROM `PinMediaSourceImageBase64` WHERE 0;

