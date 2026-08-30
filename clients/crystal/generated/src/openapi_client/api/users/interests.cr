require "json"

module OpenAPIClient
  module Api
  class Users::Interests
    def initialize(@conn : Connection); end

    # List following interests Get a list of a user&#39;s following interests in one place.
    def follow(username : String, *, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::UserAccountFollowedInterests200Response)
      @conn.request(OpenAPIClient::UserAccountFollowedInterests200Response,
        method: :GET,
        path: "/users/{username}/interests/follow".sub("{username}", OpenAPIClient.enc(username)),
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
