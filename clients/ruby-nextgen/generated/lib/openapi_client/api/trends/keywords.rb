# frozen_string_literal: true

module OpenapiClient
  module Api
    class Trends::Keywords
      def initialize(connection)
        @connection = connection
      end

      def top(region:, trend_type:, interests: nil, genders: nil, ages: nil, include_keywords: nil, normalize_against_group: nil, limit: nil, include_demographics: nil)
        raise ArgumentError, 'region is required' if region.nil?
        raise ArgumentError, 'trend_type is required' if trend_type.nil?

        @connection.call(
          :GET,
          '/trends/keywords/{region}/top/{trend_type}'
            .gsub('{region}', ERB::Util.url_encode(region.to_s))
            .gsub('{trend_type}', ERB::Util.url_encode(trend_type.to_s)),
          type: OpenapiClient::Models::TrendingKeywordsResponse,
          auth: ['pinterest_oauth2'],
          query: { 'interests' => interests, 'genders' => genders, 'ages' => ages, 'include_keywords' => include_keywords, 'normalize_against_group' => normalize_against_group, 'limit' => limit, 'include_demographics' => include_demographics }
        )
      end
    end
  end
end
