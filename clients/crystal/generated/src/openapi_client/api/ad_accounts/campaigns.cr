require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Campaigns
    def initialize(@conn : Connection); end

    # Get campaign analytics Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def analytics(ad_account_id : String, *, start_date : Time? = nil, end_date : Time? = nil, campaign_ids : Array(String)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, aggregate_report_rows : Bool? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(Array(OpenAPIClient::CampaignsAnalyticsMetrics))
      @conn.request(Array(OpenAPIClient::CampaignsAnalyticsMetrics),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/campaigns/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "campaign_ids" => campaign_ids, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "aggregate_report_rows" => aggregate_report_rows, "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update campaigns Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    def bulk_partial_update(ad_account_id : String, campaign_batch_update_item : Array(OpenAPIClient::CampaignBatchUpdateItem)) : Response(OpenAPIClient::CampaignBatchWriteResponseModel)
      @conn.request(OpenAPIClient::CampaignBatchWriteResponseModel,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/campaigns".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: campaign_batch_update_item,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create campaigns Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    def create(ad_account_id : String, campaign_create_item : Array(OpenAPIClient::CampaignCreateItem)) : Response(OpenAPIClient::CampaignBatchWriteResponseModel)
      @conn.request(OpenAPIClient::CampaignBatchWriteResponseModel,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/campaigns".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: campaign_create_item,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get campaign delivery estimates Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
    def delivery_estimates(ad_account_id : String, campaign_delivery_estimates_campaign : Array(OpenAPIClient::CampaignDeliveryEstimatesCampaign)) : Response(OpenAPIClient::CampaignDeliveryEstimatesResponse)
      @conn.request(OpenAPIClient::CampaignDeliveryEstimatesResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/campaigns/delivery_estimates".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: campaign_delivery_estimates_campaign,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get campaign Get a specific campaign given the campaign ID.
    def get(campaign_id : String, ad_account_id : String) : Response(OpenAPIClient::Campaign)
      @conn.request(OpenAPIClient::Campaign,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/campaigns/{campaign_id}".sub("{campaign_id}", OpenAPIClient.enc(campaign_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List campaigns Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, campaign_ids : Array(String)? = nil, entity_statuses : Array(OpenAPIClient::EntityStatus)? = nil) : Response(OpenAPIClient::CampaignsList200Response)
      @conn.request(OpenAPIClient::CampaignsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/campaigns".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "campaign_ids" => campaign_ids, "entity_statuses" => entity_statuses },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get targeting analytics for campaigns Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def targeting_analytics(ad_account_id : String, *, campaign_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, targeting_types : Array(OpenAPIClient::AdsAnalyticsCampaignTargetingType)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, attribution_types : Array(OpenAPIClient::ConversionReportAttributionType)? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(OpenAPIClient::MetricsResponse)
      @conn.request(OpenAPIClient::MetricsResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/campaigns/targeting_analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "campaign_ids" => campaign_ids, "start_date" => start_date, "end_date" => end_date, "targeting_types" => targeting_types.try(&.map(&.to_s).join(",")), "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "attribution_types" => attribution_types.try(&.map(&.to_s).join(",")), "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
