--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- currency_filter class
local currency_filter = {}
local currency_filter_mt = {
	__name = "currency_filter";
	__index = currency_filter;
}

local function cast_currency_filter(t)
	return setmetatable(t, currency_filter_mt)
end

local function new_currency_filter(CURRENCY)
	return cast_currency_filter({
		["CURRENCY"] = CURRENCY;
	})
end

return {
	cast = cast_currency_filter;
	new = new_currency_filter;
}
