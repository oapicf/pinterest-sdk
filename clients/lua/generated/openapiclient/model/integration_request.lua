--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- integration_request class
local integration_request = {}
local integration_request_mt = {
	__name = "integration_request";
	__index = integration_request;
}

local function cast_integration_request(t)
	return setmetatable(t, integration_request_mt)
end

local function new_integration_request(external_business_id, connected_merchant_id, connected_advertiser_id, connected_lba_id, connected_tag_id, partner_access_token, partner_refresh_token, partner_primary_email, partner_access_token_expiry, partner_refresh_token_expiry, scopes, additional_id_1, partner_metadata)
	return cast_integration_request({
		["external_business_id"] = external_business_id;
		["connected_merchant_id"] = connected_merchant_id;
		["connected_advertiser_id"] = connected_advertiser_id;
		["connected_lba_id"] = connected_lba_id;
		["connected_tag_id"] = connected_tag_id;
		["partner_access_token"] = partner_access_token;
		["partner_refresh_token"] = partner_refresh_token;
		["partner_primary_email"] = partner_primary_email;
		["partner_access_token_expiry"] = partner_access_token_expiry;
		["partner_refresh_token_expiry"] = partner_refresh_token_expiry;
		["scopes"] = scopes;
		["additional_id_1"] = additional_id_1;
		["partner_metadata"] = partner_metadata;
	})
end

return {
	cast = cast_integration_request;
	new = new_integration_request;
}
