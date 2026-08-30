require "json"

module OpenAPIClient
  module Api
  class Catalogs
    def initialize(@conn : Connection); end

    # List available filter values Get the available filter attributes and values associated with a given feed or catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - &#x60;country&#x60;, &#x60;language&#x60;, and &#x60;feed_id&#x60; are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def available_filter_values(*, catalog_id : String? = nil, feed_id : String? = nil, country : OpenAPIClient::Country? = nil, language : OpenAPIClient::CatalogsLocale? = nil, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsAvailableFilterValues)
      @conn.request(OpenAPIClient::CatalogsAvailableFilterValues,
        method: :GET,
        path: "/catalogs/available_filter_values",
        query: { "catalog_id" => catalog_id, "feed_id" => feed_id, "country" => country, "language" => language, "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create catalog Create a new catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def create(catalog_create : OpenAPIClient::CatalogCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::Catalog)
      @conn.request(OpenAPIClient::Catalog,
        method: :POST,
        path: "/catalogs",
        body: catalog_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get catalogs items (POST) Get the items of the catalog owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def items(catalogs_items_request : OpenAPIClient::CatalogsItemsRequest, *, ad_account_id : String? = nil) : Response(OpenAPIClient::ItemsPost200Response)
      @conn.request(OpenAPIClient::ItemsPost200Response,
        method: :POST,
        path: "/catalogs/items",
        body: catalogs_items_request,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Operate on item batch This endpoint supports multiple operations on a set of one or more catalog items owned by the \&quot;operation user_account\&quot;. [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.
    def items_batch(catalogs_items_batch_post_request : OpenAPIClient::CatalogsItemsBatchPostRequest, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsItemsBatch)
      @conn.request(OpenAPIClient::CatalogsItemsBatch,
        method: :POST,
        path: "/catalogs/items/batch",
        body: catalogs_items_batch_post_request,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get item batch status Get a single catalogs items batch owned by the \&quot;operating user_account\&quot;. [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    def items_batch_get(batch_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsItemsBatch)
      @conn.request(OpenAPIClient::CatalogsItemsBatch,
        method: :GET,
        path: "/catalogs/items/batch/{batch_id}".sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List catalogs Fetch catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def list(*, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::CatalogsList200Response)
      @conn.request(OpenAPIClient::CatalogsList200Response,
        method: :GET,
        path: "/catalogs",
        query: { "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Operate on local inventory item batch Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def local_inventory_items_batch_operate(catalog_id : String, local_inventory_items_batch_create : OpenAPIClient::LocalInventoryItemsBatchCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::SupplementalItemsBatchResponse)
      @conn.request(OpenAPIClient::SupplementalItemsBatchResponse,
        method: :POST,
        path: "/catalogs/{catalog_id}/local_inventory_items/batch".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        body: local_inventory_items_batch_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get local inventory items (POST) Get local inventory items for a catalog owned by the \&quot;operation user_account\&quot;.  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def local_inventory_items_post(catalog_id : String, local_inventory_items_get_create : OpenAPIClient::LocalInventoryItemsGetCreate, *, ad_account_id : String? = nil) : Response(OpenAPIClient::LocalInventoryItemsGet)
      @conn.request(OpenAPIClient::LocalInventoryItemsGet,
        method: :POST,
        path: "/catalogs/{catalog_id}/local_inventory_items/query".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        body: local_inventory_items_get_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create local stores Create a local store for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def local_stores_create(catalog_id : String, local_store_create : Array(OpenAPIClient::LocalStoreCreate), *, ad_account_id : String? = nil) : Response(Array(OpenAPIClient::CatalogsLocalStoresCreate200ResponseInner))
      @conn.request(Array(OpenAPIClient::CatalogsLocalStoresCreate200ResponseInner),
        method: :POST,
        path: "/catalogs/{catalog_id}/local_stores".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        body: local_store_create,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete local stores   Delete multiple local stores for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    def local_stores_delete(catalog_id : String, *, ids : Array(String)? = nil, ad_account_id : String? = nil) : Response(Array(OpenAPIClient::CatalogsLocalStoresDelete200ResponseInner))
      @conn.request(Array(OpenAPIClient::CatalogsLocalStoresDelete200ResponseInner),
        method: :DELETE,
        path: "/catalogs/{catalog_id}/local_stores".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        query: { "ids" => ids.try(&.map(&.to_s).join(",")), "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List local stores Fetch local stores for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def local_stores_list(catalog_id : String, *, ids : Array(String)? = nil, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::CatalogsLocalStoresList200Response)
      @conn.request(OpenAPIClient::CatalogsLocalStoresList200Response,
        method: :GET,
        path: "/catalogs/{catalog_id}/local_stores".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        query: { "ids" => ids.try(&.map(&.to_s).join(",")), "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update local stores   Update a local store for a catalog owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)
    def local_stores_update(catalog_id : String, local_store_batch_update : Array(OpenAPIClient::LocalStoreBatchUpdate), *, ad_account_id : String? = nil) : Response(Array(OpenAPIClient::CatalogsLocalStoresCreate200ResponseInner))
      @conn.request(Array(OpenAPIClient::CatalogsLocalStoresCreate200ResponseInner),
        method: :PATCH,
        path: "/catalogs/{catalog_id}/local_stores".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)),
        body: local_store_batch_update,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List products by filter List products Pins owned by the \&quot;operation user_account\&quot; that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)
    def products_get_by_product_group_filters(catalogs_list_products_by_filter_request : OpenAPIClient::CatalogsListProductsByFilterRequest, *, bookmark : String? = nil, page_size : Int32? = nil, ad_account_id : String? = nil, pin_metrics : Bool? = nil) : Response(OpenAPIClient::CatalogsProductGroupPinsList200Response)
      @conn.request(OpenAPIClient::CatalogsProductGroupPinsList200Response,
        method: :POST,
        path: "/catalogs/products/get_by_product_group_filters",
        body: catalogs_list_products_by_filter_request,
        query: { "bookmark" => bookmark, "page_size" => page_size, "ad_account_id" => ad_account_id, "pin_metrics" => pin_metrics },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get catalogs report This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    def reports(*, ad_account_id : String? = nil, token : String? = nil) : Response(OpenAPIClient::CatalogsReport)
      @conn.request(OpenAPIClient::CatalogsReport,
        method: :GET,
        path: "/catalogs/reports",
        query: { "ad_account_id" => ad_account_id, "token" => token },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Build catalogs report Async request to create a report of the catalog owned by the \&quot;operation user_account\&quot;. This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
    def reports_post(catalogs_report_parameters : OpenAPIClient::CatalogsReportParameters, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsCreateReportResponse)
      @conn.request(OpenAPIClient::CatalogsCreateReportResponse,
        method: :POST,
        path: "/catalogs/reports",
        body: catalogs_report_parameters,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List report stats List aggregated numbers of issues for a catalog owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
    def reports_stats(*, ad_account_id : String? = nil, parameters : OpenAPIClient::CatalogsReportStatsParameters? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::ReportsStats200Response)
      @conn.request(OpenAPIClient::ReportsStats200Response,
        method: :GET,
        path: "/catalogs/reports/stats",
        query: { "ad_account_id" => ad_account_id, "parameters" => parameters, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get supplemental items batch status Fetch the status and results of a supplemental items batch operation. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def supplemental_items_batch_get(catalog_id : String, batch_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::SupplementalItemsBatchResponse)
      @conn.request(OpenAPIClient::SupplementalItemsBatchResponse,
        method: :GET,
        path: "/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}".sub("{catalog_id}", OpenAPIClient.enc(catalog_id)).sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
