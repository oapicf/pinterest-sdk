--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMediaWithImages' definition.
--


--
-- SELECT template for table `PinMediaWithImages`
--
SELECT `items`, `media_type` FROM `PinMediaWithImages` WHERE 1;

--
-- INSERT template for table `PinMediaWithImages`
--
INSERT INTO `PinMediaWithImages`(`items`, `media_type`) VALUES (?, ?);

--
-- UPDATE template for table `PinMediaWithImages`
--
UPDATE `PinMediaWithImages` SET `items` = ?, `media_type` = ? WHERE 1;

--
-- DELETE template for table `PinMediaWithImages`
--
DELETE FROM `PinMediaWithImages` WHERE 0;

