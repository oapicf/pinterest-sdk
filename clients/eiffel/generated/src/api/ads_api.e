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
	ADS_API

inherit

    API_I


feature -- API Access


	ad_previews_create (ad_account_id: STRING_32; ad_preview_request: AD_PREVIEW_REQUEST): detachable AD_PREVIEW_URL_RESPONSE
			-- Create ad preview with pin or image
			-- Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: ad_preview_request Create ad preview with pin or image. (required)
			-- 
			-- 
			-- Result AD_PREVIEW_URL_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(ad_preview_request)
			l_path := "/ad_accounts/{ad_account_id}/ad_previews"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_PREVIEW_URL_RESPONSE } l_response.data ({ AD_PREVIEW_URL_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ad_targeting_analytics_get (ad_account_id: STRING_32; ad_ids: LIST [STRING_32]; start_date: DATE; end_date: DATE; targeting_types: LIST [ADS_ANALYTICS_AD_TARGETING_TYPE]; columns: LIST [STRING_32]; granularity: GRANULARITY; click_window_days: INTEGER_32; engagement_window_days: INTEGER_32; view_window_days: INTEGER_32; conversion_report_time: STRING_32; attribution_types: detachable CONVERSION_REPORT_ATTRIBUTION_TYPE): detachable METRICS_RESPONSE
			-- Get targeting analytics for ads
			-- Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: ad_ids List of Ad Ids to use to filter the results. (required)
			-- 
			-- argument: start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
			-- 
			-- argument: end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
			-- 
			-- argument: targeting_types Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. (required)
			-- 
			-- argument: columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned (required)
			-- 
			-- argument: granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (required)
			-- 
			-- argument: click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
			-- 
			-- argument: engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
			-- 
			-- argument: view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
			-- 
			-- argument: conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
			-- 
			-- argument: attribution_types List of types of attribution for the conversion report (optional, default to null)
			-- 
			-- 
			-- Result METRICS_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/ad_accounts/{ad_account_id}/ads/targeting_analytics"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "ad_ids", ad_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "start_date", start_date));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_date", end_date));
			l_request.fill_query_params(api_client.parameter_to_tuple("csv", "targeting_types", targeting_types));
			l_request.fill_query_params(api_client.parameter_to_tuple("csv", "columns", columns));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "granularity", granularity));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "click_window_days", click_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "engagement_window_days", engagement_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "view_window_days", view_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "conversion_report_time", conversion_report_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "attribution_types", attribution_types));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { METRICS_RESPONSE } l_response.data ({ METRICS_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ads_analytics (ad_account_id: STRING_32; start_date: DATE; end_date: DATE; columns: LIST [STRING_32]; granularity: GRANULARITY; ad_ids: detachable LIST [STRING_32]; click_window_days: INTEGER_32; engagement_window_days: INTEGER_32; view_window_days: INTEGER_32; conversion_report_time: STRING_32; pin_ids: detachable LIST [STRING_32]; campaign_ids: detachable LIST [STRING_32]): detachable LIST [ADS_ANALYTICS_RESPONSE_INNER]
			-- Get ad analytics
			-- Get analytics for the specified ads in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: start_date Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
			-- 
			-- argument: end_date Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
			-- 
			-- argument: columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned (required)
			-- 
			-- argument: granularity TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (required)
			-- 
			-- argument: ad_ids List of Ad Ids to use to filter the results. (optional, default to null)
			-- 
			-- argument: click_window_days Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
			-- 
			-- argument: engagement_window_days Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
			-- 
			-- argument: view_window_days Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
			-- 
			-- argument: conversion_report_time The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
			-- 
			-- argument: pin_ids List of Pin IDs. (optional, default to null)
			-- 
			-- argument: campaign_ids List of Campaign Ids to use to filter the results. (optional, default to null)
			-- 
			-- 
			-- Result LIST [ADS_ANALYTICS_RESPONSE_INNER]
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/ad_accounts/{ad_account_id}/ads/analytics"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("", "start_date", start_date));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "end_date", end_date));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "ad_ids", ad_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("csv", "columns", columns));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "granularity", granularity));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "click_window_days", click_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "engagement_window_days", engagement_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "view_window_days", view_window_days));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "conversion_report_time", conversion_report_time));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "pin_ids", pin_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "campaign_ids", campaign_ids));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LIST [ADS_ANALYTICS_RESPONSE_INNER] } l_response.data ({ LIST [ADS_ANALYTICS_RESPONSE_INNER] }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ads_create (ad_account_id: STRING_32; ad_create_request: LIST [AD_CREATE_REQUEST]): detachable AD_ARRAY_RESPONSE
			-- Create ads
			-- Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: ad_create_request List of ads to create, size limit [1, 30]. (required)
			-- 
			-- 
			-- Result AD_ARRAY_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(ad_create_request)
			l_path := "/ad_accounts/{ad_account_id}/ads"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_ARRAY_RESPONSE } l_response.data ({ AD_ARRAY_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ads_get (ad_account_id: STRING_32; ad_id: STRING_32): detachable AD_RESPONSE
			-- Get ad
			-- Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: ad_id Unique identifier of an ad. (required)
			-- 
			-- 
			-- Result AD_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/ad_accounts/{ad_account_id}/ads/{ad_id}"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_path.replace_substring_all ("{"+"ad_id"+"}", api_client.url_encode (ad_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_RESPONSE } l_response.data ({ AD_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ads_list (ad_account_id: STRING_32; campaign_ids: detachable LIST [STRING_32]; ad_group_ids: detachable LIST [STRING_32]; ad_ids: detachable LIST [STRING_32]; entity_statuses: detachable LIST [STRING_32]; page_size: INTEGER_32; order: STRING_32; bookmark: STRING_32): detachable ADS_LIST_200_RESPONSE
			-- List ads
			-- List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: campaign_ids List of Campaign Ids to use to filter the results. (optional, default to null)
			-- 
			-- argument: ad_group_ids List of Ad group Ids to use to filter the results. (optional, default to null)
			-- 
			-- argument: ad_ids List of Ad Ids to use to filter the results. (optional, default to null)
			-- 
			-- argument: entity_statuses Entity status (optional, default to ["ACTIVE","PAUSED"])
			-- 
			-- argument: page_size Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
			-- 
			-- argument: order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to null)
			-- 
			-- argument: bookmark Cursor used to fetch the next page of items (optional, default to null)
			-- 
			-- 
			-- Result ADS_LIST_200_RESPONSE
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
			
			l_path := "/ad_accounts/{ad_account_id}/ads"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "campaign_ids", campaign_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "ad_group_ids", ad_group_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "ad_ids", ad_ids));
			l_request.fill_query_params(api_client.parameter_to_tuple("multi", "entity_statuses", entity_statuses));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "page_size", page_size));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "order", order));
			l_request.fill_query_params(api_client.parameter_to_tuple("", "bookmark", bookmark));


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { ADS_LIST_200_RESPONSE } l_response.data ({ ADS_LIST_200_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	ads_update (ad_account_id: STRING_32; ad_update_request: LIST [AD_UPDATE_REQUEST]): detachable AD_ARRAY_RESPONSE
			-- Update ads
			-- Update multiple existing ads
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: ad_update_request List of ads to update, size limit [1, 30] (required)
			-- 
			-- 
			-- Result AD_ARRAY_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(ad_update_request)
			l_path := "/ad_accounts/{ad_account_id}/ads"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Patch", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { AD_ARRAY_RESPONSE } l_response.data ({ AD_ARRAY_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end
