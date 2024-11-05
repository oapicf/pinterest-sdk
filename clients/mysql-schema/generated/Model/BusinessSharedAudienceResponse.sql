--
-- Pinterest REST API.
-- Prepared SQL queries for 'BusinessSharedAudienceResponse' definition.
--


--
-- SELECT template for table `BusinessSharedAudienceResponse`
--
SELECT `audience_id`, `permissions`, `recipient_business_ids` FROM `BusinessSharedAudienceResponse` WHERE 1;

--
-- INSERT template for table `BusinessSharedAudienceResponse`
--
INSERT INTO `BusinessSharedAudienceResponse`(`audience_id`, `permissions`, `recipient_business_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `BusinessSharedAudienceResponse`
--
UPDATE `BusinessSharedAudienceResponse` SET `audience_id` = ?, `permissions` = ?, `recipient_business_ids` = ? WHERE 1;

--
-- DELETE template for table `BusinessSharedAudienceResponse`
--
DELETE FROM `BusinessSharedAudienceResponse` WHERE 0;

