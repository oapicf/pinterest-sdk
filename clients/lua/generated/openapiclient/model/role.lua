--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- role class
local role = {}
local role_mt = {
	__name = "role";
	__index = role;
}

local function cast_role(t)
	return setmetatable(t, role_mt)
end

local function new_role()
	return cast_role({
	})
end

return {
	cast = cast_role;
	new = new_role;
}
