--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesBase64' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesBase64`
--
SELECT `source_type`, `items`, `index` FROM `PinMediaSourceImagesBase64` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesBase64`
--
INSERT INTO `PinMediaSourceImagesBase64`(`source_type`, `items`, `index`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesBase64`
--
UPDATE `PinMediaSourceImagesBase64` SET `source_type` = ?, `items` = ?, `index` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesBase64`
--
DELETE FROM `PinMediaSourceImagesBase64` WHERE 0;

