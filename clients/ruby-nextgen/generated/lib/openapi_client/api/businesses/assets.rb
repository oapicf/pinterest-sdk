# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses::Assets
      def initialize(connection)
        @connection = connection
      end

      def list(business_id:, permissions: nil, child_asset_id: nil, asset_group_id: nil, asset_type: nil, start_index: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/assets'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::BusinessAssetsGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'permissions' => permissions, 'child_asset_id' => child_asset_id, 'asset_group_id' => asset_group_id, 'asset_type' => asset_type, 'start_index' => start_index, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def members(business_id:, asset_id:, start_index: nil, fetch_system_users: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'asset_id is required' if asset_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/assets/{asset_id}/members'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s))
            .gsub('{asset_id}', ERB::Util.url_encode(asset_id.to_s)),
          type: OpenapiClient::Models::BusinessAssetMembersGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'start_index' => start_index, 'fetch_system_users' => fetch_system_users, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def partners(business_id:, asset_id:, start_index: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'asset_id is required' if asset_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/assets/{asset_id}/partners'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s))
            .gsub('{asset_id}', ERB::Util.url_encode(asset_id.to_s)),
          type: OpenapiClient::Models::BusinessAssetMembersGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'start_index' => start_index, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
