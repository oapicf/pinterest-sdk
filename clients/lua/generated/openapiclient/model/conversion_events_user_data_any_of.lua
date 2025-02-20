--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- conversion_events_user_data_any_of class
local conversion_events_user_data_any_of = {}
local conversion_events_user_data_any_of_mt = {
	__name = "conversion_events_user_data_any_of";
	__index = conversion_events_user_data_any_of;
}

local function cast_conversion_events_user_data_any_of(t)
	return setmetatable(t, conversion_events_user_data_any_of_mt)
end

local function new_conversion_events_user_data_any_of(em, hashed_maids, client_ip_address, client_user_agent)
	return cast_conversion_events_user_data_any_of({
		["em"] = em;
		["hashed_maids"] = hashed_maids;
		["client_ip_address"] = client_ip_address;
		["client_user_agent"] = client_user_agent;
	})
end

return {
	cast = cast_conversion_events_user_data_any_of;
	new = new_conversion_events_user_data_any_of;
}
