--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- linked_business class
local linked_business = {}
local linked_business_mt = {
	__name = "linked_business";
	__index = linked_business;
}

local function cast_linked_business(t)
	return setmetatable(t, linked_business_mt)
end

local function new_linked_business(username, image_small_url, image_medium_url, image_large_url, image_xlarge_url)
	return cast_linked_business({
		["username"] = username;
		["image_small_url"] = image_small_url;
		["image_medium_url"] = image_medium_url;
		["image_large_url"] = image_large_url;
		["image_xlarge_url"] = image_xlarge_url;
	})
end

return {
	cast = cast_linked_business;
	new = new_linked_business;
}