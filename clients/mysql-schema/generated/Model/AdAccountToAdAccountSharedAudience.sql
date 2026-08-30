--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountToAdAccountSharedAudience' definition.
--


--
-- SELECT template for table `AdAccountToAdAccountSharedAudience`
--
SELECT `audience_id`, `permissions`, `recipient_account_ids` FROM `AdAccountToAdAccountSharedAudience` WHERE 1;

--
-- INSERT template for table `AdAccountToAdAccountSharedAudience`
--
INSERT INTO `AdAccountToAdAccountSharedAudience`(`audience_id`, `permissions`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdAccountToAdAccountSharedAudience`
--
UPDATE `AdAccountToAdAccountSharedAudience` SET `audience_id` = ?, `permissions` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `AdAccountToAdAccountSharedAudience`
--
DELETE FROM `AdAccountToAdAccountSharedAudience` WHERE 0;

