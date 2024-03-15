--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesURL' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesURL`
--
SELECT `source_type`, `items`, `index` FROM `PinMediaSourceImagesURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesURL`
--
INSERT INTO `PinMediaSourceImagesURL`(`source_type`, `items`, `index`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesURL`
--
UPDATE `PinMediaSourceImagesURL` SET `source_type` = ?, `items` = ?, `index` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesURL`
--
DELETE FROM `PinMediaSourceImagesURL` WHERE 0;

