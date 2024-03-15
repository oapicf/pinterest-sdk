--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceCreateCustomRequest' definition.
--


--
-- SELECT template for table `AudienceCreateCustomRequest`
--
SELECT `ad_account_id`, `name`, `rule`, `sharing_type`, `data_party`, `category` FROM `AudienceCreateCustomRequest` WHERE 1;

--
-- INSERT template for table `AudienceCreateCustomRequest`
--
INSERT INTO `AudienceCreateCustomRequest`(`ad_account_id`, `name`, `rule`, `sharing_type`, `data_party`, `category`) VALUES (?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceCreateCustomRequest`
--
UPDATE `AudienceCreateCustomRequest` SET `ad_account_id` = ?, `name` = ?, `rule` = ?, `sharing_type` = ?, `data_party` = ?, `category` = ? WHERE 1;

--
-- DELETE template for table `AudienceCreateCustomRequest`
--
DELETE FROM `AudienceCreateCustomRequest` WHERE 0;

