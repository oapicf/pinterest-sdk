--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- top_video_pins_analytics_response class
local top_video_pins_analytics_response = {}
local top_video_pins_analytics_response_mt = {
	__name = "top_video_pins_analytics_response";
	__index = top_video_pins_analytics_response;
}

local function cast_top_video_pins_analytics_response(t)
	return setmetatable(t, top_video_pins_analytics_response_mt)
end

local function new_top_video_pins_analytics_response(date_availability, pins, sort_by)
	return cast_top_video_pins_analytics_response({
		["date_availability"] = date_availability;
		["pins"] = pins;
		["sort_by"] = sort_by;
	})
end

return {
	cast = cast_top_video_pins_analytics_response;
	new = new_top_video_pins_analytics_response;
}
