--
-- "Pinterest REST API"
-- Prepared SQL queries for 'CampaignAdPreview' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'campaign_ad_preview'
--
SELECT ad_account_id, ad_group_id, client_id, expires_at, is_active, pin_id, pin_promotion_id, promoted_product_group_id, url, user_id, uuid FROM campaign_ad_preview WHERE 1=1;

--
-- INSERT template for table 'campaign_ad_preview'
--
INSERT INTO campaign_ad_preview (ad_account_id, ad_group_id, client_id, expires_at, is_active, pin_id, pin_promotion_id, promoted_product_group_id, url, user_id, uuid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'campaign_ad_preview'
--
UPDATE campaign_ad_preview SET ad_account_id = ?, ad_group_id = ?, client_id = ?, expires_at = ?, is_active = ?, pin_id = ?, pin_promotion_id = ?, promoted_product_group_id = ?, url = ?, user_id = ?, uuid = ? WHERE 1=2;

--
-- DELETE template for table 'campaign_ad_preview'
--
DELETE FROM campaign_ad_preview WHERE 1=2;

