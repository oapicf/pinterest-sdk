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
            l_response: PRODUCT_GROUP_PROMOTIONS
            l_ad_account_id: STRING_32
            l_product_group_promotions_create: PRODUCT_GROUP_PROMOTIONS_CREATE
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_product_group_promotions_create

            -- l_response := api.product_group_promotions_create(l_ad_account_id, l_product_group_promotions_create)
            assert ("not_implemented", False)
        end

    test_product_group_promotions_get
            -- Get a product group promotion by id
            --
            -- Get a product group promotion by id
        local
            l_response: PRODUCT_GROUP_PROMOTION
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
            -- List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
        local
            l_response: PRODUCT_GROUP_PROMOTIONS_LIST_200_RESPONSE
            l_ad_account_id: STRING_32
            l_bookmark: STRING_32
            l_page_size: INTEGER_32
            l_order: PINTEREST_LIB_PAGINATION_ORDER
            l_product_group_promotion_ids: LIST [STRING_32]
            l_entity_statuses: LIST [ENTITY_STATUS]
            l_ad_group_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id

            -- l_response := api.product_group_promotions_list(l_ad_account_id, l_bookmark, l_page_size, l_order, l_product_group_promotion_ids, l_entity_statuses, l_ad_group_id)
            assert ("not_implemented", False)
        end

    test_product_group_promotions_update
            -- Update product group promotions
            --
            -- Update multiple existing Product Group Promotions (by product_group_id)
        local
            l_response: PRODUCT_GROUP_PROMOTIONS
            l_ad_account_id: STRING_32
            l_product_group_promotions_update_with_required_body: PRODUCT_GROUP_PROMOTIONS_UPDATE_WITH_REQUIRED_BODY
        do
            -- TODO: Initialize required params.
            -- l_ad_account_id
            -- l_product_group_promotions_update_with_required_body

            -- l_response := api.product_group_promotions_update(l_ad_account_id, l_product_group_promotions_update_with_required_body)
            assert ("not_implemented", False)
        end

    test_product_groups_analytics
            -- Get product group analytics
            --
            -- Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
        local
            l_response: LIST [PRODUCT_GROUP_ANALYTICS_ITEMS]
            l_start_date: DATE
            l_end_date: DATE
            l_product_group_ids: LIST [STRING_32]
            l_columns: LIST [REPORTING_COLUMN_SYNC]
            l_granularity: GRANULARITY
            l_ad_account_id: STRING_32
            l_click_window_days: REAL_32
            l_engagement_window_days: REAL_32
            l_view_window_days: REAL_32
            l_conversion_report_time: STRING_32
            l_reporting_timezone: REPORTING_TIME_ZONE
        do
            -- TODO: Initialize required params.
            -- l_start_date
            -- l_end_date
            -- create {ARRAYED_LIST [STRING_32]} l_product_group_ids.make (2)
            -- create {ARRAYED_LIST [REPORTING_COLUMN_SYNC]} l_columns.make (2)
            -- l_granularity
            -- l_ad_account_id

            -- l_response := api.product_groups_analytics(l_start_date, l_end_date, l_product_group_ids, l_columns, l_granularity, l_ad_account_id, l_click_window_days, l_engagement_window_days, l_view_window_days, l_conversion_report_time, l_reporting_timezone)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: PRODUCTGROUPPROMOTIONS_API
            -- Create an object instance of `PRODUCTGROUPPROMOTIONS_API'.
        once
            create { PRODUCTGROUPPROMOTIONS_API } Result
        end

end
