--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImage' definition.
--


--
-- SELECT template for table `PinMediaWithImage`
--
SELECT `images`, `media_type` FROM `PinMediaWithImage` WHERE 1;

--
-- INSERT template for table `PinMediaWithImage`
--
INSERT INTO `PinMediaWithImage`(`images`, `media_type`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImage`
--
UPDATE `PinMediaWithImage` SET `images` = ?, `media_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImage`
--
DELETE FROM `PinMediaWithImage` WHERE 0;

