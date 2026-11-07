note
    description: "API tests for RESOURCES_API"
    date: "$Date$"
    revision: "$Revision$"


class RESOURCES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_ad_account_countries_get
            -- Get ad accounts countries
            --
            -- Get Ad Accounts countries
        local
            l_response: AD_ACCOUNT_COUNTRIES_GET_200_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.ad_account_countries_get
            assert ("not_implemented", False)
        end

    test_delivery_metrics_get
            -- Get available metrics&#39; definitions
            --
            -- Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
        local
            l_response: DELIVERY_METRICS_GET_200_RESPONSE
            l_report_type: REPORT_TYPE
        do
            -- TODO: Initialize required params.

            -- l_response := api.delivery_metrics_get(l_report_type)
            assert ("not_implemented", False)
        end

    test_interest_targeting_options_get
            -- Get interest details
            --
            -- Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875) for a spreadsheet listing interests and their IDs.
        local
            l_response: SINGLE_INTEREST_TARGETING_OPTION
            l_interest_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_interest_id

            -- l_response := api.interest_targeting_options_get(l_interest_id)
            assert ("not_implemented", False)
        end

    test_lead_form_questions_get
            -- Get lead form questions
            --
            -- Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
        local
        do
            -- TODO: Initialize required params.

            -- api.lead_form_questions_get
            assert ("not_implemented", False)
        end

    test_metrics_ready_state_get
            -- Get metrics ready state
            --
            -- Learn whether conversion or non-conversion metrics are finalized and ready to query.
        local
            l_response: BOOK_CLOSED
            l_date: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_date

            -- l_response := api.metrics_ready_state_get(l_date)
            assert ("not_implemented", False)
        end

    test_targeting_options_get
            -- Get targeting options
            --
            --     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      &#x60;&#x60;&#x60;     [{\&quot;36313\&quot;: \&quot;Australia: Moreton Bay - North\&quot;, \&quot;124735\&quot;: \&quot;Canada: North Battleford\&quot;, \&quot;36109\&quot;: \&quot;Australia: Murray\&quot;, \&quot;36108\&quot;: \&quot;Australia: Mid North Coast\&quot;, \&quot;36101\&quot;: \&quot;Australia: Capital Region\&quot;, \&quot;811\&quot;: \&quot;U.S.: Reno\&quot;, \&quot;36103\&quot;: \&quot;Australia: Central West\&quot;, \&quot;36102\&quot;: \&quot;Australia: Central Coast\&quot;, \&quot;36105\&quot;: \&quot;Australia: Far West and Orana\&quot;, \&quot;36104\&quot;: \&quot;Australia: Coffs Harbour - Grafton\&quot;, \&quot;36107\&quot;: \&quot;Australia: Illawarra\&quot;, \&quot;36106\&quot;: \&quot;Australia: Hunter Valley Exc Newcastle\&quot;, \&quot;554017\&quot;: \&quot;New Zealand: Wanganui\&quot;, \&quot;554016\&quot;: \&quot;New Zealand: Marlborough\&quot;, \&quot;554015\&quot;: \&quot;New Zealand: Gisborne\&quot;, \&quot;554014\&quot;: \&quot;New Zealand: Tararua\&quot;, \&quot;554013\&quot;: \&quot;New Zealand: Invercargill\&quot;, \&quot;GR\&quot;: \&quot;Greece\&quot;, \&quot;554011\&quot;: \&quot;New Zealand: Whangarei\&quot;, \&quot;554010\&quot;: \&quot;New Zealand: Far North\&quot;, \&quot;717\&quot;: \&quot;U.S.: Quincy-Hannibal-Keokuk\&quot;, \&quot;716\&quot;: \&quot;U.S.: Baton Rouge\&quot;,...}]     &#x60;&#x60;&#x60;
        local
            l_response: LIST [ANY]
            l_targeting_type: PUBLIC_TARGETING_TYPE
            l_ad_account_id: STRING_32
            l_client_id: STRING_32
            l_oauth_signature: STRING_32
            l_timestamp: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_targeting_type

            -- l_response := api.targeting_options_get(l_targeting_type, l_ad_account_id, l_client_id, l_oauth_signature, l_timestamp)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: RESOURCES_API
            -- Create an object instance of `RESOURCES_API'.
        once
            create { RESOURCES_API } Result
        end

end
