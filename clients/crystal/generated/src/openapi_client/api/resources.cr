require "json"

module OpenAPIClient
  module Api
  class Resources
    def initialize(@conn : Connection); end

    # Get ad accounts countries Get Ad Accounts countries
    def ad_account_countries() : Response(OpenAPIClient::AdAccountCountriesGet200Response)
      @conn.request(OpenAPIClient::AdAccountCountriesGet200Response,
        method: :GET,
        path: "/resources/ad_account_countries",
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get available metrics&#39; definitions Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
    def delivery_metrics(*, report_type : OpenAPIClient::ReportType? = nil) : Response(OpenAPIClient::DeliveryMetricsGet200Response)
      @conn.request(OpenAPIClient::DeliveryMetricsGet200Response,
        method: :GET,
        path: "/resources/delivery_metrics",
        query: { "report_type" => report_type },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get lead form questions Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    def lead_form_questions() : Response(Nil)
      @conn.request(Nil,
        method: :GET,
        path: "/resources/lead_form_questions",
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get metrics ready state Learn whether conversion or non-conversion metrics are finalized and ready to query.
    def metrics_ready_state(*, date : String? = nil) : Response(OpenAPIClient::BookClosed)
      @conn.request(OpenAPIClient::BookClosed,
        method: :GET,
        path: "/resources/metrics_ready_state",
        query: { "date" => date },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
