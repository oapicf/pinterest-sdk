require "json"

module OpenAPIClient
  module Api
  class Pins
    def initialize(@conn : Connection); end

    # Get multiple Pin analytics **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    def analytics(*, pin_ids : Array(String)? = nil, start_date : Time? = nil, end_date : Time? = nil, app_types : String? = nil, metric_types : Array(OpenAPIClient::MultiPinsAnalyticsMetricTypesItem)? = nil, ad_account_id : String? = nil) : Response(Hash(String, Hash(String, JSON::Any)))
      @conn.request(Hash(String, Hash(String, JSON::Any)),
        method: :GET,
        path: "/pins/analytics",
        query: { "pin_ids" => pin_ids, "start_date" => start_date, "end_date" => end_date, "app_types" => app_types, "metric_types" => metric_types.try(&.map(&.to_s).join(",")), "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get Pin analytics Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    def analytics_get(pin_id : String, *, start_date : Time? = nil, end_date : Time? = nil, app_types : String? = nil, metric_types : Array(OpenAPIClient::QuerypinanalyticsmetrictypesItems)? = nil, split_field : String? = nil, ad_account_id : String? = nil) : Response(Hash(String, OpenAPIClient::PinAnalyticsMetricsResponse))
      @conn.request(Hash(String, OpenAPIClient::PinAnalyticsMetricsResponse),
        method: :GET,
        path: "/pins/{pin_id}/analytics".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        query: { "start_date" => start_date, "end_date" => end_date, "app_types" => app_types, "metric_types" => metric_types.try(&.map(&.to_s).join(",")), "split_field" => split_field, "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Create Pin  Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
    def create(pin_create : OpenAPIClient::PinCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Pin)
      @conn.request(OpenAPIClient::Pin,
        method: :POST,
        path: "/pins",
        body: pin_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Delete Pin   Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
    def delete(pin_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Pin)
      @conn.request(OpenAPIClient::Pin,
        method: :DELETE,
        path: "/pins/{pin_id}".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get Pin   Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
    def get(pin_id : String, *, ad_account_id : String? = nil, pin_metrics : Bool? = nil) : Response(OpenAPIClient::Pin)
      @conn.request(OpenAPIClient::Pin,
        method: :GET,
        path: "/pins/{pin_id}".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        query: { "ad_account_id" => ad_account_id, "pin_metrics" => pin_metrics },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List Pins     Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
    def list(*, pin_filter : OpenAPIClient::PinFilter? = nil, pin_metrics : Bool? = nil, include_protected_pins : Bool? = nil, pin_type : OpenAPIClient::PinType? = nil, creative_types : Array(OpenAPIClient::CreativeType)? = nil, ad_account_id : String? = nil, domain : String? = nil, domains : Array(String)? = nil, include_product_tag_obj : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::PinsList200Response)
      @conn.request(OpenAPIClient::PinsList200Response,
        method: :GET,
        path: "/pins",
        query: { "pin_filter" => pin_filter, "pin_metrics" => pin_metrics, "include_protected_pins" => include_protected_pins, "pin_type" => pin_type, "creative_types" => creative_types, "ad_account_id" => ad_account_id, "domain" => domain, "domains" => domains, "include_product_tag_obj" => include_product_tag_obj, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get product tags for pin Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
    def product_tags(pin_id : String) : Response(OpenAPIClient::ProductTagsResponse)
      @conn.request(OpenAPIClient::ProductTagsResponse,
        method: :GET,
        path: "/pins/{pin_id}/product_tags".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete product tags from pin Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
    def product_tags_bulk_delete(pin_id : String, product_tags_bulk_delete_request : OpenAPIClient::ProductTagsBulkDeleteRequest) : Response(Nil)
      @conn.request(Nil,
        method: :POST,
        path: "/pins/{pin_id}/product_tags/bulk-delete".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        body: product_tags_bulk_delete_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Add product tags to pin Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
    def product_tags_post(pin_id : String, product_tags_bulk_add_request : OpenAPIClient::ProductTagsBulkAddRequest) : Response(OpenAPIClient::ProductTagsResponse)
      @conn.request(OpenAPIClient::ProductTagsResponse,
        method: :POST,
        path: "/pins/{pin_id}/product_tags".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        body: product_tags_bulk_add_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Save Pin Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
    def save(pin_id : String, pins_save_request_create : OpenAPIClient::PinsSaveRequestCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Pin)
      @conn.request(OpenAPIClient::Pin,
        method: :POST,
        path: "/pins/{pin_id}/save".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        body: pins_save_request_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update Pin Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
    def update(pin_id : String, pin_update : OpenAPIClient::PinUpdate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Pin)
      @conn.request(OpenAPIClient::Pin,
        method: :PATCH,
        path: "/pins/{pin_id}".sub("{pin_id}", OpenAPIClient.enc(pin_id)),
        body: pin_update,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
