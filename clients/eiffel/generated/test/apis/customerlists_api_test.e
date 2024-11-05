note
    description: "API tests for CUSTOMERLISTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CUSTOMERLISTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_customer_lists_create
            -- Create customer lists
            --
            -- &lt;p&gt;Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).&lt;/p&gt; &lt;p&gt;A customer list is one of the four types of Pinterest audiences: for more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;p/&gt;  &lt;p&gt;&lt;b&gt;Please review our &lt;u&gt;&lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting#section-13341\&quot; target&#x3D;\&quot;_blank\&quot;&gt;requirements&lt;/a&gt;&lt;/u&gt; for what type of information is allowed when uploading a customer list.&lt;/b&gt;&lt;/p&gt; &lt;p&gt;When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.&lt;/p&gt; &lt;p&gt;Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the &lt;a href&#x3D;\&quot;#operation/create_audience_handler\&quot;&gt;create audience endpoint&lt;/a&gt; before it can be used.&lt;/p&gt;
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_request: CUSTOMER_LIST_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_request

            -- l_response := api.customer_lists_create(l_ad_account_id, l_customer_list_request)
            assert ("not_implemented", False)
        end

    test_customer_lists_get
            -- Get customer list
            --
            -- Gets a specific customer list given the customer list ID.
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id

            -- l_response := api.customer_lists_get(l_ad_account_id, l_customer_list_id)
            assert ("not_implemented", False)
        end

    test_customer_lists_list
            -- Get customer lists
            --
            -- &lt;p&gt;Get a set of customer lists including id and name based on the filters provided.&lt;/p&gt; &lt;p&gt;(Customer lists are a type of audience.) For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;  or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
        local
            l_response: CUSTOMER_LISTS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.customer_lists_list(l_ad_account_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

    test_customer_lists_update
            -- Update customer list
            --
            -- &lt;p&gt;Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)&lt;/p&gt; &lt;p&gt;When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt; or the &lt;a href&#x3D;\&quot;/docs/api-features/targeting-overview/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audiences&lt;/a&gt; section of the ads management guide.&lt;/p&gt;
        local
            l_response: CUSTOMER_LIST
            l_ad_account_id: STRING_32
            l_customer_list_id: STRING_32
            l_customer_list_update_request: CUSTOMER_LIST_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_customer_list_id
            -- l_customer_list_update_request

            -- l_response := api.customer_lists_update(l_ad_account_id, l_customer_list_id, l_customer_list_update_request)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CUSTOMERLISTS_API
            -- Create an object instance of `CUSTOMERLISTS_API'.
        once
            create { CUSTOMERLISTS_API } Result
        end

end
