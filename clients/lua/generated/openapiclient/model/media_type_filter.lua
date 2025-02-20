--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- media_type_filter class
local media_type_filter = {}
local media_type_filter_mt = {
	__name = "media_type_filter";
	__index = media_type_filter;
}

local function cast_media_type_filter(t)
	return setmetatable(t, media_type_filter_mt)
end

local function new_media_type_filter(MEDIA_TYPE)
	return cast_media_type_filter({
		["MEDIA_TYPE"] = MEDIA_TYPE;
	})
end

return {
	cast = cast_media_type_filter;
	new = new_media_type_filter;
}
