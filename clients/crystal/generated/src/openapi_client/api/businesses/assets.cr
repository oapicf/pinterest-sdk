require "json"

module OpenAPIClient
  module Api
  class Businesses::Assets
    def initialize(@conn : Connection); end

    # List business assets Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
    def list(business_id : String, *, permissions : Array(OpenAPIClient::PermissionsWithOwner)? = nil, child_asset_id : String? = nil, asset_group_id : String? = nil, asset_type : String? = nil, start_index : Int32? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BusinessAssetsGet200Response)
      @conn.request(OpenAPIClient::BusinessAssetsGet200Response,
        method: :GET,
        path: "/businesses/{business_id}/assets".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "permissions" => permissions, "child_asset_id" => child_asset_id, "asset_group_id" => asset_group_id, "asset_type" => asset_type, "start_index" => start_index, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get members with access to asset Get all the members the requesting business has granted access to on the given asset.
    def members(business_id : String, asset_id : String, *, start_index : Int32? = nil, fetch_system_users : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BusinessAssetMembersGet200Response)
      @conn.request(OpenAPIClient::BusinessAssetMembersGet200Response,
        method: :GET,
        path: "/businesses/{business_id}/assets/{asset_id}/members".sub("{business_id}", OpenAPIClient.enc(business_id)).sub("{asset_id}", OpenAPIClient.enc(asset_id)),
        query: { "start_index" => start_index, "fetch_system_users" => fetch_system_users, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get partners with access to asset Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
    def partners(business_id : String, asset_id : String, *, start_index : Int32? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BusinessAssetMembersGet200Response)
      @conn.request(OpenAPIClient::BusinessAssetMembersGet200Response,
        method: :GET,
        path: "/businesses/{business_id}/assets/{asset_id}/partners".sub("{business_id}", OpenAPIClient.enc(business_id)).sub("{asset_id}", OpenAPIClient.enc(asset_id)),
        query: { "start_index" => start_index, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
