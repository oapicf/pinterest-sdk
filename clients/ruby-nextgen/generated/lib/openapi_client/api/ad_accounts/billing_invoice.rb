# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::BillingInvoice
      def initialize(connection)
        @connection = connection
      end

      def download(ad_account_id:, billing_invoice_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'billing_invoice_id is required' if billing_invoice_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{billing_invoice_id}', ERB::Util.url_encode(billing_invoice_id.to_s)),
          type: OpenapiClient::Models::BillingInvoiceDownloadResponse,
          auth: ['pinterest_oauth2']
        )
      end
    end
  end
end
