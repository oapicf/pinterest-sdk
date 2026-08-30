--
-- Pinterest REST API.
-- Prepared SQL queries for 'SSIOInsertionOrderCreate' definition.
--


--
-- SELECT template for table `SSIOInsertionOrderCreate`
--
SELECT `accepted_terms_id`, `accepted_terms_time`, `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `billto_billing_address_id`, `billto_business_address_id`, `billto_company_id`, `budget_amount`, `currency_info`, `end_date`, `estimated_monthly_spend`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `order_line_type`, `order_name`, `pmp_id`, `po_number`, `start_date`, `user_email` FROM `SSIOInsertionOrderCreate` WHERE 1;

--
-- INSERT template for table `SSIOInsertionOrderCreate`
--
INSERT INTO `SSIOInsertionOrderCreate`(`accepted_terms_id`, `accepted_terms_time`, `agency_link`, `billing_contact_email`, `billing_contact_firstname`, `billing_contact_lastname`, `billto_billing_address_id`, `billto_business_address_id`, `billto_company_id`, `budget_amount`, `currency_info`, `end_date`, `estimated_monthly_spend`, `media_contact_email`, `media_contact_firstname`, `media_contact_lastname`, `order_line_type`, `order_name`, `pmp_id`, `po_number`, `start_date`, `user_email`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `SSIOInsertionOrderCreate`
--
UPDATE `SSIOInsertionOrderCreate` SET `accepted_terms_id` = ?, `accepted_terms_time` = ?, `agency_link` = ?, `billing_contact_email` = ?, `billing_contact_firstname` = ?, `billing_contact_lastname` = ?, `billto_billing_address_id` = ?, `billto_business_address_id` = ?, `billto_company_id` = ?, `budget_amount` = ?, `currency_info` = ?, `end_date` = ?, `estimated_monthly_spend` = ?, `media_contact_email` = ?, `media_contact_firstname` = ?, `media_contact_lastname` = ?, `order_line_type` = ?, `order_name` = ?, `pmp_id` = ?, `po_number` = ?, `start_date` = ?, `user_email` = ? WHERE 1;

--
-- DELETE template for table `SSIOInsertionOrderCreate`
--
DELETE FROM `SSIOInsertionOrderCreate` WHERE 0;

