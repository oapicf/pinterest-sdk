--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_retail_feed class
local catalogs_retail_feed = {}
local catalogs_retail_feed_mt = {
	__name = "catalogs_retail_feed";
	__index = catalogs_retail_feed;
}

local function cast_catalogs_retail_feed(t)
	return setmetatable(t, catalogs_retail_feed_mt)
end

local function new_catalogs_retail_feed(created_at, id, updated_at, name, format, catalog_type, credentials, location, preferred_processing_schedule, status, default_currency, default_locale, default_country, default_availability)
	return cast_catalogs_retail_feed({
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
	})
end

return {
	cast = cast_catalogs_retail_feed;
	new = new_catalogs_retail_feed;
}
