# frozen_string_literal: true

module OpenapiClient
  module Api
    class Search::Boards
      def initialize(connection)
        @connection = connection
      end

      def list(ad_account_id: nil, query: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/search/boards',
          type: OpenapiClient::Models::BoardsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'query' => query, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
