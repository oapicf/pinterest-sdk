--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_hotel_items_batch class
local catalogs_hotel_items_batch = {}
local catalogs_hotel_items_batch_mt = {
	__name = "catalogs_hotel_items_batch";
	__index = catalogs_hotel_items_batch;
}

local function cast_catalogs_hotel_items_batch(t)
	return setmetatable(t, catalogs_hotel_items_batch_mt)
end

local function new_catalogs_hotel_items_batch(batch_id, created_time, completed_time, status, catalog_type, items)
	return cast_catalogs_hotel_items_batch({
		["batch_id"] = batch_id;
		["created_time"] = created_time;
		["completed_time"] = completed_time;
		["status"] = status;
		["catalog_type"] = catalog_type;
		["items"] = items;
	})
end

return {
	cast = cast_catalogs_hotel_items_batch;
	new = new_catalogs_hotel_items_batch;
}
