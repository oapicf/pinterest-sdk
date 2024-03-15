--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLog' definition.
--


--
-- SELECT template for table `IntegrationLog`
--
SELECT `client_timestamp`, `event_type`, `log_level`, `external_business_id`, `advertiser_id`, `merchant_id`, `tag_id`, `feed_profile_id`, `message`, `app_version_number`, `platform_version_number`, `error`, `request` FROM `IntegrationLog` WHERE 1;

--
-- INSERT template for table `IntegrationLog`
--
INSERT INTO `IntegrationLog`(`client_timestamp`, `event_type`, `log_level`, `external_business_id`, `advertiser_id`, `merchant_id`, `tag_id`, `feed_profile_id`, `message`, `app_version_number`, `platform_version_number`, `error`, `request`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLog`
--
UPDATE `IntegrationLog` SET `client_timestamp` = ?, `event_type` = ?, `log_level` = ?, `external_business_id` = ?, `advertiser_id` = ?, `merchant_id` = ?, `tag_id` = ?, `feed_profile_id` = ?, `message` = ?, `app_version_number` = ?, `platform_version_number` = ?, `error` = ?, `request` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLog`
--
DELETE FROM `IntegrationLog` WHERE 0;

