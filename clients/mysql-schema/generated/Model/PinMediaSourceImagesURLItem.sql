--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImagesURLItem' definition.
--


--
-- SELECT template for table `PinMediaSourceImagesURLItem`
--
SELECT `description`, `link`, `title`, `url` FROM `PinMediaSourceImagesURLItem` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImagesURLItem`
--
INSERT INTO `PinMediaSourceImagesURLItem`(`description`, `link`, `title`, `url`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImagesURLItem`
--
UPDATE `PinMediaSourceImagesURLItem` SET `description` = ?, `link` = ?, `title` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImagesURLItem`
--
DELETE FROM `PinMediaSourceImagesURLItem` WHERE 0;

