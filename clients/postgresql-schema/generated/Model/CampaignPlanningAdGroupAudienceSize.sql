--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignPlanningAdGroupAudienceSize' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_planning_ad_group_audience_size'
--
SELECT count_lower, count_upper FROM campaign_planning_ad_group_audience_size WHERE 1=1;

--
-- INSERT template for table 'campaign_planning_ad_group_audience_size'
--
INSERT INTO campaign_planning_ad_group_audience_size (count_lower, count_upper) VALUES (?, ?);

--
-- UPDATE template for table 'campaign_planning_ad_group_audience_size'
--
UPDATE campaign_planning_ad_group_audience_size SET count_lower = ?, count_upper = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_planning_ad_group_audience_size'
--
DELETE FROM campaign_planning_ad_group_audience_size WHERE 1=2;

