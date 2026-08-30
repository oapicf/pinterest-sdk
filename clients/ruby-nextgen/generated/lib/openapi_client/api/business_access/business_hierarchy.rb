# frozen_string_literal: true

module OpenapiClient
  module Api
    class BusinessAccess::BusinessHierarchy
      def initialize(connection)
        @connection = connection
      end

      def brand_accounts(business_hierarchy_id:, brand_account_create:)
        raise ArgumentError, 'business_hierarchy_id is required' if business_hierarchy_id.nil?
        raise ArgumentError, 'brand_account_create is required' if brand_account_create.nil?

        @connection.call(
          :POST,
          '/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts'
            .gsub('{business_hierarchy_id}', ERB::Util.url_encode(business_hierarchy_id.to_s)),
          type: OpenapiClient::Models::BrandAccount,
          auth: ['pinterest_oauth2'],
          body: brand_account_create
        )
      end

      def brand_accounts_patch(brand_account_id:, business_hierarchy_id:, brand_account_update:)
        raise ArgumentError, 'brand_account_id is required' if brand_account_id.nil?
        raise ArgumentError, 'business_hierarchy_id is required' if business_hierarchy_id.nil?
        raise ArgumentError, 'brand_account_update is required' if brand_account_update.nil?

        @connection.call(
          :PATCH,
          '/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}'
            .gsub('{brand_account_id}', ERB::Util.url_encode(brand_account_id.to_s))
            .gsub('{business_hierarchy_id}', ERB::Util.url_encode(business_hierarchy_id.to_s)),
          type: OpenapiClient::Models::BrandAccount,
          auth: ['pinterest_oauth2'],
          body: brand_account_update
        )
      end
    end
  end
end
