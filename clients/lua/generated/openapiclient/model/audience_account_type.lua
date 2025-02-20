--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- audience_account_type class
local audience_account_type = {}
local audience_account_type_mt = {
	__name = "audience_account_type";
	__index = audience_account_type;
}

local function cast_audience_account_type(t)
	return setmetatable(t, audience_account_type_mt)
end

local function new_audience_account_type()
	return cast_audience_account_type({
	})
end

return {
	cast = cast_audience_account_type;
	new = new_audience_account_type;
}
