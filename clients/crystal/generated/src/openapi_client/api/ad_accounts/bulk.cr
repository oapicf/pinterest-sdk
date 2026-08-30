require "json"

module OpenAPIClient
  module Api
  class AdAccounts::Bulk
    def initialize(@conn : Connection); end

    # Get advertiser entities in bulk Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
    def download(ad_account_id : String, bulk_download_create : OpenAPIClient::BulkDownloadCreate) : Response(OpenAPIClient::BulkDownload)
      @conn.request(OpenAPIClient::BulkDownload,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/bulk/download".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: bulk_download_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Download advertiser entities in bulk Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
    def get(ad_account_id : String, bulk_request_id : String, *, include_details : Bool? = nil) : Response(OpenAPIClient::BulkJobData)
      @conn.request(OpenAPIClient::BulkJobData,
        method: :GET,
        path: "/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)).sub("{bulk_request_id}", OpenAPIClient.enc(bulk_request_id)),
        query: { "include_details" => include_details },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2 client_credentials])
    end

    # Create/update ad entities in bulk Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
    def upsert(ad_account_id : String, bulk_upsert_request : OpenAPIClient::BulkUpsertRequest) : Response(OpenAPIClient::BulkUpsertResponse)
      @conn.request(OpenAPIClient::BulkUpsertResponse,
        method: :POST,
        path: "/ad_accounts/{ad_account_id}/bulk/upsert".sub("{ad_account_id}", OpenAPIClient.enc(ad_account_id)),
        body: bulk_upsert_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
