--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- ad_array_response_element class
local ad_array_response_element = {}
local ad_array_response_element_mt = {
	__name = "ad_array_response_element";
	__index = ad_array_response_element;
}

local function cast_ad_array_response_element(t)
	return setmetatable(t, ad_array_response_element_mt)
end

local function new_ad_array_response_element(data, exceptions)
	return cast_ad_array_response_element({
		["data"] = data;
		["exceptions"] = exceptions;
	})
end

return {
	cast = cast_ad_array_response_element;
	new = new_ad_array_response_element;
}
