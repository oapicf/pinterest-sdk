note
    description: "API tests for SEARCH_API"
    date: "$Date$"
    revision: "$Revision$"


class SEARCH_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_search_partner_pins
            -- Search pins by a given search term
            --
            -- &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get the top 10 Pins by a given search term.
        local
            l_response: SEARCH_PARTNER_PINS_200_RESPONSE
            l_term: STRING_32
            l_country_code: STRING_32
            l_bookmark: STRING_32
            l_locale: STRING_32
            l_limit: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_term
            -- l_country_code

            -- l_response := api.search_partner_pins(l_term, l_country_code, l_bookmark, l_locale, l_limit)
            assert ("not_implemented", False)
        end

    test_search_user_boards_get
            -- Search user&#39;s boards
            --
            -- Search for boards for the \&quot;operation user_account\&quot;. This includes boards of all board types. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        local
            l_response: SEARCH_USER_BOARDS_GET_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_query: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.search_user_boards_get(l_ad_account_id, l_bookmark, l_page_size, l_query)
            assert ("not_implemented", False)
        end

    test_search_user_pins_list
            -- Search user&#39;s Pins
            --
            -- Search for pins for the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;. See &lt;a href&#x3D;&#39;/docs/getting-started/using-business-access/&#39;&gt;Understanding Business Access&lt;/a&gt; for more information.
        local
            l_response: PINS_LIST_200_RESPONSE
            l_query: STRING_32
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_query

            -- l_response := api.search_user_pins_list(l_query, l_ad_account_id, l_bookmark)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SEARCH_API
            -- Create an object instance of `SEARCH_API'.
        once
            create { SEARCH_API } Result
        end

end
