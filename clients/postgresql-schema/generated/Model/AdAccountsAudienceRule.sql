--
-- "Pinterest REST API"
-- Prepared SQL queries for 'AdAccountsAudienceRule' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'ad_accounts_audience_rule'
--
SELECT ad_account_id, ad_id, campaign_id, country, customer_list_id, engagement_domain, engagement_type, engager_type, "event", event_data, event_source, ingestion_source, objective_type, percentage, pin_id, prefill, retention_days, seed_id, url, visitor_source_id FROM ad_accounts_audience_rule WHERE 1=1;

--
-- INSERT template for table 'ad_accounts_audience_rule'
--
INSERT INTO ad_accounts_audience_rule (ad_account_id, ad_id, campaign_id, country, customer_list_id, engagement_domain, engagement_type, engager_type, "event", event_data, event_source, ingestion_source, objective_type, percentage, pin_id, prefill, retention_days, seed_id, url, visitor_source_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'ad_accounts_audience_rule'
--
UPDATE ad_accounts_audience_rule SET ad_account_id = ?, ad_id = ?, campaign_id = ?, country = ?, customer_list_id = ?, engagement_domain = ?, engagement_type = ?, engager_type = ?, "event" = ?, event_data = ?, event_source = ?, ingestion_source = ?, objective_type = ?, percentage = ?, pin_id = ?, prefill = ?, retention_days = ?, seed_id = ?, url = ?, visitor_source_id = ? WHERE 1=2;

--
-- DELETE template for table 'ad_accounts_audience_rule'
--
DELETE FROM ad_accounts_audience_rule WHERE 1=2;

