require "json"

module OpenAPIClient
  module Api
  class AdAccounts::AdGroups
    def initialize(@conn : Connection); end

    # Get ad group analytics Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def analytics(ad_account_id : String, *, start_date : Time? = nil, end_date : Time? = nil, ad_group_ids : Array(String)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, aggregate_report_rows : Bool? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(Array(OpenAPIClient::AdGroupsAnalyticsMetrics))
      @conn.request(Array(OpenAPIClient::AdGroupsAnalyticsMetrics),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "ad_group_ids" => ad_group_ids, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "aggregate_report_rows" => aggregate_report_rows, "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get audience sizing Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    def audience_sizing(ad_account_id : String, ad_group_audience_sizing_create : OpenAPIClient::AdGroupAudienceSizingCreate) : Response(OpenAPIClient::AdGroupAudienceSizing)
      @conn.request(OpenAPIClient::AdGroupAudienceSizing,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ad_groups/audience_sizing".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_group_audience_sizing_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update ad groups Update multiple existing ad groups.
    def bulk_partial_update(ad_account_id : String, ad_group_update_batch_update : Array(OpenAPIClient::AdGroupUpdateBatchUpdate)) : Response(OpenAPIClient::AdGroupsCreate200Response)
      @conn.request(OpenAPIClient::AdGroupsCreate200Response,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/ad_groups".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_group_update_batch_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create ad groups Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
    def create(ad_account_id : String, ad_group_create_create : Array(OpenAPIClient::AdGroupCreateCreate)) : Response(OpenAPIClient::AdGroupsCreate200Response)
      @conn.request(OpenAPIClient::AdGroupsCreate200Response,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ad_groups".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_group_create_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Process dynamic titles CSV Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
    def dynamic_titles(ad_account_id : String, ad_group_id : String, dynamic_titles_process_csv_create : OpenAPIClient::DynamicTitlesProcessCSVCreate) : Response(OpenAPIClient::DynamicTitlesProcessCSV)
      @conn.request(OpenAPIClient::DynamicTitlesProcessCSV,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{ad_group_id}", OpenAPIClient.enc(ad_group_id)),
        body: dynamic_titles_process_csv_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get dynamic titles CSV download URL Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
    def dynamic_titles_csv(ad_account_id : String, ad_group_id : String) : Response(OpenAPIClient::DynamicTitlesDownloadCSV)
      @conn.request(OpenAPIClient::DynamicTitlesDownloadCSV,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{ad_group_id}", OpenAPIClient.enc(ad_group_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get dynamic titles status Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
    def dynamic_titles_status(ad_account_id : String, ad_group_id : String) : Response(OpenAPIClient::DynamicTitlesGetStatus)
      @conn.request(OpenAPIClient::DynamicTitlesGetStatus,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{ad_group_id}", OpenAPIClient.enc(ad_group_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get dynamic titles upload URL Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
    def dynamic_titles_uploads(ad_account_id : String, ad_group_id : String) : Response(OpenAPIClient::DynamicTitlesUploadURL)
      @conn.request(OpenAPIClient::DynamicTitlesUploadURL,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{ad_group_id}", OpenAPIClient.enc(ad_group_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get ad group Get a specific ad group given the ad group ID.
    def get(ad_group_id : String, ad_account_id : String) : Response(OpenAPIClient::AdGroup)
      @conn.request(OpenAPIClient::AdGroup,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}".sub("{ad_group_id}", OpenAPIClient.enc(ad_group_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List ad groups List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, campaign_ids : Array(String)? = nil, ad_group_ids : Array(String)? = nil, entity_statuses : Array(OpenAPIClient::EntityStatus)? = nil, translate_interests_to_names : Bool? = nil) : Response(OpenAPIClient::AdGroupsList200Response)
      @conn.request(OpenAPIClient::AdGroupsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "campaign_ids" => campaign_ids, "ad_group_ids" => ad_group_ids, "entity_statuses" => entity_statuses, "translate_interests_to_names" => translate_interests_to_names },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get targeting analytics for ad groups Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def targeting_analytics(ad_account_id : String, *, ad_group_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, targeting_types : Array(OpenAPIClient::AdsAnalyticsAdGroupTargetingType)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, attribution_types : Array(OpenAPIClient::ConversionReportAttributionType)? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil, sort_columns : Array(String)? = nil, sort_ascending : Bool? = nil) : Response(OpenAPIClient::MetricsResponse)
      @conn.request(OpenAPIClient::MetricsResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "ad_group_ids" => ad_group_ids, "start_date" => start_date, "end_date" => end_date, "targeting_types" => targeting_types.try(&.map(&.to_s).join(",")), "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "attribution_types" => attribution_types.try(&.map(&.to_s).join(",")), "reporting_timezone" => reporting_timezone, "sort_columns" => sort_columns, "sort_ascending" => sort_ascending },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
