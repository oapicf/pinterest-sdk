require "json"

module OpenAPIClient
  module Api
  class UserAccount::Following
    def initialize(@conn : Connection); end

    # List following boards Get a list of the boards a user follows. The request returns a board summary object array.
    def boards(*, ad_account_id : String? = nil, explicit_following : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BoardsList200Response)
      @conn.request(OpenAPIClient::BoardsList200Response,
        method: :GET,
        path: "/user_account/following/boards",
        query: { "ad_account_id" => ad_account_id, "explicit_following" => explicit_following, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Follow user **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.
    def create(username : String, follow_user_create : OpenAPIClient::FollowUserCreate) : Response(OpenAPIClient::FollowUser)
      @conn.request(OpenAPIClient::FollowUser,
        method: :POST,
        path: "/user_account/following/{username}".sub("{username}", OpenAPIClient.enc(username)),
        body: follow_user_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List following Get a list of who a certain user follows.
    def list(*, ad_account_id : String? = nil, explicit_following : Bool? = nil, feed_type : OpenAPIClient::UserFollowingFeedType? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::FollowersList200Response)
      @conn.request(OpenAPIClient::FollowersList200Response,
        method: :GET,
        path: "/user_account/following",
        query: { "ad_account_id" => ad_account_id, "explicit_following" => explicit_following, "feed_type" => feed_type, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
