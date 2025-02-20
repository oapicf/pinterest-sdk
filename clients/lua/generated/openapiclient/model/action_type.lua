--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- action_type class
local action_type = {}
local action_type_mt = {
	__name = "action_type";
	__index = action_type;
}

local function cast_action_type(t)
	return setmetatable(t, action_type_mt)
end

local function new_action_type()
	return cast_action_type({
	})
end

return {
	cast = cast_action_type;
	new = new_action_type;
}
