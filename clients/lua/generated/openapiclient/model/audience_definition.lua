--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- audience_definition class
local audience_definition = {}
local audience_definition_mt = {
	__name = "audience_definition";
	__index = audience_definition;
}

local function cast_audience_definition(t)
	return setmetatable(t, audience_definition_mt)
end

local function new_audience_definition(date, type, scope)
	return cast_audience_definition({
		["date"] = date;
		["type"] = type;
		["scope"] = scope;
	})
end

return {
	cast = cast_audience_definition;
	new = new_audience_definition;
}
