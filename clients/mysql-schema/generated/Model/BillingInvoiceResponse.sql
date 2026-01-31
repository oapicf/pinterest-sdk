--
-- Pinterest REST API.
-- Prepared SQL queries for 'BillingInvoiceResponse' definition.
--


--
-- SELECT template for table `BillingInvoiceResponse`
--
SELECT `ad_account_id`, `ad_account_name`, `amount_billed_micro_currency`, `amount_discount_micro_currency`, `amount_net_micro_currency`, `amount_tax_micro_currency`, `bill_to_country`, `billing_period_end_date`, `billing_period_start_date`, `currency`, `document_type`, `id`, `invoice_due_date`, `payment_terms`, `status` FROM `BillingInvoiceResponse` WHERE 1;

--
-- INSERT template for table `BillingInvoiceResponse`
--
INSERT INTO `BillingInvoiceResponse`(`ad_account_id`, `ad_account_name`, `amount_billed_micro_currency`, `amount_discount_micro_currency`, `amount_net_micro_currency`, `amount_tax_micro_currency`, `bill_to_country`, `billing_period_end_date`, `billing_period_start_date`, `currency`, `document_type`, `id`, `invoice_due_date`, `payment_terms`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BillingInvoiceResponse`
--
UPDATE `BillingInvoiceResponse` SET `ad_account_id` = ?, `ad_account_name` = ?, `amount_billed_micro_currency` = ?, `amount_discount_micro_currency` = ?, `amount_net_micro_currency` = ?, `amount_tax_micro_currency` = ?, `bill_to_country` = ?, `billing_period_end_date` = ?, `billing_period_start_date` = ?, `currency` = ?, `document_type` = ?, `id` = ?, `invoice_due_date` = ?, `payment_terms` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `BillingInvoiceResponse`
--
DELETE FROM `BillingInvoiceResponse` WHERE 0;

