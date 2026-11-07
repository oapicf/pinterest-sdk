note
    description: "API tests for BUSINESSACCESSRELATIONSHIPS_API"
    date: "$Date$"
    revision: "$Revision$"


class BUSINESSACCESSRELATIONSHIPS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_brand_accounts_create
            -- Create a Brand Account
            --
            -- Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.
        local
            l_response: BRAND_ACCOUNT
            l_business_hierarchy_id: STRING_32
            l_brand_account_create: BRAND_ACCOUNT_CREATE
        do
            -- TODO: Initialize required params.
            -- l_business_hierarchy_id
            -- l_brand_account_create

            -- l_response := api.brand_accounts_create(l_business_hierarchy_id, l_brand_account_create)
            assert ("not_implemented", False)
        end

    test_brand_accounts_update
            -- Update a Brand Account
            --
            -- Update an existing Brand Account
        local
            l_response: BRAND_ACCOUNT
            l_brand_account_id: STRING_32
            l_business_hierarchy_id: STRING_32
            l_brand_account_update: BRAND_ACCOUNT_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_brand_account_id
            -- l_business_hierarchy_id
            -- l_brand_account_update

            -- l_response := api.brand_accounts_update(l_brand_account_id, l_business_hierarchy_id, l_brand_account_update)
            assert ("not_implemented", False)
        end

    test_business_employers
            -- List business employers for user
            --
            -- Get all of the viewing user&#39;s business employers.
        local
            l_response: GET_BUSINESS_EMPLOYERS_200_RESPONSE
            l_assets_summary: BOOLEAN
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.business_employers(l_assets_summary, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_members
            -- Get business members
            --
            -- Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
        local
            l_response: GET_BUSINESS_EMPLOYERS_200_RESPONSE
            l_business_id: STRING_32
            l_fetch_system_users: BOOLEAN
            l_assets_summary: BOOLEAN
            l_business_roles: LIST [MEMBER_BUSINESS_ROLE]
            l_member_ids: STRING_32
            l_start_index: INTEGER_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_members(l_business_id, l_fetch_system_users, l_assets_summary, l_business_roles, l_member_ids, l_start_index, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_business_partners
            -- Get business partners
            --
            -- Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
        local
            l_response: GET_BUSINESS_EMPLOYERS_200_RESPONSE
            l_business_id: STRING_32
            l_assets_summary: BOOLEAN
            l_partner_type: PARTNER_TYPE
            l_partner_ids: STRING_32
            l_start_index: INTEGER_32
            l_sort_ascending: BOOLEAN
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.business_partners(l_business_id, l_assets_summary, l_partner_type, l_partner_ids, l_start_index, l_sort_ascending, l_bookmark, l_page_size)
            assert ("not_implemented", False)
        end

    test_delete_business_membership
            -- Terminate business memberships
            --
            -- Terminate memberships between the specified members and your business.
        local
            l_response: DELETE_BUSINESS_MEMBERSHIP_200_RESPONSE
            l_business_id: STRING_32
            l_delete_business_membership_body: DELETE_BUSINESS_MEMBERSHIP_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_business_membership_body

            -- l_response := api.delete_business_membership(l_business_id, l_delete_business_membership_body)
            assert ("not_implemented", False)
        end

    test_delete_business_partners
            -- Terminate business partnerships
            --
            -- Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
        local
            l_response: DELETE_BUSINESS_PARTNERS
            l_business_id: STRING_32
            l_delete_business_partners_delete: DELETE_BUSINESS_PARTNERS_DELETE
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_delete_business_partners_delete

            -- l_response := api.delete_business_partners(l_business_id, l_delete_business_partners_delete)
            assert ("not_implemented", False)
        end

    test_system_user_update
            -- Update a system user information.
            --
            -- Update a system user information such as name.
        local
            l_business_id: STRING_32
            l_system_user_id: STRING_32
            l_system_user_update_with_required_body: SYSTEM_USER_UPDATE_WITH_REQUIRED_BODY
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_system_user_id
            -- l_system_user_update_with_required_body

            -- api.system_user_update(l_business_id, l_system_user_id, l_system_user_update_with_required_body)
            assert ("not_implemented", False)
        end

    test_update_business_memberships
            -- Update member&#39;s business role
            --
            -- Update a member&#39;s business role within the business.
        local
            l_response: UPDATE_BUSINESS_MEMBERSHIPS_RESPONSE
            l_business_id: STRING_32
            l_business_membership_member: LIST [BUSINESS_MEMBERSHIP_MEMBER]
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- create {ARRAYED_LIST [BUSINESS_MEMBERSHIP_MEMBER]} l_business_membership_member.make (2)

            -- l_response := api.update_business_memberships(l_business_id, l_business_membership_member)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: BUSINESSACCESSRELATIONSHIPS_API
            -- Create an object instance of `BUSINESSACCESSRELATIONSHIPS_API'.
        once
            create { BUSINESSACCESSRELATIONSHIPS_API } Result
        end

end
