--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- objective_type class
local objective_type = {}
local objective_type_mt = {
	__name = "objective_type";
	__index = objective_type;
}

local function cast_objective_type(t)
	return setmetatable(t, objective_type_mt)
end

local function new_objective_type()
	return cast_objective_type({
	})
end

return {
	cast = cast_objective_type;
	new = new_objective_type;
}
