--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- pin class
local pin = {}
local pin_mt = {
	__name = "pin";
	__index = pin;
}

local function cast_pin(t)
	return setmetatable(t, pin_mt)
end

local function new_pin(id, created_at, link, title, description, dominant_color, alt_text, creative_type, board_id, board_section_id, board_owner, is_owner, media, media_source, parent_pin_id, is_standard, has_been_promoted, note, pin_metrics)
	return cast_pin({
		["id"] = id;
		["created_at"] = created_at;
		["link"] = link;
		["title"] = title;
		["description"] = description;
		["dominant_color"] = dominant_color;
		["alt_text"] = alt_text;
		["creative_type"] = creative_type;
		["board_id"] = board_id;
		["board_section_id"] = board_section_id;
		["board_owner"] = board_owner;
		["is_owner"] = is_owner;
		["media"] = media;
		["media_source"] = media_source;
		["parent_pin_id"] = parent_pin_id;
		["is_standard"] = is_standard;
		["has_been_promoted"] = has_been_promoted;
		["note"] = note;
		["pin_metrics"] = pin_metrics;
	})
end

return {
	cast = cast_pin;
	new = new_pin;
}