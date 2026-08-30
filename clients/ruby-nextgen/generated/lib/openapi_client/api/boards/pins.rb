# frozen_string_literal: true

module OpenapiClient
  module Api
    class Boards::Pins
      def initialize(connection)
        @connection = connection
      end

      def list(board_id:, creative_types: nil, ad_account_id: nil, pin_metrics: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'board_id is required' if board_id.nil?

        @connection.call(
          :GET,
          '/boards/{board_id}/pins'
            .gsub('{board_id}', ERB::Util.url_encode(board_id.to_s)),
          type: OpenapiClient::Models::BoardsListPins200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'creative_types' => creative_types, 'ad_account_id' => ad_account_id, 'pin_metrics' => pin_metrics, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
