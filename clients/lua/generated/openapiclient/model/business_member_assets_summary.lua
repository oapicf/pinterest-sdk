--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- business_member_assets_summary class
local business_member_assets_summary = {}
local business_member_assets_summary_mt = {
	__name = "business_member_assets_summary";
	__index = business_member_assets_summary;
}

local function cast_business_member_assets_summary(t)
	return setmetatable(t, business_member_assets_summary_mt)
end

local function new_business_member_assets_summary(ad_accounts, profiles)
	return cast_business_member_assets_summary({
		["ad_accounts"] = ad_accounts;
		["profiles"] = profiles;
	})
end

return {
	cast = cast_business_member_assets_summary;
	new = new_business_member_assets_summary;
}
