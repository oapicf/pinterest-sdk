--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- campaign_update_request class
local campaign_update_request = {}
local campaign_update_request_mt = {
	__name = "campaign_update_request";
	__index = campaign_update_request;
}

local function cast_campaign_update_request(t)
	return setmetatable(t, campaign_update_request_mt)
end

local function new_campaign_update_request(id, ad_account_id, name, status, lifetime_spend_cap, daily_spend_cap, order_line_id, tracking_urls, start_time, end_time, is_flexible_daily_budgets, default_ad_group_budget_in_micro_currency, is_automated_campaign, is_campaign_budget_optimization, objective_type)
	return cast_campaign_update_request({
		["id"] = id;
		["ad_account_id"] = ad_account_id;
		["name"] = name;
		["status"] = status;
		["lifetime_spend_cap"] = lifetime_spend_cap;
		["daily_spend_cap"] = daily_spend_cap;
		["order_line_id"] = order_line_id;
		["tracking_urls"] = tracking_urls;
		["start_time"] = start_time;
		["end_time"] = end_time;
		["is_flexible_daily_budgets"] = is_flexible_daily_budgets;
		["default_ad_group_budget_in_micro_currency"] = default_ad_group_budget_in_micro_currency;
		["is_automated_campaign"] = is_automated_campaign;
		["is_campaign_budget_optimization"] = is_campaign_budget_optimization;
		["objective_type"] = objective_type;
	})
end

return {
	cast = cast_campaign_update_request;
	new = new_campaign_update_request;
}
