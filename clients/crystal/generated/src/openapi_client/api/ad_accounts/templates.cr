require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Templates
    def initialize(@conn : Connection); end

    # List templates Gets all Templates associated with an ad account ID.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::TemplatesList200Response)
      @conn.request(OpenAPIClient::TemplatesList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/templates".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create async request for an analytics report using a template   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
    def reports(ad_account_id : String, template_id : String, *, start_date : Time? = nil, end_date : Time? = nil, granularity : OpenAPIClient::Granularity? = nil) : Response(OpenAPIClient::TemplateBasedReport)
      @conn.request(OpenAPIClient::TemplateBasedReport,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/templates/{template_id}/reports".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{template_id}", OpenAPIClient.enc(template_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "granularity" => granularity },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
