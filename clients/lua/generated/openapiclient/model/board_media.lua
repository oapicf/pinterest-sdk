--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- board_media class
local board_media = {}
local board_media_mt = {
	__name = "board_media";
	__index = board_media;
}

local function cast_board_media(t)
	return setmetatable(t, board_media_mt)
end

local function new_board_media(image_cover_url, pin_thumbnail_urls)
	return cast_board_media({
		["image_cover_url"] = image_cover_url;
		["pin_thumbnail_urls"] = pin_thumbnail_urls;
	})
end

return {
	cast = cast_board_media;
	new = new_board_media;
}