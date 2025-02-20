--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- bid_floor class
local bid_floor = {}
local bid_floor_mt = {
	__name = "bid_floor";
	__index = bid_floor;
}

local function cast_bid_floor(t)
	return setmetatable(t, bid_floor_mt)
end

local function new_bid_floor(bid_floors, type)
	return cast_bid_floor({
		["bid_floors"] = bid_floors;
		["type"] = type;
	})
end

return {
	cast = cast_bid_floor;
	new = new_bid_floor;
}
