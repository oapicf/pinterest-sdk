--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- ssio_insertion_order_status class
local ssio_insertion_order_status = {}
local ssio_insertion_order_status_mt = {
	__name = "ssio_insertion_order_status";
	__index = ssio_insertion_order_status;
}

local function cast_ssio_insertion_order_status(t)
	return setmetatable(t, ssio_insertion_order_status_mt)
end

local function new_ssio_insertion_order_status(pin_order_id, status, creation_time)
	return cast_ssio_insertion_order_status({
		["pin_order_id"] = pin_order_id;
		["status"] = status;
		["creation_time"] = creation_time;
	})
end

return {
	cast = cast_ssio_insertion_order_status;
	new = new_ssio_insertion_order_status;
}