--
-- Pinterest REST API.
-- Prepared SQL queries for 'BillingInvoiceDownloadResponse' definition.
--


--
-- SELECT template for table `BillingInvoiceDownloadResponse`
--
SELECT `download_url`, `id` FROM `BillingInvoiceDownloadResponse` WHERE 1;

--
-- INSERT template for table `BillingInvoiceDownloadResponse`
--
INSERT INTO `BillingInvoiceDownloadResponse`(`download_url`, `id`) VALUES (?, ?);

--
-- UPDATE template for table `BillingInvoiceDownloadResponse`
--
UPDATE `BillingInvoiceDownloadResponse` SET `download_url` = ?, `id` = ? WHERE 1;

--
-- DELETE template for table `BillingInvoiceDownloadResponse`
--
DELETE FROM `BillingInvoiceDownloadResponse` WHERE 0;

