--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOOrderLine' definition.
--


--
-- SELECT template for table `SSIOOrderLine`
--
SELECT `accepted_terms_id`, `accepted_terms_time`, `ads_manager_order_line_id`, `agency_link`, `bill_to_company_name`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `currency_info`, `end_date`, `estimated_monthly_spend`, `last_modified_date_time`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `order_name`, `pin_order_id`, `pmp_name`, `po_number`, `salesforce_order_line_id`, `start_date` FROM `SSIOOrderLine` WHERE 1;

--
-- INSERT template for table `SSIOOrderLine`
--
INSERT INTO `SSIOOrderLine`(`accepted_terms_id`, `accepted_terms_time`, `ads_manager_order_line_id`, `agency_link`, `bill_to_company_name`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `currency_info`, `end_date`, `estimated_monthly_spend`, `last_modified_date_time`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `order_name`, `pin_order_id`, `pmp_name`, `po_number`, `salesforce_order_line_id`, `start_date`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOOrderLine`
--
UPDATE `SSIOOrderLine` SET `accepted_terms_id` = ?, `accepted_terms_time` = ?, `ads_manager_order_line_id` = ?, `agency_link` = ?, `bill_to_company_name` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `budget_amount` = ?, `currency_info` = ?, `end_date` = ?, `estimated_monthly_spend` = ?, `last_modified_date_time` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `order_name` = ?, `pin_order_id` = ?, `pmp_name` = ?, `po_number` = ?, `salesforce_order_line_id` = ?, `start_date` = ? WHERE 1;

--
-- DELETE template for table `SSIOOrderLine`
--
DELETE FROM `SSIOOrderLine` WHERE 0;

