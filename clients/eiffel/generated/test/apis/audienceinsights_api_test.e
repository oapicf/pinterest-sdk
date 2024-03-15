note
    description: "API tests for AUDIENCEINSIGHTS_API"
    date: "$Date$"
    revision: "$Revision$"


class AUDIENCEINSIGHTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_audience_insights_get
            -- Get audience insights
            --
            -- Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.&lt;p/&gt; &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-insights\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Learn more about Audience Insights&lt;/a&gt;.
        local
            l_response: AUDIENCE_INSIGHTS_RESPONSE
            l_ad_account_id: STRING_32
            l_audience_insight_type: AUDIENCE_INSIGHT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_audience_insight_type

            -- l_response := api.audience_insights_get(l_ad_account_id, l_audience_insight_type)
            assert ("not_implemented", False)
        end

    test_audience_insights_scope_and_type_get
            -- Get audience insights scope and type
            --
            -- Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
        local
            l_response: AUDIENCE_DEFINITION_RESPONSE
            l_ad_account_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.audience_insights_scope_and_type_get(l_ad_account_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: AUDIENCEINSIGHTS_API
            -- Create an object instance of `AUDIENCEINSIGHTS_API'.
        once
            create { AUDIENCEINSIGHTS_API } Result
        end

end
