require 'json'


MyApp.add_route('GET', '/v5/trends/topics/featured', {
  "resourcePath" => "/ProductCategories",
  "summary" => "Get featured topics",
  "nickname" => "trends_featured_topics/list",
  "responseClass" => "Array<FeaturedTrend>",
  "endpoint" => "/trends/topics/featured",
  "notes" => "  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.",
  "parameters" => [
    {
      "name" => "interest",
      "description" => "Interest to filter by",
      "dataType" => "InterestsEnum",
      "allowableValues" => "[ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING]",
      "paramType" => "query",
    },
    {
      "name" => "region",
      "description" => "      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada",
      "dataType" => "ProductCategoryRegion",
      "allowableValues" => "[US, GB+IE, CA]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/trends/product_categories/details', {
  "resourcePath" => "/ProductCategories",
  "summary" => "Get product category details",
  "nickname" => "trends_product_categories_details/list",
  "responseClass" => "Array<ProductCategoryDetails>",
  "endpoint" => "/trends/product_categories/details",
  "notes" => "  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories",
  "parameters" => [
    {
      "name" => "product_categories",
      "description" => "List of product categories",
      "dataType" => "Array<ProductCategoryEnum>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "region",
      "description" => "      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada",
      "dataType" => "ProductCategoryRegion",
      "allowableValues" => "[US, GB+IE, CA]",
      "paramType" => "query",
    },
    {
      "name" => "lookback_window",
      "description" => "   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)",
      "dataType" => "ProductCategoryDetailLookbackWindow",
      "allowableValues" => "[90, 180, 365, 730]",
      "paramType" => "query",
    },
    {
      "name" => "engagement_type",
      "description" => "     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves",
      "dataType" => "ProductCategoriesEngagementType",
      "allowableValues" => "[ENGAGEMENT, OUTBOUND_CLICK, SAVE]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v5/trends/product_categories/trending', {
  "resourcePath" => "/ProductCategories",
  "summary" => "Get a list of growing Shopping Product Categories",
  "nickname" => "trends_product_categories_trending/list",
  "responseClass" => "Array<TrendingProductCategory>",
  "endpoint" => "/trends/product_categories/trending",
  "notes" => "  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.",
  "parameters" => [
    {
      "name" => "region",
      "description" => "      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada",
      "dataType" => "ProductCategoryRegion",
      "allowableValues" => "[US, GB+IE, CA]",
      "paramType" => "query",
    },
    {
      "name" => "verticals",
      "description" => "List of verticals to filter by",
      "dataType" => "Array<VerticalProductCategory>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "ages",
      "description" => "Age to filter by. If not provided, the results will be filtered by all ages.",
      "dataType" => "Array<AgeTrendsBucket>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "genders",
      "description" => "Gender to filter by, If not provided, the results will be filtered by all genders.",
      "dataType" => "Array<GenderBucket>",
      "collectionFormat" => "multi",
      "paramType" => "query",
    },
    {
      "name" => "engagement_type",
      "description" => "     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves",
      "dataType" => "ProductCategoriesEngagementType",
      "allowableValues" => "[ENGAGEMENT, OUTBOUND_CLICK, SAVE]",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

