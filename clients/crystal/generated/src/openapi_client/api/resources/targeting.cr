require "json"

module OpenAPIClient
  module Api
  class Resources::Targeting
    def initialize(@conn : Connection); end

    # Get targeting options     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
    def get(targeting_type : OpenAPIClient::PublicTargetingType, *, ad_account_id : String? = nil, client_id : String? = nil, oauth_signature : String? = nil, timestamp : String? = nil) : Response(Array(JSON::Any))
      @conn.request(Array(JSON::Any),
        method: :GET,
        path: "/resources/targeting/{targeting_type}".sub("{targeting_type}", OpenAPIClient.enc(targeting_type)),
        query: { "ad_account_id" => ad_account_id, "client_id" => client_id, "oauth_signature" => oauth_signature, "timestamp" => timestamp },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get interest details Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
    def interests(interest_id : String) : Response(OpenAPIClient::SingleInterestTargetingOption)
      @conn.request(OpenAPIClient::SingleInterestTargetingOption,
        method: :GET,
        path: "/resources/targeting/interests/{interest_id}".sub("{interest_id}", OpenAPIClient.enc(interest_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
