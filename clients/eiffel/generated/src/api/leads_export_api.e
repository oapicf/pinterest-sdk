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
	LEADSEXPORT_API

inherit

    API_I


feature -- API Access


	leads_export_create (ad_account_id: STRING_32; leads_export_create_request: LEADS_EXPORT_CREATE_REQUEST): detachable LEADS_EXPORT_CREATE_RESPONSE
			-- Create a request to export leads collected from a lead ad
			-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: leads_export_create_request  (required)
			-- 
			-- 
			-- Result LEADS_EXPORT_CREATE_RESPONSE
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			l_request.set_body(leads_export_create_request)
			l_path := "/ad_accounts/{ad_account_id}/leads_export"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<"application/json">>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Post", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LEADS_EXPORT_CREATE_RESPONSE } l_response.data ({ LEADS_EXPORT_CREATE_RESPONSE }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end

	leads_export_get (ad_account_id: STRING_32; leads_export_id: STRING_32): detachable LEADS_EXPORT_RESPONSE_DATA
			-- Get the lead export from the lead export create call
			-- &lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt;  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/lead-ads\&quot;&gt;Lead ads&lt;/a&gt;.
			-- 
			-- argument: ad_account_id Unique identifier of an ad account. (required)
			-- 
			-- argument: leads_export_id lead_export_id token returned from the create a lead export endpoint (required)
			-- 
			-- 
			-- Result LEADS_EXPORT_RESPONSE_DATA
		require
		local
  			l_path: STRING
  			l_request: API_CLIENT_REQUEST
  			l_response: API_CLIENT_RESPONSE
		do
			reset_error
			create l_request
			
			l_path := "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"
			l_path.replace_substring_all ("{"+"ad_account_id"+"}", api_client.url_encode (ad_account_id.out))
			l_path.replace_substring_all ("{"+"leads_export_id"+"}", api_client.url_encode (leads_export_id.out))


			if attached {STRING} api_client.select_header_accept ({ARRAY [STRING]}<<"application/json">>)  as l_accept then
				l_request.add_header(l_accept,"Accept");
			end
			l_request.add_header(api_client.select_header_content_type ({ARRAY [STRING]}<<>>),"Content-Type")
			l_request.set_auth_names ({ARRAY [STRING]}<<"pinterest_oauth2">>)
			l_response := api_client.call_api (l_path, "Get", l_request, Void, agent deserializer)
			if l_response.has_error then
				last_error := l_response.error
			elseif attached { LEADS_EXPORT_RESPONSE_DATA } l_response.data ({ LEADS_EXPORT_RESPONSE_DATA }) as l_data then
				Result := l_data
			else
				create last_error.make ("Unknown error: Status response [ " + l_response.status.out + "]")
			end
		end


end
