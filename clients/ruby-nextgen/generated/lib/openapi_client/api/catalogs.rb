# frozen_string_literal: true

module OpenapiClient
  module Api
    class Catalogs
      def initialize(connection)
        @connection = connection
      end

      def available_filter_values(catalog_id:, feed_id: nil, country: nil, language: nil, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?

        @connection.call(
          :GET,
          '/catalogs/available_filter_values',
          type: OpenapiClient::Models::CatalogsAvailableFilterValues,
          auth: ['pinterest_oauth2'],
          query: { 'catalog_id' => catalog_id, 'feed_id' => feed_id, 'country' => country, 'language' => language, 'ad_account_id' => ad_account_id }
        )
      end

      def create(catalog_create:, ad_account_id: nil)
        raise ArgumentError, 'catalog_create is required' if catalog_create.nil?

        @connection.call(
          :POST,
          '/catalogs',
          type: OpenapiClient::Models::Catalog,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalog_create
        )
      end

      def items(catalogs_items_request:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_items_request is required' if catalogs_items_request.nil?

        @connection.call(
          :POST,
          '/catalogs/items',
          type: OpenapiClient::Models::ItemsPost200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_items_request
        )
      end

      def items_batch(catalogs_items_batch_post_request:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_items_batch_post_request is required' if catalogs_items_batch_post_request.nil?

        @connection.call(
          :POST,
          '/catalogs/items/batch',
          type: OpenapiClient::Models::CatalogsItemsBatch,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_items_batch_post_request
        )
      end

      def items_batch_get(batch_id:, ad_account_id: nil)
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :GET,
          '/catalogs/items/batch/{batch_id}'
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::CatalogsItemsBatch,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def list(ad_account_id: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/catalogs',
          type: OpenapiClient::Models::CatalogsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def local_inventory_items/post(catalog_id:, local_inventory_items_get_create:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'local_inventory_items_get_create is required' if local_inventory_items_get_create.nil?

        @connection.call(
          :POST,
          '/catalogs/{catalog_id}/local_inventory_items/query'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: OpenapiClient::Models::LocalInventoryItemsGet,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: local_inventory_items_get_create
        )
      end

      def local_inventory_items_batch/operate(catalog_id:, local_inventory_items_batch_create:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'local_inventory_items_batch_create is required' if local_inventory_items_batch_create.nil?

        @connection.call(
          :POST,
          '/catalogs/{catalog_id}/local_inventory_items/batch'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: OpenapiClient::Models::SupplementalItemsBatchResponse,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: local_inventory_items_batch_create
        )
      end

      def local_stores/create(catalog_id:, local_store_create:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'local_store_create is required' if local_store_create.nil?

        @connection.call(
          :POST,
          '/catalogs/{catalog_id}/local_stores'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: [OpenapiClient::Models::CatalogsLocalStoresCreate200ResponseInner],
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: local_store_create
        )
      end

      def local_stores/delete(catalog_id:, ids:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'ids is required' if ids.nil?

        @connection.call(
          :DELETE,
          '/catalogs/{catalog_id}/local_stores'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: [OpenapiClient::Models::CatalogsLocalStoresDelete200ResponseInner],
          auth: ['pinterest_oauth2'],
          query: { 'ids' => ids, 'ad_account_id' => ad_account_id }
        )
      end

      def local_stores/list(catalog_id:, ids: nil, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?

        @connection.call(
          :GET,
          '/catalogs/{catalog_id}/local_stores'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: OpenapiClient::Models::CatalogsLocalStoresList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ids' => ids, 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def local_stores/update(catalog_id:, local_store_batch_update:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'local_store_batch_update is required' if local_store_batch_update.nil?

        @connection.call(
          :PATCH,
          '/catalogs/{catalog_id}/local_stores'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s)),
          type: [OpenapiClient::Models::CatalogsLocalStoresCreate200ResponseInner],
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: local_store_batch_update
        )
      end

      def products_get_by_product_group_filters(catalogs_list_products_by_filter_request:, bookmark: nil, page_size: nil, ad_account_id: nil, pin_metrics: nil)
        raise ArgumentError, 'catalogs_list_products_by_filter_request is required' if catalogs_list_products_by_filter_request.nil?

        @connection.call(
          :POST,
          '/catalogs/products/get_by_product_group_filters',
          type: OpenapiClient::Models::CatalogsProductGroupPinsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'bookmark' => bookmark, 'page_size' => page_size, 'ad_account_id' => ad_account_id, 'pin_metrics' => pin_metrics },
          body: catalogs_list_products_by_filter_request
        )
      end

      def reports(token:, ad_account_id: nil)
        raise ArgumentError, 'token is required' if token.nil?

        @connection.call(
          :GET,
          '/catalogs/reports',
          type: OpenapiClient::Models::CatalogsReport,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id, 'token' => token }
        )
      end

      def reports_post(catalogs_report_parameters:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_report_parameters is required' if catalogs_report_parameters.nil?

        @connection.call(
          :POST,
          '/catalogs/reports',
          type: OpenapiClient::Models::CatalogsCreateReportResponse,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_report_parameters
        )
      end

      def reports_stats(parameters:, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'parameters is required' if parameters.nil?

        @connection.call(
          :GET,
          '/catalogs/reports/stats',
          type: OpenapiClient::Models::ReportsStats200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id, 'parameters' => parameters, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def supplemental_items_batch/get(catalog_id:, batch_id:, ad_account_id: nil)
        raise ArgumentError, 'catalog_id is required' if catalog_id.nil?
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :GET,
          '/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}'
            .gsub('{catalog_id}', ERB::Util.url_encode(catalog_id.to_s))
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::SupplementalItemsBatchResponse,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end
    end
  end
end
