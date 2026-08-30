# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Keywords
      def initialize(connection)
        @connection = connection
      end

      def bulk_partial_update(ad_account_id:, keywords_update:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'keywords_update is required' if keywords_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/keywords'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Keywords,
          auth: ['pinterest_oauth2'],
          body: keywords_update
        )
      end

      def create(ad_account_id:, keywords_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'keywords_create is required' if keywords_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/keywords'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::Keywords,
          auth: ['pinterest_oauth2'],
          body: keywords_create
        )
      end

      def list(ad_account_id:, campaign_id: nil, ad_group_id: nil, ad_group_ids: nil, match_types: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/keywords'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::KeywordsGet200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'campaign_id' => campaign_id, 'ad_group_id' => ad_group_id, 'ad_group_ids' => ad_group_ids, 'match_types' => match_types, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def metrics(ad_account_id:, country_code:, keywords:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'country_code is required' if country_code.nil?
        raise ArgumentError, 'keywords is required' if keywords.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/keywords/metrics'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::KeywordsMetricsArrayResponse,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'country_code' => country_code, 'keywords' => keywords }
        )
      end
    end
  end
end
