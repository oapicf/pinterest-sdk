--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesBase64' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesBase64`
--
SELECT `index`, `items`, `source_type` FROM `PinMediaSourceImagesBase64` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesBase64`
--
INSERT INTO `PinMediaSourceImagesBase64`(`index`, `items`, `source_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesBase64`
--
UPDATE `PinMediaSourceImagesBase64` SET `index` = ?, `items` = ?, `source_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesBase64`
--
DELETE FROM `PinMediaSourceImagesBase64` WHERE 0;

