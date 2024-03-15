--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLine' definition.
--


--
-- SELECT template for table `OrderLine`
--
SELECT `id`, `type`, `ad_account_id`, `purchase_order_id`, `start_time`, `end_time`, `budget`, `paid_budget`, `status`, `name`, `paid_type`, `campaign_ids` FROM `OrderLine` WHERE 1;

--
-- INSERT template for table `OrderLine`
--
INSERT INTO `OrderLine`(`id`, `type`, `ad_account_id`, `purchase_order_id`, `start_time`, `end_time`, `budget`, `paid_budget`, `status`, `name`, `paid_type`, `campaign_ids`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderLine`
--
UPDATE `OrderLine` SET `id` = ?, `type` = ?, `ad_account_id` = ?, `purchase_order_id` = ?, `start_time` = ?, `end_time` = ?, `budget` = ?, `paid_budget` = ?, `status` = ?, `name` = ?, `paid_type` = ?, `campaign_ids` = ? WHERE 1;

--
-- DELETE template for table `OrderLine`
--
DELETE FROM `OrderLine` WHERE 0;

