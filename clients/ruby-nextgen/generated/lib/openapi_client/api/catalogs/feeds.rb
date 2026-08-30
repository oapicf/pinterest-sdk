# frozen_string_literal: true

module OpenapiClient
  module Api
    class Catalogs::Feeds
      def initialize(connection)
        @connection = connection
      end

      def create(catalogs_feed_create_request_schema:, ad_account_id: nil)
        raise ArgumentError, 'catalogs_feed_create_request_schema is required' if catalogs_feed_create_request_schema.nil?

        @connection.call(
          :POST,
          '/catalogs/feeds',
          type: OpenapiClient::Models::CatalogsFeed,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_feed_create_request_schema
        )
      end

      def delete(feed_id:, ad_account_id: nil)
        raise ArgumentError, 'feed_id is required' if feed_id.nil?

        @connection.call(
          :DELETE,
          '/catalogs/feeds/{feed_id}'
            .gsub('{feed_id}', ERB::Util.url_encode(feed_id.to_s)),
          type: OpenapiClient::Models::CatalogsFeed,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def get(feed_id:, ad_account_id: nil)
        raise ArgumentError, 'feed_id is required' if feed_id.nil?

        @connection.call(
          :GET,
          '/catalogs/feeds/{feed_id}'
            .gsub('{feed_id}', ERB::Util.url_encode(feed_id.to_s)),
          type: OpenapiClient::Models::CatalogsFeed,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def ingest(feed_id:, ad_account_id: nil)
        raise ArgumentError, 'feed_id is required' if feed_id.nil?

        @connection.call(
          :POST,
          '/catalogs/feeds/{feed_id}/ingest'
            .gsub('{feed_id}', ERB::Util.url_encode(feed_id.to_s)),
          type: OpenapiClient::Models::CatalogsFeedIngestion,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id }
        )
      end

      def list(catalog_id: nil, ad_account_id: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/catalogs/feeds',
          type: OpenapiClient::Models::FeedsList200Response,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'catalog_id' => catalog_id, 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def partial_update(feed_id:, catalogs_feed_update_request_schema:, ad_account_id: nil)
        raise ArgumentError, 'feed_id is required' if feed_id.nil?
        raise ArgumentError, 'catalogs_feed_update_request_schema is required' if catalogs_feed_update_request_schema.nil?

        @connection.call(
          :PATCH,
          '/catalogs/feeds/{feed_id}'
            .gsub('{feed_id}', ERB::Util.url_encode(feed_id.to_s)),
          type: OpenapiClient::Models::CatalogsFeed,
          auth: ['pinterest_oauth2', 'client_credentials'],
          query: { 'ad_account_id' => ad_account_id },
          body: catalogs_feed_update_request_schema
        )
      end

      def processing_results(feed_id:, ad_account_id: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'feed_id is required' if feed_id.nil?

        @connection.call(
          :GET,
          '/catalogs/feeds/{feed_id}/processing_results'
            .gsub('{feed_id}', ERB::Util.url_encode(feed_id.to_s)),
          type: OpenapiClient::Models::FeedProcessingResultsList200Response,
          auth: ['pinterest_oauth2'],
          query: { 'ad_account_id' => ad_account_id, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
