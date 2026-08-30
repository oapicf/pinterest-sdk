# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses::Audiences
      def initialize(connection)
        @connection = connection
      end

      def ad_accounts_shared(business_id:, business_to_ad_account_shared_audience_update_with_required_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'business_to_ad_account_shared_audience_update_with_required_body is required' if business_to_ad_account_shared_audience_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/audiences/ad_accounts/shared'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::BusinessToAdAccountSharedAudience,
          auth: ['pinterest_oauth2'],
          body: business_to_ad_account_shared_audience_update_with_required_body
        )
      end

      def businesses_shared(business_id:, business_to_business_shared_audience_update_with_required_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'business_to_business_shared_audience_update_with_required_body is required' if business_to_business_shared_audience_update_with_required_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/audiences/businesses/shared'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::BusinessToBusinessSharedAudience,
          auth: ['pinterest_oauth2'],
          body: business_to_business_shared_audience_update_with_required_body
        )
      end

      def list(business_id:, order: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/audiences'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::SharedAudiencesForBusinessList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'order' => order, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def shared_accounts(business_id:, audience_id:, account_type:, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'audience_id is required' if audience_id.nil?
        raise ArgumentError, 'account_type is required' if account_type.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/audiences/shared/accounts'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::AdAccountsAudiencesSharedAccountsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'audience_id' => audience_id, 'account_type' => account_type, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
