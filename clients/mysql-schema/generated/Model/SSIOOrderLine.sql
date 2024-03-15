--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOOrderLine' definition.
--


--
-- SELECT template for table `SSIOOrderLine`
--
SELECT `salesforce_order_line_id`, `ads_manager_order_line_id`, `pin_order_id`, `last_modified_date_time`, `start_date`, `end_date`, `bill_to_company_name`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `currency_info`, `agency_link`, `po_number`, `order_name`, `pmp_name`, `accepted_terms_id`, `accepted_terms_time`, `budget_amount`, `estimated_monthly_spend` FROM `SSIOOrderLine` WHERE 1;

--
-- INSERT template for table `SSIOOrderLine`
--
INSERT INTO `SSIOOrderLine`(`salesforce_order_line_id`, `ads_manager_order_line_id`, `pin_order_id`, `last_modified_date_time`, `start_date`, `end_date`, `bill_to_company_name`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `currency_info`, `agency_link`, `po_number`, `order_name`, `pmp_name`, `accepted_terms_id`, `accepted_terms_time`, `budget_amount`, `estimated_monthly_spend`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOOrderLine`
--
UPDATE `SSIOOrderLine` SET `salesforce_order_line_id` = ?, `ads_manager_order_line_id` = ?, `pin_order_id` = ?, `last_modified_date_time` = ?, `start_date` = ?, `end_date` = ?, `bill_to_company_name` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `billing_contact_email` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `currency_info` = ?, `agency_link` = ?, `po_number` = ?, `order_name` = ?, `pmp_name` = ?, `accepted_terms_id` = ?, `accepted_terms_time` = ?, `budget_amount` = ?, `estimated_monthly_spend` = ? WHERE 1;

--
-- DELETE template for table `SSIOOrderLine`
--
DELETE FROM `SSIOOrderLine` WHERE 0;

