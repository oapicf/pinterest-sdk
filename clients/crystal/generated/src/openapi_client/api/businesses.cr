require "json"

module OpenAPIClient
  module Api
  class Businesses
    def initialize(@conn : Connection); end

    # Create a new asset group. Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
    def asset_groups(business_id : String, asset_group_input_create : OpenAPIClient::AssetGroupInputCreate) : Response(OpenAPIClient::AssetGroupInput)
      @conn.request(OpenAPIClient::AssetGroupInput,
        method: :POST,
        path: "/businesses/{business_id}/asset_groups".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: asset_group_input_create,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete asset groups. Delete a batch of asset groups.
    def asset_groups_delete(business_id : String, asset_group_deletion_delete : OpenAPIClient::AssetGroupDeletionDelete) : Response(OpenAPIClient::AssetGroupDeletion)
      @conn.request(OpenAPIClient::AssetGroupDeletion,
        method: :DELETE,
        path: "/businesses/{business_id}/asset_groups".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: asset_group_deletion_delete,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update asset groups. Update a batch of asset groups with the specified parameters.
    def asset_groups_patch(business_id : String, asset_group_modification_read_or_update : OpenAPIClient::AssetGroupModificationReadOrUpdate) : Response(OpenAPIClient::AssetGroupModification)
      @conn.request(OpenAPIClient::AssetGroupModification,
        method: :PATCH,
        path: "/businesses/{business_id}/asset_groups".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: asset_group_modification_read_or_update,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # List business employers for user Get all of the viewing user&#39;s business employers.
    def employers(*, assets_summary : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::GetBusinessEmployers200Response)
      @conn.request(OpenAPIClient::GetBusinessEmployers200Response,
        method: :GET,
        path: "/businesses/employers",
        query: { "assets_summary" => assets_summary, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Accept or decline an invite/request Accept or decline invites or requests.
    def invites(auth_respond_invites_body : OpenAPIClient::AuthRespondInvitesBody) : Response(OpenAPIClient::RespondToInvitesResponseArray)
      @conn.request(OpenAPIClient::RespondToInvitesResponseArray,
        method: :PATCH,
        path: "/businesses/invites",
        body: auth_respond_invites_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update invite/request with an asset permission Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
    def invites_assets_access(business_id : String, create_asset_invites_request : OpenAPIClient::CreateAssetInvitesRequest) : Response(OpenAPIClient::UpdateInvitesResultsResponseArray)
      @conn.request(OpenAPIClient::UpdateInvitesResultsResponseArray,
        method: :POST,
        path: "/businesses/{business_id}/invites/assets/access".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: create_asset_invites_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Cancel invites/requests Cancel membership/partnership invites and/or requests.
    def invites_delete(business_id : String, cancel_invites_request : OpenAPIClient::CancelInvitesRequest) : Response(OpenAPIClient::CancelInvitesResponse)
      @conn.request(OpenAPIClient::CancelInvitesResponse,
        method: :DELETE,
        path: "/businesses/{business_id}/invites".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: cancel_invites_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get invites/requests Get the membership/partnership invites and/or requests for the authorized user.
    def invites_get(business_id : String, *, is_member : Bool? = nil, invite_status : Array(OpenAPIClient::InviteFilterStatus)? = nil, invite_type : OpenAPIClient::InviteType? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::GetInvites200Response)
      @conn.request(OpenAPIClient::GetInvites200Response,
        method: :GET,
        path: "/businesses/{business_id}/invites".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "is_member" => is_member, "invite_status" => invite_status, "invite_type" => invite_type, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create invites or requests Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
    def invites_post(business_id : String, create_membership_or_partnership_invites_body : OpenAPIClient::CreateMembershipOrPartnershipInvitesBody) : Response(OpenAPIClient::CreateInvitesResultsResponseArray)
      @conn.request(OpenAPIClient::CreateInvitesResultsResponseArray,
        method: :POST,
        path: "/businesses/{business_id}/invites".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: create_membership_or_partnership_invites_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Create a request to access an existing partner&#39;s assets. Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
    def requests_assets_access(business_id : String, create_asset_access_request_body : OpenAPIClient::CreateAssetAccessRequestBody) : Response(OpenAPIClient::CreateAssetAccessRequestResponse)
      @conn.request(OpenAPIClient::CreateAssetAccessRequestResponse,
        method: :POST,
        path: "/businesses/{business_id}/requests/assets/access".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: create_asset_access_request_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
