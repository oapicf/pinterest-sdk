--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLineResponse' definition.
--


--
-- SELECT template for table `OrderLineResponse`
--
SELECT `errors`, `order_line` FROM `OrderLineResponse` WHERE 1;

--
-- INSERT template for table `OrderLineResponse`
--
INSERT INTO `OrderLineResponse`(`errors`, `order_line`) VALUES (?, ?);

--
-- UPDATE template for table `OrderLineResponse`
--
UPDATE `OrderLineResponse` SET `errors` = ?, `order_line` = ? WHERE 1;

--
-- DELETE template for table `OrderLineResponse`
--
DELETE FROM `OrderLineResponse` WHERE 0;

