require "json"

module OpenAPIClient
  module Api
  class Businesses::Partners
    def initialize(@conn : Connection); end

    # Delete partner access to asset Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
    def assets(business_id : String, delete_partner_asset_access_body : OpenAPIClient::DeletePartnerAssetAccessBody) : Response(OpenAPIClient::DeletePartnerAssetAccessResultsResponseArray)
      @conn.request(OpenAPIClient::DeletePartnerAssetAccessResultsResponseArray,
        method: :DELETE,
        path: "/businesses/{business_id}/partners/assets".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: delete_partner_asset_access_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get assets assigned to a partner or assets assigned by a partner Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
    def assets_get(business_id : String, partner_id : String, *, partner_type : String? = nil, asset_type : String? = nil, start_index : Int32? = nil, sort_by : OpenAPIClient::AssetSortBy? = nil, sort_ascending : Bool? = nil, search_by : OpenAPIClient::AssetSearchBy? = nil, search_value : String? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::BusinessPartnerAssetAccessGet200Response)
      @conn.request(OpenAPIClient::BusinessPartnerAssetAccessGet200Response,
        method: :GET,
        path: "/businesses/{business_id}/partners/{partner_id}/assets".sub("{business_id}", OpenAPIClient.enc(business_id)).sub("{partner_id}", OpenAPIClient.enc(partner_id)),
        query: { "partner_type" => partner_type, "asset_type" => asset_type, "start_index" => start_index, "sort_by" => sort_by, "sort_ascending" => sort_ascending, "search_by" => search_by, "search_value" => search_value, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Assign/Update partner asset permissions Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
    def assets_patch(business_id : String, update_partner_asset_access_body : OpenAPIClient::UpdatePartnerAssetAccessBody) : Response(OpenAPIClient::UpdatePartnerAssetsResultsResponseArray)
      @conn.request(OpenAPIClient::UpdatePartnerAssetsResultsResponseArray,
        method: :PATCH,
        path: "/businesses/{business_id}/partners/assets".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: update_partner_asset_access_body,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Terminate business partnerships Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
    def bulk_destroy(business_id : String, delete_business_partners_delete : OpenAPIClient::DeleteBusinessPartnersDelete) : Response(OpenAPIClient::DeleteBusinessPartners)
      @conn.request(OpenAPIClient::DeleteBusinessPartners,
        method: :DELETE,
        path: "/businesses/{business_id}/partners".sub("{business_id}", OpenAPIClient.enc(business_id)),
        body: delete_business_partners_delete,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[pinterest_oauth2])
    end

    # Get business partners Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
    def list(business_id : String, *, assets_summary : Bool? = nil, partner_type : OpenAPIClient::PartnerType? = nil, partner_ids : String? = nil, start_index : Int32? = nil, sort_ascending : Bool? = nil, bookmark : String? = nil, page_size : Int32? = nil) : Response(OpenAPIClient::GetBusinessEmployers200Response)
      @conn.request(OpenAPIClient::GetBusinessEmployers200Response,
        method: :GET,
        path: "/businesses/{business_id}/partners".sub("{business_id}", OpenAPIClient.enc(business_id)),
        query: { "assets_summary" => assets_summary, "partner_type" => partner_type, "partner_ids" => partner_ids, "start_index" => start_index, "sort_ascending" => sort_ascending, "bookmark" => bookmark, "page_size" => page_size },
        accept: %w[application/json],
        auth: %w[pinterest_oauth2])
    end
  end
  end

end
