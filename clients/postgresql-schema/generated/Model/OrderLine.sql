--
-- "Pinterest REST API"
-- Prepared SQL queries for 'OrderLine' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'order_line'
--
SELECT ad_account_id, budget, campaign_ids, end_time, "id", "name", paid_budget, paid_type, purchase_order_id, start_time, status, "type" FROM order_line WHERE 1=1;

--
-- INSERT template for table 'order_line'
--
INSERT INTO order_line (ad_account_id, budget, campaign_ids, end_time, "id", "name", paid_budget, paid_type, purchase_order_id, start_time, status, "type") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'order_line'
--
UPDATE order_line SET ad_account_id = ?, budget = ?, campaign_ids = ?, end_time = ?, "id" = ?, "name" = ?, paid_budget = ?, paid_type = ?, purchase_order_id = ?, start_time = ?, status = ?, "type" = ? WHERE 1=2;

--
-- DELETE template for table 'order_line'
--
DELETE FROM order_line WHERE 1=2;

