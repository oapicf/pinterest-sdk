--
-- Pinterest REST API.
-- Prepared SQL queries for 'BillingInvoice' definition.
--


--
-- SELECT template for table `BillingInvoice`
--
SELECT `ad_account_id`, `ad_account_name`, `amount_billed_micro_currency`, `amount_discount_micro_currency`, `amount_net_micro_currency`, `amount_tax_micro_currency`, `bill_to_country`, `billing_period_end_date`, `billing_period_start_date`, `currency`, `document_type`, `id`, `invoice_due_date`, `payment_terms`, `status` FROM `BillingInvoice` WHERE 1;

--
-- INSERT template for table `BillingInvoice`
--
INSERT INTO `BillingInvoice`(`ad_account_id`, `ad_account_name`, `amount_billed_micro_currency`, `amount_discount_micro_currency`, `amount_net_micro_currency`, `amount_tax_micro_currency`, `bill_to_country`, `billing_period_end_date`, `billing_period_start_date`, `currency`, `document_type`, `id`, `invoice_due_date`, `payment_terms`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `BillingInvoice`
--
UPDATE `BillingInvoice` SET `ad_account_id` = ?, `ad_account_name` = ?, `amount_billed_micro_currency` = ?, `amount_discount_micro_currency` = ?, `amount_net_micro_currency` = ?, `amount_tax_micro_currency` = ?, `bill_to_country` = ?, `billing_period_end_date` = ?, `billing_period_start_date` = ?, `currency` = ?, `document_type` = ?, `id` = ?, `invoice_due_date` = ?, `payment_terms` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `BillingInvoice`
--
DELETE FROM `BillingInvoice` WHERE 0;

