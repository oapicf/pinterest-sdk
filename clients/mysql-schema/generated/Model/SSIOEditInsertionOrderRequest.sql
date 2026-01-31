--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOEditInsertionOrderRequest' definition.
--


--
-- SELECT template for table `SSIOEditInsertionOrderRequest`
--
SELECT `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email`, `ads_manager_order_line_id`, `oracle_line_id`, `salesforce_order_id`, `salesforce_order_line_id` FROM `SSIOEditInsertionOrderRequest` WHERE 1;

--
-- INSERT template for table `SSIOEditInsertionOrderRequest`
--
INSERT INTO `SSIOEditInsertionOrderRequest`(`agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email`, `ads_manager_order_line_id`, `oracle_line_id`, `salesforce_order_id`, `salesforce_order_line_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOEditInsertionOrderRequest`
--
UPDATE `SSIOEditInsertionOrderRequest` SET `agency_link` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `budget_amount` = ?, `end_date` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `po_number` = ?, `start_date` = ?, `user_email` = ?, `ads_manager_order_line_id` = ?, `oracle_line_id` = ?, `salesforce_order_id` = ?, `salesforce_order_line_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOEditInsertionOrderRequest`
--
DELETE FROM `SSIOEditInsertionOrderRequest` WHERE 0;

