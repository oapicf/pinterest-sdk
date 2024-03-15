--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceRule' definition.
--


--
-- SELECT template for table `AudienceRule`
--
SELECT `country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `event`, `event_data`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id`, `event_source`, `ingestion_source`, `engager_type`, `campaign_id`, `ad_id`, `objective_type`, `ad_account_id` FROM `AudienceRule` WHERE 1;

--
-- INSERT template for table `AudienceRule`
--
INSERT INTO `AudienceRule`(`country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `event`, `event_data`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id`, `event_source`, `ingestion_source`, `engager_type`, `campaign_id`, `ad_id`, `objective_type`, `ad_account_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceRule`
--
UPDATE `AudienceRule` SET `country` = ?, `customer_list_id` = ?, `engagement_domain` = ?, `engagement_type` = ?, `event` = ?, `event_data` = ?, `percentage` = ?, `pin_id` = ?, `prefill` = ?, `retention_days` = ?, `seed_id` = ?, `url` = ?, `visitor_source_id` = ?, `event_source` = ?, `ingestion_source` = ?, `engager_type` = ?, `campaign_id` = ?, `ad_id` = ?, `objective_type` = ?, `ad_account_id` = ? WHERE 1;

--
-- DELETE template for table `AudienceRule`
--
DELETE FROM `AudienceRule` WHERE 0;

