--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesURL_items_inner' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesURL_items_inner`
--
SELECT `title`, `description`, `link`, `url` FROM `PinMediaSourceImagesURL_items_inner` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesURL_items_inner`
--
INSERT INTO `PinMediaSourceImagesURL_items_inner`(`title`, `description`, `link`, `url`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesURL_items_inner`
--
UPDATE `PinMediaSourceImagesURL_items_inner` SET `title` = ?, `description` = ?, `link` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesURL_items_inner`
--
DELETE FROM `PinMediaSourceImagesURL_items_inner` WHERE 0;

