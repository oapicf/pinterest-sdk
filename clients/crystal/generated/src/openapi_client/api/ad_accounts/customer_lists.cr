require "json"

module OpenAPIClient
  module Api
  class AdAccounts::CustomerLists
    def initialize(@conn : Connection); end

    # Create customer lists Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
    def create(ad_account_id : String, customer_list_create : OpenAPIClient::CustomerListCreate) : Response(OpenAPIClient::CustomerList)
      @conn.request(OpenAPIClient::CustomerList,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/customer_lists".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: customer_list_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get customer list Gets a specific customer list given the customer list ID.
    def get(ad_account_id : String, customer_list_id : String) : Response(OpenAPIClient::CustomerList)
      @conn.request(OpenAPIClient::CustomerList,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{customer_list_id}", OpenAPIClient.enc(customer_list_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get customer lists Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil, exclude_nca : Bool? = nil) : Response(OpenAPIClient::CustomerListsList200Response)
      @conn.request(OpenAPIClient::CustomerListsList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/customer_lists".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order, "exclude_nca" => exclude_nca },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update customer list Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    def partial_update(ad_account_id : String, customer_list_id : String, customer_list_update_with_required_body : OpenAPIClient::CustomerListUpdateWithRequiredBody) : Response(OpenAPIClient::CustomerList)
      @conn.request(OpenAPIClient::CustomerList,
        method: :PATCH,
        path: "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{customer_list_id}", OpenAPIClient.enc(customer_list_id)),
        body: customer_list_update_with_required_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create customer list upload Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
    def uploads(ad_account_id : String, customer_list_id : String, customer_list_upload_create_request : OpenAPIClient::CustomerListUploadCreateRequest) : Response(OpenAPIClient::CustomerListUploadCreateResponse)
      @conn.request(OpenAPIClient::CustomerListUploadCreateResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{customer_list_id}", OpenAPIClient.enc(customer_list_id)),
        body: customer_list_upload_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get customer list upload Get the metadata for a given upload by its ID.
    def uploads_get(ad_account_id : String, customer_list_id : String, customer_list_upload_id : String) : Response(OpenAPIClient::CustomerListUpload)
      @conn.request(OpenAPIClient::CustomerListUpload,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{customer_list_id}", OpenAPIClient.enc(customer_list_id)).sub("{customer_list_upload_id}", OpenAPIClient.enc(customer_list_upload_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Run customer list upload Begin processing a customer list upload.
    def uploads_run(ad_account_id : String, customer_list_id : String, customer_list_upload_id : String) : Response(OpenAPIClient::CustomerListUpload)
      @conn.request(OpenAPIClient::CustomerListUpload,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{customer_list_id}", OpenAPIClient.enc(customer_list_id)).sub("{customer_list_upload_id}", OpenAPIClient.enc(customer_list_upload_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
