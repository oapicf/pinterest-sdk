--[[
  Pinterest REST API

  Pinterest's REST API

  The version of the OpenAPI document: 5.14.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

--package openapiclient

local http_request = require "http.request"
local http_util = require "http.util"
local dkjson = require "dkjson"
local basexx = require "basexx"

-- model import
local openapiclient_ads_analytics_campaign_targeting_type = require "openapiclient.model.ads_analytics_campaign_targeting_type"
local openapiclient_campaign_create_request = require "openapiclient.model.campaign_create_request"
local openapiclient_campaign_create_response = require "openapiclient.model.campaign_create_response"
local openapiclient_campaign_response = require "openapiclient.model.campaign_response"
local openapiclient_campaign_update_request = require "openapiclient.model.campaign_update_request"
local openapiclient_campaign_update_response = require "openapiclient.model.campaign_update_response"
local openapiclient_campaigns_analytics_response_inner = require "openapiclient.model.campaigns_analytics_response_inner"
local openapiclient_conversion_report_attribution_type = require "openapiclient.model.conversion_report_attribution_type"
local openapiclient_error = require "openapiclient.model.error"
local openapiclient_granularity = require "openapiclient.model.granularity"
local openapiclient_metrics_response = require "openapiclient.model.metrics_response"
local openapiclient_campaigns_list_200_response = require "openapiclient.model.campaigns_list_200_response"

local campaigns_api = {}
local campaigns_api_mt = {
	__name = "campaigns_api";
	__index = campaigns_api;
}

local function new_campaigns_api(authority, basePath, schemes)
	local schemes_map = {}
	for _,v in ipairs(schemes) do
		schemes_map[v] = v
	end
	local default_scheme = schemes_map.https or schemes_map.http
	local host, port = http_util.split_authority(authority, default_scheme)
	return setmetatable({
		host = host;
		port = port;
		basePath = basePath or "https://api.pinterest.com/v5";
		schemes = schemes_map;
		default_scheme = default_scheme;
		http_username = nil;
		http_password = nil;
		api_key = {};
		access_token = nil;
	}, campaigns_api_mt)
end

function campaigns_api:campaign_targeting_analytics_get(ad_account_id, campaign_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time, attribution_types)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns/targeting_analytics?campaign_ids=%s&start_date=%s&end_date=%s&targeting_types=%s&columns=%s&granularity=%s&click_window_days=%s&engagement_window_days=%s&view_window_days=%s&conversion_report_time=%s&attribution_types=%s",
			self.basePath, ad_account_id, http_util.encodeURIComponent(campaign_ids), http_util.encodeURIComponent(start_date), http_util.encodeURIComponent(end_date), http_util.encodeURIComponent(targeting_types), http_util.encodeURIComponent(columns), http_util.encodeURIComponent(granularity), http_util.encodeURIComponent(click_window_days), http_util.encodeURIComponent(engagement_window_days), http_util.encodeURIComponent(view_window_days), http_util.encodeURIComponent(conversion_report_time), http_util.encodeURIComponent(attribution_types));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_metrics_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function campaigns_api:campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days, engagement_window_days, view_window_days, conversion_report_time)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns/analytics?start_date=%s&end_date=%s&campaign_ids=%s&columns=%s&granularity=%s&click_window_days=%s&engagement_window_days=%s&view_window_days=%s&conversion_report_time=%s",
			self.basePath, ad_account_id, http_util.encodeURIComponent(start_date), http_util.encodeURIComponent(end_date), http_util.encodeURIComponent(campaign_ids), http_util.encodeURIComponent(columns), http_util.encodeURIComponent(granularity), http_util.encodeURIComponent(click_window_days), http_util.encodeURIComponent(engagement_window_days), http_util.encodeURIComponent(view_window_days), http_util.encodeURIComponent(conversion_report_time));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		for _, ob in ipairs(result) do
			openapiclient_campaigns_analytics_response_inner.cast(ob)
		end
		return result, headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function campaigns_api:campaigns_create(ad_account_id, campaign_create_request)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns",
			self.basePath, ad_account_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "POST")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/json" }
	req.headers:upsert("accept", "application/json")

	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	req:set_body(dkjson.encode(campaign_create_request))

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_campaign_create_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function campaigns_api:campaigns_get(ad_account_id, campaign_id)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns/%s",
			self.basePath, ad_account_id, campaign_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_campaign_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function campaigns_api:campaigns_list(ad_account_id, campaign_ids, entity_statuses, page_size, order, bookmark)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns?campaign_ids=%s&entity_statuses=%s&page_size=%s&order=%s&bookmark=%s",
			self.basePath, ad_account_id, http_util.encodeURIComponent(campaign_ids), http_util.encodeURIComponent(entity_statuses), http_util.encodeURIComponent(page_size), http_util.encodeURIComponent(order), http_util.encodeURIComponent(bookmark));
	})

	-- set HTTP verb
	req.headers:upsert(":method", "GET")
	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_campaigns_list_200_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

function campaigns_api:campaigns_update(ad_account_id, campaign_update_request)
	local req = http_request.new_from_uri({
		scheme = self.default_scheme;
		host = self.host;
		port = self.port;
		path = string.format("%s/ad_accounts/%s/campaigns",
			self.basePath, ad_account_id);
	})

	-- set HTTP verb
	req.headers:upsert(":method", "PATCH")
	-- TODO: create a function to select proper accept
	--local var_content_type = { "application/json" }
	req.headers:upsert("accept", "application/json")

	-- TODO: create a function to select proper content-type
	--local var_accept = { "application/json" }
	req.headers:upsert("content-type", "application/json")

	req:set_body(dkjson.encode(campaign_update_request))

	-- oAuth
	if self.access_token then
		req.headers:upsert("authorization", "Bearer " .. self.access_token)
	end

	-- make the HTTP call
	local headers, stream, errno = req:go()
	if not headers then
		return nil, stream, errno
	end
	local http_status = headers:get(":status")
	if http_status:sub(1,1) == "2" then
		local body, err, errno2 = stream:get_body_as_string()
		-- exception when getting the HTTP body
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		local result, _, err3 = dkjson.decode(body)
		-- exception when decoding the HTTP body
		if result == nil then
			return nil, err3
		end
		return openapiclient_campaign_update_response.cast(result), headers
	else
		local body, err, errno2 = stream:get_body_as_string()
		if not body then
			return nil, err, errno2
		end
		stream:shutdown()
		-- return the error message (http body)
		return nil, http_status, body
	end
end

return {
	new = new_campaigns_api;
}
