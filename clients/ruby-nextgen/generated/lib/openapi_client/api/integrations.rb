# frozen_string_literal: true

module OpenapiClient
  module Api
    class Integrations
      def initialize(connection)
        @connection = connection
      end

      def get(id:)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :GET,
          '/integrations/{id}'
            .gsub('{id}', ERB::Util.url_encode(id.to_s)),
          type: OpenapiClient::Models::IntegrationRecord,
          auth: ['pinterest_oauth2']
        )
      end

      def list(bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/integrations',
          type: OpenapiClient::Models::IntegrationsGetList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def logs/post(integration_logs_request_create:)
        raise ArgumentError, 'integration_logs_request_create is required' if integration_logs_request_create.nil?

        @connection.call(
          :POST,
          '/integrations/logs',
          type: OpenapiClient::Models::IntegrationLogsSuccessResponse,
          auth: ['pinterest_oauth2'],
          body: integration_logs_request_create
        )
      end
    end
  end
end
