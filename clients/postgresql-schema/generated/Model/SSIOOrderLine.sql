--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOOrderLine' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_order_line'
--
SELECT accepted_terms_id, accepted_terms_time, ads_manager_order_line_id, agency_link, bill_to_company_name, billing_contact_email, billing_contact_firstname, billing_contact_lastname, budget_amount, currency_info, end_date, estimated_monthly_spend, last_modified_date_time, media_contact_email, media_contact_firstname, media_contact_lastname, order_name, pin_order_id, pmp_name, po_number, salesforce_order_line_id, start_date FROM ssio_order_line WHERE 1=1;

--
-- INSERT template for table 'ssio_order_line'
--
INSERT INTO ssio_order_line (accepted_terms_id, accepted_terms_time, ads_manager_order_line_id, agency_link, bill_to_company_name, billing_contact_email, billing_contact_firstname, billing_contact_lastname, budget_amount, currency_info, end_date, estimated_monthly_spend, last_modified_date_time, media_contact_email, media_contact_firstname, media_contact_lastname, order_name, pin_order_id, pmp_name, po_number, salesforce_order_line_id, start_date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_order_line'
--
UPDATE ssio_order_line SET accepted_terms_id = ?, accepted_terms_time = ?, ads_manager_order_line_id = ?, agency_link = ?, bill_to_company_name = ?, billing_contact_email = ?, billing_contact_firstname = ?, billing_contact_lastname = ?, budget_amount = ?, currency_info = ?, end_date = ?, estimated_monthly_spend = ?, last_modified_date_time = ?, media_contact_email = ?, media_contact_firstname = ?, media_contact_lastname = ?, order_name = ?, pin_order_id = ?, pmp_name = ?, po_number = ?, salesforce_order_line_id = ?, start_date = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_order_line'
--
DELETE FROM ssio_order_line WHERE 1=2;

