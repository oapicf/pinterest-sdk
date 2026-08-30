require "json"

module OpenAPIClient
  module Api
  class AdAccounts::OrderLines
    def initialize(@conn : Connection); end

    # Get order line Get a specific existing order line associated with an ad account.
    def get(order_line_id : String, ad_account_id : String) : Response(OpenAPIClient::OrderLine)
      @conn.request(OpenAPIClient::OrderLine,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/order_lines/{order_line_id}".sub("{order_line_id}", OpenAPIClient.enc(order_line_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get order lines. List existing order lines associated with an ad account.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::OrderLinesList200Response)
      @conn.request(OpenAPIClient::OrderLinesList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/order_lines".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
