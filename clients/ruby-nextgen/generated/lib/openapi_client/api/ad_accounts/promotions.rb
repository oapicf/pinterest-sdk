# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Promotions
      def initialize(connection)
        @connection = connection
      end

      def bulk_partial_update(ad_account_id:, promotion_batch_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'promotion_batch_update is required' if promotion_batch_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::PromotionsResponse,
          auth: ['pinterest_oauth2'],
          body: promotion_batch_update
        )
      end

      def create(ad_account_id:, promotion_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'promotion_create is required' if promotion_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::PromotionsResponse,
          auth: ['pinterest_oauth2'],
          body: promotion_create
        )
      end

      def delete(promotion_id:, ad_account_id:)
        raise ArgumentError, 'promotion_id is required' if promotion_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :DELETE,
          '/ad_accounts/{ad_account_id}/promotions/{promotion_id}'
            .gsub('{promotion_id}', ERB::Util.url_encode(promotion_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Promotion,
          auth: ['pinterest_oauth2']
        )
      end

      def get(promotion_id:, ad_account_id:)
        raise ArgumentError, 'promotion_id is required' if promotion_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/promotions/{promotion_id}'
            .gsub('{promotion_id}', ERB::Util.url_encode(promotion_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Promotion,
          auth: ['pinterest_oauth2']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/promotions'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::PromotionsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end
    end
  end
end
