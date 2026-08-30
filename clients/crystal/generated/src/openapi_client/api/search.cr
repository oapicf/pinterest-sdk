require "json"

module OpenAPIClient
  module Api
  class Search
    def initialize(@conn : Connection); end

    # Search pins by a given search term **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.
    def partner_pins(*, term : String? = nil, country_code : String? = nil, bookmark : String? = nil, locale : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::SearchPartnerPins200Response)
      @conn.request(OpenAPIClient::SearchPartnerPins200Response,
        method: :GET,
        path: "/search/partner/pins",
        query: { "term" => term, "country_code" => country_code, "bookmark" => bookmark, "locale" => locale, "limit" => limit },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
