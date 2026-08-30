require "json"

module OpenAPIClient
  module Api
  class UserAccount::Businesses
    def initialize(@conn : Connection); end

    # List linked businesses Get a list of your linked business accounts.
    def list() : Response(Array(OpenAPIClient::LinkedBusiness))
      @conn.request(Array(OpenAPIClient::LinkedBusiness),
        method: :GET,
        path: "/user_account/businesses",
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
