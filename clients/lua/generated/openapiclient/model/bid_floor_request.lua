--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- bid_floor_request class
local bid_floor_request = {}
local bid_floor_request_mt = {
	__name = "bid_floor_request";
	__index = bid_floor_request;
}

local function cast_bid_floor_request(t)
	return setmetatable(t, bid_floor_request_mt)
end

local function new_bid_floor_request(bid_floor_specs, targeting_spec)
	return cast_bid_floor_request({
		["bid_floor_specs"] = bid_floor_specs;
		["targeting_spec"] = targeting_spec;
	})
end

return {
	cast = cast_bid_floor_request;
	new = new_bid_floor_request;
}
