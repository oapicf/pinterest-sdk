require "json"

module OpenAPIClient
  module Api
  class AdAccounts::BillingInvoice
    def initialize(@conn : Connection); end

    # Get download url for a billing invoice Get download url for a billing invoice.
    def download(ad_account_id : String, billing_invoice_id : String) : Response(OpenAPIClient::BillingInvoiceDownloadResponse)
      @conn.request(OpenAPIClient::BillingInvoiceDownloadResponse,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{billing_invoice_id}", OpenAPIClient.enc(billing_invoice_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
