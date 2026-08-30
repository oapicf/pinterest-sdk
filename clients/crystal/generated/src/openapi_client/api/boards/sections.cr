require "json"

module OpenAPIClient
  module Api
  class Boards::Sections
    def initialize(@conn : Connection); end

    # Create board section Create a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def create(board_id : String, board_section_create : OpenAPIClient::BoardSectionCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::BoardSection)
      @conn.request(OpenAPIClient::BoardSection,
        method: :POST,
        path: "/boards/{board_id}/sections".sub("{board_id}", OpenAPIClient.enc(board_id)),
        body: board_section_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete board section Delete a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def delete(board_id : String, section_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::BoardSection)
      @conn.request(OpenAPIClient::BoardSection,
        method: :DELETE,
        path: "/boards/{board_id}/sections/{section_id}".sub("{board_id}", OpenAPIClient.enc(board_id)).sub("{section_id}", OpenAPIClient.enc(section_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List board sections Get a list of all board sections from a board owned by the \&quot;operation user_account\&quot; - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def list(board_id : String, *, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardSectionsList200Response)
      @conn.request(OpenAPIClient::BoardSectionsList200Response,
        method: :GET,
        path: "/boards/{board_id}/sections".sub("{board_id}", OpenAPIClient.enc(board_id)),
        query: { "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update board section Update a board section on a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def partial_update(board_id : String, section_id : String, board_section_update_with_required_body : OpenAPIClient::BoardSectionUpdateWithRequiredBody, *, ad_account_id : String? = nil) : Response(OpenAPIClient::BoardSection)
      @conn.request(OpenAPIClient::BoardSection,
        method: :PATCH,
        path: "/boards/{board_id}/sections/{section_id}".sub("{board_id}", OpenAPIClient.enc(board_id)).sub("{section_id}", OpenAPIClient.enc(section_id)),
        body: board_section_update_with_required_body,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List Pins on board section Get a list of the Pins on a board section of a board owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.
    def pins(board_id : String, section_id : String, *, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardsListPins200Response)
      @conn.request(OpenAPIClient::BoardsListPins200Response,
        method: :GET,
        path: "/boards/{board_id}/sections/{section_id}/pins".sub("{board_id}", OpenAPIClient.enc(board_id)).sub("{section_id}", OpenAPIClient.enc(section_id)),
        query: { "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
