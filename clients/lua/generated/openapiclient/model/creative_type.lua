--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- creative_type class
local creative_type = {}
local creative_type_mt = {
	__name = "creative_type";
	__index = creative_type;
}

local function cast_creative_type(t)
	return setmetatable(t, creative_type_mt)
end

local function new_creative_type()
	return cast_creative_type({
	})
end

return {
	cast = cast_creative_type;
	new = new_creative_type;
}