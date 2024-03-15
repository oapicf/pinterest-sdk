--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderStatusResponse' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderStatusResponse`
--
SELECT `pin_order_id`, `status`, `creation_time` FROM `SSIOInsertionOrderStatusResponse` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderStatusResponse`
--
INSERT INTO `SSIOInsertionOrderStatusResponse`(`pin_order_id`, `status`, `creation_time`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderStatusResponse`
--
UPDATE `SSIOInsertionOrderStatusResponse` SET `pin_order_id` = ?, `status` = ?, `creation_time` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderStatusResponse`
--
DELETE FROM `SSIOInsertionOrderStatusResponse` WHERE 0;

