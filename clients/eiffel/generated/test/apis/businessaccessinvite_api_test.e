note
    description: "API tests for BUSINESSACCESSINVITE_API"
    date: "$Date$"
    revision: "$Revision$"


class BUSINESSACCESSINVITE_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_asset_access_requests_create
            -- Create a request to access an existing partner&#39;s assets.
            --
            -- Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
        local
            l_response: CREATE_ASSET_ACCESS_REQUEST_RESPONSE
            l_business_id: STRING_32
            l_create_asset_access_request_body: CREATE_ASSET_ACCESS_REQUEST_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_asset_access_request_body

            -- l_response := api.asset_access_requests_create(l_business_id, l_create_asset_access_request_body)
            assert ("not_implemented", False)
        end

    test_cancel_invites_or_requests
            -- Cancel invites/requests
            --
            -- Cancel membership/partnership invites and/or requests.
        local
            l_response: DELETE_INVITES_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_cancel_invites_body: CANCEL_INVITES_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_cancel_invites_body

            -- l_response := api.cancel_invites_or_requests(l_business_id, l_cancel_invites_body)
            assert ("not_implemented", False)
        end

    test_create_asset_invites
            -- Update invite/request with an asset permission
            --
            -- Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
        local
            l_response: UPDATE_INVITES_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_create_asset_invites_request: CREATE_ASSET_INVITES_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_asset_invites_request

            -- l_response := api.create_asset_invites(l_business_id, l_create_asset_invites_request)
            assert ("not_implemented", False)
        end

    test_create_membership_or_partnership_invites
            -- Create invites or requests
            --
            -- Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
        local
            l_response: CREATE_INVITES_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_create_membership_or_partnership_invites_body: CREATE_MEMBERSHIP_OR_PARTNERSHIP_INVITES_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_create_membership_or_partnership_invites_body

            -- l_response := api.create_membership_or_partnership_invites(l_business_id, l_create_membership_or_partnership_invites_body)
            assert ("not_implemented", False)
        end

    test_invites
            -- Get invites/requests
            --
            -- Get the membership/partnership invites and/or requests for the authorized user.
        local
            l_response: GET_INVITES_200_RESPONSE
            l_business_id: STRING_32
            l_is_member: BOOLEAN
            l_invite_status: LIST [STRING_32]
            l_invite_type: INVITE_TYPE
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.invites(l_business_id, l_is_member, l_invite_status, l_invite_type, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_respond_business_access_invites
            -- Accept or decline an invite/request
            --
            -- Accept or decline invites or requests.
        local
            l_response: RESPOND_TO_INVITES_RESPONSE_ARRAY
            l_auth_respond_invites_body: AUTH_RESPOND_INVITES_BODY
        do
            -- TODO: Initialize required params.
            -- l_auth_respond_invites_body

            -- l_response := api.respond_business_access_invites(l_auth_respond_invites_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BUSINESSACCESSINVITE_API
            -- Create an object instance of `BUSINESSACCESSINVITE_API'.
        once
            create { BUSINESSACCESSINVITE_API } Result
        end

end
