--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinMedia' definition.
--


--
-- SELECT template for table `PinMedia`
--
SELECT `media_type` FROM `PinMedia` WHERE 1;

--
-- INSERT template for table `PinMedia`
--
INSERT INTO `PinMedia`(`media_type`) VALUES (?);

--
-- UPDATE template for table `PinMedia`
--
UPDATE `PinMedia` SET `media_type` = ? WHERE 1;

--
-- DELETE template for table `PinMedia`
--
DELETE FROM `PinMedia` WHERE 0;

