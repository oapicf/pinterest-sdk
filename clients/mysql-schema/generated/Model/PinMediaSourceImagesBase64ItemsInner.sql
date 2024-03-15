--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesBase64_items_inner' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesBase64_items_inner`
--
SELECT `title`, `description`, `link`, `content_type`, `data` FROM `PinMediaSourceImagesBase64_items_inner` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesBase64_items_inner`
--
INSERT INTO `PinMediaSourceImagesBase64_items_inner`(`title`, `description`, `link`, `content_type`, `data`) VALUES (?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesBase64_items_inner`
--
UPDATE `PinMediaSourceImagesBase64_items_inner` SET `title` = ?, `description` = ?, `link` = ?, `content_type` = ?, `data` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesBase64_items_inner`
--
DELETE FROM `PinMediaSourceImagesBase64_items_inner` WHERE 0;

