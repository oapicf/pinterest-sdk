--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLine' definition.
--


--
-- SELECT template for table `OrderLine`
--
SELECT `ad_account_id`, `budget`, `end_time`, `id`, `name`, `paid_budget`, `paid_type`, `purchase_order_id`, `start_time`, `status`, `type`, `campaign_ids` FROM `OrderLine` WHERE 1;

--
-- INSERT template for table `OrderLine`
--
INSERT INTO `OrderLine`(`ad_account_id`, `budget`, `end_time`, `id`, `name`, `paid_budget`, `paid_type`, `purchase_order_id`, `start_time`, `status`, `type`, `campaign_ids`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderLine`
--
UPDATE `OrderLine` SET `ad_account_id` = ?, `budget` = ?, `end_time` = ?, `id` = ?, `name` = ?, `paid_budget` = ?, `paid_type` = ?, `purchase_order_id` = ?, `start_time` = ?, `status` = ?, `type` = ?, `campaign_ids` = ? WHERE 1;

--
-- DELETE template for table `OrderLine`
--
DELETE FROM `OrderLine` WHERE 0;

