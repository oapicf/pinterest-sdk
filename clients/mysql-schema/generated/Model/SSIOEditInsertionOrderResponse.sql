--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOEditInsertionOrderResponse' definition.
--


--
-- SELECT template for table `SSIOEditInsertionOrderResponse`
--
SELECT `pin_order_id` FROM `SSIOEditInsertionOrderResponse` WHERE 1;

--
-- INSERT template for table `SSIOEditInsertionOrderResponse`
--
INSERT INTO `SSIOEditInsertionOrderResponse`(`pin_order_id`) VALUES (?);

--
-- UPDATE template for table `SSIOEditInsertionOrderResponse`
--
UPDATE `SSIOEditInsertionOrderResponse` SET `pin_order_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOEditInsertionOrderResponse`
--
DELETE FROM `SSIOEditInsertionOrderResponse` WHERE 0;

