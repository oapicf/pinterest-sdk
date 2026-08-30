--
-- Pinterest REST API.
-- Prepared SQL queries for 'ConversionEventsDataItemsCustomData' definition.
--


--
-- SELECT template for table `ConversionEventsDataItemsCustomData`
--
SELECT `content_brand`, `content_category`, `content_ids`, `content_name`, `contents`, `currency`, `external_measurement_id`, `external_measurement_vendor_id`, `np`, `num_items`, `opt_out_type`, `order_id`, `predicted_ltv`, `search_string`, `value` FROM `ConversionEventsDataItemsCustomData` WHERE 1;

--
-- INSERT template for table `ConversionEventsDataItemsCustomData`
--
INSERT INTO `ConversionEventsDataItemsCustomData`(`content_brand`, `content_category`, `content_ids`, `content_name`, `contents`, `currency`, `external_measurement_id`, `external_measurement_vendor_id`, `np`, `num_items`, `opt_out_type`, `order_id`, `predicted_ltv`, `search_string`, `value`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ConversionEventsDataItemsCustomData`
--
UPDATE `ConversionEventsDataItemsCustomData` SET `content_brand` = ?, `content_category` = ?, `content_ids` = ?, `content_name` = ?, `contents` = ?, `currency` = ?, `external_measurement_id` = ?, `external_measurement_vendor_id` = ?, `np` = ?, `num_items` = ?, `opt_out_type` = ?, `order_id` = ?, `predicted_ltv` = ?, `search_string` = ?, `value` = ? WHERE 1;

--
-- DELETE template for table `ConversionEventsDataItemsCustomData`
--
DELETE FROM `ConversionEventsDataItemsCustomData` WHERE 0;

