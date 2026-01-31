--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderStatus' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderStatus`
--
SELECT `creation_time`, `pin_order_id`, `status` FROM `SSIOInsertionOrderStatus` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderStatus`
--
INSERT INTO `SSIOInsertionOrderStatus`(`creation_time`, `pin_order_id`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderStatus`
--
UPDATE `SSIOInsertionOrderStatus` SET `creation_time` = ?, `pin_order_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderStatus`
--
DELETE FROM `SSIOInsertionOrderStatus` WHERE 0;

