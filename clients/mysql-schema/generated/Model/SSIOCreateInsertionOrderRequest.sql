--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOCreateInsertionOrderRequest' definition.
--


--
-- SELECT template for table `SSIOCreateInsertionOrderRequest`
--
SELECT `start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email`, `accepted_terms_time`, `pmp_id`, `order_name`, `order_line_type`, `accepted_terms_id`, `billto_company_id`, `billto_business_address_id`, `billto_billing_address_id`, `estimated_monthly_spend`, `currency_info` FROM `SSIOCreateInsertionOrderRequest` WHERE 1;

--
-- INSERT template for table `SSIOCreateInsertionOrderRequest`
--
INSERT INTO `SSIOCreateInsertionOrderRequest`(`start_date`, `end_date`, `po_number`, `budget_amount`, `billing_contact_firstname`, `billing_contact_lastname`, `billing_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `media_contact_email`, `agency_link`, `user_email`, `accepted_terms_time`, `pmp_id`, `order_name`, `order_line_type`, `accepted_terms_id`, `billto_company_id`, `billto_business_address_id`, `billto_billing_address_id`, `estimated_monthly_spend`, `currency_info`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOCreateInsertionOrderRequest`
--
UPDATE `SSIOCreateInsertionOrderRequest` SET `start_date` = ?, `end_date` = ?, `po_number` = ?, `budget_amount` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `billing_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `media_contact_email` = ?, `agency_link` = ?, `user_email` = ?, `accepted_terms_time` = ?, `pmp_id` = ?, `order_name` = ?, `order_line_type` = ?, `accepted_terms_id` = ?, `billto_company_id` = ?, `billto_business_address_id` = ?, `billto_billing_address_id` = ?, `estimated_monthly_spend` = ?, `currency_info` = ? WHERE 1;

--
-- DELETE template for table `SSIOCreateInsertionOrderRequest`
--
DELETE FROM `SSIOCreateInsertionOrderRequest` WHERE 0;

