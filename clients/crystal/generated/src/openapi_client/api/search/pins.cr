require "json"

module OpenAPIClient
  module Api
  class Search::Pins
    def initialize(@conn : Connection); end

    # Search user&#39;s Pins Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    def list(*, ad_account_id : String? = nil, query : String? = nil, bookmark : String? = nil) : Response(OpenAPIClient::PinsList200Response)
      @conn.request(OpenAPIClient::PinsList200Response,
        method: :GET,
        path: "/search/pins",
        query: { "ad_account_id" => ad_account_id, "query" => query, "bookmark" => bookmark },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
