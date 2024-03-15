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
            l_response: AD_ACCOUNTS_COUNTRY_RESPONSE
        do
            -- TODO: Initialize required params.

            -- l_response := api.ad_account_countries_get
            assert ("not_implemented", False)
        end

    test_delivery_metrics_get
            -- Get available metrics&#39; definitions
            --
            -- Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The &#x60;display_name&#x60; attribute will match how the metric is named in our native tools like Ads Manager. See &lt;a href&#x3D;&#39;/docs/content/analytics/&#39;&gt;Organic Analytics&lt;/a&gt; and &lt;a href&#x3D;&#39;/docs/ads/ad-analytics-reporting/&#39;&gt;Ads Analytics&lt;/a&gt; for more information.
        local
            l_response: DELIVERY_METRICS_RESPONSE
            l_report_type: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.delivery_metrics_get(l_report_type)
            assert ("not_implemented", False)
        end

    test_interest_targeting_options_get
            -- Get interest details
            --
            -- &lt;p&gt;Get details of a specific interest given interest ID.&lt;/p&gt; &lt;p&gt;Click &lt;a href&#x3D;\&quot;https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid&#x3D;118370875\&quot; target&#x3D;\&quot;_blank\&quot;&gt;here&lt;/a&gt; for a spreadsheet listing interests and their IDs.&lt;/p&gt;
        local
            l_response: SINGLE_INTEREST_TARGETING_OPTION_RESPONSE
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
            -- Get a list of all lead form question type names. Some questions might not be used.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
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
            l_response: BOOK_CLOSED_RESPONSE
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
            -- &lt;p&gt;You can use targeting values in ads placement to define your intended audience. &lt;/p&gt; &lt;p&gt;Targeting metrics are organized around targeting specifications.&lt;/p&gt; &lt;p&gt;For more information on ads targeting, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/audience-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Audience targeting&lt;/a&gt;.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Sample return:&lt;/b&gt;&lt;/p&gt; &lt;pre class&#x3D;\&quot;literal-block\&quot;&gt; [{&amp;quot;36313&amp;quot;: &amp;quot;Australia: Moreton Bay - North&amp;quot;, &amp;quot;124735&amp;quot;: &amp;quot;Canada: North Battleford&amp;quot;, &amp;quot;36109&amp;quot;: &amp;quot;Australia: Murray&amp;quot;, &amp;quot;36108&amp;quot;: &amp;quot;Australia: Mid North Coast&amp;quot;, &amp;quot;36101&amp;quot;: &amp;quot;Australia: Capital Region&amp;quot;, &amp;quot;811&amp;quot;: &amp;quot;U.S.: Reno&amp;quot;, &amp;quot;36103&amp;quot;: &amp;quot;Australia: Central West&amp;quot;, &amp;quot;36102&amp;quot;: &amp;quot;Australia: Central Coast&amp;quot;, &amp;quot;36105&amp;quot;: &amp;quot;Australia: Far West and Orana&amp;quot;, &amp;quot;36104&amp;quot;: &amp;quot;Australia: Coffs Harbour - Grafton&amp;quot;, &amp;quot;36107&amp;quot;: &amp;quot;Australia: Illawarra&amp;quot;, &amp;quot;36106&amp;quot;: &amp;quot;Australia: Hunter Valley Exc Newcastle&amp;quot;, &amp;quot;554017&amp;quot;: &amp;quot;New Zealand: Wanganui&amp;quot;, &amp;quot;554016&amp;quot;: &amp;quot;New Zealand: Marlborough&amp;quot;, &amp;quot;554015&amp;quot;: &amp;quot;New Zealand: Gisborne&amp;quot;, &amp;quot;554014&amp;quot;: &amp;quot;New Zealand: Tararua&amp;quot;, &amp;quot;554013&amp;quot;: &amp;quot;New Zealand: Invercargill&amp;quot;, &amp;quot;GR&amp;quot;: &amp;quot;Greece&amp;quot;, &amp;quot;554011&amp;quot;: &amp;quot;New Zealand: Whangarei&amp;quot;, &amp;quot;554010&amp;quot;: &amp;quot;New Zealand: Far North&amp;quot;, &amp;quot;717&amp;quot;: &amp;quot;U.S.: Quincy-Hannibal-Keokuk&amp;quot;, &amp;quot;716&amp;quot;: &amp;quot;U.S.: Baton Rouge&amp;quot;,...}] &lt;/pre&gt;
        local
            l_response: LIST [ANY]
            l_targeting_type: STRING_32
            l_client_id: STRING_32
            l_oauth_signature: STRING_32
            l_timestamp: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_targeting_type

            -- l_response := api.targeting_options_get(l_targeting_type, l_client_id, l_oauth_signature, l_timestamp)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: RESOURCES_API
            -- Create an object instance of `RESOURCES_API'.
        once
            create { RESOURCES_API } Result
        end

end
