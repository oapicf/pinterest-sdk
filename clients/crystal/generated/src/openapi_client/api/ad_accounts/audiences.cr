require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Audiences
    def initialize(@conn : Connection); end

    # Update audience sharing between ad accounts From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    def ad_accounts_shared(ad_account_id : String, ad_account_to_ad_account_shared_audience_update_with_required_body : OpenAPIClient::AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody) : Response(OpenAPIClient::AdAccountToAdAccountSharedAudience)
      @conn.request(OpenAPIClient::AdAccountToAdAccountSharedAudience,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_account_to_ad_account_shared_audience_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update audience sharing from an ad account to businesses From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
    def businesses_shared(ad_account_id : String, ad_account_to_business_shared_audience_update_with_required_body : OpenAPIClient::AdAccountToBusinessSharedAudienceUpdateWithRequiredBody) : Response(OpenAPIClient::AdAccountToBusinessSharedAudience)
      @conn.request(OpenAPIClient::AdAccountToBusinessSharedAudience,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/audiences/businesses/shared".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_account_to_business_shared_audience_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create audience Create a new audience for the ad account.
    def create(ad_account_id : String, ad_accounts_audience_create : OpenAPIClient::AdAccountsAudienceCreate) : Response(OpenAPIClient::AdAccountsAudience)
      @conn.request(OpenAPIClient::AdAccountsAudience,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/audiences".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_accounts_audience_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get audience Get a specific audience given the audience ID.
    def get(audience_id : String, ad_account_id : String) : Response(OpenAPIClient::AdAccountsAudience)
      @conn.request(OpenAPIClient::AdAccountsAudience,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/audiences/{audience_id}".sub("{audience_id}", OpenAPIClient.enc(audience_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List audiences Get list of audiences for the ad account.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, ownership_type : OpenAPIClient::AudienceOwnershipType? = nil, exclude_nca : Bool? = nil) : Response(OpenAPIClient::AudiencesList200Response)
      @conn.request(OpenAPIClient::AudiencesList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/audiences".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "ownership_type" => ownership_type, "exclude_nca" => exclude_nca },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Update audience Update an existing audience for the ad account.
    def partial_update(audience_id : String, ad_account_id : String, ad_accounts_audience_update : OpenAPIClient::AdAccountsAudienceUpdate) : Response(OpenAPIClient::AdAccountsAudience)
      @conn.request(OpenAPIClient::AdAccountsAudience,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/audiences/{audience_id}".sub("{audience_id}", OpenAPIClient.enc(audience_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: ad_accounts_audience_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List accounts with access to an audience owned by an ad account List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
    def shared_accounts_list(ad_account_id : String, *, audience_id : String? = nil, account_type : OpenAPIClient::AudienceAccountType? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::AdAccountsAudiencesSharedAccountsList200Response)
      @conn.request(OpenAPIClient::AdAccountsAudiencesSharedAccountsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/audiences/shared/accounts".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "audience_id" => audience_id, "account_type" => account_type, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
