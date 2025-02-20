--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- business_shared_audience class
local business_shared_audience = {}
local business_shared_audience_mt = {
	__name = "business_shared_audience";
	__index = business_shared_audience;
}

local function cast_business_shared_audience(t)
	return setmetatable(t, business_shared_audience_mt)
end

local function new_business_shared_audience(audience_id, operation_type, recipient_business_ids)
	return cast_business_shared_audience({
		["audience_id"] = audience_id;
		["operation_type"] = operation_type;
		["recipient_business_ids"] = recipient_business_ids;
	})
end

return {
	cast = cast_business_shared_audience;
	new = new_business_shared_audience;
}
