--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourceImageURL' definition.
--


--
-- SELECT template for table `PinMediaSourceImageURL`
--
SELECT `is_standard`, `source_type`, `url` FROM `PinMediaSourceImageURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourceImageURL`
--
INSERT INTO `PinMediaSourceImageURL`(`is_standard`, `source_type`, `url`) VALUES (?, ?, ?);

--
-- UPDATE template for table `PinMediaSourceImageURL`
--
UPDATE `PinMediaSourceImageURL` SET `is_standard` = ?, `source_type` = ?, `url` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourceImageURL`
--
DELETE FROM `PinMediaSourceImageURL` WHERE 0;

