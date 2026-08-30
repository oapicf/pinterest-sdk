require "json"

module OpenAPIClient
  module Api
  class Terms
    def initialize(@conn : Connection); end

    # List related terms Get a list of terms logically related to each input term.  Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
    def related_list(*, terms : Array(String)? = nil) : Response(OpenAPIClient::RelatedTerms)
      @conn.request(OpenAPIClient::RelatedTerms,
        method: :GET,
        path: "/terms/related",
        query: { "terms" => terms },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List suggested terms Get popular search terms that begin with your input term.  Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
    def suggested_list(*, term : String? = nil, limit : Int32? = nil) : Response(Array(String))
      @conn.request(Array(String),
        method: :GET,
        path: "/terms/suggested",
        query: { "term" => term, "limit" => limit },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
