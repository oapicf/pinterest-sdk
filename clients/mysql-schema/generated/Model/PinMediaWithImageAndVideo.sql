--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImageAndVideo' definition.
--


--
-- SELECT template for table `PinMediaWithImageAndVideo`
--
SELECT `media_type`, `items` FROM `PinMediaWithImageAndVideo` WHERE 1;

--
-- INSERT template for table `PinMediaWithImageAndVideo`
--
INSERT INTO `PinMediaWithImageAndVideo`(`media_type`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImageAndVideo`
--
UPDATE `PinMediaWithImageAndVideo` SET `media_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImageAndVideo`
--
DELETE FROM `PinMediaWithImageAndVideo` WHERE 0;

