# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Templates
      def initialize(connection)
        @connection = connection
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/templates'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::TemplatesList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end

      def reports(ad_account_id:, template_id:, start_date: nil, end_date: nil, granularity: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'template_id is required' if template_id.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/templates/{template_id}/reports'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{template_id}', ERB::Util.url_encode(template_id.to_s)),
          type: OpenapiClient::Models::TemplateBasedReport,
          auth: ['pinterest_oauth2'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'granularity' => granularity }
        )
      end
    end
  end
end
