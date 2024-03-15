--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaSourcePinURL' definition.
--


--
-- SELECT template for table `PinMediaSourcePinURL`
--
SELECT `source_type`, `is_affiliate_link` FROM `PinMediaSourcePinURL` WHERE 1;

--
-- INSERT template for table `PinMediaSourcePinURL`
--
INSERT INTO `PinMediaSourcePinURL`(`source_type`, `is_affiliate_link`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaSourcePinURL`
--
UPDATE `PinMediaSourcePinURL` SET `source_type` = ?, `is_affiliate_link` = ? WHERE 1;

--
-- DELETE template for table `PinMediaSourcePinURL`
--
DELETE FROM `PinMediaSourcePinURL` WHERE 0;

