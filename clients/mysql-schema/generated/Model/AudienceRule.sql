--
-- Pinterest REST API.
-- Prepared SQL queries for 'AudienceRule' definition.
--


--
-- SELECT template for table `AudienceRule`
--
SELECT `ad_account_id`, `ad_id`, `campaign_id`, `country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `engager_type`, `event`, `event_data`, `event_source`, `ingestion_source`, `objective_type`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id` FROM `AudienceRule` WHERE 1;

--
-- INSERT template for table `AudienceRule`
--
INSERT INTO `AudienceRule`(`ad_account_id`, `ad_id`, `campaign_id`, `country`, `customer_list_id`, `engagement_domain`, `engagement_type`, `engager_type`, `event`, `event_data`, `event_source`, `ingestion_source`, `objective_type`, `percentage`, `pin_id`, `prefill`, `retention_days`, `seed_id`, `url`, `visitor_source_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `AudienceRule`
--
UPDATE `AudienceRule` SET `ad_account_id` = ?, `ad_id` = ?, `campaign_id` = ?, `country` = ?, `customer_list_id` = ?, `engagement_domain` = ?, `engagement_type` = ?, `engager_type` = ?, `event` = ?, `event_data` = ?, `event_source` = ?, `ingestion_source` = ?, `objective_type` = ?, `percentage` = ?, `pin_id` = ?, `prefill` = ?, `retention_days` = ?, `seed_id` = ?, `url` = ?, `visitor_source_id` = ? WHERE 1;

--
-- DELETE template for table `AudienceRule`
--
DELETE FROM `AudienceRule` WHERE 0;

