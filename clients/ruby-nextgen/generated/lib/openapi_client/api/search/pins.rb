# frozen_string_literal: true

module OpenapiClient
  module Api
    class Search::Pins
      def initialize(connection)
        @connection = connection
      end

      def list(query:, ad_account_id: nil, bookmark: nil)
        raise ArgumentError, 'query is required' if query.nil?

        @connection.call(
          :GET,
          '/search/pins',
          type: OpenapiClient::Models::PinsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id, 'query' => query, 'bookmark' => bookmark }
        )
      end
    end
  end
end
