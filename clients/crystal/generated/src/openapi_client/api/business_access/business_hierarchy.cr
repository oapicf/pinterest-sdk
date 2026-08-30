require "json"

module OpenAPIClient
  module Api
  class BusinessAccess::BusinessHierarchy
    def initialize(@conn : Connection); end

    # Create a Brand Account Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
    def brand_accounts(business_hierarchy_id : String, brand_account_create : OpenAPIClient::BrandAccountCreate) : Response(OpenAPIClient::BrandAccount)
      @conn.request(OpenAPIClient::BrandAccount,
        method: :POST,
        path: "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts".sub("{business_hierarchy_id}", OpenAPIClient.enc(business_hierarchy_id)),
        body: brand_account_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update a Brand Account Update an existing Brand Account
    def brand_accounts_patch(brand_account_id : String, business_hierarchy_id : String, brand_account_update : OpenAPIClient::BrandAccountUpdate) : Response(OpenAPIClient::BrandAccount)
      @conn.request(OpenAPIClient::BrandAccount,
        method: :PATCH,
        path: "/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}".sub("{brand_account_id}", OpenAPIClient.enc(brand_account_id)).sub("{business_hierarchy_id}", OpenAPIClient.enc(business_hierarchy_id)),
        body: brand_account_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
