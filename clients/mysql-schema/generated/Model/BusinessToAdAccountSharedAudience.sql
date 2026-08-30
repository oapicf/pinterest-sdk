--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessToAdAccountSharedAudience' definition.
--


--
-- SELECT template for table `BusinessToAdAccountSharedAudience`
--
SELECT `audience_id`, `permissions`, `recipient_account_ids` FROM `BusinessToAdAccountSharedAudience` WHERE 1;

--
-- INSERT template for table `BusinessToAdAccountSharedAudience`
--
INSERT INTO `BusinessToAdAccountSharedAudience`(`audience_id`, `permissions`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessToAdAccountSharedAudience`
--
UPDATE `BusinessToAdAccountSharedAudience` SET `audience_id` = ?, `permissions` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessToAdAccountSharedAudience`
--
DELETE FROM `BusinessToAdAccountSharedAudience` WHERE 0;

