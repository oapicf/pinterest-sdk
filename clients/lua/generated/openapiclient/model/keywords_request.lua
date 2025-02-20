--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- keywords_request class
local keywords_request = {}
local keywords_request_mt = {
	__name = "keywords_request";
	__index = keywords_request;
}

local function cast_keywords_request(t)
	return setmetatable(t, keywords_request_mt)
end

local function new_keywords_request(keywords, parent_id)
	return cast_keywords_request({
		["keywords"] = keywords;
		["parent_id"] = parent_id;
	})
end

return {
	cast = cast_keywords_request;
	new = new_keywords_request;
}
