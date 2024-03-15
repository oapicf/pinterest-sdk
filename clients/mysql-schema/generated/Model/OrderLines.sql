--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLines' definition.
--


--
-- SELECT template for table `OrderLines`
--
SELECT `id`, `type`, `ad_account_id`, `purchase_order_id`, `start_time`, `end_time`, `budget`, `paid_budget`, `status`, `name`, `paid_type` FROM `OrderLines` WHERE 1;

--
-- INSERT template for table `OrderLines`
--
INSERT INTO `OrderLines`(`id`, `type`, `ad_account_id`, `purchase_order_id`, `start_time`, `end_time`, `budget`, `paid_budget`, `status`, `name`, `paid_type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderLines`
--
UPDATE `OrderLines` SET `id` = ?, `type` = ?, `ad_account_id` = ?, `purchase_order_id` = ?, `start_time` = ?, `end_time` = ?, `budget` = ?, `paid_budget` = ?, `status` = ?, `name` = ?, `paid_type` = ? WHERE 1;

--
-- DELETE template for table `OrderLines`
--
DELETE FROM `OrderLines` WHERE 0;

