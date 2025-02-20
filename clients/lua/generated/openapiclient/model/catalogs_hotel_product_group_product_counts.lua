--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_hotel_product_group_product_counts class
local catalogs_hotel_product_group_product_counts = {}
local catalogs_hotel_product_group_product_counts_mt = {
	__name = "catalogs_hotel_product_group_product_counts";
	__index = catalogs_hotel_product_group_product_counts;
}

local function cast_catalogs_hotel_product_group_product_counts(t)
	return setmetatable(t, catalogs_hotel_product_group_product_counts_mt)
end

local function new_catalogs_hotel_product_group_product_counts(catalog_type, total)
	return cast_catalogs_hotel_product_group_product_counts({
		["catalog_type"] = catalog_type;
		["total"] = total;
	})
end

return {
	cast = cast_catalogs_hotel_product_group_product_counts;
	new = new_catalogs_hotel_product_group_product_counts;
}
