--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- targeting_spec_app_type class
local targeting_spec_app_type = {}
local targeting_spec_app_type_mt = {
	__name = "targeting_spec_app_type";
	__index = targeting_spec_app_type;
}

local function cast_targeting_spec_app_type(t)
	return setmetatable(t, targeting_spec_app_type_mt)
end

local function new_targeting_spec_app_type()
	return cast_targeting_spec_app_type({
	})
end

return {
	cast = cast_targeting_spec_app_type;
	new = new_targeting_spec_app_type;
}
