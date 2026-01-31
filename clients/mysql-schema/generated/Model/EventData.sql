--
-- Pinterest REST API.
-- Prepared SQL queries for 'EventData' definition.
--


--
-- SELECT template for table `EventData`
--
SELECT `currency`, `lead_type`, `line_items`, `order_id`, `order_quantity`, `page_name`, `promo_code`, `property`, `search_query`, `value`, `video_title` FROM `EventData` WHERE 1;

--
-- INSERT template for table `EventData`
--
INSERT INTO `EventData`(`currency`, `lead_type`, `line_items`, `order_id`, `order_quantity`, `page_name`, `promo_code`, `property`, `search_query`, `value`, `video_title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `EventData`
--
UPDATE `EventData` SET `currency` = ?, `lead_type` = ?, `line_items` = ?, `order_id` = ?, `order_quantity` = ?, `page_name` = ?, `promo_code` = ?, `property` = ?, `search_query` = ?, `value` = ?, `video_title` = ? WHERE 1;

--
-- DELETE template for table `EventData`
--
DELETE FROM `EventData` WHERE 0;

