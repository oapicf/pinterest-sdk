--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOEditInsertionOrderRequest' definition.
--


--
-- SELECT template for table `SSIOEditInsertionOrderRequest`
--
SELECT `start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email`, `oracle_line_id`, `salesforce_order_id`, `salesforce_order_line_id`, `ads_manager_order_line_id` FROM `SSIOEditInsertionOrderRequest` WHERE 1;

--
-- INSERT template for table `SSIOEditInsertionOrderRequest`
--
INSERT INTO `SSIOEditInsertionOrderRequest`(`start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email`, `oracle_line_id`, `salesforce_order_id`, `salesforce_order_line_id`, `ads_manager_order_line_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOEditInsertionOrderRequest`
--
UPDATE `SSIOEditInsertionOrderRequest` SET `start_date` = ?, `end_date` = ?, `po_number` = ?, `budget_amount` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `billing_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `media_contact_email` = ?, `agency_link` = ?, `user_email` = ?, `oracle_line_id` = ?, `salesforce_order_id` = ?, `salesforce_order_line_id` = ?, `ads_manager_order_line_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOEditInsertionOrderRequest`
--
DELETE FROM `SSIOEditInsertionOrderRequest` WHERE 0;

