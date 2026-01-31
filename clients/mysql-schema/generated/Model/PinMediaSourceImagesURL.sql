--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesURL' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesURL`
--
SELECT `index`, `items`, `source_type` FROM `PinMediaSourceImagesURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesURL`
--
INSERT INTO `PinMediaSourceImagesURL`(`index`, `items`, `source_type`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesURL`
--
UPDATE `PinMediaSourceImagesURL` SET `index` = ?, `items` = ?, `source_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesURL`
--
DELETE FROM `PinMediaSourceImagesURL` WHERE 0;

