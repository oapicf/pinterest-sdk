--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesBase64Item' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesBase64Item`
--
SELECT `content_type`, `data`, `description`, `link`, `title` FROM `PinMediaSourceImagesBase64Item` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesBase64Item`
--
INSERT INTO `PinMediaSourceImagesBase64Item`(`content_type`, `data`, `description`, `link`, `title`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesBase64Item`
--
UPDATE `PinMediaSourceImagesBase64Item` SET `content_type` = ?, `data` = ?, `description` = ?, `link` = ?, `title` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesBase64Item`
--
DELETE FROM `PinMediaSourceImagesBase64Item` WHERE 0;

