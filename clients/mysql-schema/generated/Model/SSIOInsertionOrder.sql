--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrder' definition.
--


--
-- SELECT template for table `SSIOInsertionOrder`
--
SELECT `pin_order_id` FROM `SSIOInsertionOrder` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrder`
--
INSERT INTO `SSIOInsertionOrder`(`pin_order_id`) VALUES (?);

--
-- UPDATE template for table `SSIOInsertionOrder`
--
UPDATE `SSIOInsertionOrder` SET `pin_order_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrder`
--
DELETE FROM `SSIOInsertionOrder` WHERE 0;

