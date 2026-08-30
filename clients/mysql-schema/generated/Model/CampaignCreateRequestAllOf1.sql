--
-- Pinterest REST API.
-- Prepared SQL queries for 'CampaignCreateRequestAllOf1' definition.
--


--
-- SELECT template for table `CampaignCreateRequestAllOf1`
--
SELECT `bid_options`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `status` FROM `CampaignCreateRequestAllOf1` WHERE 1;

--
-- INSERT template for table `CampaignCreateRequestAllOf1`
--
INSERT INTO `CampaignCreateRequestAllOf1`(`bid_options`, `intended_promotion_type`, `is_automated_campaign`, `is_campaign_budget_optimization`, `is_flexible_daily_budgets`, `is_ltv_optimized`, `is_performance_plus`, `is_top_of_search`, `objective_type`, `status`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `CampaignCreateRequestAllOf1`
--
UPDATE `CampaignCreateRequestAllOf1` SET `bid_options` = ?, `intended_promotion_type` = ?, `is_automated_campaign` = ?, `is_campaign_budget_optimization` = ?, `is_flexible_daily_budgets` = ?, `is_ltv_optimized` = ?, `is_performance_plus` = ?, `is_top_of_search` = ?, `objective_type` = ?, `status` = ? WHERE 1;

--
-- DELETE template for table `CampaignCreateRequestAllOf1`
--
DELETE FROM `CampaignCreateRequestAllOf1` WHERE 0;

