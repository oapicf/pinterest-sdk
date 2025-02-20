--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- feed_processing_results_list_200_response class
local feed_processing_results_list_200_response = {}
local feed_processing_results_list_200_response_mt = {
	__name = "feed_processing_results_list_200_response";
	__index = feed_processing_results_list_200_response;
}

local function cast_feed_processing_results_list_200_response(t)
	return setmetatable(t, feed_processing_results_list_200_response_mt)
end

local function new_feed_processing_results_list_200_response(items, bookmark)
	return cast_feed_processing_results_list_200_response({
		["items"] = items;
		["bookmark"] = bookmark;
	})
end

return {
	cast = cast_feed_processing_results_list_200_response;
	new = new_feed_processing_results_list_200_response;
}
