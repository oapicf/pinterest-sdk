--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_product class
local catalogs_product = {}
local catalogs_product_mt = {
	__name = "catalogs_product";
	__index = catalogs_product;
}

local function cast_catalogs_product(t)
	return setmetatable(t, catalogs_product_mt)
end

local function new_catalogs_product(metadata, pin)
	return cast_catalogs_product({
		["metadata"] = metadata;
		["pin"] = pin;
	})
end

return {
	cast = cast_catalogs_product;
	new = new_catalogs_product;
}