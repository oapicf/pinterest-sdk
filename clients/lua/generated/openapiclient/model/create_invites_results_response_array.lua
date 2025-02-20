--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- create_invites_results_response_array class
local create_invites_results_response_array = {}
local create_invites_results_response_array_mt = {
	__name = "create_invites_results_response_array";
	__index = create_invites_results_response_array;
}

local function cast_create_invites_results_response_array(t)
	return setmetatable(t, create_invites_results_response_array_mt)
end

local function new_create_invites_results_response_array(items)
	return cast_create_invites_results_response_array({
		["items"] = items;
	})
end

return {
	cast = cast_create_invites_results_response_array;
	new = new_create_invites_results_response_array;
}
