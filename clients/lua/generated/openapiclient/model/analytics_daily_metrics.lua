--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- analytics_daily_metrics class
local analytics_daily_metrics = {}
local analytics_daily_metrics_mt = {
	__name = "analytics_daily_metrics";
	__index = analytics_daily_metrics;
}

local function cast_analytics_daily_metrics(t)
	return setmetatable(t, analytics_daily_metrics_mt)
end

local function new_analytics_daily_metrics(data_status, date, metrics)
	return cast_analytics_daily_metrics({
		["data_status"] = data_status;
		["date"] = date;
		["metrics"] = metrics;
	})
end

return {
	cast = cast_analytics_daily_metrics;
	new = new_analytics_daily_metrics;
}