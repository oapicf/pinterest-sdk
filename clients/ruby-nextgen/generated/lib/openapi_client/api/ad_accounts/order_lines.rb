# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::OrderLines
      def initialize(connection)
        @connection = connection
      end

      def get(order_line_id:, ad_account_id:)
        raise ArgumentError, 'order_line_id is required' if order_line_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/order_lines/{order_line_id}'
            .gsub('{order_line_id}', ERB::Util.url_encode(order_line_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::OrderLine,
          auth: ['pinterest_oauth2']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/order_lines'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::OrderLinesList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order }
        )
      end
    end
  end
end
