--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- auth_respond_invites_body_invites_inner class
local auth_respond_invites_body_invites_inner = {}
local auth_respond_invites_body_invites_inner_mt = {
	__name = "auth_respond_invites_body_invites_inner";
	__index = auth_respond_invites_body_invites_inner;
}

local function cast_auth_respond_invites_body_invites_inner(t)
	return setmetatable(t, auth_respond_invites_body_invites_inner_mt)
end

local function new_auth_respond_invites_body_invites_inner(action, invite_id)
	return cast_auth_respond_invites_body_invites_inner({
		["action"] = action;
		["invite_id"] = invite_id;
	})
end

return {
	cast = cast_auth_respond_invites_body_invites_inner;
	new = new_auth_respond_invites_body_invites_inner;
}
