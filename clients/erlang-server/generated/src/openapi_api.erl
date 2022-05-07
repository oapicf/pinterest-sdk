-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('AdAccountAnalytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];

request_params('AdAccountsList') ->
    [
        'bookmark',
        'page_size',
        'include_shared_accounts'
    ];

request_params('AdGroupsAnalytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'ad_group_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];

request_params('AdGroupsList') ->
    [
        'ad_account_id',
        'campaign_ids',
        'ad_group_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark',
        'translate_interests_to_names'
    ];

request_params('AdsAnalytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'ad_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];

request_params('AdsList') ->
    [
        'ad_account_id',
        'campaign_ids',
        'ad_group_ids',
        'ad_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark'
    ];

request_params('AnalyticsCreateReport') ->
    [
        'ad_account_id',
        'AdsAnalyticsCreateAsyncRequest'
    ];

request_params('AnalyticsGetReport') ->
    [
        'ad_account_id',
        'token'
    ];

request_params('CampaignsAnalytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'campaign_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];

request_params('CampaignsList') ->
    [
        'ad_account_id',
        'campaign_ids',
        'entity_statuses',
        'page_size',
        'order',
        'bookmark'
    ];

request_params('ProductGroupsAnalytics') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'product_group_ids',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time'
    ];


request_params('BoardSectionsCreate') ->
    [
        'board_id',
        'BoardSection'
    ];

request_params('BoardSectionsDelete') ->
    [
        'board_id',
        'section_id'
    ];

request_params('BoardSectionsList') ->
    [
        'board_id',
        'bookmark',
        'page_size'
    ];

request_params('BoardSectionsListPins') ->
    [
        'board_id',
        'section_id',
        'bookmark',
        'page_size'
    ];

request_params('BoardSectionsUpdate') ->
    [
        'board_id',
        'section_id',
        'BoardSection'
    ];

request_params('BoardsCreate') ->
    [
        'Board'
    ];

request_params('BoardsDelete') ->
    [
        'board_id'
    ];

request_params('BoardsGet') ->
    [
        'board_id'
    ];

request_params('BoardsList') ->
    [
        'bookmark',
        'page_size',
        'privacy'
    ];

request_params('BoardsListPins') ->
    [
        'board_id',
        'bookmark',
        'page_size'
    ];

request_params('BoardsUpdate') ->
    [
        'board_id',
        'BoardUpdate'
    ];


request_params('CatalogsProductGroupsCreate') ->
    [
        'CatalogsProductGroupCreateRequest'
    ];

request_params('CatalogsProductGroupsDelete') ->
    [
        'product_group_id'
    ];

request_params('CatalogsProductGroupsList') ->
    [
        'feed_id',
        'bookmark',
        'page_size'
    ];

request_params('CatalogsProductGroupsUpdate') ->
    [
        'product_group_id',
        'CatalogsProductGroupUpdateRequest'
    ];

request_params('FeedProcessingResultsList') ->
    [
        'feed_id',
        'bookmark',
        'page_size'
    ];

request_params('FeedsCreate') ->
    [
        'CatalogsFeedsCreateRequest'
    ];

request_params('FeedsDelete') ->
    [
        'feed_id'
    ];

request_params('FeedsGet') ->
    [
        'feed_id'
    ];

request_params('FeedsList') ->
    [
        'bookmark',
        'page_size'
    ];

request_params('FeedsUpdate') ->
    [
        'feed_id',
        'CatalogsFeedsUpdateRequest'
    ];

request_params('ItemsBatchGet') ->
    [
        'batch_id'
    ];

request_params('ItemsBatchPost') ->
    [
        'CatalogsItemsBatchRequest'
    ];

request_params('ItemsGet') ->
    [
        'country',
        'item_ids',
        'language'
    ];


request_params('MediaCreate') ->
    [
        'MediaUploadRequest'
    ];

request_params('MediaGet') ->
    [
        'media_id'
    ];

request_params('MediaList') ->
    [
        'bookmark',
        'page_size'
    ];


request_params('OauthToken') ->
    [
        'grant_type'
    ];


request_params('PinsAnalytics') ->
    [
        'pin_id',
        'start_date',
        'end_date',
        'metric_types',
        'app_types',
        'split_field',
        'ad_account_id'
    ];

request_params('PinsCreate') ->
    [
        'Pin'
    ];

request_params('PinsDelete') ->
    [
        'pin_id'
    ];

request_params('PinsGet') ->
    [
        'pin_id',
        'ad_account_id'
    ];


request_params('UserAccountAnalytics') ->
    [
        'start_date',
        'end_date',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'metric_types',
        'split_field',
        'ad_account_id'
    ];

request_params('UserAccountGet') ->
    [
        'ad_account_id'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('AdAccountAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdAccountAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdAccountAnalytics', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['AD_ACCOUNT_ID', 'AD_GROUP_ENTITY_STATUS', 'AD_GROUP_ID', 'AD_ID', 'CAMPAIGN_DAILY_SPEND_CAP', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_ID', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_NAME', 'CHECKOUT_ROAS', 'CLICKTHROUGH_1', 'CLICKTHROUGH_1_GROSS', 'CLICKTHROUGH_2', 'CPC_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'CPM_IN_MICRO_DOLLAR', 'CTR', 'CTR_2', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'ECPC_IN_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPE_IN_DOLLAR', 'ECPM_IN_MICRO_DOLLAR', 'ECPV_IN_DOLLAR', 'ECTR', 'EENGAGEMENT_RATE', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ENGAGEMENT_RATE', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'IMPRESSION_2', 'INAPP_CHECKOUT_COST_PER_ACTION', 'OUTBOUND_CLICK_1', 'OUTBOUND_CLICK_2', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'PAID_IMPRESSION', 'PIN_ID', 'REPIN_1', 'REPIN_2', 'REPIN_RATE', 'SPEND_IN_DOLLAR', 'SPEND_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICKTHROUGH', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CONVERSIONS', 'TOTAL_CUSTOM', 'TOTAL_ENGAGEMENT', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'TOTAL_IMPRESSION_FREQUENCY', 'TOTAL_IMPRESSION_USER', 'TOTAL_LEAD', 'TOTAL_PAGE_VISIT', 'TOTAL_REPIN_RATE', 'TOTAL_SIGNUP', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_LENGTH', 'VIDEO_MRC_VIEWS_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS'] },
            required
        ]
    };

request_param_info('AdAccountAnalytics', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdAccountAnalytics', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountAnalytics', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdAccountsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AdAccountsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('AdAccountsList', 'include_shared_accounts') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'ad_group_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['AD_ACCOUNT_ID', 'AD_GROUP_ENTITY_STATUS', 'AD_GROUP_ID', 'AD_ID', 'CAMPAIGN_DAILY_SPEND_CAP', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_ID', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_NAME', 'CHECKOUT_ROAS', 'CLICKTHROUGH_1', 'CLICKTHROUGH_1_GROSS', 'CLICKTHROUGH_2', 'CPC_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'CPM_IN_MICRO_DOLLAR', 'CTR', 'CTR_2', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'ECPC_IN_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPE_IN_DOLLAR', 'ECPM_IN_MICRO_DOLLAR', 'ECPV_IN_DOLLAR', 'ECTR', 'EENGAGEMENT_RATE', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ENGAGEMENT_RATE', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'IMPRESSION_2', 'INAPP_CHECKOUT_COST_PER_ACTION', 'OUTBOUND_CLICK_1', 'OUTBOUND_CLICK_2', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'PAID_IMPRESSION', 'PIN_ID', 'REPIN_1', 'REPIN_2', 'REPIN_RATE', 'SPEND_IN_DOLLAR', 'SPEND_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICKTHROUGH', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CONVERSIONS', 'TOTAL_CUSTOM', 'TOTAL_ENGAGEMENT', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'TOTAL_IMPRESSION_FREQUENCY', 'TOTAL_IMPRESSION_USER', 'TOTAL_LEAD', 'TOTAL_PAGE_VISIT', 'TOTAL_REPIN_RATE', 'TOTAL_SIGNUP', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_LENGTH', 'VIDEO_MRC_VIEWS_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS'] },
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdGroupsAnalytics', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdGroupsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsList', 'campaign_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdGroupsList', 'ad_group_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdGroupsList', 'entity_statuses') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED'] },
            not_required
        ]
    };

request_param_info('AdGroupsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('AdGroupsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('AdGroupsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AdGroupsList', 'translate_interests_to_names') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdsAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdsAnalytics', 'ad_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdsAnalytics', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['AD_ACCOUNT_ID', 'AD_GROUP_ENTITY_STATUS', 'AD_GROUP_ID', 'AD_ID', 'CAMPAIGN_DAILY_SPEND_CAP', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_ID', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_NAME', 'CHECKOUT_ROAS', 'CLICKTHROUGH_1', 'CLICKTHROUGH_1_GROSS', 'CLICKTHROUGH_2', 'CPC_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'CPM_IN_MICRO_DOLLAR', 'CTR', 'CTR_2', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'ECPC_IN_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPE_IN_DOLLAR', 'ECPM_IN_MICRO_DOLLAR', 'ECPV_IN_DOLLAR', 'ECTR', 'EENGAGEMENT_RATE', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ENGAGEMENT_RATE', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'IMPRESSION_2', 'INAPP_CHECKOUT_COST_PER_ACTION', 'OUTBOUND_CLICK_1', 'OUTBOUND_CLICK_2', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'PAID_IMPRESSION', 'PIN_ID', 'REPIN_1', 'REPIN_2', 'REPIN_RATE', 'SPEND_IN_DOLLAR', 'SPEND_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICKTHROUGH', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CONVERSIONS', 'TOTAL_CUSTOM', 'TOTAL_ENGAGEMENT', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'TOTAL_IMPRESSION_FREQUENCY', 'TOTAL_IMPRESSION_USER', 'TOTAL_LEAD', 'TOTAL_PAGE_VISIT', 'TOTAL_REPIN_RATE', 'TOTAL_SIGNUP', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_LENGTH', 'VIDEO_MRC_VIEWS_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS'] },
            required
        ]
    };

request_param_info('AdsAnalytics', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdsAnalytics', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsList', 'campaign_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdsList', 'ad_group_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdsList', 'ad_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdsList', 'entity_statuses') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED'] },
            not_required
        ]
    };

request_param_info('AdsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('AdsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('AdsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AnalyticsCreateReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsCreateReport', 'AdsAnalyticsCreateAsyncRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AnalyticsGetReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsGetReport', 'token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'campaign_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['AD_ACCOUNT_ID', 'AD_GROUP_ENTITY_STATUS', 'AD_GROUP_ID', 'AD_ID', 'CAMPAIGN_DAILY_SPEND_CAP', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_ID', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_NAME', 'CHECKOUT_ROAS', 'CLICKTHROUGH_1', 'CLICKTHROUGH_1_GROSS', 'CLICKTHROUGH_2', 'CPC_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'CPM_IN_MICRO_DOLLAR', 'CTR', 'CTR_2', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'ECPC_IN_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPE_IN_DOLLAR', 'ECPM_IN_MICRO_DOLLAR', 'ECPV_IN_DOLLAR', 'ECTR', 'EENGAGEMENT_RATE', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ENGAGEMENT_RATE', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'IMPRESSION_2', 'INAPP_CHECKOUT_COST_PER_ACTION', 'OUTBOUND_CLICK_1', 'OUTBOUND_CLICK_2', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'PAID_IMPRESSION', 'PIN_ID', 'REPIN_1', 'REPIN_2', 'REPIN_RATE', 'SPEND_IN_DOLLAR', 'SPEND_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICKTHROUGH', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CONVERSIONS', 'TOTAL_CUSTOM', 'TOTAL_ENGAGEMENT', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'TOTAL_IMPRESSION_FREQUENCY', 'TOTAL_IMPRESSION_USER', 'TOTAL_LEAD', 'TOTAL_PAGE_VISIT', 'TOTAL_REPIN_RATE', 'TOTAL_SIGNUP', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_LENGTH', 'VIDEO_MRC_VIEWS_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS'] },
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CampaignsAnalytics', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('CampaignsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsList', 'campaign_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('CampaignsList', 'entity_statuses') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED'] },
            not_required
        ]
    };

request_param_info('CampaignsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CampaignsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('CampaignsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'product_group_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['AD_ACCOUNT_ID', 'AD_GROUP_ENTITY_STATUS', 'AD_GROUP_ID', 'AD_ID', 'CAMPAIGN_DAILY_SPEND_CAP', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_ID', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_NAME', 'CHECKOUT_ROAS', 'CLICKTHROUGH_1', 'CLICKTHROUGH_1_GROSS', 'CLICKTHROUGH_2', 'CPC_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'CPM_IN_MICRO_DOLLAR', 'CTR', 'CTR_2', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'ECPC_IN_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPE_IN_DOLLAR', 'ECPM_IN_MICRO_DOLLAR', 'ECPV_IN_DOLLAR', 'ECTR', 'EENGAGEMENT_RATE', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ENGAGEMENT_RATE', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'IMPRESSION_2', 'INAPP_CHECKOUT_COST_PER_ACTION', 'OUTBOUND_CLICK_1', 'OUTBOUND_CLICK_2', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'PAID_IMPRESSION', 'PIN_ID', 'REPIN_1', 'REPIN_2', 'REPIN_RATE', 'SPEND_IN_DOLLAR', 'SPEND_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICKTHROUGH', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CONVERSIONS', 'TOTAL_CUSTOM', 'TOTAL_ENGAGEMENT', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'TOTAL_IMPRESSION_FREQUENCY', 'TOTAL_IMPRESSION_USER', 'TOTAL_LEAD', 'TOTAL_PAGE_VISIT', 'TOTAL_REPIN_RATE', 'TOTAL_SIGNUP', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_LENGTH', 'VIDEO_MRC_VIEWS_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS'] },
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['1', '7', '30', '60'] },
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };


request_param_info('BoardSectionsCreate', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsCreate', 'BoardSection') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('BoardSectionsDelete', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsDelete', 'section_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsList', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BoardSectionsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardSectionsListPins', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsListPins', 'section_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsListPins', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BoardSectionsListPins', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardSectionsUpdate', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsUpdate', 'section_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardSectionsUpdate', 'BoardSection') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('BoardsCreate', 'Board') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('BoardsDelete', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardsGet', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BoardsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardsList', 'privacy') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['PUBLIC', 'PROTECTED', 'SECRET'] },
            not_required
        ]
    };

request_param_info('BoardsListPins', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardsListPins', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BoardsListPins', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardsUpdate', 'board_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BoardsUpdate', 'BoardUpdate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CatalogsProductGroupsCreate', 'CatalogsProductGroupCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CatalogsProductGroupsDelete', 'product_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'feed_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsUpdate', 'product_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupsUpdate', 'CatalogsProductGroupUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('FeedProcessingResultsList', 'feed_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('FeedProcessingResultsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('FeedProcessingResultsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('FeedsCreate', 'CatalogsFeedsCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('FeedsDelete', 'feed_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('FeedsGet', 'feed_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('FeedsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('FeedsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('FeedsUpdate', 'feed_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('FeedsUpdate', 'CatalogsFeedsUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ItemsBatchGet', 'batch_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ItemsBatchPost', 'CatalogsItemsBatchRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ItemsGet', 'country') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ItemsGet', 'item_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('ItemsGet', 'language') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };


request_param_info('MediaCreate', 'MediaUploadRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('MediaGet', 'media_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('MediaList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('MediaList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 100 }, 
            {min, 1 },
            not_required
        ]
    };


request_param_info('OauthToken', 'grant_type') ->
    #{
        source =>   body,
        rules => [
            {type, 'binary'},
            {enum, ['authorization_code', 'refresh_token'] },
            required
        ]
    };


request_param_info('PinsAnalytics', 'pin_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PinsAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('PinsAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('PinsAnalytics', 'metric_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['IMPRESSION', 'SAVE', 'PIN_CLICK', 'OUTBOUND_CLICK', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW'] },
            required
        ]
    };

request_param_info('PinsAnalytics', 'app_types') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };

request_param_info('PinsAnalytics', 'split_field') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['NO_SPLIT', 'APP_TYPE'] },
            not_required
        ]
    };

request_param_info('PinsAnalytics', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('PinsCreate', 'Pin') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('PinsDelete', 'pin_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PinsGet', 'pin_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PinsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };


request_param_info('UserAccountAnalytics', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalytics', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalytics', 'from_claimed_content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'pin_format') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'PRODUCT', 'REGULAR', 'VIDEO'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'app_types') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'metric_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ENGAGEMENT', 'ENGAGEMENT_RATE', 'IMPRESSION', 'OUTBOUND_CLICK', 'OUTBOUND_CLICK_RATE', 'PIN_CLICK', 'PIN_CLICK_RATE', 'SAVE', 'SAVE_RATE'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'split_field') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['NO_SPLIT', 'APP_TYPE', 'OWNED_CONTENT', 'PIN_FORMAT'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserAccountGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('AdAccountAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('AdAccountAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('AdAccountsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('AdGroupsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('AdGroupsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('AdsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('AdsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsCreateReport', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('AnalyticsCreateReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsCreateReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsGetReport', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsGetAsyncResponse', 'AdsAnalyticsGetAsyncResponse', Body, ValidatorState);
validate_response('AnalyticsGetReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsGetReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('CampaignsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CampaignsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('CampaignsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CampaignsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductGroupsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('ProductGroupsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ProductGroupsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('BoardSectionsCreate', 201, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('BoardSectionsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsCreate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsCreate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsCreate', 500, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardSectionsDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('BoardSectionsDelete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsDelete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardSectionsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('BoardSectionsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardSectionsListPins', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('BoardSectionsListPins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsListPins', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsListPins', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsListPins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardSectionsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('BoardSection', 'BoardSection', Body, ValidatorState);
validate_response('BoardSectionsUpdate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsUpdate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsUpdate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardSectionsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsCreate', 201, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('BoardsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('BoardsDelete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsDelete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsDelete', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsGet', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('BoardsGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('BoardsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsListPins', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('BoardsListPins', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsListPins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('Board', 'Board', Body, ValidatorState);
validate_response('BoardsUpdate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsUpdate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsUpdate', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CatalogsProductGroupsCreate', 201, Body, ValidatorState) ->
    validate_response_body('object', 'object', Body, ValidatorState);
validate_response('CatalogsProductGroupsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsCreate', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsCreate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsCreate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsProductGroup', 'CatalogsProductGroup', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedProcessingResultsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('FeedProcessingResultsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedProcessingResultsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedProcessingResultsList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedProcessingResultsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedsCreate', 201, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('FeedsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsCreate', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsCreate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsCreate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsCreate', 422, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedsDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('FeedsDelete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsDelete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsDelete', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedsGet', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('FeedsGet', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsGet', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedsList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('FeedsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsFeed', 'CatalogsFeed', Body, ValidatorState);
validate_response('FeedsUpdate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsUpdate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsUpdate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FeedsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsBatchGet', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('ItemsBatchGet', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsBatchPost', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('ItemsBatchPost', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchPost', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchPost', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsGet', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItems', 'CatalogsItems', Body, ValidatorState);
validate_response('ItemsGet', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('MediaCreate', 201, Body, ValidatorState) ->
    validate_response_body('MediaUpload', 'MediaUpload', Body, ValidatorState);
validate_response('MediaCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('MediaGet', 200, Body, ValidatorState) ->
    validate_response_body('MediaUploadDetails', 'MediaUploadDetails', Body, ValidatorState);
validate_response('MediaGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('MediaGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('MediaList', 200, Body, ValidatorState) ->
    validate_response_body('Paginated', 'Paginated', Body, ValidatorState);
validate_response('MediaList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('OauthToken', 200, Body, ValidatorState) ->
    validate_response_body('OauthAccessTokenResponse', 'OauthAccessTokenResponse', Body, ValidatorState);
validate_response('OauthToken', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('PinsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'AnalyticsMetricsResponse', Body, ValidatorState);
validate_response('PinsAnalytics', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsAnalytics', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PinsCreate', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('PinsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsCreate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsCreate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsCreate', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PinsDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('PinsDelete', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PinsGet', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('PinsGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('UserAccountAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'AnalyticsMetricsResponse', Body, ValidatorState);
validate_response('UserAccountAnalytics', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountGet', 200, Body, ValidatorState) ->
    validate_response_body('Account', 'Account', Body, ValidatorState);
validate_response('UserAccountGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps])
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
