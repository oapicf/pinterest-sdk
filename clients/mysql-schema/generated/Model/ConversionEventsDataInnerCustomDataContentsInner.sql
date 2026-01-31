--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEvents_data_inner_custom_data_contents_inner' definition.
--


--
-- SELECT template for table `ConversionEvents_data_inner_custom_data_contents_inner`
--
SELECT `id`, `item_brand`, `item_category`, `item_name`, `item_price`, `quantity` FROM `ConversionEvents_data_inner_custom_data_contents_inner` WHERE 1;

--
-- INSERT template for table `ConversionEvents_data_inner_custom_data_contents_inner`
--
INSERT INTO `ConversionEvents_data_inner_custom_data_contents_inner`(`id`, `item_brand`, `item_category`, `item_name`, `item_price`, `quantity`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEvents_data_inner_custom_data_contents_inner`
--
UPDATE `ConversionEvents_data_inner_custom_data_contents_inner` SET `id` = ?, `item_brand` = ?, `item_category` = ?, `item_name` = ?, `item_price` = ?, `quantity` = ? WHERE 1;

--
-- DELETE template for table `ConversionEvents_data_inner_custom_data_contents_inner`
--
DELETE FROM `ConversionEvents_data_inner_custom_data_contents_inner` WHERE 0;

