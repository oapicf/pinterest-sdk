--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- data_output_format class
local data_output_format = {}
local data_output_format_mt = {
	__name = "data_output_format";
	__index = data_output_format;
}

local function cast_data_output_format(t)
	return setmetatable(t, data_output_format_mt)
end

local function new_data_output_format()
	return cast_data_output_format({
	})
end

return {
	cast = cast_data_output_format;
	new = new_data_output_format;
}