require "json"

module OpenAPIClient
  module Api
  class Catalogs::ProductGroups
    def initialize(@conn : Connection); end

    # Create product group Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def create(catalogs_product_groups_create_request_schema : OpenAPIClient::CatalogsProductGroupsCreateRequestSchema, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsVerticalProductGroup)
      @conn.request(OpenAPIClient::CatalogsVerticalProductGroup,
        method: :POST,
        path: "/catalogs/product_groups",
        body: catalogs_product_groups_create_request_schema,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create product groups Create product group to use in Catalogs owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def create_many(catalogs_product_groups_create_many_request_items : Array(OpenAPIClient::CatalogsProductGroupsCreateManyRequestItems), *, ad_account_id : String? = nil) : Response(Array(String))
      @conn.request(Array(String),
        method: :POST,
        path: "/catalogs/product_groups/multiple",
        body: catalogs_product_groups_create_many_request_items,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete product group Delete a product group owned by the \&quot;operation user_account\&quot; from being in use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def delete(product_group_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsVerticalProductGroup)
      @conn.request(OpenAPIClient::CatalogsVerticalProductGroup,
        method: :DELETE,
        path: "/catalogs/product_groups/{product_group_id}".sub("{product_group_id}", OpenAPIClient.enc(product_group_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete product groups Delete product groups owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def delete_many(*, id : Array(Int32)? = nil, ad_account_id : String? = nil) : Response(Nil)
      @conn.request(Nil,
        method: :DELETE,
        path: "/catalogs/product_groups/multiple",
        query: { "id" => id.try(&.map(&.to_s).join(",")), "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get product group Get a single product group for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def get(product_group_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsVerticalProductGroup)
      @conn.request(OpenAPIClient::CatalogsVerticalProductGroup,
        method: :GET,
        path: "/catalogs/product_groups/{product_group_id}".sub("{product_group_id}", OpenAPIClient.enc(product_group_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List product groups Get a list of product groups for a given Catalogs Feed Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def list(*, id : Array(Int32)? = nil, feed_id : String? = nil, catalog_id : String? = nil, ad_account_id : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::CatalogsProductGroupsList200Response)
      @conn.request(OpenAPIClient::CatalogsProductGroupsList200Response,
        method: :GET,
        path: "/catalogs/product_groups",
        query: { "id" => id.try(&.map(&.to_s).join(",")), "feed_id" => feed_id, "catalog_id" => catalog_id, "ad_account_id" => ad_account_id, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get product counts Get a product counts for a given Catalogs Product Group owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def product_counts_get(product_group_id : String, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsProductGroupProductCountsVertical)
      @conn.request(OpenAPIClient::CatalogsProductGroupProductCountsVertical,
        method: :GET,
        path: "/catalogs/product_groups/{product_group_id}/product_counts".sub("{product_group_id}", OpenAPIClient.enc(product_group_id)),
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List products by product group Get a list of product pins for a given Catalogs Product Group Id owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)
    def products(product_group_id : String, *, ad_account_id : String? = nil, pin_metrics : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::CatalogsProductGroupPinsList200Response)
      @conn.request(OpenAPIClient::CatalogsProductGroupPinsList200Response,
        method: :GET,
        path: "/catalogs/product_groups/{product_group_id}/products".sub("{product_group_id}", OpenAPIClient.enc(product_group_id)),
        query: { "ad_account_id" => ad_account_id, "pin_metrics" => pin_metrics, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update single product group Update product group owned by the \&quot;operation user_account\&quot; to use in Catalogs. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \&quot;Catalog-based product groups\&quot; can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \&quot;retail feed-based\&quot; option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.
    def update(product_group_id : String, catalogs_product_groups_update_request_schema : OpenAPIClient::CatalogsProductGroupsUpdateRequestSchema, *, ad_account_id : String? = nil) : Response(OpenAPIClient::CatalogsVerticalProductGroup)
      @conn.request(OpenAPIClient::CatalogsVerticalProductGroup,
        method: :PATCH,
        path: "/catalogs/product_groups/{product_group_id}".sub("{product_group_id}", OpenAPIClient.enc(product_group_id)),
        body: catalogs_product_groups_update_request_schema,
        query: { "ad_account_id" => ad_account_id },
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
