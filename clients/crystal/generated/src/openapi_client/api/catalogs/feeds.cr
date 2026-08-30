require "json"

module OpenAPIClient
  module Api
  class Catalogs::Feeds
    def initialize(@conn : Connection); end

    # Create feed Create a new feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Please, be aware that \&quot;default_country\&quot; and \&quot;default_locale\&quot; are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def create(catalogs_feed_create_request_schema : OpenAPIClient::CatalogsFeedCreateRequestSchema, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsFeed)
      @conn.request(OpenAPIClient::CatalogsFeed,
        method: :POST,
        path: "/catalogs/feeds",
        body: catalogs_feed_create_request_schema,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Delete feed Delete a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
    def delete(feed_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsFeed)
      @conn.request(OpenAPIClient::CatalogsFeed,
        method: :DELETE,
        path: "/catalogs/feeds/{feed_id}".sub("{feed_id}", OpenAPIClient.enc(feed_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get feed Get a single feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
    def get(feed_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsFeed)
      @conn.request(OpenAPIClient::CatalogsFeed,
        method: :GET,
        path: "/catalogs/feeds/{feed_id}".sub("{feed_id}", OpenAPIClient.enc(feed_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Ingest feed items Ingest items for a given feed owned by the \&quot;operation user_account\&quot;.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def ingest(feed_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsFeedIngestion)
      @conn.request(OpenAPIClient::CatalogsFeedIngestion,
        method: :POST,
        path: "/catalogs/feeds/{feed_id}/ingest".sub("{feed_id}", OpenAPIClient.enc(feed_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List feeds Fetch feeds owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).
    def list(*, catalog_id : String? = nil, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::FeedsList200Response)
      @conn.request(OpenAPIClient::FeedsList200Response,
        method: :GET,
        path: "/catalogs/feeds",
        query: { "catalog_id" => catalog_id, "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update feed Update a feed owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def partial_update(feed_id : String, catalogs_feed_update_request_schema : OpenAPIClient::CatalogsFeedUpdateRequestSchema, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsFeed)
      @conn.request(OpenAPIClient::CatalogsFeed,
        method: :PATCH,
        path: "/catalogs/feeds/{feed_id}".sub("{feed_id}", OpenAPIClient.enc(feed_id)),
        body: catalogs_feed_update_request_schema,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List feed processing results Fetch a feed processing results owned by the \&quot;operation user_account\&quot;. Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def processing_results(feed_id : String, *, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::FeedProcessingResultsList200Response)
      @conn.request(OpenAPIClient::FeedProcessingResultsList200Response,
        method: :GET,
        path: "/catalogs/feeds/{feed_id}/processing_results".sub("{feed_id}", OpenAPIClient.enc(feed_id)),
        query: { "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
