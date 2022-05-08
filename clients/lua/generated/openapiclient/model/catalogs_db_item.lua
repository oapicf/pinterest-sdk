--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.3.0
  Contact: pinterest-api@pinterest.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_db_item class
local catalogs_db_item = {}
local catalogs_db_item_mt = {
	__name = "catalogs_db_item";
	__index = catalogs_db_item;
}

local function cast_catalogs_db_item(t)
	return setmetatable(t, catalogs_db_item_mt)
end

local function new_catalogs_db_item(created_at, id, updated_at)
	return cast_catalogs_db_item({
		["created_at"] = created_at;
		["id"] = id;
		["updated_at"] = updated_at;
	})
end

return {
	cast = cast_catalogs_db_item;
	new = new_catalogs_db_item;
}