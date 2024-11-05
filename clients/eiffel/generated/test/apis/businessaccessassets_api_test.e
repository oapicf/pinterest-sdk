note
    description: "API tests for BUSINESSACCESSASSETS_API"
    date: "$Date$"
    revision: "$Revision$"


class BUSINESSACCESSASSETS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_asset_group_create
            -- Create a new asset group.
            --
            -- Create a new asset group with the specified parameters. - An &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/asset-groups\&quot;&gt;asset group&lt;/a&gt; is a custom group of assets based on how you’d like to manage your accounts.
        local
            l_response: CREATE_ASSET_GROUP_RESPONSE
            l_business_id: STRING_32
            l_create_asset_group_body: CREATE_ASSET_GROUP_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_asset_group_body

            -- l_response := api.asset_group_create(l_business_id, l_create_asset_group_body)
            assert ("not_implemented", False)
        end

    test_asset_group_delete
            -- Delete asset groups.
            --
            -- Delete a batch of asset groups.
        local
            l_response: DELETE_ASSET_GROUP_RESPONSE
            l_business_id: STRING_32
            l_delete_asset_group_body: DELETE_ASSET_GROUP_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_asset_group_body

            -- l_response := api.asset_group_delete(l_business_id, l_delete_asset_group_body)
            assert ("not_implemented", False)
        end

    test_asset_group_update
            -- Update asset groups.
            --
            -- Update a batch of asset groups with the specified parameters.
        local
            l_response: UPDATE_ASSET_GROUP_RESPONSE
            l_business_id: STRING_32
            l_update_asset_group_body: UPDATE_ASSET_GROUP_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_asset_group_body

            -- l_response := api.asset_group_update(l_business_id, l_update_asset_group_body)
            assert ("not_implemented", False)
        end

    test_business_asset_members_get
            -- Get members with access to asset
            --
            -- Get all the members the requesting business has granted access to on the given asset.
        local
            l_response: BUSINESS_ASSET_MEMBERS_GET_200_RESPONSE
            l_business_id: STRING_32
            l_asset_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_start_index: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_asset_id

            -- l_response := api.business_asset_members_get(l_business_id, l_asset_id, l_bookmark, l_page_size, l_start_index)
            assert ("not_implemented", False)
        end

    test_business_asset_partners_get
            -- Get partners with access to asset
            --
            -- Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
        local
            l_response: BUSINESS_ASSET_PARTNERS_GET_200_RESPONSE
            l_business_id: STRING_32
            l_asset_id: STRING_32
            l_start_index: INTEGER_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_asset_id

            -- l_response := api.business_asset_partners_get(l_business_id, l_asset_id, l_start_index, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_assets_get
            -- List business assets
            --
            -- Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
        local
            l_response: BUSINESS_ASSETS_GET_200_RESPONSE
            l_business_id: STRING_32
            l_permissions: LIST [PERMISSIONS_WITH_OWNER]
            l_child_asset_id: STRING_32
            l_asset_group_id: STRING_32
            l_asset_type: STRING_32
            l_start_index: INTEGER_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_assets_get(l_business_id, l_permissions, l_child_asset_id, l_asset_group_id, l_asset_type, l_start_index, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_member_assets_get
            -- Get assets assigned to a member
            --
            -- Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
        local
            l_response: BUSINESS_MEMBER_ASSETS_GET_200_RESPONSE
            l_business_id: STRING_32
            l_member_id: STRING_32
            l_asset_type: STRING_32
            l_start_index: INTEGER_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_member_id

            -- l_response := api.business_member_assets_get(l_business_id, l_member_id, l_asset_type, l_start_index, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_members_asset_access_delete
            -- Delete member access to asset
            --
            -- Terminate multiple members&#39; access to an asset.
        local
            l_response: DELETE_MEMBER_ACCESS_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_business_members_asset_access_delete_request: BUSINESS_MEMBERS_ASSET_ACCESS_DELETE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_business_members_asset_access_delete_request

            -- l_response := api.business_members_asset_access_delete(l_business_id, l_business_members_asset_access_delete_request)
            assert ("not_implemented", False)
        end

    test_business_members_asset_access_update
            -- Assign/Update member asset permissions
            --
            -- Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 
        local
            l_response: UPDATE_MEMBER_ASSETS_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_update_member_asset_access_body: UPDATE_MEMBER_ASSET_ACCESS_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_member_asset_access_body

            -- l_response := api.business_members_asset_access_update(l_business_id, l_update_member_asset_access_body)
            assert ("not_implemented", False)
        end

    test_business_partner_asset_access_get
            -- Get assets assigned to a partner or assets assigned by a partner
            --
            -- Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
        local
            l_response: BUSINESS_PARTNER_ASSET_ACCESS_GET_200_RESPONSE
            l_business_id: STRING_32
            l_partner_id: STRING_32
            l_partner_type: PARTNER_TYPE
            l_asset_type: STRING_32
            l_start_index: INTEGER_32
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_partner_id

            -- l_response := api.business_partner_asset_access_get(l_business_id, l_partner_id, l_partner_type, l_asset_type, l_start_index, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_delete_partner_asset_access_handler_impl
            -- Delete partner access to asset
            --
            -- Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
        local
            l_response: DELETE_PARTNER_ASSETS_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_delete_partner_asset_access_body: DELETE_PARTNER_ASSET_ACCESS_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_partner_asset_access_body

            -- l_response := api.delete_partner_asset_access_handler_impl(l_business_id, l_delete_partner_asset_access_body)
            assert ("not_implemented", False)
        end

    test_update_partner_asset_access_handler_impl
            -- Assign/Update partner asset permissions
            --
            -- Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
        local
            l_response: UPDATE_PARTNER_ASSETS_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_update_partner_asset_access_body: UPDATE_PARTNER_ASSET_ACCESS_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_update_partner_asset_access_body

            -- l_response := api.update_partner_asset_access_handler_impl(l_business_id, l_update_partner_asset_access_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BUSINESSACCESSASSETS_API
            -- Create an object instance of `BUSINESSACCESSASSETS_API'.
        once
            create { BUSINESSACCESSASSETS_API } Result
        end

end
