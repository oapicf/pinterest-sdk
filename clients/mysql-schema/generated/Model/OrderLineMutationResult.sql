--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLineMutationResult' definition.
--


--
-- SELECT template for table `OrderLineMutationResult`
--
SELECT `errors`, `order_line` FROM `OrderLineMutationResult` WHERE 1;

--
-- INSERT template for table `OrderLineMutationResult`
--
INSERT INTO `OrderLineMutationResult`(`errors`, `order_line`) VALUES (?, ?);

--
-- UPDATE template for table `OrderLineMutationResult`
--
UPDATE `OrderLineMutationResult` SET `errors` = ?, `order_line` = ? WHERE 1;

--
-- DELETE template for table `OrderLineMutationResult`
--
DELETE FROM `OrderLineMutationResult` WHERE 0;

