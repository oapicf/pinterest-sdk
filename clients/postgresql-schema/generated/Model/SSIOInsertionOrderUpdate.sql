--
-- "Pinterest REST API"
-- Prepared SQL queries for 'SSIOInsertionOrderUpdate' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ssio_insertion_order_update'
--
SELECT ads_manager_order_line_id, agency_link, billing_contact_email, billing_contact_firstname, billing_contact_lastname, budget_amount, end_date, media_contact_email, media_contact_firstname, media_contact_lastname, oracle_line_id, po_number, salesforce_order_id, salesforce_order_line_id, start_date, user_email FROM ssio_insertion_order_update WHERE 1=1;

--
-- INSERT template for table 'ssio_insertion_order_update'
--
INSERT INTO ssio_insertion_order_update (ads_manager_order_line_id, agency_link, billing_contact_email, billing_contact_firstname, billing_contact_lastname, budget_amount, end_date, media_contact_email, media_contact_firstname, media_contact_lastname, oracle_line_id, po_number, salesforce_order_id, salesforce_order_line_id, start_date, user_email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ssio_insertion_order_update'
--
UPDATE ssio_insertion_order_update SET ads_manager_order_line_id = ?, agency_link = ?, billing_contact_email = ?, billing_contact_firstname = ?, billing_contact_lastname = ?, budget_amount = ?, end_date = ?, media_contact_email = ?, media_contact_firstname = ?, media_contact_lastname = ?, oracle_line_id = ?, po_number = ?, salesforce_order_id = ?, salesforce_order_line_id = ?, start_date = ?, user_email = ? WHERE 1=2;

--
-- DELETE template for table 'ssio_insertion_order_update'
--
DELETE FROM ssio_insertion_order_update WHERE 1=2;

