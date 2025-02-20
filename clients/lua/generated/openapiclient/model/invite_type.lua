--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- invite_type class
local invite_type = {}
local invite_type_mt = {
	__name = "invite_type";
	__index = invite_type;
}

local function cast_invite_type(t)
	return setmetatable(t, invite_type_mt)
end

local function new_invite_type()
	return cast_invite_type({
	})
end

return {
	cast = cast_invite_type;
	new = new_invite_type;
}
