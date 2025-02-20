--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- oauth_access_token_response_code class
local oauth_access_token_response_code = {}
local oauth_access_token_response_code_mt = {
	__name = "oauth_access_token_response_code";
	__index = oauth_access_token_response_code;
}

local function cast_oauth_access_token_response_code(t)
	return setmetatable(t, oauth_access_token_response_code_mt)
end

local function new_oauth_access_token_response_code(response_type, access_token, token_type, expires_in, scope, refresh_token, refresh_token_expires_in)
	return cast_oauth_access_token_response_code({
		["response_type"] = response_type;
		["access_token"] = access_token;
		["token_type"] = token_type;
		["expires_in"] = expires_in;
		["scope"] = scope;
		["refresh_token"] = refresh_token;
		["refresh_token_expires_in"] = refresh_token_expires_in;
	})
end

return {
	cast = cast_oauth_access_token_response_code;
	new = new_oauth_access_token_response_code;
}
