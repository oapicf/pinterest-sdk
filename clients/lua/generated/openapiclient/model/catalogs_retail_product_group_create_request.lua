--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_retail_product_group_create_request class
local catalogs_retail_product_group_create_request = {}
local catalogs_retail_product_group_create_request_mt = {
	__name = "catalogs_retail_product_group_create_request";
	__index = catalogs_retail_product_group_create_request;
}

local function cast_catalogs_retail_product_group_create_request(t)
	return setmetatable(t, catalogs_retail_product_group_create_request_mt)
end

local function new_catalogs_retail_product_group_create_request(catalog_type, name, description, filters, catalog_id, country, locale)
	return cast_catalogs_retail_product_group_create_request({
		["catalog_type"] = catalog_type;
		["name"] = name;
		["description"] = description;
		["filters"] = filters;
		["catalog_id"] = catalog_id;
		["country"] = country;
		["locale"] = locale;
	})
end

return {
	cast = cast_catalogs_retail_product_group_create_request;
	new = new_catalogs_retail_product_group_create_request;
}
