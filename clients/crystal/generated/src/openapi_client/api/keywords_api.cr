# #Pinterest REST API
#
##Pinterest's REST API
#
#The version of the OpenAPI document: 5.12.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.4.0
#

require "uri"

module OpenAPIClient
  class KeywordsApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get country's keyword metrics
    # See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \"Get delivery metrics definitions\" <a href=\"/docs/api/v5/#operation/delivery_metrics/get\">API endpoint</a>).
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param country_code [String] Two letter country code (ISO 3166-1 alpha-2)
    # @param keywords [Array(String)] Comma-separated keywords
    # @return [KeywordsMetricsArrayResponse]
    def country_keywords_metrics_get(ad_account_id : String, country_code : String, keywords : Array(String))
      data, _status_code, _headers = country_keywords_metrics_get_with_http_info(ad_account_id, country_code, keywords)
      data
    end

    # Get country&#39;s keyword metrics
    # See keyword metrics for a specified country, aggregated across all of Pinterest. (Definitions are available from the \&quot;Get delivery metrics definitions\&quot; &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/delivery_metrics/get\&quot;&gt;API endpoint&lt;/a&gt;).
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param country_code [String] Two letter country code (ISO 3166-1 alpha-2)
    # @param keywords [Array(String)] Comma-separated keywords
    # @return [Array<(KeywordsMetricsArrayResponse, Integer, Hash)>] KeywordsMetricsArrayResponse data, response status code and response headers
    def country_keywords_metrics_get_with_http_info(ad_account_id : String, country_code : String, keywords : Array(String))
      if @api_client.config.debugging
        Log.debug {"Calling API: KeywordsApi.country_keywords_metrics_get ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling KeywordsApi.country_keywords_metrics_get")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.country_keywords_metrics_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.country_keywords_metrics_get, must conform to the pattern #{pattern}.")
      end

      # verify the required parameter "country_code" is set
      if @api_client.config.client_side_validation && country_code.nil?
        raise ArgumentError.new("Missing the required parameter 'country_code' when calling KeywordsApi.country_keywords_metrics_get")
      end
      # verify the required parameter "keywords" is set
      if @api_client.config.client_side_validation && keywords.nil?
        raise ArgumentError.new("Missing the required parameter 'keywords' when calling KeywordsApi.country_keywords_metrics_get")
      end
      if @api_client.config.client_side_validation && keywords.size > 2000
        raise ArgumentError.new("invalid value for \"keywords\" when calling KeywordsApi.country_keywords_metrics_get, number of items must be less than or equal to 2000.")
      end

      if @api_client.config.client_side_validation && keywords.size < 1
        raise ArgumentError.new("invalid value for \"keywords\" when calling KeywordsApi.country_keywords_metrics_get, number of items must be greater than or equal to 1.")
      end

      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/keywords/metrics".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["country_code"] = country_code.to_s unless country_code.nil?
      query_params["keywords"] = @api_client.build_collection_param(keywords, :csv)

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "KeywordsMetricsArrayResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"KeywordsApi.country_keywords_metrics_get",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: KeywordsApi#country_keywords_metrics_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return KeywordsMetricsArrayResponse.from_json(data), status_code, headers
    end

    # Create keywords
    # <p>Create keywords for following entity types(advertiser, campaign, ad group or ad).</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a  target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul> <p><b>Rate limit</b>: <a href=\"/docs/redoc/#tag/Rate-Limits\">WRITE</a>.</p>
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param keywords_request [KeywordsRequest] 
    # @return [KeywordsResponse]
    def keywords_create(ad_account_id : String, keywords_request : KeywordsRequest)
      data, _status_code, _headers = keywords_create_with_http_info(ad_account_id, keywords_request)
      data
    end

    # Create keywords
    # &lt;p&gt;Create keywords for following entity types(advertiser, campaign, ad group or ad).&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a  target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;&lt;b&gt;Rate limit&lt;/b&gt;: &lt;a href&#x3D;\&quot;/docs/redoc/#tag/Rate-Limits\&quot;&gt;WRITE&lt;/a&gt;.&lt;/p&gt;
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param keywords_request [KeywordsRequest] 
    # @return [Array<(KeywordsResponse, Integer, Hash)>] KeywordsResponse data, response status code and response headers
    def keywords_create_with_http_info(ad_account_id : String, keywords_request : KeywordsRequest)
      if @api_client.config.debugging
        Log.debug {"Calling API: KeywordsApi.keywords_create ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling KeywordsApi.keywords_create")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_create, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_create, must conform to the pattern #{pattern}.")
      end

      # verify the required parameter "keywords_request" is set
      if @api_client.config.client_side_validation && keywords_request.nil?
        raise ArgumentError.new("Missing the required parameter 'keywords_request' when calling KeywordsApi.keywords_create")
      end
      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/keywords".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = keywords_request.to_json

      # return_type
      return_type = "KeywordsResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:POST,
                                                        local_var_path,
                                                        :"KeywordsApi.keywords_create",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: KeywordsApi#keywords_create\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return KeywordsResponse.from_json(data), status_code, headers
    end

    # Get keywords
    # <p>Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.</p> <p>For more information, see <a target=\"_blank\" href=\"https://help.pinterest.com/en/business/article/keyword-targeting\">Keyword targeting</a>.</p> <p><b>Notes:</b></p> <ul style=\"list-style-type: square;\"> <li>Advertisers and campaigns can only be assigned keywords with excluding ('_NEGATIVE').</li> <li>All keyword match types are available for ad groups.</li> </ul> <p>For more information on match types, see <a target=\"_blank\" href=\"/docs/ads/targeting/#Match%20type%20and%20targeting%20level\">match type enums</a>.</p> <p><b>Returns:</b></p> <ul style=\"list-style-type: square;\"> <li><p>A successful call returns an object containing an array of new keyword objects and an empty &quot;errors&quot; object array.</p></li> <li><p>An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &quot;errors&quot; object array:</p> <pre class=\"last literal-block\"> { \"keywords\": [], \"errors\": [ { \"data\": { \"archived\": null, \"match_type\": \"EXACT\", \"parent_type\": null, \"value\": \"foobar\", \"parent_id\": null, \"type\": \"keyword\", \"id\": null }, \"error_messages\": [ \"Advertisers and Campaigns only accept excluded targeting attributes.\" ] } } </pre></li> </ul>
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @return [KeywordsGet200Response]
    def keywords_get(ad_account_id : String, campaign_id : String?, ad_group_id : String?, match_types : Array(MatchType)?, page_size : Int32?, bookmark : String?)
      data, _status_code, _headers = keywords_get_with_http_info(ad_account_id, campaign_id, ad_group_id, match_types, page_size, bookmark)
      data
    end

    # Get keywords
    # &lt;p&gt;Get a list of keywords based on the filters provided. If no filter is provided, it will default to the ad_account_id filter, which means it will only return keywords that specifically have parent_id set to the ad_account_id. Note: Keywords can have ad_account_ids, campaign_ids, and ad_group_ids set as their parent_ids. Keywords created through Ads Manager will have their parent_id set to an ad_group_id, not ad_account_id.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/keyword-targeting\&quot;&gt;Keyword targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Notes:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;Advertisers and campaigns can only be assigned keywords with excluding (&#39;_NEGATIVE&#39;).&lt;/li&gt; &lt;li&gt;All keyword match types are available for ad groups.&lt;/li&gt; &lt;/ul&gt; &lt;p&gt;For more information on match types, see &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;/docs/ads/targeting/#Match%20type%20and%20targeting%20level\&quot;&gt;match type enums&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Returns:&lt;/b&gt;&lt;/p&gt; &lt;ul style&#x3D;\&quot;list-style-type: square;\&quot;&gt; &lt;li&gt;&lt;p&gt;A successful call returns an object containing an array of new keyword objects and an empty &amp;quot;errors&amp;quot; object array.&lt;/p&gt;&lt;/li&gt; &lt;li&gt;&lt;p&gt;An unsuccessful call returns an empty keywords array, and, instead, inserts the entire object with nulled/negated properties into the &amp;quot;errors&amp;quot; object array:&lt;/p&gt; &lt;pre class&#x3D;\&quot;last literal-block\&quot;&gt; { \&quot;keywords\&quot;: [], \&quot;errors\&quot;: [ { \&quot;data\&quot;: { \&quot;archived\&quot;: null, \&quot;match_type\&quot;: \&quot;EXACT\&quot;, \&quot;parent_type\&quot;: null, \&quot;value\&quot;: \&quot;foobar\&quot;, \&quot;parent_id\&quot;: null, \&quot;type\&quot;: \&quot;keyword\&quot;, \&quot;id\&quot;: null }, \&quot;error_messages\&quot;: [ \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot; ] } } &lt;/pre&gt;&lt;/li&gt; &lt;/ul&gt;
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @return [Array<(KeywordsGet200Response, Integer, Hash)>] KeywordsGet200Response data, response status code and response headers
    def keywords_get_with_http_info(ad_account_id : String, campaign_id : String?, ad_group_id : String?, match_types : Array(MatchType)?, page_size : Int32?, bookmark : String?)
      if @api_client.config.debugging
        Log.debug {"Calling API: KeywordsApi.keywords_get ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling KeywordsApi.keywords_get")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_get, must conform to the pattern #{pattern}.")
      end

      if @api_client.config.client_side_validation && !campaign_id.nil? && campaign_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"campaign_id\" when calling KeywordsApi.keywords_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && campaign_id.nil? && campaign_id !~ pattern
        raise ArgumentError.new("invalid value for \"campaign_id\" when calling KeywordsApi.keywords_get, must conform to the pattern #{pattern}.")
      end

      if @api_client.config.client_side_validation && !ad_group_id.nil? && ad_group_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_group_id\" when calling KeywordsApi.keywords_get, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_group_id.nil? && ad_group_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_group_id\" when calling KeywordsApi.keywords_get, must conform to the pattern #{pattern}.")
      end

      if @api_client.config.client_side_validation && match_types.nil? && match_types.size > 5
        raise ArgumentError.new("invalid value for \"match_types\" when calling KeywordsApi.keywords_get, number of items must be less than or equal to 5.")
      end

      if @api_client.config.client_side_validation && match_types.nil? && match_types.size < 1
        raise ArgumentError.new("invalid value for \"match_types\" when calling KeywordsApi.keywords_get, number of items must be greater than or equal to 1.")
      end

      if @api_client.config.client_side_validation && !page_size.nil? && page_size > 250
        raise ArgumentError.new("invalid value for \"page_size\" when calling KeywordsApi.keywords_get, must be smaller than or equal to 250.")
      end

      if @api_client.config.client_side_validation && !page_size.nil? && page_size < 1
        raise ArgumentError.new("invalid value for \"page_size\" when calling KeywordsApi.keywords_get, must be greater than or equal to 1.")
      end

      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/keywords".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["campaign_id"] = campaign_id.to_s unless campaign_id.nil?
      query_params["ad_group_id"] = ad_group_id.to_s unless ad_group_id.nil?
      query_params["match_types"] = @api_client.build_collection_param(match_types, :multi)
      query_params["page_size"] = page_size.to_s unless page_size.nil?
      query_params["bookmark"] = bookmark.to_s unless bookmark.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "KeywordsGet200Response"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"KeywordsApi.keywords_get",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: KeywordsApi#keywords_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return KeywordsGet200Response.from_json(data), status_code, headers
    end

    # Update keywords
    # <p>Update one or more keywords' bid and archived fields.</p> <p>Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity's keywords list.</p>
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param keyword_update_body [KeywordUpdateBody] 
    # @return [KeywordsResponse]
    def keywords_update(ad_account_id : String, keyword_update_body : KeywordUpdateBody)
      data, _status_code, _headers = keywords_update_with_http_info(ad_account_id, keyword_update_body)
      data
    end

    # Update keywords
    # &lt;p&gt;Update one or more keywords&#39; bid and archived fields.&lt;/p&gt; &lt;p&gt;Archiving a keyword effectively deletes it - keywords no longer receive metrics and no longer visible within the parent entity&#39;s keywords list.&lt;/p&gt;
    # @param ad_account_id [String] Unique identifier of an ad account.
    # @param keyword_update_body [KeywordUpdateBody] 
    # @return [Array<(KeywordsResponse, Integer, Hash)>] KeywordsResponse data, response status code and response headers
    def keywords_update_with_http_info(ad_account_id : String, keyword_update_body : KeywordUpdateBody)
      if @api_client.config.debugging
        Log.debug {"Calling API: KeywordsApi.keywords_update ..."}
      end
      # verify the required parameter "ad_account_id" is set
      if @api_client.config.client_side_validation && ad_account_id.nil?
        raise ArgumentError.new("Missing the required parameter 'ad_account_id' when calling KeywordsApi.keywords_update")
      end
      if @api_client.config.client_side_validation && ad_account_id.to_s.size > 18
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_update, the character length must be smaller than or equal to 18.")
      end

      pattern = Regexp.new(/^\d+$/)
      if @api_client.config.client_side_validation && ad_account_id !~ pattern
        raise ArgumentError.new("invalid value for \"ad_account_id\" when calling KeywordsApi.keywords_update, must conform to the pattern #{pattern}.")
      end

      # verify the required parameter "keyword_update_body" is set
      if @api_client.config.client_side_validation && keyword_update_body.nil?
        raise ArgumentError.new("Missing the required parameter 'keyword_update_body' when calling KeywordsApi.keywords_update")
      end
      # resource path
      local_var_path = "/ad_accounts/{ad_account_id}/keywords".sub("{" + "ad_account_id" + "}", URI.encode_path(ad_account_id.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])
      # HTTP header "Content-Type"
      header_params["Content-Type"] = @api_client.select_header_content_type(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = keyword_update_body.to_json

      # return_type
      return_type = "KeywordsResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:PATCH,
                                                        local_var_path,
                                                        :"KeywordsApi.keywords_update",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: KeywordsApi#keywords_update\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return KeywordsResponse.from_json(data), status_code, headers
    end

    # List trending keywords
    # <p>Get the top trending search keywords among the Pinterest user audience.</p> <p>Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.</p> <p>Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.</p> <p>For an interactive way to explore this data, please visit <a href=\"https://trends.pinterest.com\">trends.pinterest.com</a>.
    # @param region [TrendsSupportedRegion] The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
    # @param trend_type [TrendType] The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    # @return [TrendingKeywordsResponse]
    def trending_keywords_list(region : TrendsSupportedRegion, trend_type : TrendType, interests : Array(String)?, genders : Array(String)?, ages : Array(String)?, normalize_against_group : Bool?, limit : Int32?)
      data, _status_code, _headers = trending_keywords_list_with_http_info(region, trend_type, interests, genders, ages, normalize_against_group, limit)
      data
    end

    # List trending keywords
    # &lt;p&gt;Get the top trending search keywords among the Pinterest user audience.&lt;/p&gt; &lt;p&gt;Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.&lt;/p&gt; &lt;p&gt;Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.&lt;/p&gt; &lt;p&gt;For an interactive way to explore this data, please visit &lt;a href&#x3D;\&quot;https://trends.pinterest.com\&quot;&gt;trends.pinterest.com&lt;/a&gt;.
    # @param region [TrendsSupportedRegion] The geographic region of interest. Only top trends within the specified region will be returned.&lt;br /&gt; The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas: - &#x60;US&#x60; - United States - &#x60;CA&#x60; - Canada - &#x60;DE&#x60; - Germany - &#x60;FR&#x60; - France - &#x60;ES&#x60; - Spain - &#x60;IT&#x60; - Italy - &#x60;DE+AT+CH&#x60; - Germanic countries - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe - &#x60;SE+DK+FI+NO&#x60; - Nordic countries - &#x60;NL+BE+LU&#x60; - Benelux - &#x60;AR&#x60; - Argentina - &#x60;BR&#x60; - Brazil - &#x60;CO&#x60; - Colombia - &#x60;MX&#x60; - Mexico - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm - &#x60;AU+NZ&#x60; - Australasia
    # @param trend_type [TrendType] The methodology used to rank how trendy a keyword is. - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter - &#x60;monthly&#x60; trends have high search volume in the last month - &#x60;yearly&#x60; trends have high search volume in the last year - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    # @return [Array<(TrendingKeywordsResponse, Integer, Hash)>] TrendingKeywordsResponse data, response status code and response headers
    def trending_keywords_list_with_http_info(region : TrendsSupportedRegion, trend_type : TrendType, interests : Array(String)?, genders : Array(String)?, ages : Array(String)?, normalize_against_group : Bool?, limit : Int32?)
      if @api_client.config.debugging
        Log.debug {"Calling API: KeywordsApi.trending_keywords_list ..."}
      end
      # verify the required parameter "region" is set
      if @api_client.config.client_side_validation && region.nil?
        raise ArgumentError.new("Missing the required parameter 'region' when calling KeywordsApi.trending_keywords_list")
      end
      # verify the required parameter "trend_type" is set
      if @api_client.config.client_side_validation && trend_type.nil?
        raise ArgumentError.new("Missing the required parameter 'trend_type' when calling KeywordsApi.trending_keywords_list")
      end
      allowable_values = ["animals", "architecture", "art", "beauty", "childrens_fashion", "design", "diy_and_crafts", "education", "electronics", "entertainment", "event_planning", "finance", "food_and_drinks", "gardening", "health", "home_decor", "mens_fashion", "parenting", "quotes", "sport", "travel", "vehicles", "wedding", "womens_fashion"]
      if @api_client.config.client_side_validation && interests && interests.all? { |item| allowable_values.includes?(item) }
        raise ArgumentError.new("invalid value for \"interests\", must include one of #{allowable_values}")
      end
      allowable_values = ["female", "male", "unknown"]
      if @api_client.config.client_side_validation && genders && genders.all? { |item| allowable_values.includes?(item) }
        raise ArgumentError.new("invalid value for \"genders\", must include one of #{allowable_values}")
      end
      allowable_values = ["18-24", "25-34", "35-44", "45-49", "50-54", "55-64", "65+"]
      if @api_client.config.client_side_validation && ages && ages.all? { |item| allowable_values.includes?(item) }
        raise ArgumentError.new("invalid value for \"ages\", must include one of #{allowable_values}")
      end
      if @api_client.config.client_side_validation && !limit.nil? && limit > 50
        raise ArgumentError.new("invalid value for \"limit\" when calling KeywordsApi.trending_keywords_list, must be smaller than or equal to 50.")
      end

      if @api_client.config.client_side_validation && !limit.nil? && limit < 1
        raise ArgumentError.new("invalid value for \"limit\" when calling KeywordsApi.trending_keywords_list, must be greater than or equal to 1.")
      end

      # resource path
      local_var_path = "/trends/keywords/{region}/top/{trend_type}".sub("{" + "region" + "}", URI.encode_path(region.to_s)).sub("{" + "trend_type" + "}", URI.encode_path(trend_type.to_s))

      # query parameters
      query_params = Hash(String, String).new
      query_params["interests"] = @api_client.build_collection_param(interests, :multi)
      query_params["genders"] = @api_client.build_collection_param(genders, :multi)
      query_params["ages"] = @api_client.build_collection_param(ages, :multi)
      query_params["normalize_against_group"] = normalize_against_group.to_s unless normalize_against_group.nil?
      query_params["limit"] = limit.to_s unless limit.nil?

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "TrendingKeywordsResponse"

      # auth_names
      auth_names = ["pinterest_oauth2"]

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"KeywordsApi.trending_keywords_list",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: KeywordsApi#trending_keywords_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return TrendingKeywordsResponse.from_json(data), status_code, headers
    end
  end
end