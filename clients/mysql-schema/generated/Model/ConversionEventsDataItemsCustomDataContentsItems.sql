--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsDataItemsCustomDataContentsItems' definition.
--


--
-- SELECT template for table `ConversionEventsDataItemsCustomDataContentsItems`
--
SELECT `id`, `item_brand`, `item_brand_id`, `item_category`, `item_name`, `item_price`, `quantity` FROM `ConversionEventsDataItemsCustomDataContentsItems` WHERE 1;

--
-- INSERT template for table `ConversionEventsDataItemsCustomDataContentsItems`
--
INSERT INTO `ConversionEventsDataItemsCustomDataContentsItems`(`id`, `item_brand`, `item_brand_id`, `item_category`, `item_name`, `item_price`, `quantity`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsDataItemsCustomDataContentsItems`
--
UPDATE `ConversionEventsDataItemsCustomDataContentsItems` SET `id` = ?, `item_brand` = ?, `item_brand_id` = ?, `item_category` = ?, `item_name` = ?, `item_price` = ?, `quantity` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsDataItemsCustomDataContentsItems`
--
DELETE FROM `ConversionEventsDataItemsCustomDataContentsItems` WHERE 0;

