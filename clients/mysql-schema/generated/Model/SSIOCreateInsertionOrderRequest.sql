--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOCreateInsertionOrderRequest' definition.
--


--
-- SELECT template for table `SSIOCreateInsertionOrderRequest`
--
SELECT `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email`, `accepted_terms_id`, `accepted_terms_time`, `billto_billing_address_id`, `billto_business_address_id`, `billto_company_id`, `currency_info`, `estimated_monthly_spend`, `order_line_type`, `order_name`, `pmp_id` FROM `SSIOCreateInsertionOrderRequest` WHERE 1;

--
-- INSERT template for table `SSIOCreateInsertionOrderRequest`
--
INSERT INTO `SSIOCreateInsertionOrderRequest`(`agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `budget_amount`, `end_date`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `po_number`, `start_date`, `user_email`, `accepted_terms_id`, `accepted_terms_time`, `billto_billing_address_id`, `billto_business_address_id`, `billto_company_id`, `currency_info`, `estimated_monthly_spend`, `order_line_type`, `order_name`, `pmp_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOCreateInsertionOrderRequest`
--
UPDATE `SSIOCreateInsertionOrderRequest` SET `agency_link` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `budget_amount` = ?, `end_date` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `po_number` = ?, `start_date` = ?, `user_email` = ?, `accepted_terms_id` = ?, `accepted_terms_time` = ?, `billto_billing_address_id` = ?, `billto_business_address_id` = ?, `billto_company_id` = ?, `currency_info` = ?, `estimated_monthly_spend` = ?, `order_line_type` = ?, `order_name` = ?, `pmp_id` = ? WHERE 1;

--
-- DELETE template for table `SSIOCreateInsertionOrderRequest`
--
DELETE FROM `SSIOCreateInsertionOrderRequest` WHERE 0;

