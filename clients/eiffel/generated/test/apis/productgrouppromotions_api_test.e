note
    description: "API tests for PRODUCTGROUPPROMOTIONS_API"
    date: "$Date$"
    revision: "$Revision$"


class PRODUCTGROUPPROMOTIONS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_product_group_promotions_create
            -- Create product group promotions
            --
            -- Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
        local
            l_response: PRODUCT_GROUP_PROMOTION_RESPONSE
            l_ad_account_id: STRING_32
            l_product_group_promotion_create_request: PRODUCT_GROUP_PROMOTION_CREATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_product_group_promotion_create_request

            -- l_response := api.product_group_promotions_create(l_ad_account_id, l_product_group_promotion_create_request)
            assert ("not_implemented", False)
        end

    test_product_group_promotions_get
            -- Get a product group promotion by id
            --
            -- Get a product group promotion by id
        local
            l_response: PRODUCT_GROUP_PROMOTION_RESPONSE
            l_ad_account_id: STRING_32
            l_product_group_promotion_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_product_group_promotion_id

            -- l_response := api.product_group_promotions_get(l_ad_account_id, l_product_group_promotion_id)
            assert ("not_implemented", False)
        end

    test_product_group_promotions_list
            -- Get product group promotions
            --
            -- List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  &lt;b&gt;Note:&lt;/b&gt; ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
        local
            l_response: PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_product_group_promotion_ids: LIST [STRING_32]
            l_entity_statuses: LIST [STRING_32]
            l_ad_group_id: STRING_32
            l_page_size: INTEGER_32
            l_order: STRING_32
            l_bookmark: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.product_group_promotions_list(l_ad_account_id, l_product_group_promotion_ids, l_entity_statuses, l_ad_group_id, l_page_size, l_order, l_bookmark)
            assert ("not_implemented", False)
        end

    test_product_group_promotions_update
            -- Update product group promotions
            --
            -- Update multiple existing Product Group Promotions (by product_group_id)
        local
            l_response: PRODUCT_GROUP_PROMOTION_RESPONSE
            l_ad_account_id: STRING_32
            l_product_group_promotion_update_request: PRODUCT_GROUP_PROMOTION_UPDATE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_product_group_promotion_update_request

            -- l_response := api.product_group_promotions_update(l_ad_account_id, l_product_group_promotion_update_request)
            assert ("not_implemented", False)
        end

    test_product_groups_analytics
            -- Get product group analytics
            --
            -- Get analytics for the specified product groups in the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
        local
            l_response: LIST [PRODUCT_GROUP_ANALYTICS_RESPONSE_INNER]
            l_ad_account_id: STRING_32
            l_start_date: DATE
            l_end_date: DATE
            l_product_group_ids: LIST [STRING_32]
            l_columns: LIST [STRING_32]
            l_granularity: GRANULARITY
            l_click_window_days: INTEGER_32
            l_engagement_window_days: INTEGER_32
            l_view_window_days: INTEGER_32
            l_conversion_report_time: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [STRING_32]} l_product_group_ids.make (2)
            -- create {ARRAYED_LIST [STRING_32]} l_columns.make (2)
            -- l_granularity

            -- l_response := api.product_groups_analytics(l_ad_account_id, l_start_date, l_end_date, l_product_group_ids, l_columns, l_granularity, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTGROUPPROMOTIONS_API
            -- Create an object instance of `PRODUCTGROUPPROMOTIONS_API'.
        once
            create { PRODUCTGROUPPROMOTIONS_API } Result
        end

end
