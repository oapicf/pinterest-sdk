# frozen_string_literal: true

module OpenapiClient
  module Api
    class Resources
      def initialize(connection)
        @connection = connection
      end

      def ad_account_countries
        @connection.call(
          :GET,
          '/resources/ad_account_countries',
          type: OpenapiClient::Models::AdAccountCountriesGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def delivery_metrics(report_type: nil)
        @connection.call(
          :GET,
          '/resources/delivery_metrics',
          type: OpenapiClient::Models::DeliveryMetricsGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'report_type' => report_type }
        )
      end

      def lead_form_questions
        @connection.call(
          :GET,
          '/resources/lead_form_questions',
          type: nil,
          auth: ['pinterest_oauth2']
        )
      end

      def metrics_ready_state(date:)
        raise ArgumentError, 'date is required' if date.nil?

        @connection.call(
          :GET,
          '/resources/metrics_ready_state',
          type: OpenapiClient::Models::BookClosed,
          auth: ['pinterest_oauth2'],
          query: { 'date' => date }
        )
      end
    end
  end
end
