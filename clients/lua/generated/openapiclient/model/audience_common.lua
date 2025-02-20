--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- audience_common class
local audience_common = {}
local audience_common_mt = {
	__name = "audience_common";
	__index = audience_common;
}

local function cast_audience_common(t)
	return setmetatable(t, audience_common_mt)
end

local function new_audience_common(ad_account_id, name, rule)
	return cast_audience_common({
		["ad_account_id"] = ad_account_id;
		["name"] = name;
		["rule"] = rule;
	})
end

return {
	cast = cast_audience_common;
	new = new_audience_common;
}
