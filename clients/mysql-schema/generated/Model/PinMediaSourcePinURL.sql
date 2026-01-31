--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourcePinURL' definition.
--


--
-- SELECT template for table `PinMediaSourcePinURL`
--
SELECT `is_affiliate_link`, `source_type` FROM `PinMediaSourcePinURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourcePinURL`
--
INSERT INTO `PinMediaSourcePinURL`(`is_affiliate_link`, `source_type`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaSourcePinURL`
--
UPDATE `PinMediaSourcePinURL` SET `is_affiliate_link` = ?, `source_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourcePinURL`
--
DELETE FROM `PinMediaSourcePinURL` WHERE 0;

