note
    description: "API tests for BUSINESSACCESSRELATIONSHIPS_API"
    date: "$Date$"
    revision: "$Revision$"


class BUSINESSACCESSRELATIONSHIPS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_business_employers
            -- List business employers for user
            --
            -- Get all of the viewing user&#39;s business employers.
        local
            l_response: GET_BUSINESS_EMPLOYERS_200_RESPONSE
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.business_employers(l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_business_members
            -- Get business members
            --
            -- Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
        local
            l_response: GET_BUSINESS_MEMBERS_200_RESPONSE
            l_business_id: STRING_32
            l_assets_summary: BOOLEAN
            l_business_roles: LIST [MEMBER_BUSINESS_ROLE]
            l_member_ids: STRING_32
            l_start_index: INTEGER_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_members(l_business_id, l_assets_summary, l_business_roles, l_member_ids, l_start_index, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_partners
            -- Get business partners
            --
            -- Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
        local
            l_response: GET_BUSINESS_PARTNERS_200_RESPONSE
            l_business_id: STRING_32
            l_assets_summary: BOOLEAN
            l_partner_type: PARTNER_TYPE
            l_partner_ids: STRING_32
            l_start_index: INTEGER_32
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_partners(l_business_id, l_assets_summary, l_partner_type, l_partner_ids, l_start_index, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_delete_business_membership
            -- Terminate business memberships
            --
            -- Terminate memberships between the specified members and your business.
        local
            l_response: DELETED_MEMBERS_RESPONSE
            l_business_id: STRING_32
            l_members_to_delete_body: MEMBERS_TO_DELETE_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_members_to_delete_body

            -- l_response := api.delete_business_membership(l_business_id, l_members_to_delete_body)
            assert ("not_implemented", False)
        end

    test_delete_business_partners
            -- Terminate business partnerships
            --
            -- Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
        local
            l_response: DELETE_PARTNERS_RESPONSE
            l_business_id: STRING_32
            l_delete_partners_request: DELETE_PARTNERS_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_partners_request

            -- l_response := api.delete_business_partners(l_business_id, l_delete_partners_request)
            assert ("not_implemented", False)
        end

    test_update_business_memberships
            -- Update member&#39;s business role
            --
            -- Update a member&#39;s business role within the business.
        local
            l_response: UPDATE_MEMBER_RESULTS_RESPONSE_ARRAY
            l_business_id: STRING_32
            l_update_member_business_role_body: LIST [UPDATE_MEMBER_BUSINESS_ROLE_BODY]
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- create {ARRAYED_LIST [UPDATE_MEMBER_BUSINESS_ROLE_BODY]} l_update_member_business_role_body.make (2)

            -- l_response := api.update_business_memberships(l_business_id, l_update_member_business_role_body)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BUSINESSACCESSRELATIONSHIPS_API
            -- Create an object instance of `BUSINESSACCESSRELATIONSHIPS_API'.
        once
            create { BUSINESSACCESSRELATIONSHIPS_API } Result
        end

end
