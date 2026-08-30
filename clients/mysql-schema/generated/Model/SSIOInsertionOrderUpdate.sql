--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderUpdate' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderUpdate`
--
SELECT `ads_manager_order_line_id`, `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `oracle_line_id`, `po_number`, `salesforce_order_id`, `salesforce_order_line_id`, `start_date`, `user_email` FROM `SSIOInsertionOrderUpdate` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderUpdate`
--
INSERT INTO `SSIOInsertionOrderUpdate`(`ads_manager_order_line_id`, `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `oracle_line_id`, `po_number`, `salesforce_order_id`, `salesforce_order_line_id`, `start_date`, `user_email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderUpdate`
--
UPDATE `SSIOInsertionOrderUpdate` SET `ads_manager_order_line_id` = ?, `agency_link` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `budget_amount` = ?, `end_date` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `oracle_line_id` = ?, `po_number` = ?, `salesforce_order_id` = ?, `salesforce_order_line_id` = ?, `start_date` = ?, `user_email` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderUpdate`
--
DELETE FROM `SSIOInsertionOrderUpdate` WHERE 0;

