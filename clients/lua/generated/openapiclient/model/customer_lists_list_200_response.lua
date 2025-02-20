--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- customer_lists_list_200_response class
local customer_lists_list_200_response = {}
local customer_lists_list_200_response_mt = {
	__name = "customer_lists_list_200_response";
	__index = customer_lists_list_200_response;
}

local function cast_customer_lists_list_200_response(t)
	return setmetatable(t, customer_lists_list_200_response_mt)
end

local function new_customer_lists_list_200_response(items, bookmark)
	return cast_customer_lists_list_200_response({
		["items"] = items;
		["bookmark"] = bookmark;
	})
end

return {
	cast = cast_customer_lists_list_200_response;
	new = new_customer_lists_list_200_response;
}
