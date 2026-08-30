--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessToAdAccountSharedAudienceUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`
--
SELECT `audience_id`, `operation_type`, `recipient_account_ids` FROM `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`
--
INSERT INTO `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`(`audience_id`, `operation_type`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`
--
UPDATE `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` SET `audience_id` = ?, `operation_type` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody`
--
DELETE FROM `BusinessToAdAccountSharedAudienceUpdateWithRequiredBody` WHERE 0;

