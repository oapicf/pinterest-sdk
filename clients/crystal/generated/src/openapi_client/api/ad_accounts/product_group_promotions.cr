require "json"

module OpenAPIClient
  module Api
  class AdAccounts::ProductGroupPromotions
    def initialize(@conn : Connection); end

    # Update product group promotions Update multiple existing Product Group Promotions (by product_group_id)
    def bulk_partial_update(ad_account_id : String, product_group_promotions_update_with_required_body : OpenAPIClient::ProductGroupPromotionsUpdateWithRequiredBody) : Response(OpenAPIClient::ProductGroupPromotions)
      @conn.request(OpenAPIClient::ProductGroupPromotions,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/product_group_promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: product_group_promotions_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create product group promotions Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
    def create(ad_account_id : String, product_group_promotions_create : OpenAPIClient::ProductGroupPromotionsCreate) : Response(OpenAPIClient::ProductGroupPromotions)
      @conn.request(OpenAPIClient::ProductGroupPromotions,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/product_group_promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: product_group_promotions_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get a product group promotion by id Get a product group promotion by id
    def get(ad_account_id : String, product_group_promotion_id : String) : Response(OpenAPIClient::ProductGroupPromotion)
      @conn.request(OpenAPIClient::ProductGroupPromotion,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{product_group_promotion_id}", OpenAPIClient.enc(product_group_promotion_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get product group promotions List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, product_group_promotion_ids : Array(String)? = nil, entity_statuses : Array(OpenAPIClient::EntityStatus)? = nil, ad_group_id : String? = nil) : Response(OpenAPIClient::ProductGroupPromotionsList200Response)
      @conn.request(OpenAPIClient::ProductGroupPromotionsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/product_group_promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "product_group_promotion_ids" => product_group_promotion_ids, "entity_statuses" => entity_statuses, "ad_group_id" => ad_group_id },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
