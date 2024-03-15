--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOCreateInsertionOrderResponse' definition.
--


--
-- SELECT template for table `SSIOCreateInsertionOrderResponse`
--
SELECT `pin_order_id` FROM `SSIOCreateInsertionOrderResponse` WHERE 1;

--
-- INSERT template for table `SSIOCreateInsertionOrderResponse`
--
INSERT INTO `SSIOCreateInsertionOrderResponse`(`pin_order_id`) VALUES (?);

--
-- UPDATE template for table `SSIOCreateInsertionOrderResponse`
--
UPDATE `SSIOCreateInsertionOrderResponse` SET `pin_order_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOCreateInsertionOrderResponse`
--
DELETE FROM `SSIOCreateInsertionOrderResponse` WHERE 0;

