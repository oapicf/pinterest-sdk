--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BillingInvoice' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'billing_invoice'
--
SELECT ad_account_id, ad_account_name, amount_billed_micro_currency, amount_discount_micro_currency, amount_net_micro_currency, amount_tax_micro_currency, bill_to_country, billing_period_end_date, billing_period_start_date, currency, document_type, "id", invoice_due_date, payment_terms, status FROM billing_invoice WHERE 1=1;

--
-- INSERT template for table 'billing_invoice'
--
INSERT INTO billing_invoice (ad_account_id, ad_account_name, amount_billed_micro_currency, amount_discount_micro_currency, amount_net_micro_currency, amount_tax_micro_currency, bill_to_country, billing_period_end_date, billing_period_start_date, currency, document_type, "id", invoice_due_date, payment_terms, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'billing_invoice'
--
UPDATE billing_invoice SET ad_account_id = ?, ad_account_name = ?, amount_billed_micro_currency = ?, amount_discount_micro_currency = ?, amount_net_micro_currency = ?, amount_tax_micro_currency = ?, bill_to_country = ?, billing_period_end_date = ?, billing_period_start_date = ?, currency = ?, document_type = ?, "id" = ?, invoice_due_date = ?, payment_terms = ?, status = ? WHERE 1=2;

--
-- DELETE template for table 'billing_invoice'
--
DELETE FROM billing_invoice WHERE 1=2;

