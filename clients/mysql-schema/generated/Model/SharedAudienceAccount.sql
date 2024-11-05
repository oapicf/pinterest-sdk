--
-- Pinterest REST API.
-- Prepared SQL queries for 'SharedAudienceAccount' definition.
--


--
-- SELECT template for table `SharedAudienceAccount`
--
SELECT `account_id`, `account_name`, `account_type`, `shared_on_timestamp` FROM `SharedAudienceAccount` WHERE 1;

--
-- INSERT template for table `SharedAudienceAccount`
--
INSERT INTO `SharedAudienceAccount`(`account_id`, `account_name`, `account_type`, `shared_on_timestamp`) VALUES (?, ?, ?, ?);

--
-- UPDATE template for table `SharedAudienceAccount`
--
UPDATE `SharedAudienceAccount` SET `account_id` = ?, `account_name` = ?, `account_type` = ?, `shared_on_timestamp` = ? WHERE 1;

--
-- DELETE template for table `SharedAudienceAccount`
--
DELETE FROM `SharedAudienceAccount` WHERE 0;

