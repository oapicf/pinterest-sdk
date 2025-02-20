--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_asset_access_request_error_message_inner class
local create_asset_access_request_error_message_inner = {}
local create_asset_access_request_error_message_inner_mt = {
	__name = "create_asset_access_request_error_message_inner";
	__index = create_asset_access_request_error_message_inner;
}

local function cast_create_asset_access_request_error_message_inner(t)
	return setmetatable(t, create_asset_access_request_error_message_inner_mt)
end

local function new_create_asset_access_request_error_message_inner(code, messages)
	return cast_create_asset_access_request_error_message_inner({
		["code"] = code;
		["messages"] = messages;
	})
end

return {
	cast = cast_create_asset_access_request_error_message_inner;
	new = new_create_asset_access_request_error_message_inner;
}
