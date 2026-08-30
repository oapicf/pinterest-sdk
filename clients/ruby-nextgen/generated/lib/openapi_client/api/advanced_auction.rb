# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdvancedAuction
      def initialize(connection)
        @connection = connection
      end

      def items_get/post(advanced_auction_items_get_request:, ad_account_id: nil)
        raise ArgumentError, 'advanced_auction_items_get_request is required' if advanced_auction_items_get_request.nil?

        @connection.call(
          :POST,
          '/advanced_auction/items/get',
          type: OpenapiClient::Models::AdvancedAuctionItems,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: advanced_auction_items_get_request
        )
      end

      def items_submit/post(advanced_auction_items_submit_request:, ad_account_id: nil)
        raise ArgumentError, 'advanced_auction_items_submit_request is required' if advanced_auction_items_submit_request.nil?

        @connection.call(
          :POST,
          '/advanced_auction/items/submit',
          type: OpenapiClient::Models::AdvancedAuctionProcessedItems,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: advanced_auction_items_submit_request
        )
      end
    end
  end
end
