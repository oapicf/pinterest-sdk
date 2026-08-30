require "json"

module OpenAPIClient
  module Api
  class Boards
    def initialize(@conn : Connection); end

    # Create board Create a board owned by the \&quot;operation user_account\&quot;. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
    def create(board_create : OpenAPIClient::BoardCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Board)
      @conn.request(OpenAPIClient::Board,
        method: :POST,
        path: "/boards",
        body: board_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Delete board Delete a board owned by the \&quot;operation user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
    def delete(board_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Board)
      @conn.request(OpenAPIClient::Board,
        method: :DELETE,
        path: "/boards/{board_id}".sub("{board_id}", OpenAPIClient.enc(board_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get board Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
    def get(board_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Board)
      @conn.request(OpenAPIClient::Board,
        method: :GET,
        path: "/boards/{board_id}".sub("{board_id}", OpenAPIClient.enc(board_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List boards Get a list of the boards owned by the \&quot;operation user_account\&quot; + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
    def list(*, ad_account_id : String? = nil, privacy : OpenAPIClient::BoardPrivacyFilter? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardsList200Response)
      @conn.request(OpenAPIClient::BoardsList200Response,
        method: :GET,
        path: "/boards",
        query: { "ad_account_id" => ad_account_id, "privacy" => privacy, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update board Update a board owned by the \&quot;operating user_account\&quot;. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. * By default, the \&quot;operation user_account\&quot; is the token user_account.
    def update(board_id : String, board_with_update_privacy_update : OpenAPIClient::BoardWithUpdatePrivacyUpdate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::BoardWithUpdatePrivacy)
      @conn.request(OpenAPIClient::BoardWithUpdatePrivacy,
        method: :PATCH,
        path: "/boards/{board_id}".sub("{board_id}", OpenAPIClient.enc(board_id)),
        body: board_with_update_privacy_update,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
