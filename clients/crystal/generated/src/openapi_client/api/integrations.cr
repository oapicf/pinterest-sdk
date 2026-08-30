require "json"

module OpenAPIClient
  module Api
  class Integrations
    def initialize(@conn : Connection); end

    # Get integration metadata Get integration metadata by ID. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def get_by_id(id : String) : Response(OpenAPIClient::IntegrationRecord)
      @conn.request(OpenAPIClient::IntegrationRecord,
        method: :GET,
        path: "/integrations/{id}".sub("{id}", OpenAPIClient.enc(id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get integration metadata list Get integration metadata list. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def get_list(*, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::IntegrationsGetList200Response)
      @conn.request(OpenAPIClient::IntegrationsGetList200Response,
        method: :GET,
        path: "/integrations",
        query: { "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Receives batched logs from integration applications. This endpoint receives batched logs from integration applications on partner platforms. Note: If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.
    def logs_post(integration_logs_request_create : OpenAPIClient::IntegrationLogsRequestCreate) : Response(OpenAPIClient::IntegrationLogsSuccessResponse)
      @conn.request(OpenAPIClient::IntegrationLogsSuccessResponse,
        method: :POST,
        path: "/integrations/logs",
        body: integration_logs_request_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
