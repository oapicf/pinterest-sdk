--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- product_group_promotion_update_request class
local product_group_promotion_update_request = {}
local product_group_promotion_update_request_mt = {
	__name = "product_group_promotion_update_request";
	__index = product_group_promotion_update_request;
}

local function cast_product_group_promotion_update_request(t)
	return setmetatable(t, product_group_promotion_update_request_mt)
end

local function new_product_group_promotion_update_request(ad_group_id, product_group_promotion)
	return cast_product_group_promotion_update_request({
		["ad_group_id"] = ad_group_id;
		["product_group_promotion"] = product_group_promotion;
	})
end

return {
	cast = cast_product_group_promotion_update_request;
	new = new_product_group_promotion_update_request;
}