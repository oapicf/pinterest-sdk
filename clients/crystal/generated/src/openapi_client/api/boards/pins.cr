require "json"

module OpenAPIClient
  module Api
  class Boards::Pins
    def initialize(@conn : Connection); end

    # List Pins on board Get a list of the Pins on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def list(board_id : String, *, creative_types : Array(OpenAPIClient::CreativeType)? = nil, ad_account_id : String? = nil, pin_metrics : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardsListPins200Response)
      @conn.request(OpenAPIClient::BoardsListPins200Response,
        method: :GET,
        path: "/boards/{board_id}/pins".sub("{board_id}", OpenAPIClient.enc(board_id)),
        query: { "creative_types" => creative_types, "ad_account_id" => ad_account_id, "pin_metrics" => pin_metrics, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
