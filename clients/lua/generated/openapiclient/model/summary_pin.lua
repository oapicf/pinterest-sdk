--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- summary_pin class
local summary_pin = {}
local summary_pin_mt = {
	__name = "summary_pin";
	__index = summary_pin;
}

local function cast_summary_pin(t)
	return setmetatable(t, summary_pin_mt)
end

local function new_summary_pin(media, alt_text, link, title, description)
	return cast_summary_pin({
		["media"] = media;
		["alt_text"] = alt_text;
		["link"] = link;
		["title"] = title;
		["description"] = description;
	})
end

return {
	cast = cast_summary_pin;
	new = new_summary_pin;
}