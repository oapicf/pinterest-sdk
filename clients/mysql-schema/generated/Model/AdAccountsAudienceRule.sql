--
-- Pinterest REST API.
-- Prepared SQL queries for 'AdAccountsAudienceRule' definition.
--


--
-- SELECT template for table `AdAccountsAudienceRule`
--
SELECT `ad_account_id`, `ad_id`, `campaign_id`, `country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `engager_type`, `event`, `event_data`, `event_source`, `ingestion_source`, `objective_type`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id` FROM `AdAccountsAudienceRule` WHERE 1;

--
-- INSERT template for table `AdAccountsAudienceRule`
--
INSERT INTO `AdAccountsAudienceRule`(`ad_account_id`, `ad_id`, `campaign_id`, `country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `engager_type`, `event`, `event_data`, `event_source`, `ingestion_source`, `objective_type`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AdAccountsAudienceRule`
--
UPDATE `AdAccountsAudienceRule` SET `ad_account_id` = ?, `ad_id` = ?, `campaign_id` = ?, `country` = ?, `customer_list_id` = ?, `engagement_domain` = ?, `engagement_type` = ?, `engager_type` = ?, `event` = ?, `event_data` = ?, `event_source` = ?, `ingestion_source` = ?, `objective_type` = ?, `percentage` = ?, `pin_id` = ?, `prefill` = ?, `retention_days` = ?, `seed_id` = ?, `url` = ?, `visitor_source_id` = ? WHERE 1;

--
-- DELETE template for table `AdAccountsAudienceRule`
--
DELETE FROM `AdAccountsAudienceRule` WHERE 0;

