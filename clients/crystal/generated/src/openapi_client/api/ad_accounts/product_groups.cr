require "json"

module OpenAPIClient
  module Api
  class AdAccounts::ProductGroups
    def initialize(@conn : Connection); end

    # Get product group analytics Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    def analytics(ad_account_id : String, *, start_date : Time? = nil, end_date : Time? = nil, product_group_ids : Array(String)? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil, reporting_timezone : OpenAPIClient::ReportingTimeZone? = nil) : Response(Array(OpenAPIClient::ProductGroupAnalyticsItems))
      @conn.request(Array(OpenAPIClient::ProductGroupAnalyticsItems),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/product_groups/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "product_group_ids" => product_group_ids, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time, "reporting_timezone" => reporting_timezone },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
