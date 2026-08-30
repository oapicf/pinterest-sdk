# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses::Partners
      def initialize(connection)
        @connection = connection
      end

      def assets(business_id:, delete_partner_asset_access_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'delete_partner_asset_access_body is required' if delete_partner_asset_access_body.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/partners/assets'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::DeletePartnerAssetAccessResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: delete_partner_asset_access_body
        )
      end

      def assets_get(business_id:, partner_id:, partner_type: nil, asset_type: nil, start_index: nil, sort_by: nil, sort_ascending: nil, search_by: nil, search_value: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'partner_id is required' if partner_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/partners/{partner_id}/assets'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s))
            .gsub('{partner_id}', ERB::Util.url_encode(partner_id.to_s)),
          type: OpenapiClient::Models::BusinessPartnerAssetAccessGet200Response,
          auth: ['pinterest_oauth2'],
          query: { 'partner_type' => partner_type, 'asset_type' => asset_type, 'start_index' => start_index, 'sort_by' => sort_by, 'sort_ascending' => sort_ascending, 'search_by' => search_by, 'search_value' => search_value, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def assets_patch(business_id:, update_partner_asset_access_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'update_partner_asset_access_body is required' if update_partner_asset_access_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/partners/assets'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::UpdatePartnerAssetsResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: update_partner_asset_access_body
        )
      end

      def bulk_destroy(business_id:, delete_business_partners_delete:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'delete_business_partners_delete is required' if delete_business_partners_delete.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/partners'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::DeleteBusinessPartners,
          auth: ['pinterest_oauth2'],
          body: delete_business_partners_delete
        )
      end

      def list(business_id:, assets_summary: nil, partner_type: nil, partner_ids: nil, start_index: nil, sort_ascending: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/partners'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::GetBusinessEmployers200Response,
          auth: ['pinterest_oauth2'],
          query: { 'assets_summary' => assets_summary, 'partner_type' => partner_type, 'partner_ids' => partner_ids, 'start_index' => start_index, 'sort_ascending' => sort_ascending, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
