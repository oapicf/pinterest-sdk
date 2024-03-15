--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderStatus' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderStatus`
--
SELECT `pin_order_id`, `status`, `creation_time` FROM `SSIOInsertionOrderStatus` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderStatus`
--
INSERT INTO `SSIOInsertionOrderStatus`(`pin_order_id`, `status`, `creation_time`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderStatus`
--
UPDATE `SSIOInsertionOrderStatus` SET `pin_order_id` = ?, `status` = ?, `creation_time` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderStatus`
--
DELETE FROM `SSIOInsertionOrderStatus` WHERE 0;

