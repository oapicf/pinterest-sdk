--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- integration_logs_invalid_log_response_rejected_logs_inner class
local integration_logs_invalid_log_response_rejected_logs_inner = {}
local integration_logs_invalid_log_response_rejected_logs_inner_mt = {
	__name = "integration_logs_invalid_log_response_rejected_logs_inner";
	__index = integration_logs_invalid_log_response_rejected_logs_inner;
}

local function cast_integration_logs_invalid_log_response_rejected_logs_inner(t)
	return setmetatable(t, integration_logs_invalid_log_response_rejected_logs_inner_mt)
end

local function new_integration_logs_invalid_log_response_rejected_logs_inner(log_index, field, value, reason)
	return cast_integration_logs_invalid_log_response_rejected_logs_inner({
		["log_index"] = log_index;
		["field"] = field;
		["value"] = value;
		["reason"] = reason;
	})
end

return {
	cast = cast_integration_logs_invalid_log_response_rejected_logs_inner;
	new = new_integration_logs_invalid_log_response_rejected_logs_inner;
}
