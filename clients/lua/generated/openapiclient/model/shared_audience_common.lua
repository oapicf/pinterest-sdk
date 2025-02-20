--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- shared_audience_common class
local shared_audience_common = {}
local shared_audience_common_mt = {
	__name = "shared_audience_common";
	__index = shared_audience_common;
}

local function cast_shared_audience_common(t)
	return setmetatable(t, shared_audience_common_mt)
end

local function new_shared_audience_common(audience_id, operation_type)
	return cast_shared_audience_common({
		["audience_id"] = audience_id;
		["operation_type"] = operation_type;
	})
end

return {
	cast = cast_shared_audience_common;
	new = new_shared_audience_common;
}
