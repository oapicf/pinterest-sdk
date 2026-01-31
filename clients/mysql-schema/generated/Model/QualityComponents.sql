--
-- Pinterest REST API.
-- Prepared SQL queries for 'QualityComponents' definition.
--


--
-- SELECT template for table `QualityComponents`
--
SELECT `advertiser_external_id`, `click_id_epik`, `external_event_id`, `hashed_email`, `hashed_maid`, `ip_address`, `order_id`, `order_value`, `product_id`, `source_url`, `user_agent` FROM `QualityComponents` WHERE 1;

--
-- INSERT template for table `QualityComponents`
--
INSERT INTO `QualityComponents`(`advertiser_external_id`, `click_id_epik`, `external_event_id`, `hashed_email`, `hashed_maid`, `ip_address`, `order_id`, `order_value`, `product_id`, `source_url`, `user_agent`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `QualityComponents`
--
UPDATE `QualityComponents` SET `advertiser_external_id` = ?, `click_id_epik` = ?, `external_event_id` = ?, `hashed_email` = ?, `hashed_maid` = ?, `ip_address` = ?, `order_id` = ?, `order_value` = ?, `product_id` = ?, `source_url` = ?, `user_agent` = ? WHERE 1;

--
-- DELETE template for table `QualityComponents`
--
DELETE FROM `QualityComponents` WHERE 0;

