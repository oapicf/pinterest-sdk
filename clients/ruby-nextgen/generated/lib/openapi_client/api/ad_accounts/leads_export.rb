# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::LeadsExport
      def initialize(connection)
        @connection = connection
      end

      def create(ad_account_id:, leads_exports_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'leads_exports_create is required' if leads_exports_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/leads_export'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::LeadsExports,
          auth: ['pinterest_oauth2'],
          body: leads_exports_create
        )
      end

      def get(ad_account_id:, leads_export_id:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'leads_export_id is required' if leads_export_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s))
            .gsub('{leads_export_id}', ERB::Util.url_encode(leads_export_id.to_s)),
          type: OpenapiClient::Models::LeadsExportResponseData,
          auth: ['pinterest_oauth2']
        )
      end
    end
  end
end
