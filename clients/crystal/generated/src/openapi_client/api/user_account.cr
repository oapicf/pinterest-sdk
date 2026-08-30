require "json"

module OpenAPIClient
  module Api
  class UserAccount
    def initialize(@conn : Connection); end

    # Get user account analytics Get analytics for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
    def analytics(*, start_date : Time? = nil, end_date : Time? = nil, from_claimed_content : String? = nil, pin_format : String? = nil, app_types : String? = nil, content_type : String? = nil, source : String? = nil, metric_types : Array(OpenAPIClient::QuerymetrictypesItems)? = nil, split_field : String? = nil, ad_account_id : String? = nil) : Response(Hash(String, OpenAPIClient::AnalyticsMetricsResponse))
      @conn.request(Hash(String, OpenAPIClient::AnalyticsMetricsResponse),
        method: :GET,
        path: "/user_account/analytics",
        query: { "start_date" => start_date, "end_date" => end_date, "from_claimed_content" => from_claimed_content, "pin_format" => pin_format, "app_types" => app_types, "content_type" => content_type, "source" => source, "metric_types" => metric_types.try(&.map(&.to_s).join(",")), "split_field" => split_field, "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get user account top pins analytics Gets analytics data about a user&#39;s top pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
    def analytics_top_pins(*, start_date : Time? = nil, end_date : Time? = nil, sort_by : OpenAPIClient::TopPinsSortBy? = nil, from_claimed_content : String? = nil, pin_format : String? = nil, app_types : String? = nil, content_type : String? = nil, source : String? = nil, metric_types : Array(OpenAPIClient::QuerymetrictypesItems)? = nil, num_of_pins : Int32? = nil, created_in_last_n_days : Float64? = nil, ad_account_id : String? = nil) : Response(OpenAPIClient::TopPinsAnalyticsResponse)
      @conn.request(OpenAPIClient::TopPinsAnalyticsResponse,
        method: :GET,
        path: "/user_account/analytics/top_pins",
        query: { "start_date" => start_date, "end_date" => end_date, "sort_by" => sort_by, "from_claimed_content" => from_claimed_content, "pin_format" => pin_format, "app_types" => app_types, "content_type" => content_type, "source" => source, "metric_types" => metric_types.try(&.map(&.to_s).join(",")), "num_of_pins" => num_of_pins, "created_in_last_n_days" => created_in_last_n_days, "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get user account top video pins analytics Gets analytics data about a user&#39;s top video pins (limited to the top 50). - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.
    def analytics_top_video_pins(*, start_date : Time? = nil, end_date : Time? = nil, sort_by : OpenAPIClient::TopVideoPinsSortBy? = nil, from_claimed_content : String? = nil, pin_format : String? = nil, app_types : String? = nil, content_type : String? = nil, source : String? = nil, metric_types : Array(OpenAPIClient::QueryvideopinmetrictypesItems)? = nil, num_of_pins : Int32? = nil, created_in_last_n_days : Float64? = nil, ad_account_id : String? = nil) : Response(OpenAPIClient::TopVideoPinsAnalyticsResponse)
      @conn.request(OpenAPIClient::TopVideoPinsAnalyticsResponse,
        method: :GET,
        path: "/user_account/analytics/top_video_pins",
        query: { "start_date" => start_date, "end_date" => end_date, "sort_by" => sort_by, "from_claimed_content" => from_claimed_content, "pin_format" => pin_format, "app_types" => app_types, "content_type" => content_type, "source" => source, "metric_types" => metric_types.try(&.map(&.to_s).join(",")), "num_of_pins" => num_of_pins, "created_in_last_n_days" => created_in_last_n_days, "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List followers Get a list of your followers.
    def followers(*, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::FollowersList200Response)
      @conn.request(OpenAPIClient::FollowersList200Response,
        method: :GET,
        path: "/user_account/followers",
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get user account Get account information for the \&quot;operation user_account\&quot; - By default, the \&quot;operation user_account\&quot; is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \&quot;Understanding Business Access\&quot; If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See [Understanding Business Access] for more information.
    def get(*, ad_account_id : String? = nil) : Response(OpenAPIClient::Account)
      @conn.request(OpenAPIClient::Account,
        method: :GET,
        path: "/user_account",
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get user websites Get user websites, claimed or not
    def websites(*, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::UserWebsitesGet200Response)
      @conn.request(OpenAPIClient::UserWebsitesGet200Response,
        method: :GET,
        path: "/user_account/websites",
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Unverify website Unverify a website verified by the signed-in user.
    def websites_delete(*, website : String? = nil) : Response(OpenAPIClient::UserWebsite)
      @conn.request(OpenAPIClient::UserWebsite,
        method: :DELETE,
        path: "/user_account/websites",
        query: { "website" => website },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Verify website Verify a website as a signed-in user.
    def websites_post(user_website_create : OpenAPIClient::UserWebsiteCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::UserWebsite)
      @conn.request(OpenAPIClient::UserWebsite,
        method: :POST,
        path: "/user_account/websites",
        body: user_website_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get user verification code for website claiming Get verification code for user to install on the website to claim it.
    def websites_verification(*, ad_account_id : String? = nil) : Response(OpenAPIClient::UserWebsiteVerification)
      @conn.request(OpenAPIClient::UserWebsiteVerification,
        method: :GET,
        path: "/user_account/websites/verification",
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
