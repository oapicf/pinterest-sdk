# frozen_string_literal: true

module OpenapiClient
  module Api
    class Pins
      def initialize(connection)
        @connection = connection
      end

      def analytics(pin_ids:, start_date:, end_date:, metric_types:, app_types: nil, ad_account_id: nil)
        raise ArgumentError, 'pin_ids is required' if pin_ids.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'metric_types is required' if metric_types.nil?

        @connection.call(
          :GET,
          '/pins/analytics',
          type: nil,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'pin_ids' => pin_ids, 'start_date' => start_date, 'end_date' => end_date, 'app_types' => app_types, 'metric_types' => metric_types, 'ad_account_id' => ad_account_id }
        )
      end

      def analytics_get(pin_id:, start_date:, end_date:, metric_types:, app_types: nil, split_field: nil, ad_account_id: nil)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?
        raise ArgumentError, 'start_date is required' if start_date.nil?
        raise ArgumentError, 'end_date is required' if end_date.nil?
        raise ArgumentError, 'metric_types is required' if metric_types.nil?

        @connection.call(
          :GET,
          '/pins/{pin_id}/analytics'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'start_date' => start_date, 'end_date' => end_date, 'app_types' => app_types, 'metric_types' => metric_types, 'split_field' => split_field, 'ad_account_id' => ad_account_id }
        )
      end

      def create(pin_create:, ad_account_id: nil)
        raise ArgumentError, 'pin_create is required' if pin_create.nil?

        @connection.call(
          :POST,
          '/pins',
          type: OpenapiClient::Models::Pin,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: pin_create
        )
      end

      def delete(pin_id:, ad_account_id: nil)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?

        @connection.call(
          :DELETE,
          '/pins/{pin_id}'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::Pin,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def get(pin_id:, ad_account_id: nil, pin_metrics: nil)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?

        @connection.call(
          :GET,
          '/pins/{pin_id}'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::Pin,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id, 'pin_metrics' => pin_metrics }
        )
      end

      def list(pin_filter: nil, pin_metrics: nil, include_protected_pins: nil, pin_type: nil, creative_types: nil, ad_account_id: nil, domain: nil, domains: nil, include_product_tag_obj: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/pins',
          type: OpenapiClient::Models::PinsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'pin_filter' => pin_filter, 'pin_metrics' => pin_metrics, 'include_protected_pins' => include_protected_pins, 'pin_type' => pin_type, 'creative_types' => creative_types, 'ad_account_id' => ad_account_id, 'domain' => domain, 'domains' => domains, 'include_product_tag_obj' => include_product_tag_obj, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def partial_update(pin_id:, pin_update:, ad_account_id: nil)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?
        raise ArgumentError, 'pin_update is required' if pin_update.nil?

        @connection.call(
          :PATCH,
          '/pins/{pin_id}'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::Pin,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: pin_update
        )
      end

      def product_tags(pin_id:)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?

        @connection.call(
          :GET,
          '/pins/{pin_id}/product_tags'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::ProductTagsResponse,
          auth: ['pinterest_oauth2']
        )
      end

      def product_tags_bulk_delete(pin_id:, product_tags_bulk_delete_request:)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?
        raise ArgumentError, 'product_tags_bulk_delete_request is required' if product_tags_bulk_delete_request.nil?

        @connection.call(
          :POST,
          '/pins/{pin_id}/product_tags/bulk-delete'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: nil,
          auth: ['pinterest_oauth2'],
          body: product_tags_bulk_delete_request
        )
      end

      def product_tags_post(pin_id:, product_tags_bulk_add_request:)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?
        raise ArgumentError, 'product_tags_bulk_add_request is required' if product_tags_bulk_add_request.nil?

        @connection.call(
          :POST,
          '/pins/{pin_id}/product_tags'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::ProductTagsResponse,
          auth: ['pinterest_oauth2'],
          body: product_tags_bulk_add_request
        )
      end

      def save(pin_id:, pins_save_request_create:, ad_account_id: nil)
        raise ArgumentError, 'pin_id is required' if pin_id.nil?
        raise ArgumentError, 'pins_save_request_create is required' if pins_save_request_create.nil?

        @connection.call(
          :POST,
          '/pins/{pin_id}/save'
            .gsub('{pin_id}', ERB::Util.url_encode(pin_id.to_s)),
          type: OpenapiClient::Models::Pin,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id },
          body: pins_save_request_create
        )
      end
    end
  end
end
