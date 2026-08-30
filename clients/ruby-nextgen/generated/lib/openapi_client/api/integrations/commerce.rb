# frozen_string_literal: true

module OpenapiClient
  module Api
    class Integrations::Commerce
      def initialize(connection)
        @connection = connection
      end

      def create(integration_metadata_create:)
        raise ArgumentError, 'integration_metadata_create is required' if integration_metadata_create.nil?

        @connection.call(
          :POST,
          '/integrations/commerce',
          type: OpenapiClient::Models::IntegrationMetadata,
          auth: ['pinterest_oauth2'],
          body: integration_metadata_create
        )
      end

      def delete(external_business_id:)
        raise ArgumentError, 'external_business_id is required' if external_business_id.nil?

        @connection.call(
          :DELETE,
          '/integrations/commerce/{external_business_id}'
            .gsub('{external_business_id}', ERB::Util.url_encode(external_business_id.to_s)),
          type: OpenapiClient::Models::IntegrationMetadata,
          auth: ['pinterest_oauth2']
        )
      end

      def get(external_business_id:)
        raise ArgumentError, 'external_business_id is required' if external_business_id.nil?

        @connection.call(
          :GET,
          '/integrations/commerce/{external_business_id}'
            .gsub('{external_business_id}', ERB::Util.url_encode(external_business_id.to_s)),
          type: OpenapiClient::Models::IntegrationMetadata,
          auth: ['pinterest_oauth2']
        )
      end

      def partial_update(external_business_id:, integration_metadata_update:)
        raise ArgumentError, 'external_business_id is required' if external_business_id.nil?
        raise ArgumentError, 'integration_metadata_update is required' if integration_metadata_update.nil?

        @connection.call(
          :PATCH,
          '/integrations/commerce/{external_business_id}'
            .gsub('{external_business_id}', ERB::Util.url_encode(external_business_id.to_s)),
          type: OpenapiClient::Models::IntegrationMetadata,
          auth: ['pinterest_oauth2'],
          body: integration_metadata_update
        )
      end
    end
  end
end
