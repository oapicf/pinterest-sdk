# frozen_string_literal: true

module OpenapiClient
  module Api
    class AdAccounts::Audiences
      def initialize(connection)
        @connection = connection
      end

      def ad_accounts_shared(ad_account_id:, ad_account_to_ad_account_shared_audience_update_with_required_body:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_account_to_ad_account_shared_audience_update_with_required_body is required' if ad_account_to_ad_account_shared_audience_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountToAdAccountSharedAudience,
          auth: ['pinterest_oauth2'],
          body: ad_account_to_ad_account_shared_audience_update_with_required_body
        )
      end

      def businesses_shared(ad_account_id:, ad_account_to_business_shared_audience_update_with_required_body:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_account_to_business_shared_audience_update_with_required_body is required' if ad_account_to_business_shared_audience_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/audiences/businesses/shared'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountToBusinessSharedAudience,
          auth: ['pinterest_oauth2'],
          body: ad_account_to_business_shared_audience_update_with_required_body
        )
      end

      def create(ad_account_id:, ad_accounts_audience_create:)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_accounts_audience_create is required' if ad_accounts_audience_create.nil?

        @connection.call(
          :POST,
          '/ad_accounts/{ad_account_id}/audiences'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountsAudience,
          auth: ['pinterest_oauth2'],
          body: ad_accounts_audience_create
        )
      end

      def get(audience_id:, ad_account_id:)
        raise ArgumentError, 'audience_id is required' if audience_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/audiences/{audience_id}'
            .gsub('{audience_id}', ERB::Util.url_encode(audience_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountsAudience,
          auth: ['pinterest_oauth2', 'client_credentials']
        )
      end

      def list(ad_account_id:, bookmark: nil, page_size: nil, order: nil, ownership_type: nil, exclude_nca: nil)
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/audiences'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AudiencesList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'order' => order, 'ownership_type' => ownership_type, 'exclude_nca' => exclude_nca }
        )
      end

      def partial_update(audience_id:, ad_account_id:, ad_accounts_audience_update:)
        raise ArgumentError, 'audience_id is required' if audience_id.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?
        raise ArgumentError, 'ad_accounts_audience_update is required' if ad_accounts_audience_update.nil?

        @connection.call(
          :PATCH,
          '/ad_accounts/{ad_account_id}/audiences/{audience_id}'
            .gsub('{audience_id}', ERB::Util.url_encode(audience_id.to_s))
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountsAudience,
          auth: ['pinterest_oauth2'],
          body: ad_accounts_audience_update
        )
      end

      def shared_accounts/list(audience_id:, account_type:, ad_account_id:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'audience_id is required' if audience_id.nil?
        raise ArgumentError, 'account_type is required' if account_type.nil?
        raise ArgumentError, 'ad_account_id is required' if ad_account_id.nil?

        @connection.call(
          :GET,
          '/ad_accounts/{ad_account_id}/audiences/shared/accounts'
            .gsub('{ad_account_id}', ERB::Util.url_encode(ad_account_id.to_s)),
          type: OpenapiClient::Models::AdAccountsAudiencesSharedAccountsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'audience_id' => audience_id, 'account_type' => account_type, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
