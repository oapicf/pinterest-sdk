# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.14.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.9.0
#

require "uri"

module OpenAPIClient
  class AudienceInsightsApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get audience insights
    # Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param audience_insight_type [AudienceInsightType] Type of audience insights.
    # @return [AudienceInsightsResponse]
    def audience_insights_get(ad_account_id : String, audience_insight_type : AudienceInsightType)
      data, _status_code, _headers = audience_insights_get_with_http_info(ad_account_id, audience_insight_type)
      data
    end

    # Get audience insights
    # Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param audience_insight_type [AudienceInsightType] Type of audience insights.
    # @return [Array<(AudienceInsightsResponse, Integer, Hash)>] AudienceInsightsResponse data, response status code and response headers
    def audience_insights_get_with_http_info(ad_account_id : String, audience_insight_type : AudienceInsightType)
      if @api_client.config.debugging
        Log.debug {"Calling API: AudienceInsightsApi.audience_insights_get ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling AudienceInsightsApi.audience_insights_get")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling AudienceInsightsApi.audience_insights_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling AudienceInsightsApi.audience_insights_get, must conform to the pattern #{pattern}.")
      end

      # verify the required parameter "audience_insight_type" is set
      if @api_client.config.client_side_validation && audience_insight_type.nil?
        raise ArgumentError.new("Missing the required parameter 'audience_insight_type' when calling AudienceInsightsApi.audience_insights_get")
      end
      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/audience_insights".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["audience_insight_type"] = audience_insight_type.to_s unless audience_insight_type.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "AudienceInsightsResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"AudienceInsightsApi.audience_insights_get",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: AudienceInsightsApi#audience_insights_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return AudienceInsightsResponse.from_json(data), status_code, headers
    end

    # Get audience insights scope and type
    # Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @return [AudienceDefinitionResponse]
    def audience_insights_scope_and_type_get(ad_account_id : String)
      data, _status_code, _headers = audience_insights_scope_and_type_get_with_http_info(ad_account_id)
      data
    end

    # Get audience insights scope and type
    # Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @return [Array<(AudienceDefinitionResponse, Integer, Hash)>] AudienceDefinitionResponse data, response status code and response headers
    def audience_insights_scope_and_type_get_with_http_info(ad_account_id : String)
      if @api_client.config.debugging
        Log.debug {"Calling API: AudienceInsightsApi.audience_insights_scope_and_type_get ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling AudienceInsightsApi.audience_insights_scope_and_type_get")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling AudienceInsightsApi.audience_insights_scope_and_type_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling AudienceInsightsApi.audience_insights_scope_and_type_get, must conform to the pattern #{pattern}.")
      end

      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/insights/audiences".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "AudienceDefinitionResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"AudienceInsightsApi.audience_insights_scope_and_type_get",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: AudienceInsightsApi#audience_insights_scope_and_type_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return AudienceDefinitionResponse.from_json(data), status_code, headers
    end
  end
end
