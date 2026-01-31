--
-- Pinterest REST API.
-- Prepared SQL queries for 'OrderLines' definition.
--


--
-- SELECT template for table `OrderLines`
--
SELECT `ad_account_id`, `budget`, `end_time`, `id`, `name`, `paid_budget`, `paid_type`, `purchase_order_id`, `start_time`, `status`, `type` FROM `OrderLines` WHERE 1;

--
-- INSERT template for table `OrderLines`
--
INSERT INTO `OrderLines`(`ad_account_id`, `budget`, `end_time`, `id`, `name`, `paid_budget`, `paid_type`, `purchase_order_id`, `start_time`, `status`, `type`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `OrderLines`
--
UPDATE `OrderLines` SET `ad_account_id` = ?, `budget` = ?, `end_time` = ?, `id` = ?, `name` = ?, `paid_budget` = ?, `paid_type` = ?, `purchase_order_id` = ?, `start_time` = ?, `status` = ?, `type` = ? WHERE 1;

--
-- DELETE template for table `OrderLines`
--
DELETE FROM `OrderLines` WHERE 0;

