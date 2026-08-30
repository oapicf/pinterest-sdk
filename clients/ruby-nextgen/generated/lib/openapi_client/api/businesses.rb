# frozen_string_literal: true

module OpenapiClient
  module Api
    class Businesses
      def initialize(connection)
        @connection = connection
      end

      def asset_groups(business_id:, asset_group_input_create:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'asset_group_input_create is required' if asset_group_input_create.nil?

        @connection.call(
          :POST,
          '/businesses/{business_id}/asset_groups'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::AssetGroupInput,
          auth: ['pinterest_oauth2'],
          body: asset_group_input_create
        )
      end

      def asset_groups_delete(business_id:, asset_group_deletion_delete:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'asset_group_deletion_delete is required' if asset_group_deletion_delete.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/asset_groups'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::AssetGroupDeletion,
          auth: ['pinterest_oauth2'],
          body: asset_group_deletion_delete
        )
      end

      def asset_groups_patch(business_id:, asset_group_modification_read_or_update:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'asset_group_modification_read_or_update is required' if asset_group_modification_read_or_update.nil?

        @connection.call(
          :PATCH,
          '/businesses/{business_id}/asset_groups'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::AssetGroupModification,
          auth: ['pinterest_oauth2'],
          body: asset_group_modification_read_or_update
        )
      end

      def employers(assets_summary: nil, bookmark: nil, page_size: nil)
        @connection.call(
          :GET,
          '/businesses/employers',
          type: OpenapiClient::Models::GetBusinessEmployers200Response,
          auth: ['pinterest_oauth2'],
          query: { 'assets_summary' => assets_summary, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def invites(auth_respond_invites_body:)
        raise ArgumentError, 'auth_respond_invites_body is required' if auth_respond_invites_body.nil?

        @connection.call(
          :PATCH,
          '/businesses/invites',
          type: OpenapiClient::Models::RespondToInvitesResponseArray,
          auth: ['pinterest_oauth2'],
          body: auth_respond_invites_body
        )
      end

      def invites_assets_access(business_id:, create_asset_invites_request:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'create_asset_invites_request is required' if create_asset_invites_request.nil?

        @connection.call(
          :POST,
          '/businesses/{business_id}/invites/assets/access'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::UpdateInvitesResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: create_asset_invites_request
        )
      end

      def invites_delete(business_id:, cancel_invites_request:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'cancel_invites_request is required' if cancel_invites_request.nil?

        @connection.call(
          :DELETE,
          '/businesses/{business_id}/invites'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::CancelInvitesResponse,
          auth: ['pinterest_oauth2'],
          body: cancel_invites_request
        )
      end

      def invites_get(business_id:, is_member: nil, invite_status: nil, invite_type: nil, bookmark: nil, page_size: nil)
        raise ArgumentError, 'business_id is required' if business_id.nil?

        @connection.call(
          :GET,
          '/businesses/{business_id}/invites'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::GetInvites200Response,
          auth: ['pinterest_oauth2'],
          query: { 'is_member' => is_member, 'invite_status' => invite_status, 'invite_type' => invite_type, 'bookmark' => bookmark, 'page_size' => page_size }
        )
      end

      def invites_post(business_id:, create_membership_or_partnership_invites_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'create_membership_or_partnership_invites_body is required' if create_membership_or_partnership_invites_body.nil?

        @connection.call(
          :POST,
          '/businesses/{business_id}/invites'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::CreateInvitesResultsResponseArray,
          auth: ['pinterest_oauth2'],
          body: create_membership_or_partnership_invites_body
        )
      end

      def requests_assets_access(business_id:, create_asset_access_request_body:)
        raise ArgumentError, 'business_id is required' if business_id.nil?
        raise ArgumentError, 'create_asset_access_request_body is required' if create_asset_access_request_body.nil?

        @connection.call(
          :POST,
          '/businesses/{business_id}/requests/assets/access'
            .gsub('{business_id}', ERB::Util.url_encode(business_id.to_s)),
          type: OpenapiClient::Models::CreateAssetAccessRequestResponse,
          auth: ['pinterest_oauth2'],
          body: create_asset_access_request_body
        )
      end
    end
  end
end
