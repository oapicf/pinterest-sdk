--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- product_group_analytics_response_inner class
local product_group_analytics_response_inner = {}
local product_group_analytics_response_inner_mt = {
	__name = "product_group_analytics_response_inner";
	__index = product_group_analytics_response_inner;
}

local function cast_product_group_analytics_response_inner(t)
	return setmetatable(t, product_group_analytics_response_inner_mt)
end

local function new_product_group_analytics_response_inner(PRODUCT_GROUP_ID, DATE)
	return cast_product_group_analytics_response_inner({
		["PRODUCT_GROUP_ID"] = PRODUCT_GROUP_ID;
		["DATE"] = DATE;
	})
end

return {
	cast = cast_product_group_analytics_response_inner;
	new = new_product_group_analytics_response_inner;
}
