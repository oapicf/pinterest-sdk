# frozen_string_literal: true

module OpenapiClient
  module Api
    class Terms
      def initialize(connection)
        @connection = connection
      end

      def related/list(terms:)
        raise ArgumentError, 'terms is required' if terms.nil?

        @connection.call(
          :GET,
          '/terms/related',
          type: OpenapiClient::Models::RelatedTerms,
          auth: ['pinterest_oauth2'],
          query: { 'terms' => terms }
        )
      end

      def suggested/list(term:, limit: nil)
        raise ArgumentError, 'term is required' if term.nil?

        @connection.call(
          :GET,
          '/terms/suggested',
          type: nil,
          auth: ['pinterest_oauth2'],
          query: { 'term' => term, 'limit' => limit }
        )
      end
    end
  end
end
