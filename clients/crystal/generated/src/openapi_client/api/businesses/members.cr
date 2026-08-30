require "json"

module OpenAPIClient
  module Api
  class Businesses::Members
    def initialize(@conn : Connection); end

    # Get assets assigned to a member Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
    def assets(business_id : String, member_id : String, *, asset_type : String? = nil, start_index : Int32? = nil, sort_by : OpenAPIClient::AssetSortBy? = nil, sort_ascending : Bool? = nil, search_by : OpenAPIClient::AssetSearchBy? = nil, search_value : String? = nil, asset_permission_type : OpenAPIClient::AssetPermissionType? = nil, ad_account_statuses : Array(OpenAPIClient::NonDraftEntityStatus)? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BusinessMemberAssetsGetResponse)
      @conn.request(OpenAPIClient::BusinessMemberAssetsGetResponse,
        method: :GET,
        path: "/businesses/{business_id}/members/{member_id}/assets".sub("{business_id}", OpenAPIClient.enc(business_id)).sub("{member_id}", OpenAPIClient.enc(member_id)),
        query: { "asset_type" => asset_type, "start_index" => start_index, "sort_by" => sort_by, "sort_ascending" => sort_ascending, "search_by" => search_by, "search_value" => search_value, "asset_permission_type" => asset_permission_type, "ad_account_statuses" => ad_account_statuses, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Delete member access to asset Terminate multiple members&#39; access to an asset.
    def assets_access(business_id : String, business_members_asset_access_delete_body : OpenAPIClient::BusinessMembersAssetAccessDeleteBody) : Response(OpenAPIClient::DeleteMemberAccessResultsResponseArray)
      @conn.request(OpenAPIClient::DeleteMemberAccessResultsResponseArray,
        method: :DELETE,
        path: "/businesses/{business_id}/members/assets/access".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: business_members_asset_access_delete_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Assign/Update member asset permissions Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    def assets_access_patch(business_id : String, update_member_asset_access_body : OpenAPIClient::UpdateMemberAssetAccessBody) : Response(OpenAPIClient::UpdateMemberAssetsResultsResponseArray)
      @conn.request(OpenAPIClient::UpdateMemberAssetsResultsResponseArray,
        method: :PATCH,
        path: "/businesses/{business_id}/members/assets/access".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: update_member_asset_access_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Terminate business memberships Terminate memberships between the specified members and your business.
    def bulk_destroy(business_id : String, delete_business_membership_body : OpenAPIClient::DeleteBusinessMembershipBody) : Response(OpenAPIClient::DeleteBusinessMembership200Response)
      @conn.request(OpenAPIClient::DeleteBusinessMembership200Response,
        method: :DELETE,
        path: "/businesses/{business_id}/members".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: delete_business_membership_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Update member&#39;s business role Update a member&#39;s business role within the business.
    def bulk_partial_update(business_id : String, business_membership_member : Array(OpenAPIClient::BusinessMembershipMember)) : Response(OpenAPIClient::UpdateBusinessMembershipsResponse)
      @conn.request(OpenAPIClient::UpdateBusinessMembershipsResponse,
        method: :PATCH,
        path: "/businesses/{business_id}/members".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: business_membership_member,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get business members Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
    def list(business_id : String, *, fetch_system_users : Bool? = nil, assets_summary : Bool? = nil, business_roles : Array(OpenAPIClient::MemberBusinessRole)? = nil, member_ids : String? = nil, start_index : Int32? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::GetBusinessEmployers200Response)
      @conn.request(OpenAPIClient::GetBusinessEmployers200Response,
        method: :GET,
        path: "/businesses/{business_id}/members".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "fetch_system_users" => fetch_system_users, "assets_summary" => assets_summary, "business_roles" => business_roles, "member_ids" => member_ids, "start_index" => start_index, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
