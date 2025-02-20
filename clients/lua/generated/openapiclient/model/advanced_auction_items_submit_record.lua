--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- advanced_auction_items_submit_record class
local advanced_auction_items_submit_record = {}
local advanced_auction_items_submit_record_mt = {
	__name = "advanced_auction_items_submit_record";
	__index = advanced_auction_items_submit_record;
}

local function cast_advanced_auction_items_submit_record(t)
	return setmetatable(t, advanced_auction_items_submit_record_mt)
end

local function new_advanced_auction_items_submit_record(operation, item_id, country, language, bid_options, update_mask)
	return cast_advanced_auction_items_submit_record({
		["operation"] = operation;
		["item_id"] = item_id;
		["country"] = country;
		["language"] = language;
		["bid_options"] = bid_options;
		["update_mask"] = update_mask;
	})
end

return {
	cast = cast_advanced_auction_items_submit_record;
	new = new_advanced_auction_items_submit_record;
}
