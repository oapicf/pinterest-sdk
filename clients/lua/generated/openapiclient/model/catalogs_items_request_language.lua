--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_items_request_language class
local catalogs_items_request_language = {}
local catalogs_items_request_language_mt = {
	__name = "catalogs_items_request_language";
	__index = catalogs_items_request_language;
}

local function cast_catalogs_items_request_language(t)
	return setmetatable(t, catalogs_items_request_language_mt)
end

local function new_catalogs_items_request_language()
	return cast_catalogs_items_request_language({
	})
end

return {
	cast = cast_catalogs_items_request_language;
	new = new_catalogs_items_request_language;
}
