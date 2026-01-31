--
-- Pinterest REST API.
-- Prepared SQL queries for 'integrations_logs_post_400_response' definition.
--


--
-- SELECT template for table `integrations_logs_post_400_response`
--
SELECT `code`, `message`, `details` FROM `integrations_logs_post_400_response` WHERE 1;

--
-- INSERT template for table `integrations_logs_post_400_response`
--
INSERT INTO `integrations_logs_post_400_response`(`code`, `message`, `details`) VALUES (?, ?, ?);

--
-- UPDATE template for table `integrations_logs_post_400_response`
--
UPDATE `integrations_logs_post_400_response` SET `code` = ?, `message` = ?, `details` = ? WHERE 1;

--
-- DELETE template for table `integrations_logs_post_400_response`
--
DELETE FROM `integrations_logs_post_400_response` WHERE 0;

