--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.12.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- quiz_pin_data class
local quiz_pin_data = {}
local quiz_pin_data_mt = {
	__name = "quiz_pin_data";
	__index = quiz_pin_data;
}

local function cast_quiz_pin_data(t)
	return setmetatable(t, quiz_pin_data_mt)
end

local function new_quiz_pin_data(questions, results)
	return cast_quiz_pin_data({
		["questions"] = questions;
		["results"] = results;
	})
end

return {
	cast = cast_quiz_pin_data;
	new = new_quiz_pin_data;
}