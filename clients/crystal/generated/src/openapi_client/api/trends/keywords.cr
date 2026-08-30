require "json"

module OpenAPIClient
  module Api
  class Trends::Keywords
    def initialize(@conn : Connection); end

    # List trending keywords Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).
    def top(region : OpenAPIClient::TrendsSupportedRegion, trend_type : OpenAPIClient::TrendType, *, interests : Array(OpenAPIClient::TrendsL1Interest)? = nil, genders : Array(OpenAPIClient::TrendsGenderFilter)? = nil, ages : Array(OpenAPIClient::TrendsAgeBucket)? = nil, include_keywords : Array(String)? = nil, normalize_against_group : Bool? = nil, limit : Int32? = nil, include_demographics : Bool? = nil) : Response(OpenAPIClient::TrendingKeywordsResponse)
      @conn.request(OpenAPIClient::TrendingKeywordsResponse,
        method: :GET,
        path: "/trends/keywords/{region}/top/{trend_type}".sub("{region}", OpenAPIClient.enc(region)).sub("{trend_type}", OpenAPIClient.enc(trend_type)),
        query: { "interests" => interests, "genders" => genders, "ages" => ages, "include_keywords" => include_keywords, "normalize_against_group" => normalize_against_group, "limit" => limit, "include_demographics" => include_demographics },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
