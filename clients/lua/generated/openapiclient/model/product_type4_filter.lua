--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- product_type4_filter class
local product_type4_filter = {}
local product_type4_filter_mt = {
	__name = "product_type4_filter";
	__index = product_type4_filter;
}

local function cast_product_type4_filter(t)
	return setmetatable(t, product_type4_filter_mt)
end

local function new_product_type4_filter(product_type_4)
	return cast_product_type4_filter({
		["PRODUCT_TYPE_4"] = product_type_4;
	})
end

return {
	cast = cast_product_type4_filter;
	new = new_product_type4_filter;
}
