--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- item_response_any_of class
local item_response_any_of = {}
local item_response_any_of_mt = {
	__name = "item_response_any_of";
	__index = item_response_any_of;
}

local function cast_item_response_any_of(t)
	return setmetatable(t, item_response_any_of_mt)
end

local function new_item_response_any_of(catalog_type, item_id, pins, attributes, hotel_id, creative_assets_id)
	return cast_item_response_any_of({
		["catalog_type"] = catalog_type;
		["item_id"] = item_id;
		["pins"] = pins;
		["attributes"] = attributes;
		["hotel_id"] = hotel_id;
		["creative_assets_id"] = creative_assets_id;
	})
end

return {
	cast = cast_item_response_any_of;
	new = new_item_response_any_of;
}
