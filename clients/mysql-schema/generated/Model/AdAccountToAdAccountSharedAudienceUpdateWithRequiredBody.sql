--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`
--
SELECT `audience_id`, `operation_type`, `recipient_account_ids` FROM `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`
--
INSERT INTO `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`(`audience_id`, `operation_type`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`
--
UPDATE `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` SET `audience_id` = ?, `operation_type` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody`
--
DELETE FROM `AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody` WHERE 0;

