require "json"

module OpenAPIClient
  module Api
  class AdAccounts::ConversionDeletionRequests
    def initialize(@conn : Connection); end

    # Create a conversion deletion request **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
    def create(ad_account_id : String, conversion_deletion_request_create : OpenAPIClient::ConversionDeletionRequestCreate) : Response(OpenAPIClient::ConversionDeletionRequest)
      @conn.request(OpenAPIClient::ConversionDeletionRequest,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/conversion_deletion_requests".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: conversion_deletion_request_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Delete a conversion deletion request **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
    def delete(request_id : String, ad_account_id : String) : Response(OpenAPIClient::ConversionDeletionRequest)
      @conn.request(OpenAPIClient::ConversionDeletionRequest,
        method: :DELETE,
        path: "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".sub("{request_id}", OpenAPIClient.enc(request_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Get a single conversion deletion request **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
    def get(request_id : String, ad_account_id : String) : Response(OpenAPIClient::ConversionDeletionRequest)
      @conn.request(OpenAPIClient::ConversionDeletionRequest,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}".sub("{request_id}", OpenAPIClient.enc(request_id)).sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # List conversion deletion requests **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
    def list(ad_account_id : String, *, bookmark : String? = nil, page_size : Int32? = nil, order : OpenAPIClient::PinterestLibPaginationOrder? = nil) : Response(OpenAPIClient::ConversionDeletionRequestList200Response)
      @conn.request(OpenAPIClient::ConversionDeletionRequestList200Response,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/conversion_deletion_requests".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        query: { "bookmark" => bookmark, "page_size" => page_size, "order" => order },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end
  end
  end

end
