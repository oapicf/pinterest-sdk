--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- ad_account_create_subscription_request class
local ad_account_create_subscription_request = {}
local ad_account_create_subscription_request_mt = {
	__name = "ad_account_create_subscription_request";
	__index = ad_account_create_subscription_request;
}

local function cast_ad_account_create_subscription_request(t)
	return setmetatable(t, ad_account_create_subscription_request_mt)
end

local function new_ad_account_create_subscription_request(webhook_url, lead_form_id, partner_access_token, partner_refresh_token, partner_metadata)
	return cast_ad_account_create_subscription_request({
		["webhook_url"] = webhook_url;
		["lead_form_id"] = lead_form_id;
		["partner_access_token"] = partner_access_token;
		["partner_refresh_token"] = partner_refresh_token;
		["partner_metadata"] = partner_metadata;
	})
end

return {
	cast = cast_ad_account_create_subscription_request;
	new = new_ad_account_create_subscription_request;
}
