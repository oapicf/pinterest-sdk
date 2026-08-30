require "json"

module OpenAPIClient
  module Api
  class Trends
    def initialize(@conn : Connection); end

    # Returns editorial articles for a given region   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
    def editorial_articles_list(*, region : OpenAPIClient::ProductCategoryRegion? = nil) : Response(Array(OpenAPIClient::TrendsEditorial))
      @conn.request(Array(OpenAPIClient::TrendsEditorial),
        method: :GET,
        path: "/trends/editorial_articles",
        query: { "region" => region },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get featured topics   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
    def featured_topics_list(*, interest : OpenAPIClient::InterestsEnum? = nil, region : OpenAPIClient::ProductCategoryRegion? = nil) : Response(Array(OpenAPIClient::FeaturedTrend))
      @conn.request(Array(OpenAPIClient::FeaturedTrend),
        method: :GET,
        path: "/trends/topics/featured",
        query: { "interest" => interest, "region" => region },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get product category details   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
    def product_categories_details_list(*, product_categories : Array(OpenAPIClient::ProductCategoryEnum)? = nil, region : OpenAPIClient::ProductCategoryRegion? = nil, lookback_window : OpenAPIClient::ProductCategoryDetailLookbackWindow? = nil, engagement_type : OpenAPIClient::ProductCategoriesEngagementType? = nil) : Response(Array(OpenAPIClient::ProductCategoryDetails))
      @conn.request(Array(OpenAPIClient::ProductCategoryDetails),
        method: :GET,
        path: "/trends/product_categories/details",
        query: { "product_categories" => product_categories, "region" => region, "lookback_window" => lookback_window, "engagement_type" => engagement_type },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get a list of growing Shopping Product Categories   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
    def product_categories_trending_list(*, region : OpenAPIClient::ProductCategoryRegion? = nil, verticals : Array(OpenAPIClient::VerticalProductCategory)? = nil, ages : Array(OpenAPIClient::AgeTrendsBucket)? = nil, genders : Array(OpenAPIClient::GenderBucket)? = nil, engagement_type : OpenAPIClient::ProductCategoriesEngagementType? = nil) : Response(Array(OpenAPIClient::TrendingProductCategory))
      @conn.request(Array(OpenAPIClient::TrendingProductCategory),
        method: :GET,
        path: "/trends/product_categories/trending",
        query: { "region" => region, "verticals" => verticals, "ages" => ages, "genders" => genders, "engagement_type" => engagement_type },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
