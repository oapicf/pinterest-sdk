--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- data_status class
local data_status = {}
local data_status_mt = {
	__name = "data_status";
	__index = data_status;
}

local function cast_data_status(t)
	return setmetatable(t, data_status_mt)
end

local function new_data_status()
	return cast_data_status({
	})
end

return {
	cast = cast_data_status;
	new = new_data_status;
}