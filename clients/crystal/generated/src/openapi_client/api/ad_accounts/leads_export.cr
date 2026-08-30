require "json"

module OpenAPIClient
  module Api
  class AdAccounts::LeadsExport
    def initialize(@conn : Connection); end

    # Create a request to export leads collected from a lead ad **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def create(ad_account_id : String, leads_exports_create : OpenAPIClient::LeadsExportsCreate) : Response(OpenAPIClient::LeadsExports)
      @conn.request(OpenAPIClient::LeadsExports,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/leads_export".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: leads_exports_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get the lead export from the lead export create call **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
    def get(ad_account_id : String, leads_export_id : String) : Response(OpenAPIClient::LeadsExportResponseData)
      @conn.request(OpenAPIClient::LeadsExportResponseData,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{leads_export_id}", OpenAPIClient.enc(leads_export_id)),
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
