--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- keyword_error class
local keyword_error = {}
local keyword_error_mt = {
	__name = "keyword_error";
	__index = keyword_error;
}

local function cast_keyword_error(t)
	return setmetatable(t, keyword_error_mt)
end

local function new_keyword_error(data, error_messages)
	return cast_keyword_error({
		["data"] = data;
		["error_messages"] = error_messages;
	})
end

return {
	cast = cast_keyword_error;
	new = new_keyword_error;
}