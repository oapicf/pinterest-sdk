--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- bulk_upsert_request_update class
local bulk_upsert_request_update = {}
local bulk_upsert_request_update_mt = {
	__name = "bulk_upsert_request_update";
	__index = bulk_upsert_request_update;
}

local function cast_bulk_upsert_request_update(t)
	return setmetatable(t, bulk_upsert_request_update_mt)
end

local function new_bulk_upsert_request_update(campaigns, ad_groups, ads, product_groups, keywords)
	return cast_bulk_upsert_request_update({
		["campaigns"] = campaigns;
		["ad_groups"] = ad_groups;
		["ads"] = ads;
		["product_groups"] = product_groups;
		["keywords"] = keywords;
	})
end

return {
	cast = cast_bulk_upsert_request_update;
	new = new_bulk_upsert_request_update;
}