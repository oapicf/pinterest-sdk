--
-- Pinterest REST API.
-- Prepared SQL queries for 'SharedAudience' definition.
--


--
-- SELECT template for table `SharedAudience`
--
SELECT `audience_id`, `operation_type`, `recipient_account_ids` FROM `SharedAudience` WHERE 1;

--
-- INSERT template for table `SharedAudience`
--
INSERT INTO `SharedAudience`(`audience_id`, `operation_type`, `recipient_account_ids`) VALUES (?, ?, ?);

--
-- UPDATE template for table `SharedAudience`
--
UPDATE `SharedAudience` SET `audience_id` = ?, `operation_type` = ?, `recipient_account_ids` = ? WHERE 1;

--
-- DELETE template for table `SharedAudience`
--
DELETE FROM `SharedAudience` WHERE 0;

