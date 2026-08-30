note
    description: "API tests for TRENDS_API"
    date: "$Date$"
    revision: "$Revision$"


class TRENDS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_trends_editorial_articles_list
            -- Returns editorial articles for a given region
            --
            --   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
        local
            l_response: LIST [TRENDS_EDITORIAL]
            l_region: PRODUCT_CATEGORY_REGION
        do
            -- TODO: Initialize required params.
            -- l_region

            -- l_response := api.trends_editorial_articles_list(l_region)
            assert ("not_implemented", False)
        end

    test_trends_featured_topics_list
            -- Get featured topics
            --
            --   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
        local
            l_response: LIST [FEATURED_TREND]
            l_region: PRODUCT_CATEGORY_REGION
            l_interest: INTERESTS_ENUM
        do
            -- TODO: Initialize required params.
            -- l_region

            -- l_response := api.trends_featured_topics_list(l_region, l_interest)
            assert ("not_implemented", False)
        end

    test_trends_product_categories_details_list
            -- Get product category details
            --
            --   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
        local
            l_response: LIST [PRODUCT_CATEGORY_DETAILS]
            l_product_categories: LIST [PRODUCT_CATEGORY_ENUM]
            l_region: PRODUCT_CATEGORY_REGION
            l_lookback_window: PRODUCT_CATEGORY_DETAIL_LOOKBACK_WINDOW
            l_engagement_type: PRODUCT_CATEGORIES_ENGAGEMENT_TYPE
        do
            -- TODO: Initialize required params.
            -- create {ARRAYED_LIST [PRODUCT_CATEGORY_ENUM]} l_product_categories.make (2)
            -- l_region

            -- l_response := api.trends_product_categories_details_list(l_product_categories, l_region, l_lookback_window, l_engagement_type)
            assert ("not_implemented", False)
        end

    test_trends_product_categories_trending_list
            -- Get a list of growing Shopping Product Categories
            --
            --   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
        local
            l_response: LIST [TRENDING_PRODUCT_CATEGORY]
            l_region: PRODUCT_CATEGORY_REGION
            l_verticals: LIST [VERTICAL_PRODUCT_CATEGORY]
            l_ages: LIST [AGE_TRENDS_BUCKET]
            l_genders: LIST [GENDER_BUCKET]
            l_engagement_type: PRODUCT_CATEGORIES_ENGAGEMENT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_region

            -- l_response := api.trends_product_categories_trending_list(l_region, l_verticals, l_ages, l_genders, l_engagement_type)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TRENDS_API
            -- Create an object instance of `TRENDS_API'.
        once
            create { TRENDS_API } Result
        end

end
