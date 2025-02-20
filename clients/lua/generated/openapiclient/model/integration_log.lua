--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- integration_log class
local integration_log = {}
local integration_log_mt = {
	__name = "integration_log";
	__index = integration_log;
}

local function cast_integration_log(t)
	return setmetatable(t, integration_log_mt)
end

local function new_integration_log(client_timestamp, event_type, log_level, external_business_id, advertiser_id, merchant_id, tag_id, feed_profile_id, message, app_version_number, platform_version_number, error, request)
	return cast_integration_log({
		["client_timestamp"] = client_timestamp;
		["event_type"] = event_type;
		["log_level"] = log_level;
		["external_business_id"] = external_business_id;
		["advertiser_id"] = advertiser_id;
		["merchant_id"] = merchant_id;
		["tag_id"] = tag_id;
		["feed_profile_id"] = feed_profile_id;
		["message"] = message;
		["app_version_number"] = app_version_number;
		["platform_version_number"] = platform_version_number;
		["error"] = error;
		["request"] = request;
	})
end

return {
	cast = cast_integration_log;
	new = new_integration_log;
}
