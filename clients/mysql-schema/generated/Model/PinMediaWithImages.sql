--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImages' definition.
--


--
-- SELECT template for table `PinMediaWithImages`
--
SELECT `media_type`, `items` FROM `PinMediaWithImages` WHERE 1;

--
-- INSERT template for table `PinMediaWithImages`
--
INSERT INTO `PinMediaWithImages`(`media_type`, `items`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImages`
--
UPDATE `PinMediaWithImages` SET `media_type` = ?, `items` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImages`
--
DELETE FROM `PinMediaWithImages` WHERE 0;

