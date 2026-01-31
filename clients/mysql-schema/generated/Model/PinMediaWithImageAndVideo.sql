--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImageAndVideo' definition.
--


--
-- SELECT template for table `PinMediaWithImageAndVideo`
--
SELECT `items`, `media_type` FROM `PinMediaWithImageAndVideo` WHERE 1;

--
-- INSERT template for table `PinMediaWithImageAndVideo`
--
INSERT INTO `PinMediaWithImageAndVideo`(`items`, `media_type`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImageAndVideo`
--
UPDATE `PinMediaWithImageAndVideo` SET `items` = ?, `media_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImageAndVideo`
--
DELETE FROM `PinMediaWithImageAndVideo` WHERE 0;

