note
 description:"[
		Pinterest REST API
 		Pinterest's REST API
  		The version of the OpenAPI document: 5.14.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"

class
	AUDIENCESHARING_API

inherit

    API_I


feature -- API Access


	ad_accounts_audiences_shared_accounts_list (ad_account_id: STRING_32; audience_id: STRING_32; account_type: AUDIENCE_ACCOUNT_TYPE; page_size: INTEGER_32; bookmark: STRING_32): detachable AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
			-- List accounts with access to an audience owned by an ad account
			-- List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: audience_id Unique identifier of the audience to use to filter the results. (required)
			-- 
			-- argument: account_type Filter accounts by account type. (required)
			-- 
			-- argument: page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
			-- 
			-- argument: bookmark Cursor used to fetch the next page of items (optional, default to null)
			-- 
			-- 
			-- Result AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
		require
			page_size_is_less_or_equal_than: page_size <= 250
     		page_size_is_greater_or_equal_than: page_size >= 1
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/ad_accounts/{ad_account_id}/audiences/shared/accounts"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "audience_id", audience_id));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "account_type", account_type));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "page_size", page_size));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "bookmark", bookmark));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE } l_response.data ({ AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	business_account_audiences_shared_accounts_list (business_id: STRING_32; audience_id: STRING_32; account_type: AUDIENCE_ACCOUNT_TYPE; page_size: INTEGER_32; bookmark: STRING_32): detachable AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
			-- List accounts with access to an audience owned by a business
			-- List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
			-- 
			-- argument: business_id Unique identifier of the requesting business. (required)
			-- 
			-- argument: audience_id Unique identifier of the audience to use to filter the results. (required)
			-- 
			-- argument: account_type Filter accounts by account type. (required)
			-- 
			-- argument: page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
			-- 
			-- argument: bookmark Cursor used to fetch the next page of items (optional, default to null)
			-- 
			-- 
			-- Result AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
		require
			page_size_is_less_or_equal_than: page_size <= 250
     		page_size_is_greater_or_equal_than: page_size >= 1
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/businesses/{business_id}/audiences/shared/accounts"
			l_path.replace_substring_all ("{"+"business_id"+"}", api_client.url_encode (business_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "audience_id", audience_id));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "account_type", account_type));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "page_size", page_size));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "bookmark", bookmark));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE } l_response.data ({ AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	shared_audiences_for_business_list (business_id: STRING_32; bookmark: STRING_32; order: STRING_32; page_size: INTEGER_32): detachable AUDIENCES_LIST_200_RESPONSE
			-- List received audiences for a business
			-- Get a list of received audiences for the given business.
			-- 
			-- argument: business_id Unique identifier of the requesting business. (required)
			-- 
			-- argument: bookmark Cursor used to fetch the next page of items (optional, default to null)
			-- 
			-- argument: order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to null)
			-- 
			-- argument: page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
			-- 
			-- 
			-- Result AUDIENCES_LIST_200_RESPONSE
		require
			page_size_is_less_or_equal_than: page_size <= 250
     		page_size_is_greater_or_equal_than: page_size >= 1
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/businesses/{business_id}/audiences"
			l_path.replace_substring_all ("{"+"business_id"+"}", api_client.url_encode (business_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "bookmark", bookmark));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "order", order));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "page_size", page_size));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AUDIENCES_LIST_200_RESPONSE } l_response.data ({ AUDIENCES_LIST_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	update_ad_account_to_ad_account_shared_audience (ad_account_id: STRING_32; shared_audience: SHARED_AUDIENCE): detachable SHARED_AUDIENCE_RESPONSE
			-- Update audience sharing between ad accounts
			-- From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: shared_audience  (required)
			-- 
			-- 
			-- Result SHARED_AUDIENCE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(shared_audience)
			l_path := "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { SHARED_AUDIENCE_RESPONSE } l_response.data ({ SHARED_AUDIENCE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	update_ad_account_to_business_shared_audience (ad_account_id: STRING_32; business_shared_audience: BUSINESS_SHARED_AUDIENCE): detachable BUSINESS_SHARED_AUDIENCE_RESPONSE
			-- Update audience sharing from an ad account to businesses
			-- From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: business_shared_audience  (required)
			-- 
			-- 
			-- Result BUSINESS_SHARED_AUDIENCE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(business_shared_audience)
			l_path := "/ad_accounts/{ad_account_id}/audiences/businesses/shared"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { BUSINESS_SHARED_AUDIENCE_RESPONSE } l_response.data ({ BUSINESS_SHARED_AUDIENCE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	update_business_to_ad_account_shared_audience (business_id: STRING_32; shared_audience: SHARED_AUDIENCE): detachable SHARED_AUDIENCE_RESPONSE
			-- Update audience sharing from a business to ad accounts
			-- From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
			-- 
			-- argument: business_id Unique identifier of the requesting business. (required)
			-- 
			-- argument: shared_audience  (required)
			-- 
			-- 
			-- Result SHARED_AUDIENCE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(shared_audience)
			l_path := "/businesses/{business_id}/audiences/ad_accounts/shared"
			l_path.replace_substring_all ("{"+"business_id"+"}", api_client.url_encode (business_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { SHARED_AUDIENCE_RESPONSE } l_response.data ({ SHARED_AUDIENCE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	update_business_to_business_shared_audience (business_id: STRING_32; business_shared_audience: BUSINESS_SHARED_AUDIENCE): detachable BUSINESS_SHARED_AUDIENCE_RESPONSE
			-- Update audience sharing between businesses
			-- From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
			-- 
			-- argument: business_id Unique identifier of the requesting business. (required)
			-- 
			-- argument: business_shared_audience  (required)
			-- 
			-- 
			-- Result BUSINESS_SHARED_AUDIENCE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(business_shared_audience)
			l_path := "/businesses/{business_id}/audiences/businesses/shared"
			l_path.replace_substring_all ("{"+"business_id"+"}", api_client.url_encode (business_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { BUSINESS_SHARED_AUDIENCE_RESPONSE } l_response.data ({ BUSINESS_SHARED_AUDIENCE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end
