note
    description: "API tests for AUDIENCESHARING_API"
    date: "$Date$"
    revision: "$Revision$"


class AUDIENCESHARING_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_accounts_audiences_shared_accounts_list
            -- List accounts with access to an audience owned by an ad account
            --
            -- List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
        local
            l_response: AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_audience_id: STRING_32
            l_account_type: AUDIENCE_ACCOUNT_TYPE
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_id
            -- l_account_type

            -- l_response := api.ad_accounts_audiences_shared_accounts_list(l_ad_account_id, l_audience_id, l_account_type, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_business_account_audiences_shared_accounts_list
            -- List accounts with access to an audience owned by a business
            --
            -- List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
        local
            l_response: AD_ACCOUNTS_AUDIENCES_SHARED_ACCOUNTS_LIST_200_RESPONSE
            l_business_id: STRING_32
            l_audience_id: STRING_32
            l_account_type: AUDIENCE_ACCOUNT_TYPE
            l_page_size: INTEGER_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_audience_id
            -- l_account_type

            -- l_response := api.business_account_audiences_shared_accounts_list(l_business_id, l_audience_id, l_account_type, l_page_size, l_bookmark)
            assert ("not_implemented", False)
        end

    test_shared_audiences_for_business_list
            -- List received audiences for a business
            --
            -- Get a list of received audiences for the given business.
        local
            l_response: AUDIENCES_LIST_200_RESPONSE
            l_business_id: STRING_32
            l_bookmark: STRING_32
            l_order: STRING_32
            l_page_size: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_business_id

            -- l_response := api.shared_audiences_for_business_list(l_business_id, l_bookmark, l_order, l_page_size)
            assert ("not_implemented", False)
        end

    test_update_ad_account_to_ad_account_shared_audience
            -- Update audience sharing between ad accounts
            --
            -- From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same &lt;a href&#x3D;&#39;https://help.pinterest.com/en/business/article/create-and-manage-accounts&#39;&gt;Pinterest Business Hierarchy&lt;/a&gt; as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
        local
            l_response: SHARED_AUDIENCE_RESPONSE
            l_ad_account_id: STRING_32
            l_shared_audience: SHARED_AUDIENCE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_shared_audience

            -- l_response := api.update_ad_account_to_ad_account_shared_audience(l_ad_account_id, l_shared_audience)
            assert ("not_implemented", False)
        end

    test_update_ad_account_to_business_shared_audience
            -- Update audience sharing from an ad account to businesses
            --
            -- From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
        local
            l_response: BUSINESS_SHARED_AUDIENCE_RESPONSE
            l_ad_account_id: STRING_32
            l_business_shared_audience: BUSINESS_SHARED_AUDIENCE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_business_shared_audience

            -- l_response := api.update_ad_account_to_business_shared_audience(l_ad_account_id, l_business_shared_audience)
            assert ("not_implemented", False)
        end

    test_update_business_to_ad_account_shared_audience
            -- Update audience sharing from a business to ad accounts
            --
            -- From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. &lt;ul&gt; &lt;li&gt;If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.&lt;/li&gt; &lt;li&gt;If the business is the recipient of the audience, it can share with any of its owned ad accounts.&lt;/li&gt; &lt;/ul&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
        local
            l_response: SHARED_AUDIENCE_RESPONSE
            l_business_id: STRING_32
            l_shared_audience: SHARED_AUDIENCE
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_shared_audience

            -- l_response := api.update_business_to_ad_account_shared_audience(l_business_id, l_shared_audience)
            assert ("not_implemented", False)
        end

    test_update_business_to_business_shared_audience
            -- Update audience sharing between businesses
            --
            -- From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.&lt;br&gt; This endpoint is not available to all apps.&lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.
        local
            l_response: BUSINESS_SHARED_AUDIENCE_RESPONSE
            l_business_id: STRING_32
            l_business_shared_audience: BUSINESS_SHARED_AUDIENCE
        do
            -- TODO: Initialize required params.
            -- l_business_id
            -- l_business_shared_audience

            -- l_response := api.update_business_to_business_shared_audience(l_business_id, l_business_shared_audience)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDIENCESHARING_API
            -- Create an object instance of `AUDIENCESHARING_API'.
        once
            create { AUDIENCESHARING_API } Result
        end

end
