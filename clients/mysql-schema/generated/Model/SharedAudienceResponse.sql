--
-- Pinterest REST API.
-- Prepared SQL queries for 'SharedAudienceResponse' definition.
--


--
-- SELECT template for table `SharedAudienceResponse`
--
SELECT `audience_id`, `permissions`, `recipient_account_ids` FROM `SharedAudienceResponse` WHERE 1;

--
-- INSERT template for table `SharedAudienceResponse`
--
INSERT INTO `SharedAudienceResponse`(`audience_id`, `permissions`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SharedAudienceResponse`
--
UPDATE `SharedAudienceResponse` SET `audience_id` = ?, `permissions` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `SharedAudienceResponse`
--
DELETE FROM `SharedAudienceResponse` WHERE 0;

