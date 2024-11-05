note
    description: "API tests for CONVERSIONEVENTS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONEVENTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_events_create
            -- Send conversions
            --
            -- The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object. - This endpoint requires an &lt;code&gt;access_token&lt;/code&gt; be generated through Ads Manager. Review the &lt;a href&#x3D;\&quot;/docs/api-features/conversion-overview/\&quot;&gt;Conversions Guide&lt;/a&gt; for more details. (Note that the authorization header required is &lt;code&gt;Authorization: Bearer &amp;lt;access_token&amp;gt;&lt;/code&gt;). - The token&#39;s &lt;code&gt;user_account&lt;/code&gt; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
        local
            l_response: CONVERSION_API_RESPONSE
            l_ad_account_id: STRING_32
            l_conversion_events: CONVERSION_EVENTS
            l_test: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_conversion_events

            -- l_response := api.events_create(l_ad_account_id, l_conversion_events, l_test)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONEVENTS_API
            -- Create an object instance of `CONVERSIONEVENTS_API'.
        once
            create { CONVERSIONEVENTS_API } Result
        end

end
