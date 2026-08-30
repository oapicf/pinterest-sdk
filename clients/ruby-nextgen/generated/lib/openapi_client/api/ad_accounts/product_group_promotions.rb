# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::ProductGroupPromotions
      def initialize(connection)
        @connection = connection
      end

      def bulk_partial_update(ad_account_id:, product_group_promotions_update_with_required_body:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'product_group_promotions_update_with_required_body is required' if product_group_promotions_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/product_group_promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ProductGroupPromotions,
          auth: ['pinterest_oauth2'],
          body: product_group_promotions_update_with_required_body
        )
      end

      def create(ad_account_id:, product_group_promotions_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'product_group_promotions_create is required' if product_group_promotions_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/product_group_promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ProductGroupPromotions,
          auth: ['pinterest_oauth2'],
          body: product_group_promotions_create
        )
      end

      def get(ad_account_id:, product_group_promotion_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'product_group_promotion_id is required' if product_group_promotion_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{product_group_promotion_id}', ERB::Util.url_encode(product_group_promotion_id.to_s)),
          type: OpenapiClient::Models::ProductGroupPromotion,
          auth: ['pinterest_oauth2']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, product_group_promotion_ids: nil, entity_statuses: nil, ad_group_id: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/product_group_promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::ProductGroupPromotionsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'product_group_promotion_ids' => product_group_promotion_ids, 'entity_statuses' => entity_statuses, 'ad_group_id' => ad_group_id }
        )
      end
    end
  end
end
