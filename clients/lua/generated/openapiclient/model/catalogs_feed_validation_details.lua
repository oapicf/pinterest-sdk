--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- catalogs_feed_validation_details class
local catalogs_feed_validation_details = {}
local catalogs_feed_validation_details_mt = {
	__name = "catalogs_feed_validation_details";
	__index = catalogs_feed_validation_details;
}

local function cast_catalogs_feed_validation_details(t)
	return setmetatable(t, catalogs_feed_validation_details_mt)
end

local function new_catalogs_feed_validation_details(errors, warnings)
	return cast_catalogs_feed_validation_details({
		["errors"] = errors;
		["warnings"] = warnings;
	})
end

return {
	cast = cast_catalogs_feed_validation_details;
	new = new_catalogs_feed_validation_details;
}
