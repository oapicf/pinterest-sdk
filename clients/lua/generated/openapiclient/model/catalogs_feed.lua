--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_feed class
local catalogs_feed = {}
local catalogs_feed_mt = {
	__name = "catalogs_feed";
	__index = catalogs_feed;
}

local function cast_catalogs_feed(t)
	return setmetatable(t, catalogs_feed_mt)
end

local function new_catalogs_feed(created_at, id, updated_at, name, format, catalog_type, credentials, location, preferred_processing_schedule, status, default_currency, default_locale, default_country, default_availability, catalog_id)
	return cast_catalogs_feed({
		["created_at"] = created_at;
		["id"] = id;
		["updated_at"] = updated_at;
		["name"] = name;
		["format"] = format;
		["catalog_type"] = catalog_type;
		["credentials"] = credentials;
		["location"] = location;
		["preferred_processing_schedule"] = preferred_processing_schedule;
		["status"] = status;
		["default_currency"] = default_currency;
		["default_locale"] = default_locale;
		["default_country"] = default_country;
		["default_availability"] = default_availability;
		["catalog_id"] = catalog_id;
	})
end

return {
	cast = cast_catalogs_feed;
	new = new_catalogs_feed;
}
