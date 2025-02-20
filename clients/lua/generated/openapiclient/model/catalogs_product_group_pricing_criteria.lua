--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_product_group_pricing_criteria class
local catalogs_product_group_pricing_criteria = {}
local catalogs_product_group_pricing_criteria_mt = {
	__name = "catalogs_product_group_pricing_criteria";
	__index = catalogs_product_group_pricing_criteria;
}

local function cast_catalogs_product_group_pricing_criteria(t)
	return setmetatable(t, catalogs_product_group_pricing_criteria_mt)
end

local function new_catalogs_product_group_pricing_criteria(inclusion, values, negated)
	return cast_catalogs_product_group_pricing_criteria({
		["inclusion"] = inclusion;
		["values"] = values;
		["negated"] = negated;
	})
end

return {
	cast = cast_catalogs_product_group_pricing_criteria;
	new = new_catalogs_product_group_pricing_criteria;
}
