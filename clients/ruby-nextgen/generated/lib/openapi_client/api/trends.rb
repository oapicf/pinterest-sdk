# frozen_string_literal: true

module OpenapiClient
  module Api
    class Trends
      def initialize(connection)
        @connection = connection
      end

      def editorial_articles/list(region:)
        raise ArgumentError, 'region is required' if region.nil?

        @connection.call(
          :GET,
          '/trends/editorial_articles',
          type: [OpenapiClient::Models::TrendsEditorial],
          auth: ['pinterest_oauth2'],
          query: { 'region' => region }
        )
      end

      def featured_topics/list(region:, interest: nil)
        raise ArgumentError, 'region is required' if region.nil?

        @connection.call(
          :GET,
          '/trends/topics/featured',
          type: [OpenapiClient::Models::FeaturedTrend],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'interest' => interest, 'region' => region }
        )
      end

      def product_categories_details/list(product_categories:, region:, lookback_window: nil, engagement_type: nil)
        raise ArgumentError, 'product_categories is required' if product_categories.nil?
        raise ArgumentError, 'region is required' if region.nil?

        @connection.call(
          :GET,
          '/trends/product_categories/details',
          type: [OpenapiClient::Models::ProductCategoryDetails],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'product_categories' => product_categories, 'region' => region, 'lookback_window' => lookback_window, 'engagement_type' => engagement_type }
        )
      end

      def product_categories_trending/list(region:, verticals: nil, ages: nil, genders: nil, engagement_type: nil)
        raise ArgumentError, 'region is required' if region.nil?

        @connection.call(
          :GET,
          '/trends/product_categories/trending',
          type: [OpenapiClient::Models::TrendingProductCategory],
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'region' => region, 'verticals' => verticals, 'ages' => ages, 'genders' => genders, 'engagement_type' => engagement_type }
        )
      end
    end
  end
end
