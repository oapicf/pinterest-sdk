require "json"

module OpenAPIClient
  module Api
  class Businesses::Audiences
    def initialize(@conn : Connection); end

    # Update audience sharing from a business to ad accounts From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    def ad_accounts_shared(business_id : String, business_to_ad_account_shared_audience_update_with_required_body : OpenAPIClient::BusinessToAdAccountSharedAudienceUpdateWithRequiredBody) : Response(OpenAPIClient::BusinessToAdAccountSharedAudience)
      @conn.request(OpenAPIClient::BusinessToAdAccountSharedAudience,
        method: :PATCH,
        path: "/businesses/{business_id}/audiences/ad_accounts/shared".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: business_to_ad_account_shared_audience_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update audience sharing between businesses From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    def businesses_shared(business_id : String, business_to_business_shared_audience_update_with_required_body : OpenAPIClient::BusinessToBusinessSharedAudienceUpdateWithRequiredBody) : Response(OpenAPIClient::BusinessToBusinessSharedAudience)
      @conn.request(OpenAPIClient::BusinessToBusinessSharedAudience,
        method: :PATCH,
        path: "/businesses/{business_id}/audiences/businesses/shared".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: business_to_business_shared_audience_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List received audiences for a business Get a list of received audiences for the given business.
    def list(business_id : String, *, order : OpenAPIClient::Order? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::SharedAudiencesForBusinessList200Response)
      @conn.request(OpenAPIClient::SharedAudiencesForBusinessList200Response,
        method: :GET,
        path: "/businesses/{business_id}/audiences".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "order" => order, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List accounts with access to an audience owned by a business List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
    def shared_accounts(business_id : String, *, audience_id : String? = nil, account_type : OpenAPIClient::AudienceAccountType? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::AdAccountsAudiencesSharedAccountsList200Response)
      @conn.request(OpenAPIClient::AdAccountsAudiencesSharedAccountsList200Response,
        method: :GET,
        path: "/businesses/{business_id}/audiences/shared/accounts".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "audience_id" => audience_id, "account_type" => account_type, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
