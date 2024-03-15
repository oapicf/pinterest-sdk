--
-- Pinterest REST API.
-- Prepared SQL queries for 'PinterestTagEventData' definition.
--


--
-- SELECT template for table `PinterestTagEventData`
--
SELECT `currency`, `lead_type`, `line_items`, `order_id`, `order_quantity`, `page_name`, `promo_code`, `property`, `search_query`, `value`, `video_title` FROM `PinterestTagEventData` WHERE 1;

--
-- INSERT template for table `PinterestTagEventData`
--
INSERT INTO `PinterestTagEventData`(`currency`, `lead_type`, `line_items`, `order_id`, `order_quantity`, `page_name`, `promo_code`, `property`, `search_query`, `value`, `video_title`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `PinterestTagEventData`
--
UPDATE `PinterestTagEventData` SET `currency` = ?, `lead_type` = ?, `line_items` = ?, `order_id` = ?, `order_quantity` = ?, `page_name` = ?, `promo_code` = ?, `property` = ?, `search_query` = ?, `value` = ?, `video_title` = ? WHERE 1;

--
-- DELETE template for table `PinterestTagEventData`
--
DELETE FROM `PinterestTagEventData` WHERE 0;

