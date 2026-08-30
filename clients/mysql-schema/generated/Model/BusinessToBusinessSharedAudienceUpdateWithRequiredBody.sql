--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessToBusinessSharedAudienceUpdateWithRequiredBody' definition.
--


--
-- SELECT template for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`
--
SELECT `audience_id`, `operation_type`, `recipient_business_ids` FROM `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` WHERE 1;

--
-- INSERT template for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`
--
INSERT INTO `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`(`audience_id`, `operation_type`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`
--
UPDATE `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` SET `audience_id` = ?, `operation_type` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessToBusinessSharedAudienceUpdateWithRequiredBody`
--
DELETE FROM `BusinessToBusinessSharedAudienceUpdateWithRequiredBody` WHERE 0;

