--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- board_sections_list_200_response class
local board_sections_list_200_response = {}
local board_sections_list_200_response_mt = {
	__name = "board_sections_list_200_response";
	__index = board_sections_list_200_response;
}

local function cast_board_sections_list_200_response(t)
	return setmetatable(t, board_sections_list_200_response_mt)
end

local function new_board_sections_list_200_response(items, bookmark)
	return cast_board_sections_list_200_response({
		["items"] = items;
		["bookmark"] = bookmark;
	})
end

return {
	cast = cast_board_sections_list_200_response;
	new = new_board_sections_list_200_response;
}
