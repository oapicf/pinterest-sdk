require "json"

module OpenAPIClient
  module Api
  class Integrations::Commerce
    def initialize(@conn : Connection); end

    # Delete commerce integration Delete commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def del(external_business_id : String) : Response(OpenAPIClient::IntegrationMetadata)
      @conn.request(OpenAPIClient::IntegrationMetadata,
        method: :DELETE,
        path: "/integrations/commerce/{external_business_id}".sub("{external_business_id}", OpenAPIClient.enc(external_business_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get commerce integration Get commerce integration metadata associated with the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def get(external_business_id : String) : Response(OpenAPIClient::IntegrationMetadata)
      @conn.request(OpenAPIClient::IntegrationMetadata,
        method: :GET,
        path: "/integrations/commerce/{external_business_id}".sub("{external_business_id}", OpenAPIClient.enc(external_business_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update commerce integration Update commerce integration metadata for the given external business ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def patch(external_business_id : String, integration_metadata_update : OpenAPIClient::IntegrationMetadataUpdate) : Response(OpenAPIClient::IntegrationMetadata)
      @conn.request(OpenAPIClient::IntegrationMetadata,
        method: :PATCH,
        path: "/integrations/commerce/{external_business_id}".sub("{external_business_id}", OpenAPIClient.enc(external_business_id)),
        body: integration_metadata_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create commerce integration Create commerce integration metadata to link an external business ID with a Pinterest merchant &amp; ad account. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def post(integration_metadata_create : OpenAPIClient::IntegrationMetadataCreate) : Response(OpenAPIClient::IntegrationMetadata)
      @conn.request(OpenAPIClient::IntegrationMetadata,
        method: :POST,
        path: "/integrations/commerce",
        body: integration_metadata_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
