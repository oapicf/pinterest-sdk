--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- lead_forms_list_200_response class
local lead_forms_list_200_response = {}
local lead_forms_list_200_response_mt = {
	__name = "lead_forms_list_200_response";
	__index = lead_forms_list_200_response;
}

local function cast_lead_forms_list_200_response(t)
	return setmetatable(t, lead_forms_list_200_response_mt)
end

local function new_lead_forms_list_200_response(items, bookmark)
	return cast_lead_forms_list_200_response({
		["items"] = items;
		["bookmark"] = bookmark;
	})
end

return {
	cast = cast_lead_forms_list_200_response;
	new = new_lead_forms_list_200_response;
}