--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- update_partner_asset_access_body_accesses_inner class
local update_partner_asset_access_body_accesses_inner = {}
local update_partner_asset_access_body_accesses_inner_mt = {
	__name = "update_partner_asset_access_body_accesses_inner";
	__index = update_partner_asset_access_body_accesses_inner;
}

local function cast_update_partner_asset_access_body_accesses_inner(t)
	return setmetatable(t, update_partner_asset_access_body_accesses_inner_mt)
end

local function new_update_partner_asset_access_body_accesses_inner(partner_id, asset_id, permissions)
	return cast_update_partner_asset_access_body_accesses_inner({
		["partner_id"] = partner_id;
		["asset_id"] = asset_id;
		["permissions"] = permissions;
	})
end

return {
	cast = cast_update_partner_asset_access_body_accesses_inner;
	new = new_update_partner_asset_access_body_accesses_inner;
}
