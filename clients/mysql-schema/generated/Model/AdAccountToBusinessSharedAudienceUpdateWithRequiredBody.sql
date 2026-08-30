--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountToBusinessSharedAudienceUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`
--
SELECT `audience_id`, `operation_type`, `recipient_business_ids` FROM `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`
--
INSERT INTO `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`(`audience_id`, `operation_type`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`
--
UPDATE `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` SET `audience_id` = ?, `operation_type` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody`
--
DELETE FROM `AdAccountToBusinessSharedAudienceUpdateWithRequiredBody` WHERE 0;

