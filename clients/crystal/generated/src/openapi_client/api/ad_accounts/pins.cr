require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Pins
    def initialize(@conn : Connection); end

    # Get pins analytics Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
    def analytics(ad_account_id : String, *, campaign_id : String? = nil, pin_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, columns : Array(OpenAPIClient::ReportingColumnSync)? = nil, granularity : OpenAPIClient::Granularity? = nil, click_window_days : Float64? = nil, engagement_window_days : Float64? = nil, view_window_days : Float64? = nil, conversion_report_time : String? = nil) : Response(Array(OpenAPIClient::AdPinAnalytics))
      @conn.request(Array(OpenAPIClient::AdPinAnalytics),
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/pins/analytics".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "campaign_id" => campaign_id, "pin_ids" => pin_ids, "start_date" => start_date, "end_date" => end_date, "columns" => columns.try(&.map(&.to_s).join(",")), "granularity" => granularity, "click_window_days" => click_window_days, "engagement_window_days" => engagement_window_days, "view_window_days" => view_window_days, "conversion_report_time" => conversion_report_time },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
