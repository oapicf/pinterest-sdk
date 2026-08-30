--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessToBusinessSharedAudience' definition.
--


--
-- SELECT template for table `BusinessToBusinessSharedAudience`
--
SELECT `audience_id`, `permissions`, `recipient_business_ids` FROM `BusinessToBusinessSharedAudience` WHERE 1;

--
-- INSERT template for table `BusinessToBusinessSharedAudience`
--
INSERT INTO `BusinessToBusinessSharedAudience`(`audience_id`, `permissions`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessToBusinessSharedAudience`
--
UPDATE `BusinessToBusinessSharedAudience` SET `audience_id` = ?, `permissions` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessToBusinessSharedAudience`
--
DELETE FROM `BusinessToBusinessSharedAudience` WHERE 0;

