--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- targeting_template_response_data class
local targeting_template_response_data = {}
local targeting_template_response_data_mt = {
	__name = "targeting_template_response_data";
	__index = targeting_template_response_data;
}

local function cast_targeting_template_response_data(t)
	return setmetatable(t, targeting_template_response_data_mt)
end

local function new_targeting_template_response_data(name, auto_targeting_enabled, targeting_attributes, placement_group, keywords, tracking_urls, id, created_time, updated_time, ad_account_id, status, sizing)
	return cast_targeting_template_response_data({
		["name"] = name;
		["auto_targeting_enabled"] = auto_targeting_enabled;
		["targeting_attributes"] = targeting_attributes;
		["placement_group"] = placement_group;
		["keywords"] = keywords;
		["tracking_urls"] = tracking_urls;
		["id"] = id;
		["created_time"] = created_time;
		["updated_time"] = updated_time;
		["ad_account_id"] = ad_account_id;
		["status"] = status;
		["sizing"] = sizing;
	})
end

return {
	cast = cast_targeting_template_response_data;
	new = new_targeting_template_response_data;
}
