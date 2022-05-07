--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImageURL' definition.
--


--
-- SELECT template for table `PinMediaSourceImageURL`
--
SELECT `source_type`, `url` FROM `PinMediaSourceImageURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImageURL`
--
INSERT INTO `PinMediaSourceImageURL`(`source_type`, `url`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaSourceImageURL`
--
UPDATE `PinMediaSourceImageURL` SET `source_type` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImageURL`
--
DELETE FROM `PinMediaSourceImageURL` WHERE 0;

