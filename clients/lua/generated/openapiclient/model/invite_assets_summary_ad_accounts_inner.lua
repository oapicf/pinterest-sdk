--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- invite_assets_summary_ad_accounts_inner class
local invite_assets_summary_ad_accounts_inner = {}
local invite_assets_summary_ad_accounts_inner_mt = {
	__name = "invite_assets_summary_ad_accounts_inner";
	__index = invite_assets_summary_ad_accounts_inner;
}

local function cast_invite_assets_summary_ad_accounts_inner(t)
	return setmetatable(t, invite_assets_summary_ad_accounts_inner_mt)
end

local function new_invite_assets_summary_ad_accounts_inner(id, permissions)
	return cast_invite_assets_summary_ad_accounts_inner({
		["id"] = id;
		["permissions"] = permissions;
	})
end

return {
	cast = cast_invite_assets_summary_ad_accounts_inner;
	new = new_invite_assets_summary_ad_accounts_inner;
}
