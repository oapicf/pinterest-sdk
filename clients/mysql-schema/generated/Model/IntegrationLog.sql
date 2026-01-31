--
-- Pinterest REST API.
-- Prepared SQL queries for 'IntegrationLog' definition.
--


--
-- SELECT template for table `IntegrationLog`
--
SELECT `advertiser_id`, `app_version_number`, `client_timestamp`, `error`, `event_type`, `external_business_id`, `feed_profile_id`, `log_level`, `merchant_id`, `message`, `platform_version_number`, `request`, `tag_id` FROM `IntegrationLog` WHERE 1;

--
-- INSERT template for table `IntegrationLog`
--
INSERT INTO `IntegrationLog`(`advertiser_id`, `app_version_number`, `client_timestamp`, `error`, `event_type`, `external_business_id`, `feed_profile_id`, `log_level`, `merchant_id`, `message`, `platform_version_number`, `request`, `tag_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `IntegrationLog`
--
UPDATE `IntegrationLog` SET `advertiser_id` = ?, `app_version_number` = ?, `client_timestamp` = ?, `error` = ?, `event_type` = ?, `external_business_id` = ?, `feed_profile_id` = ?, `log_level` = ?, `merchant_id` = ?, `message` = ?, `platform_version_number` = ?, `request` = ?, `tag_id` = ? WHERE 1;

--
-- DELETE template for table `IntegrationLog`
--
DELETE FROM `IntegrationLog` WHERE 0;

