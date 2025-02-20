--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- ad_account class
local ad_account = {}
local ad_account_mt = {
	__name = "ad_account";
	__index = ad_account;
}

local function cast_ad_account(t)
	return setmetatable(t, ad_account_mt)
end

local function new_ad_account(id, name, owner, country, currency, permissions, created_time, updated_time)
	return cast_ad_account({
		["id"] = id;
		["name"] = name;
		["owner"] = owner;
		["country"] = country;
		["currency"] = currency;
		["permissions"] = permissions;
		["created_time"] = created_time;
		["updated_time"] = updated_time;
	})
end

return {
	cast = cast_ad_account;
	new = new_ad_account;
}
