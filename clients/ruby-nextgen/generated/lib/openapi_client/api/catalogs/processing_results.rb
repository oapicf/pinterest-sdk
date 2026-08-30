# frozen_string_literal: true

module OpenapiClient
  module Api
    class Catalogs::ProcessingResults
      def initialize(connection)
        @connection = connection
      end

      def item_issues(processing_result_id:, item_numbers: nil, item_validation_issue: nil, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'processing_result_id is required' if processing_result_id.nil?

        @connection.call(
          :GET,
          '/catalogs/processing_results/{processing_result_id}/item_issues'
            .gsub('{processing_result_id}', ERB::Util.url_encode(processing_result_id.to_s)),
          type: OpenapiClient::Models::ItemsIssuesList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'item_numbers' => item_numbers, 'item_validation_issue' => item_validation_issue, 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
