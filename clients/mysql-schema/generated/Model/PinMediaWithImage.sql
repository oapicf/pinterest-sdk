--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImage' definition.
--


--
-- SELECT template for table `PinMediaWithImage`
--
SELECT `media_type`, `images` FROM `PinMediaWithImage` WHERE 1;

--
-- INSERT template for table `PinMediaWithImage`
--
INSERT INTO `PinMediaWithImage`(`media_type`, `images`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImage`
--
UPDATE `PinMediaWithImage` SET `media_type` = ?, `images` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImage`
--
DELETE FROM `PinMediaWithImage` WHERE 0;

