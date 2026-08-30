--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountToBusinessSharedAudience' definition.
--


--
-- SELECT template for table `AdAccountToBusinessSharedAudience`
--
SELECT `audience_id`, `permissions`, `recipient_business_ids` FROM `AdAccountToBusinessSharedAudience` WHERE 1;

--
-- INSERT template for table `AdAccountToBusinessSharedAudience`
--
INSERT INTO `AdAccountToBusinessSharedAudience`(`audience_id`, `permissions`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdAccountToBusinessSharedAudience`
--
UPDATE `AdAccountToBusinessSharedAudience` SET `audience_id` = ?, `permissions` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `AdAccountToBusinessSharedAudience`
--
DELETE FROM `AdAccountToBusinessSharedAudience` WHERE 0;

