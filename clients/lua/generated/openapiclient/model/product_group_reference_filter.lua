--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- product_group_reference_filter class
local product_group_reference_filter = {}
local product_group_reference_filter_mt = {
	__name = "product_group_reference_filter";
	__index = product_group_reference_filter;
}

local function cast_product_group_reference_filter(t)
	return setmetatable(t, product_group_reference_filter_mt)
end

local function new_product_group_reference_filter(PRODUCT_GROUP)
	return cast_product_group_reference_filter({
		["PRODUCT_GROUP"] = PRODUCT_GROUP;
	})
end

return {
	cast = cast_product_group_reference_filter;
	new = new_product_group_reference_filter;
}
