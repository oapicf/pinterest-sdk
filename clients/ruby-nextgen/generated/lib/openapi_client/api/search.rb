# frozen_string_literal: true

module OpenapiClient
  module Api
    class Search
      def initialize(connection)
        @connection = connection
      end

      def partner_pins(term:, country_code:, bookmark: nil, locale: nil, limit: nil)
        raise ArgumentError, 'term is required' if term.nil?
        raise ArgumentError, 'country_code is required' if country_code.nil?

        @connection.call(
          :GET,
          '/search/partner/pins',
          type: OpenapiClient::Models::SearchPartnerPins200Response,
          auth: ['pinterest_oauth2'],
          query: { 'term' => term, 'country_code' => country_code, 'bookmark' => bookmark, 'locale' => locale, 'limit' => limit }
        )
      end
    end
  end
end
