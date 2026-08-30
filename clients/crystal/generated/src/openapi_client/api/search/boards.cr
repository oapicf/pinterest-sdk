require "json"

module OpenAPIClient
  module Api
  class Search::Boards
    def initialize(@conn : Connection); end

    # Search user&#39;s boards Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.
    def list(*, ad_account_id : String? = nil, query : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardsList200Response)
      @conn.request(OpenAPIClient::BoardsList200Response,
        method: :GET,
        path: "/search/boards",
        query: { "ad_account_id" => ad_account_id, "query" => query, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
