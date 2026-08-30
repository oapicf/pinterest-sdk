require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Promotions
    def initialize(@conn : Connection); end

    # Update promotions Update multiple promotions.
    def bulk_partial_update(ad_account_id : String, promotion_batch_update : Array(OpenAPIClient::PromotionBatchUpdate)) : Response(OpenAPIClient::PromotionsResponse)
      @conn.request(OpenAPIClient::PromotionsResponse,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: promotion_batch_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create promotions Create multiple new promotions.
    def create(ad_account_id : String, promotion_create : Array(OpenAPIClient::PromotionCreate)) : Response(OpenAPIClient::PromotionsResponse)
      @conn.request(OpenAPIClient::PromotionsResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: promotion_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete promotion by id Delete a promotion within Pinterest.
    def delete(promotion_id : String, ad_account_id : String) : Response(OpenAPIClient::Promotion)
      @conn.request(OpenAPIClient::Promotion,
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".sub("{promotion_id}", OpenAPIClient.enc(promotion_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get promotion by id Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
    def get(promotion_id : String, ad_account_id : String) : Response(OpenAPIClient::Promotion)
      @conn.request(OpenAPIClient::Promotion,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/promotions/{promotion_id}".sub("{promotion_id}", OpenAPIClient.enc(promotion_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get promotions Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::PromotionsList200Response)
      @conn.request(OpenAPIClient::PromotionsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/promotions".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
