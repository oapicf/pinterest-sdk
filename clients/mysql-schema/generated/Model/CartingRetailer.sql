--
-- Pinterest REST API.
-- Prepared SQL queries for 'CartingRetailer' definition.
--


--
-- SELECT template for table `CartingRetailer`
--
SELECT `retailer_id`, `retailer_name` FROM `CartingRetailer` WHERE 1;

--
-- INSERT template for table `CartingRetailer`
--
INSERT INTO `CartingRetailer`(`retailer_id`, `retailer_name`) VALUES (?, ?);

--
-- UPDATE template for table `CartingRetailer`
--
UPDATE `CartingRetailer` SET `retailer_id` = ?, `retailer_name` = ? WHERE 1;

--
-- DELETE template for table `CartingRetailer`
--
DELETE FROM `CartingRetailer` WHERE 0;

