# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Bulk
      def initialize(connection)
        @connection = connection
      end

      def download(ad_account_id:, bulk_download_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'bulk_download_create is required' if bulk_download_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/bulk/download'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::BulkDownload,
          auth: ['pinterest_oauth2'],
          body: bulk_download_create
        )
      end

      def get(ad_account_id:, bulk_request_id:, include_details: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'bulk_request_id is required' if bulk_request_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{bulk_request_id}', ERB::Util.url_encode(bulk_request_id.to_s)),
          type: OpenapiClient::Models::BulkJobData,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'include_details' => include_details }
        )
      end

      def upsert(ad_account_id:, bulk_upsert_request:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'bulk_upsert_request is required' if bulk_upsert_request.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/bulk/upsert'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::BulkUpsertResponse,
          auth: ['pinterest_oauth2'],
          body: bulk_upsert_request
        )
      end
    end
  end
end
