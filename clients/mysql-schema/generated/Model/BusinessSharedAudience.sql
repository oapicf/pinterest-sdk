--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessSharedAudience' definition.
--


--
-- SELECT template for table `BusinessSharedAudience`
--
SELECT `audience_id`, `operation_type`, `recipient_business_ids` FROM `BusinessSharedAudience` WHERE 1;

--
-- INSERT template for table `BusinessSharedAudience`
--
INSERT INTO `BusinessSharedAudience`(`audience_id`, `operation_type`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessSharedAudience`
--
UPDATE `BusinessSharedAudience` SET `audience_id` = ?, `operation_type` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessSharedAudience`
--
DELETE FROM `BusinessSharedAudience` WHERE 0;

