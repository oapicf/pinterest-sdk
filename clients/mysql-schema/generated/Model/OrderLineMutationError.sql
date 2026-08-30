--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLineMutationError' definition.
--


--
-- SELECT template for table `OrderLineMutationError`
--
SELECT `data`, `error_messages` FROM `OrderLineMutationError` WHERE 1;

--
-- INSERT template for table `OrderLineMutationError`
--
INSERT INTO `OrderLineMutationError`(`data`, `error_messages`) VALUES (?, ?);

--
-- UPDATE template for table `OrderLineMutationError`
--
UPDATE `OrderLineMutationError` SET `data` = ?, `error_messages` = ? WHERE 1;

--
-- DELETE template for table `OrderLineMutationError`
--
DELETE FROM `OrderLineMutationError` WHERE 0;

