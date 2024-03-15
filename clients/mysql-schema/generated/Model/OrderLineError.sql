--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLineError' definition.
--


--
-- SELECT template for table `OrderLineError`
--
SELECT `data`, `error_messages` FROM `OrderLineError` WHERE 1;

--
-- INSERT template for table `OrderLineError`
--
INSERT INTO `OrderLineError`(`data`, `error_messages`) VALUES (?, ?);

--
-- UPDATE template for table `OrderLineError`
--
UPDATE `OrderLineError` SET `data` = ?, `error_messages` = ? WHERE 1;

--
-- DELETE template for table `OrderLineError`
--
DELETE FROM `OrderLineError` WHERE 0;

