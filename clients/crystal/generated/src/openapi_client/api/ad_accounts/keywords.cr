require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Keywords
    def initialize(@conn : Connection); end

    # Update keywords   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
    def bulk_partial_update(ad_account_id : String, keywords_update : OpenAPIClient::KeywordsUpdate) : Response(OpenAPIClient::Keywords)
      @conn.request(OpenAPIClient::Keywords,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/keywords".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: keywords_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create keywords   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
    def create(ad_account_id : String, keywords_create : OpenAPIClient::KeywordsCreate) : Response(OpenAPIClient::Keywords)
      @conn.request(OpenAPIClient::Keywords,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/keywords".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: keywords_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get keywords     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
    def list(ad_account_id : String, *, campaign_id : String? = nil, ad_group_id : String? = nil, ad_group_ids : Array(String)? = nil, match_types : Array(OpenAPIClient::MatchType)? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::KeywordsGet200Response)
      @conn.request(OpenAPIClient::KeywordsGet200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/keywords".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "campaign_id" => campaign_id, "ad_group_id" => ad_group_id, "ad_group_ids" => ad_group_ids, "match_types" => match_types, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get country&#39;s keyword metrics   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
    def metrics(ad_account_id : String, *, country_code : String? = nil, keywords : Array(String)? = nil) : Response(OpenAPIClient::KeywordsMetricsArrayResponse)
      @conn.request(OpenAPIClient::KeywordsMetricsArrayResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/keywords/metrics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "country_code" => country_code, "keywords" => keywords.try(&.map(&.to_s).join(",")) },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
