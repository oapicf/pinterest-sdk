--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_vertical_feeds_create_request class
local catalogs_vertical_feeds_create_request = {}
local catalogs_vertical_feeds_create_request_mt = {
	__name = "catalogs_vertical_feeds_create_request";
	__index = catalogs_vertical_feeds_create_request;
}

local function cast_catalogs_vertical_feeds_create_request(t)
	return setmetatable(t, catalogs_vertical_feeds_create_request_mt)
end

local function new_catalogs_vertical_feeds_create_request(default_currency, name, format, default_locale, credentials, location, preferred_processing_schedule, catalog_type, default_country, default_availability, status, catalog_id)
	return cast_catalogs_vertical_feeds_create_request({
		["default_currency"] = default_currency;
		["name"] = name;
		["format"] = format;
		["default_locale"] = default_locale;
		["credentials"] = credentials;
		["location"] = location;
		["preferred_processing_schedule"] = preferred_processing_schedule;
		["catalog_type"] = catalog_type;
		["default_country"] = default_country;
		["default_availability"] = default_availability;
		["status"] = status;
		["catalog_id"] = catalog_id;
	})
end

return {
	cast = cast_catalogs_vertical_feeds_create_request;
	new = new_catalogs_vertical_feeds_create_request;
}
