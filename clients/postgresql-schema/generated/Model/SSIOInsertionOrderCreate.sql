--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOInsertionOrderCreate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_order_create'
--
SELECT accepted_terms_id, accepted_terms_time, agency_link, billing_contact_email, billing_contact_firstname, billing_contact_lastname, billto_billing_address_id, billto_business_address_id, billto_company_id, budget_amount, currency_info, end_date, estimated_monthly_spend, media_contact_email, media_contact_firstname, media_contact_lastname, order_line_type, order_name, pmp_id, po_number, start_date, user_email FROM ssio_insertion_order_create WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_order_create'
--
INSERT INTO ssio_insertion_order_create (accepted_terms_id, accepted_terms_time, agency_link, billing_contact_email, billing_contact_firstname, billing_contact_lastname, billto_billing_address_id, billto_business_address_id, billto_company_id, budget_amount, currency_info, end_date, estimated_monthly_spend, media_contact_email, media_contact_firstname, media_contact_lastname, order_line_type, order_name, pmp_id, po_number, start_date, user_email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_insertion_order_create'
--
UPDATE ssio_insertion_order_create SET accepted_terms_id = ?, accepted_terms_time = ?, agency_link = ?, billing_contact_email = ?, billing_contact_firstname = ?, billing_contact_lastname = ?, billto_billing_address_id = ?, billto_business_address_id = ?, billto_company_id = ?, budget_amount = ?, currency_info = ?, end_date = ?, estimated_monthly_spend = ?, media_contact_email = ?, media_contact_firstname = ?, media_contact_lastname = ?, order_line_type = ?, order_name = ?, pmp_id = ?, po_number = ?, start_date = ?, user_email = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_order_create'
--
DELETE FROM ssio_insertion_order_create WHERE 1=2;

