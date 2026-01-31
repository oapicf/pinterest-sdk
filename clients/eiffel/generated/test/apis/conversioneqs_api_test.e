note
    description: "API tests for CONVERSIONEQS_API"
    date: "$Date$"
    revision: "$Revision$"


class CONVERSIONEQS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_conversion_eqs_list
            -- Get event quality score (EQS)
            --
            -- Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
        local
            l_response: LIST [EVENT_QUALITY_SCORE]
            l_lookback_period: LOOKBACK_PERIOD_OPTIONS
            l_ad_account_id: STRING_32
            l_source_platform: SOURCE_PLATFORM_OPTIONS
            l_ingestion_source: INGESTION_SOURCE_OPTIONS
        do
            -- TODO: Initialize required params.
            -- l_lookback_period
            -- l_ad_account_id

            -- l_response := api.conversion_eqs_list(l_lookback_period, l_ad_account_id, l_source_platform, l_ingestion_source)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: CONVERSIONEQS_API
            -- Create an object instance of `CONVERSIONEQS_API'.
        once
            create { CONVERSIONEQS_API } Result
        end

end
