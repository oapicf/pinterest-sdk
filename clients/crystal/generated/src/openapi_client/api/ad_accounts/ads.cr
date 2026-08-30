require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Ads
    def initialize(@conn : Connection); end

    # Get ad analytics     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def analytics(ad_account_id : String, *, pin_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, ad_ids : Array(String)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, campaign_ids : Array(String)? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(Array(OpenAPIClient::AdsAnalytics))
      @conn.request(Array(OpenAPIClient::AdsAnalytics),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ads/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "pin_ids" => pin_ids, "start_date" => start_date, "end_date" => end_date, "ad_ids" => ad_ids, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "campaign_ids" => campaign_ids, "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update ads Update multiple existing ads
    def bulk_partial_update(ad_account_id : String, ad_batch_update : Array(OpenAPIClient::AdBatchUpdate)) : Response(OpenAPIClient::AdBatchWriteResponseModel)
      @conn.request(OpenAPIClient::AdBatchWriteResponseModel,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/ads".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_batch_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create ads Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
    def create(ad_account_id : String, ad_create : Array(OpenAPIClient::AdCreate)) : Response(OpenAPIClient::AdBatchWriteResponseModel)
      @conn.request(OpenAPIClient::AdBatchWriteResponseModel,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ads".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get ad Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
    def get(ad_id : String, ad_account_id : String) : Response(OpenAPIClient::Ad)
      @conn.request(OpenAPIClient::Ad,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ads/{ad_id}".sub("{ad_id}", OpenAPIClient.enc(ad_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List ads List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, campaign_ids : Array(String)? = nil, ad_group_ids : Array(String)? = nil, ad_ids : Array(String)? = nil, entity_statuses : Array(OpenAPIClient::EntityStatus)? = nil) : Response(OpenAPIClient::AdsList200Response)
      @conn.request(OpenAPIClient::AdsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ads".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "campaign_ids" => campaign_ids, "ad_group_ids" => ad_group_ids, "ad_ids" => ad_ids, "entity_statuses" => entity_statuses },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get targeting analytics for ads Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def targeting_analytics(ad_account_id : String, *, ad_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, targeting_types : Array(OpenAPIClient::AdsAnalyticsAdTargetingType)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : OpenAPIClient::ConversionAttributionWindowDays? = nil, engagement_window_days : OpenAPIClient::ConversionAttributionWindowDays? = nil, view_window_days : OpenAPIClient::ConversionAttributionWindowDays? = nil, conversion_report_time : OpenAPIClient::ConversionReportTimeType? = nil, attribution_types : Array(OpenAPIClient::ConversionReportAttributionType)? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil, sort_columns : Array(String)? = nil, sort_ascending : Bool? = nil) : Response(OpenAPIClient::MetricsResponse)
      @conn.request(OpenAPIClient::MetricsResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ads/targeting_analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "ad_ids" => ad_ids, "start_date" => start_date, "end_date" => end_date, "targeting_types" => targeting_types.try(&.map(&.to_s).join(",")), "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "attribution_types" => attribution_types.try(&.map(&.to_s).join(",")), "reporting_timezone" => reporting_timezone, "sort_columns" => sort_columns, "sort_ascending" => sort_ascending },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
