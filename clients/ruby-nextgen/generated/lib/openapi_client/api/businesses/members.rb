# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses::Members
      def initialize(connection)
        @connection = connection
      end

      def assets(business_id:, member_id:, asset_type: nil, start_index: nil, sort_by: nil, sort_ascending: nil, search_by: nil, search_value: nil, asset_permission_type: nil, ad_account_statuses: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'member_id is required' if member_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/members/{member_id}/assets'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s))
            .gsub('{member_id}', ERB::Util.url_encode(member_id.to_s)),
          type: OpenapiClient::Models::BusinessMemberAssetsGetResponse,
          auth: ['pinterest_oauth2'],
          query: { 'asset_type' => asset_type, 'start_index' => start_index, 'sort_by' => sort_by, 'sort_ascending' => sort_ascending, 'search_by' => search_by, 'search_value' => search_value, 'asset_permission_type' => asset_permission_type, 'ad_account_statuses' => ad_account_statuses, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def assets_access(business_id:, business_members_asset_access_delete_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'business_members_asset_access_delete_body is required' if business_members_asset_access_delete_body.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/members/assets/access'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::DeleteMemberAccessResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: business_members_asset_access_delete_body
        )
      end

      def assets_access_patch(business_id:, update_member_asset_access_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'update_member_asset_access_body is required' if update_member_asset_access_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/members/assets/access'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::UpdateMemberAssetsResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: update_member_asset_access_body
        )
      end

      def bulk_destroy(business_id:, delete_business_membership_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'delete_business_membership_body is required' if delete_business_membership_body.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/members'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::DeleteBusinessMembership200Response,
          auth: ['pinterest_oauth2'],
          body: delete_business_membership_body
        )
      end

      def bulk_partial_update(business_id:, business_membership_member:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'business_membership_member is required' if business_membership_member.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/members'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::UpdateBusinessMembershipsResponse,
          auth: ['pinterest_oauth2'],
          body: business_membership_member
        )
      end

      def list(business_id:, fetch_system_users: nil, assets_summary: nil, business_roles: nil, member_ids: nil, start_index: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/members'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::GetBusinessEmployers200Response,
          auth: ['pinterest_oauth2'],
          query: { 'fetch_system_users' => fetch_system_users, 'assets_summary' => assets_summary, 'business_roles' => business_roles, 'member_ids' => member_ids, 'start_index' => start_index, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end
    end
  end
end
