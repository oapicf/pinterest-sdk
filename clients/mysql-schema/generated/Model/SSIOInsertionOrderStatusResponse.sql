--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderStatusResponse' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderStatusResponse`
--
SELECT `creation_time`, `pin_order_id`, `status` FROM `SSIOInsertionOrderStatusResponse` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderStatusResponse`
--
INSERT INTO `SSIOInsertionOrderStatusResponse`(`creation_time`, `pin_order_id`, `status`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderStatusResponse`
--
UPDATE `SSIOInsertionOrderStatusResponse` SET `creation_time` = ?, `pin_order_id` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderStatusResponse`
--
DELETE FROM `SSIOInsertionOrderStatusResponse` WHERE 0;

