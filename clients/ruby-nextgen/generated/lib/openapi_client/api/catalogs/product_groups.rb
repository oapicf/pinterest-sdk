# frozen_string_literal: true

module OpenapiClient
  module Api
    class Catalogs::ProductGroups
      def initialize(connection)
        @connection = connection
      end

      def create(catalogs_product_groups_create_request_schema:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_product_groups_create_request_schema is required' if catalogs_product_groups_create_request_schema.nil?

        @connection.call(
          :POST,
          '/catalogs/product_groups',
          type: OpenapiClient::Models::CatalogsVerticalProductGroup,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_product_groups_create_request_schema
        )
      end

      def delete(product_group_id:, ad_account_id: nil)
        raise ArgumentError, 'product_group_id is required' if product_group_id.nil?

        @connection.call(
          :DELETE,
          '/catalogs/product_groups/{product_group_id}'
            .gsub('{product_group_id}', ERB::Util.url_encode(product_group_id.to_s)),
          type: OpenapiClient::Models::CatalogsVerticalProductGroup,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def get(product_group_id:, ad_account_id: nil)
        raise ArgumentError, 'product_group_id is required' if product_group_id.nil?

        @connection.call(
          :GET,
          '/catalogs/product_groups/{product_group_id}'
            .gsub('{product_group_id}', ERB::Util.url_encode(product_group_id.to_s)),
          type: OpenapiClient::Models::CatalogsVerticalProductGroup,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def list(id: nil, feed_id: nil, catalog_id: nil, ad_account_id: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/catalogs/product_groups',
          type: OpenapiClient::Models::CatalogsProductGroupsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'id' => id, 'feed_id' => feed_id, 'catalog_id' => catalog_id, 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def multiple(catalogs_product_groups_create_many_request_items:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_product_groups_create_many_request_items is required' if catalogs_product_groups_create_many_request_items.nil?

        @connection.call(
          :POST,
          '/catalogs/product_groups/multiple',
          type: nil,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_product_groups_create_many_request_items
        )
      end

      def multiple_delete(id:, ad_account_id: nil)
        raise ArgumentError, 'id is required' if id.nil?

        @connection.call(
          :DELETE,
          '/catalogs/product_groups/multiple',
          type: nil,
          auth: ['pinterest_oauth2'],
          query: { 'id' => id, 'ad_account_id' => ad_account_id }
        )
      end

      def partial_update(product_group_id:, catalogs_product_groups_update_request_schema:, ad_account_id: nil)
        raise ArgumentError, 'product_group_id is required' if product_group_id.nil?
        raise ArgumentError, 'catalogs_product_groups_update_request_schema is required' if catalogs_product_groups_update_request_schema.nil?

        @connection.call(
          :PATCH,
          '/catalogs/product_groups/{product_group_id}'
            .gsub('{product_group_id}', ERB::Util.url_encode(product_group_id.to_s)),
          type: OpenapiClient::Models::CatalogsVerticalProductGroup,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_product_groups_update_request_schema
        )
      end

      def product_counts(product_group_id:, ad_account_id: nil)
        raise ArgumentError, 'product_group_id is required' if product_group_id.nil?

        @connection.call(
          :GET,
          '/catalogs/product_groups/{product_group_id}/product_counts'
            .gsub('{product_group_id}', ERB::Util.url_encode(product_group_id.to_s)),
          type: OpenapiClient::Models::CatalogsProductGroupProductCountsVertical,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def products(product_group_id:, ad_account_id: nil, pin_metrics: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'product_group_id is required' if product_group_id.nil?

        @connection.call(
          :GET,
          '/catalogs/product_groups/{product_group_id}/products'
            .gsub('{product_group_id}', ERB::Util.url_encode(product_group_id.to_s)),
          type: OpenapiClient::Models::CatalogsProductGroupPinsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'pin_metrics' => pin_metrics, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
