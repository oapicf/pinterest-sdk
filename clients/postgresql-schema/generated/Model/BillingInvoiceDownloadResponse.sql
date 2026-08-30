--
-- "Pinterest REST API"
-- Prepared SQL queries for 'BillingInvoiceDownloadResponse' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'billing_invoice_download_response'
--
SELECT download_url, "id" FROM billing_invoice_download_response WHERE 1=1;

--
-- INSERT template for table 'billing_invoice_download_response'
--
INSERT INTO billing_invoice_download_response (download_url, "id") VALUES (?, ?);

--
-- UPDATE template for table 'billing_invoice_download_response'
--
UPDATE billing_invoice_download_response SET download_url = ?, "id" = ? WHERE 1=2;

--
-- DELETE template for table 'billing_invoice_download_response'
--
DELETE FROM billing_invoice_download_response WHERE 1=2;

