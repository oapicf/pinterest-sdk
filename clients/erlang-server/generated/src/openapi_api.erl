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

request_params('AdAccountTargetingAnalyticsGet') ->
    [
        'ad_account_id',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];

request_params('AdAccountsCreate') ->
    [
        'AdAccountCreateRequest'
    ];

request_params('AdAccountsGet') ->
    [
        'ad_account_id'
    ];

request_params('AdAccountsList') ->
    [
        'bookmark',
        'page_size',
        'include_shared_accounts'
    ];

request_params('AnalyticsCreateMmmReport') ->
    [
        'ad_account_id',
        'CreateMMMReportRequest'
    ];

request_params('AnalyticsCreateReport') ->
    [
        'ad_account_id',
        'AdsAnalyticsCreateAsyncRequest'
    ];

request_params('AnalyticsCreateTemplateReport') ->
    [
        'ad_account_id',
        'template_id',
        'start_date',
        'end_date',
        'granularity'
    ];

request_params('AnalyticsGetMmmReport') ->
    [
        'ad_account_id',
        'token'
    ];

request_params('AnalyticsGetReport') ->
    [
        'ad_account_id',
        'token'
    ];

request_params('SandboxDelete') ->
    [
        'ad_account_id'
    ];

request_params('TemplatesList') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
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

request_params('AdGroupsAudienceSizing') ->
    [
        'ad_account_id',
        'AdGroupAudienceSizingRequest'
    ];

request_params('AdGroupsBidFloorGet') ->
    [
        'ad_account_id',
        'BidFloorRequest'
    ];

request_params('AdGroupsCreate') ->
    [
        'ad_account_id',
        'list'
    ];

request_params('AdGroupsGet') ->
    [
        'ad_account_id',
        'ad_group_id'
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

request_params('AdGroupsTargetingAnalyticsGet') ->
    [
        'ad_account_id',
        'ad_group_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
    ];

request_params('AdGroupsUpdate') ->
    [
        'ad_account_id',
        'list'
    ];


request_params('AdPreviewsCreate') ->
    [
        'ad_account_id',
        'AdPreviewRequest'
    ];

request_params('AdTargetingAnalyticsGet') ->
    [
        'ad_account_id',
        'ad_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
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

request_params('AdsCreate') ->
    [
        'ad_account_id',
        'list'
    ];

request_params('AdsGet') ->
    [
        'ad_account_id',
        'ad_id'
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

request_params('AdsUpdate') ->
    [
        'ad_account_id',
        'list'
    ];


request_params('AudienceInsightsGet') ->
    [
        'ad_account_id',
        'audience_insight_type'
    ];

request_params('AudienceInsightsScopeAndTypeGet') ->
    [
        'ad_account_id'
    ];


request_params('AudiencesCreate') ->
    [
        'ad_account_id',
        'AudienceCreateRequest'
    ];

request_params('AudiencesCreateCustom') ->
    [
        'ad_account_id',
        'AudienceCreateCustomRequest'
    ];

request_params('AudiencesGet') ->
    [
        'ad_account_id',
        'audience_id'
    ];

request_params('AudiencesList') ->
    [
        'ad_account_id',
        'bookmark',
        'order',
        'page_size',
        'ownership_type'
    ];

request_params('AudiencesUpdate') ->
    [
        'ad_account_id',
        'audience_id',
        'AudienceUpdateRequest'
    ];


request_params('AdsCreditRedeem') ->
    [
        'ad_account_id',
        'AdsCreditRedeemRequest'
    ];

request_params('AdsCreditsDiscountsGet') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];

request_params('BillingProfilesGet') ->
    [
        'ad_account_id',
        'is_active',
        'bookmark',
        'page_size'
    ];

request_params('SsioAccountsGet') ->
    [
        'ad_account_id'
    ];

request_params('SsioInsertionOrderCreate') ->
    [
        'ad_account_id',
        'SSIOCreateInsertionOrderRequest'
    ];

request_params('SsioInsertionOrderEdit') ->
    [
        'ad_account_id',
        'SSIOEditInsertionOrderRequest'
    ];

request_params('SsioInsertionOrdersStatusGetByAdAccount') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size'
    ];

request_params('SsioInsertionOrdersStatusGetByPinOrderId') ->
    [
        'ad_account_id',
        'pin_order_id'
    ];

request_params('SsioOrderLinesGetByAdAccount') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'pin_order_id'
    ];


request_params('BoardSectionsCreate') ->
    [
        'board_id',
        'BoardSection',
        'ad_account_id'
    ];

request_params('BoardSectionsDelete') ->
    [
        'board_id',
        'section_id',
        'ad_account_id'
    ];

request_params('BoardSectionsList') ->
    [
        'board_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];

request_params('BoardSectionsListPins') ->
    [
        'board_id',
        'section_id',
        'ad_account_id',
        'bookmark',
        'page_size'
    ];

request_params('BoardSectionsUpdate') ->
    [
        'board_id',
        'section_id',
        'BoardSection',
        'ad_account_id'
    ];

request_params('BoardsCreate') ->
    [
        'Board',
        'ad_account_id'
    ];

request_params('BoardsDelete') ->
    [
        'board_id',
        'ad_account_id'
    ];

request_params('BoardsGet') ->
    [
        'board_id',
        'ad_account_id'
    ];

request_params('BoardsList') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'privacy'
    ];

request_params('BoardsListPins') ->
    [
        'board_id',
        'bookmark',
        'page_size',
        'creative_types',
        'ad_account_id',
        'pin_metrics'
    ];

request_params('BoardsUpdate') ->
    [
        'board_id',
        'BoardUpdate',
        'ad_account_id'
    ];


request_params('BulkDownloadCreate') ->
    [
        'ad_account_id',
        'BulkDownloadRequest'
    ];

request_params('BulkRequestGet') ->
    [
        'ad_account_id',
        'bulk_request_id',
        'include_details'
    ];

request_params('BulkUpsertCreate') ->
    [
        'ad_account_id',
        'BulkUpsertRequest'
    ];


request_params('CampaignTargetingAnalyticsGet') ->
    [
        'ad_account_id',
        'campaign_ids',
        'start_date',
        'end_date',
        'targeting_types',
        'columns',
        'granularity',
        'click_window_days',
        'engagement_window_days',
        'view_window_days',
        'conversion_report_time',
        'attribution_types'
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

request_params('CampaignsCreate') ->
    [
        'ad_account_id',
        'list'
    ];

request_params('CampaignsGet') ->
    [
        'ad_account_id',
        'campaign_id'
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

request_params('CampaignsUpdate') ->
    [
        'ad_account_id',
        'list'
    ];


request_params('CatalogsList') ->
    [
        'bookmark',
        'page_size',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupPinsList') ->
    [
        'product_group_id',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsCreate') ->
    [
        'CatalogsProductGroupsCreateRequest',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsDelete') ->
    [
        'product_group_id',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsGet') ->
    [
        'product_group_id',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsList') ->
    [
        'feed_id',
        'catalog_id',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsProductCountsGet') ->
    [
        'product_group_id',
        'ad_account_id'
    ];

request_params('CatalogsProductGroupsUpdate') ->
    [
        'product_group_id',
        'CatalogsProductGroupsUpdateRequest',
        'ad_account_id'
    ];

request_params('FeedProcessingResultsList') ->
    [
        'feed_id',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];

request_params('FeedsCreate') ->
    [
        'FeedsCreateRequest',
        'ad_account_id'
    ];

request_params('FeedsDelete') ->
    [
        'feed_id',
        'ad_account_id'
    ];

request_params('FeedsGet') ->
    [
        'feed_id',
        'ad_account_id'
    ];

request_params('FeedsList') ->
    [
        'bookmark',
        'page_size',
        'catalog_id',
        'ad_account_id'
    ];

request_params('FeedsUpdate') ->
    [
        'feed_id',
        'FeedsUpdateRequest',
        'ad_account_id'
    ];

request_params('ItemsBatchGet') ->
    [
        'batch_id',
        'ad_account_id'
    ];

request_params('ItemsBatchPost') ->
    [
        'ItemsBatchPostRequest',
        'ad_account_id'
    ];

request_params('ItemsGet') ->
    [
        'country',
        'language',
        'ad_account_id',
        'item_ids',
        'filters'
    ];

request_params('ItemsIssuesList') ->
    [
        'processing_result_id',
        'bookmark',
        'page_size',
        'item_numbers',
        'item_validation_issue',
        'ad_account_id'
    ];

request_params('ProductsByProductGroupFilterList') ->
    [
        'CatalogsListProductsByFilterRequest',
        'bookmark',
        'page_size',
        'ad_account_id'
    ];


request_params('EventsCreate') ->
    [
        'ad_account_id',
        'ConversionEvents',
        'test'
    ];


request_params('ConversionTagsCreate') ->
    [
        'ad_account_id',
        'ConversionTagCreate'
    ];

request_params('ConversionTagsGet') ->
    [
        'ad_account_id',
        'conversion_tag_id'
    ];

request_params('ConversionTagsList') ->
    [
        'ad_account_id',
        'filter_deleted'
    ];

request_params('OcpmEligibleConversionTagsGet') ->
    [
        'ad_account_id'
    ];

request_params('PageVisitConversionTagsGet') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];


request_params('CustomerListsCreate') ->
    [
        'ad_account_id',
        'CustomerListRequest'
    ];

request_params('CustomerListsGet') ->
    [
        'ad_account_id',
        'customer_list_id'
    ];

request_params('CustomerListsList') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
    ];

request_params('CustomerListsUpdate') ->
    [
        'ad_account_id',
        'customer_list_id',
        'CustomerListUpdateRequest'
    ];


request_params('IntegrationsCommerceDel') ->
    [
        'external_business_id'
    ];

request_params('IntegrationsCommerceGet') ->
    [
        'external_business_id'
    ];

request_params('IntegrationsCommercePatch') ->
    [
        'external_business_id',
        'IntegrationRequestPatch'
    ];

request_params('IntegrationsCommercePost') ->
    [
        'IntegrationRequest'
    ];

request_params('IntegrationsGetById') ->
    [
        'id'
    ];

request_params('IntegrationsGetList') ->
    [
        'bookmark',
        'page_size'
    ];

request_params('IntegrationsLogsPost') ->
    [
        'IntegrationLogsRequest'
    ];


request_params('CountryKeywordsMetricsGet') ->
    [
        'ad_account_id',
        'country_code',
        'keywords'
    ];

request_params('KeywordsCreate') ->
    [
        'ad_account_id',
        'KeywordsRequest'
    ];

request_params('KeywordsGet') ->
    [
        'ad_account_id',
        'campaign_id',
        'ad_group_id',
        'match_types',
        'page_size',
        'bookmark'
    ];

request_params('KeywordsUpdate') ->
    [
        'ad_account_id',
        'KeywordUpdateBody'
    ];

request_params('TrendingKeywordsList') ->
    [
        'region',
        'trend_type',
        'interests',
        'genders',
        'ages',
        'normalize_against_group',
        'limit'
    ];


request_params('AdAccountsSubscriptionsDelById') ->
    [
        'ad_account_id',
        'subscription_id'
    ];

request_params('AdAccountsSubscriptionsGetById') ->
    [
        'ad_account_id',
        'subscription_id'
    ];

request_params('AdAccountsSubscriptionsGetList') ->
    [
        'ad_account_id',
        'page_size',
        'bookmark'
    ];

request_params('AdAccountsSubscriptionsPost') ->
    [
        'ad_account_id',
        'AdAccountCreateSubscriptionRequest'
    ];


request_params('LeadFormGet') ->
    [
        'ad_account_id',
        'lead_form_id'
    ];

request_params('LeadFormTestCreate') ->
    [
        'ad_account_id',
        'lead_form_id',
        'LeadFormTestRequest'
    ];

request_params('LeadFormsList') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
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


request_params('OrderLinesGet') ->
    [
        'ad_account_id',
        'order_line_id'
    ];

request_params('OrderLinesList') ->
    [
        'ad_account_id',
        'page_size',
        'order',
        'bookmark'
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
        'PinCreate',
        'ad_account_id'
    ];

request_params('PinsDelete') ->
    [
        'pin_id',
        'ad_account_id'
    ];

request_params('PinsGet') ->
    [
        'pin_id',
        'pin_metrics',
        'ad_account_id'
    ];

request_params('PinsList') ->
    [
        'bookmark',
        'page_size',
        'pin_filter',
        'include_protected_pins',
        'pin_type',
        'creative_types',
        'ad_account_id',
        'pin_metrics'
    ];

request_params('PinsSave') ->
    [
        'pin_id',
        'PinsSaveRequest',
        'ad_account_id'
    ];

request_params('PinsUpdate') ->
    [
        'pin_id',
        'PinUpdate',
        'ad_account_id'
    ];


request_params('ProductGroupPromotionsCreate') ->
    [
        'ad_account_id',
        'ProductGroupPromotionCreateRequest'
    ];

request_params('ProductGroupPromotionsGet') ->
    [
        'ad_account_id',
        'product_group_promotion_id'
    ];

request_params('ProductGroupPromotionsList') ->
    [
        'ad_account_id',
        'product_group_promotion_ids',
        'entity_statuses',
        'ad_group_id',
        'page_size',
        'order',
        'bookmark'
    ];

request_params('ProductGroupPromotionsUpdate') ->
    [
        'ad_account_id',
        'ProductGroupPromotionUpdateRequest'
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


request_params('AdAccountsCatalogsProductGroupsList') ->
    [
        'ad_account_id',
        'feed_profile_id'
    ];


request_params('AdAccountCountriesGet') ->
    [
    ];

request_params('DeliveryMetricsGet') ->
    [
        'report_type'
    ];

request_params('InterestTargetingOptionsGet') ->
    [
        'interest_id'
    ];

request_params('LeadFormQuestionsGet') ->
    [
    ];

request_params('MetricsReadyStateGet') ->
    [
        'date'
    ];

request_params('TargetingOptionsGet') ->
    [
        'targeting_type',
        'client_id',
        'oauth_signature',
        'timestamp'
    ];


request_params('SearchPartnerPins') ->
    [
        'term',
        'country_code',
        'bookmark',
        'locale',
        'limit'
    ];

request_params('SearchUserBoardsGet') ->
    [
        'ad_account_id',
        'bookmark',
        'page_size',
        'query'
    ];

request_params('SearchUserPinsList') ->
    [
        'query',
        'ad_account_id',
        'bookmark'
    ];


request_params('TermsRelatedList') ->
    [
        'terms'
    ];

request_params('TermsSuggestedList') ->
    [
        'term',
        'limit'
    ];


request_params('TermsOfServiceGet') ->
    [
        'ad_account_id',
        'include_html',
        'tos_type'
    ];


request_params('BoardsUserFollowsList') ->
    [
        'bookmark',
        'page_size',
        'explicit_following',
        'ad_account_id'
    ];

request_params('FollowUserUpdate') ->
    [
        'username',
        'FollowUserRequest'
    ];

request_params('FollowersList') ->
    [
        'bookmark',
        'page_size'
    ];

request_params('LinkedBusinessAccountsGet') ->
    [
    ];

request_params('UnverifyWebsiteDelete') ->
    [
        'website'
    ];

request_params('UserAccountAnalytics') ->
    [
        'start_date',
        'end_date',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'split_field',
        'ad_account_id'
    ];

request_params('UserAccountAnalyticsTopPins') ->
    [
        'start_date',
        'end_date',
        'sort_by',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'num_of_pins',
        'created_in_last_n_days',
        'ad_account_id'
    ];

request_params('UserAccountAnalyticsTopVideoPins') ->
    [
        'start_date',
        'end_date',
        'sort_by',
        'from_claimed_content',
        'pin_format',
        'app_types',
        'content_type',
        'source',
        'metric_types',
        'num_of_pins',
        'created_in_last_n_days',
        'ad_account_id'
    ];

request_params('UserAccountFollowedInterests') ->
    [
        'username',
        'bookmark',
        'page_size'
    ];

request_params('UserAccountGet') ->
    [
        'ad_account_id'
    ];

request_params('UserFollowingGet') ->
    [
        'bookmark',
        'page_size',
        'feed_type',
        'explicit_following',
        'ad_account_id'
    ];

request_params('UserWebsitesGet') ->
    [
        'bookmark',
        'page_size'
    ];

request_params('VerifyWebsiteUpdate') ->
    [
        'UserWebsiteVerifyRequest'
    ];

request_params('WebsiteVerificationGet') ->
    [
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
            {max_length, 18 },
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
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
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

request_param_info('AdAccountTargetingAnalyticsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'targeting_types') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdAccountTargetingAnalyticsGet', 'attribution_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdAccountsCreate', 'AdAccountCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdAccountsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
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
            {max, 250 }, 
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

request_param_info('AnalyticsCreateMmmReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsCreateMmmReport', 'CreateMMMReportRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AnalyticsCreateReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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

request_param_info('AnalyticsCreateTemplateReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsCreateTemplateReport', 'template_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsCreateTemplateReport', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            not_required
        ]
    };

request_param_info('AnalyticsCreateTemplateReport', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            not_required
        ]
    };

request_param_info('AnalyticsCreateTemplateReport', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AnalyticsGetMmmReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AnalyticsGetMmmReport', 'token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AnalyticsGetReport', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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

request_param_info('SandboxDelete', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('TemplatesList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('TemplatesList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('TemplatesList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('TemplatesList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('AdGroupsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
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

request_param_info('AdGroupsAudienceSizing', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsAudienceSizing', 'AdGroupAudienceSizingRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            not_required
        ]
    };

request_param_info('AdGroupsBidFloorGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsBidFloorGet', 'BidFloorRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdGroupsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsCreate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdGroupsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsGet', 'ad_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };

request_param_info('AdGroupsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
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

request_param_info('AdGroupsTargetingAnalyticsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'ad_group_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'targeting_types') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdGroupsTargetingAnalyticsGet', 'attribution_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdGroupsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdGroupsUpdate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('AdPreviewsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdPreviewsCreate', 'AdPreviewRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'ad_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'targeting_types') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('AdTargetingAnalyticsGet', 'attribution_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('AdsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
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

request_param_info('AdsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsCreate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsGet', 'ad_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };

request_param_info('AdsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
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

request_param_info('AdsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsUpdate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('AudienceInsightsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudienceInsightsGet', 'audience_insight_type') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('AudienceInsightsScopeAndTypeGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };


request_param_info('AudiencesCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesCreate', 'AudienceCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AudiencesCreateCustom', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesCreateCustom', 'AudienceCreateCustomRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AudiencesGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesGet', 'audience_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AudiencesList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('AudiencesList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('AudiencesList', 'ownership_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['OWNED', 'RECEIVED'] },
            not_required
        ]
    };

request_param_info('AudiencesUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesUpdate', 'audience_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AudiencesUpdate', 'AudienceUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            not_required
        ]
    };


request_param_info('AdsCreditRedeem', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsCreditRedeem', 'AdsCreditRedeemRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AdsCreditsDiscountsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdsCreditsDiscountsGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AdsCreditsDiscountsGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BillingProfilesGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BillingProfilesGet', 'is_active') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            required
        ]
    };

request_param_info('BillingProfilesGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BillingProfilesGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('SsioAccountsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioInsertionOrderCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioInsertionOrderCreate', 'SSIOCreateInsertionOrderRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('SsioInsertionOrderEdit', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioInsertionOrderEdit', 'SSIOEditInsertionOrderRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('SsioInsertionOrdersStatusGetByAdAccount', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioInsertionOrdersStatusGetByAdAccount', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SsioInsertionOrdersStatusGetByAdAccount', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('SsioInsertionOrdersStatusGetByPinOrderId', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioInsertionOrdersStatusGetByPinOrderId', 'pin_order_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SsioOrderLinesGetByAdAccount', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('SsioOrderLinesGetByAdAccount', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SsioOrderLinesGetByAdAccount', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('SsioOrderLinesGetByAdAccount', 'pin_order_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
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

request_param_info('BoardSectionsCreate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('BoardSectionsDelete', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('BoardSectionsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
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

request_param_info('BoardSectionsListPins', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
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

request_param_info('BoardSectionsUpdate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('BoardsCreate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('BoardsDelete', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('BoardsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('BoardsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardsList', 'privacy') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'PROTECTED', 'PUBLIC', 'SECRET', 'PUBLIC_AND_SECRET'] },
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
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardsListPins', 'creative_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'COLLECTION', 'IDEA'] },
            not_required
        ]
    };

request_param_info('BoardsListPins', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('BoardsListPins', 'pin_metrics') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
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

request_param_info('BoardsUpdate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };


request_param_info('BulkDownloadCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BulkDownloadCreate', 'BulkDownloadRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('BulkRequestGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BulkRequestGet', 'bulk_request_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('BulkRequestGet', 'include_details') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('BulkUpsertCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('BulkUpsertCreate', 'BulkUpsertRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CampaignTargetingAnalyticsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'campaign_ids') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'targeting_types') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'columns') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'granularity') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'click_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'conversion_report_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['TIME_OF_AD_ACTION', 'TIME_OF_CONVERSION'] },
            not_required
        ]
    };

request_param_info('CampaignTargetingAnalyticsGet', 'attribution_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('CampaignsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
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

request_param_info('CampaignsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsCreate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CampaignsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsGet', 'campaign_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };

request_param_info('CampaignsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
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

request_param_info('CampaignsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CampaignsUpdate', 'list') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CatalogsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CatalogsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CatalogsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupPinsList', 'product_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupPinsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CatalogsProductGroupPinsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupPinsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsCreate', 'CatalogsProductGroupsCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CatalogsProductGroupsCreate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('CatalogsProductGroupsDelete', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsGet', 'product_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'feed_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'catalog_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('CatalogsProductGroupsProductCountsGet', 'product_group_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CatalogsProductGroupsProductCountsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
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

request_param_info('CatalogsProductGroupsUpdate', 'CatalogsProductGroupsUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CatalogsProductGroupsUpdate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('FeedProcessingResultsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('FeedsCreate', 'FeedsCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('FeedsCreate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('FeedsDelete', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('FeedsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('FeedsList', 'catalog_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('FeedsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
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

request_param_info('FeedsUpdate', 'FeedsUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('FeedsUpdate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('ItemsBatchGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('ItemsBatchPost', 'ItemsBatchPostRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ItemsBatchPost', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('ItemsGet', 'language') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ItemsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('ItemsGet', 'item_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('ItemsGet', 'filters') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('ItemsIssuesList', 'processing_result_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ItemsIssuesList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ItemsIssuesList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('ItemsIssuesList', 'item_numbers') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('ItemsIssuesList', 'item_validation_issue') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('ItemsIssuesList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('ProductsByProductGroupFilterList', 'CatalogsListProductsByFilterRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ProductsByProductGroupFilterList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ProductsByProductGroupFilterList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('ProductsByProductGroupFilterList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };


request_param_info('EventsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('EventsCreate', 'ConversionEvents') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('EventsCreate', 'test') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };


request_param_info('ConversionTagsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ConversionTagsCreate', 'ConversionTagCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ConversionTagsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ConversionTagsGet', 'conversion_tag_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ConversionTagsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ConversionTagsList', 'filter_deleted') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('OcpmEligibleConversionTagsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('PageVisitConversionTagsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('PageVisitConversionTagsGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('PageVisitConversionTagsGet', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('PageVisitConversionTagsGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('CustomerListsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsCreate', 'CustomerListRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CustomerListsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsGet', 'customer_list_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('CustomerListsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('CustomerListsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('CustomerListsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsUpdate', 'customer_list_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CustomerListsUpdate', 'CustomerListUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('IntegrationsCommerceDel', 'external_business_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('IntegrationsCommerceGet', 'external_business_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('IntegrationsCommercePatch', 'external_business_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('IntegrationsCommercePatch', 'IntegrationRequestPatch') ->
    #{
        source =>   body,
        rules => [
            schema,
            not_required
        ]
    };

request_param_info('IntegrationsCommercePost', 'IntegrationRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            not_required
        ]
    };

request_param_info('IntegrationsGetById', 'id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('IntegrationsGetList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('IntegrationsGetList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('IntegrationsLogsPost', 'IntegrationLogsRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CountryKeywordsMetricsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('CountryKeywordsMetricsGet', 'country_code') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CountryKeywordsMetricsGet', 'keywords') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('KeywordsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('KeywordsCreate', 'KeywordsRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('KeywordsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('KeywordsGet', 'campaign_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('KeywordsGet', 'ad_group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('KeywordsGet', 'match_types') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('KeywordsGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('KeywordsGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('KeywordsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('KeywordsUpdate', 'KeywordUpdateBody') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('TrendingKeywordsList', 'region') ->
    #{
        source =>  binding ,
        rules => [
            required
        ]
    };

request_param_info('TrendingKeywordsList', 'trend_type') ->
    #{
        source =>  binding ,
        rules => [
            required
        ]
    };

request_param_info('TrendingKeywordsList', 'interests') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['animals', 'architecture', 'art', 'beauty', 'childrens_fashion', 'design', 'diy_and_crafts', 'education', 'electronics', 'entertainment', 'event_planning', 'finance', 'food_and_drinks', 'gardening', 'health', 'home_decor', 'mens_fashion', 'parenting', 'quotes', 'sport', 'travel', 'vehicles', 'wedding', 'womens_fashion'] },
            not_required
        ]
    };

request_param_info('TrendingKeywordsList', 'genders') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['female', 'male', 'unknown'] },
            not_required
        ]
    };

request_param_info('TrendingKeywordsList', 'ages') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['18-24', '25-34', '35-44', '45-49', '50-54', '55-64', '65+'] },
            not_required
        ]
    };

request_param_info('TrendingKeywordsList', 'normalize_against_group') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('TrendingKeywordsList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 50 }, 
            {min, 1 },
            not_required
        ]
    };


request_param_info('AdAccountsSubscriptionsDelById', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsDelById', 'subscription_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsGetById', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsGetById', 'subscription_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsGetList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsGetList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('AdAccountsSubscriptionsGetList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('AdAccountsSubscriptionsPost', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsSubscriptionsPost', 'AdAccountCreateSubscriptionRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('LeadFormGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('LeadFormGet', 'lead_form_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('LeadFormTestCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('LeadFormTestCreate', 'lead_form_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('LeadFormTestCreate', 'LeadFormTestRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('LeadFormsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('LeadFormsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('LeadFormsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('LeadFormsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
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
            {max, 250 }, 
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


request_param_info('OrderLinesGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('OrderLinesGet', 'order_line_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('OrderLinesList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('OrderLinesList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('OrderLinesList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('OrderLinesList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
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
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('PinsCreate', 'PinCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('PinsCreate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('PinsDelete', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
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

request_param_info('PinsGet', 'pin_metrics') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PinsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('PinsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('PinsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('PinsList', 'pin_filter') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['exclude_native', 'exclude_repins', 'has_been_promoted'] },
            not_required
        ]
    };

request_param_info('PinsList', 'include_protected_pins') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PinsList', 'pin_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['PRIVATE'] },
            not_required
        ]
    };

request_param_info('PinsList', 'creative_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['REGULAR', 'VIDEO', 'SHOPPING', 'CAROUSEL', 'MAX_VIDEO', 'SHOP_THE_PIN', 'COLLECTION', 'IDEA'] },
            not_required
        ]
    };

request_param_info('PinsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('PinsList', 'pin_metrics') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('PinsSave', 'pin_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PinsSave', 'PinsSaveRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('PinsSave', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('PinsUpdate', 'pin_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PinsUpdate', 'PinUpdate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('PinsUpdate', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };


request_param_info('ProductGroupPromotionsCreate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupPromotionsCreate', 'ProductGroupPromotionCreateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ProductGroupPromotionsGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupPromotionsGet', 'product_group_promotion_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'product_group_promotion_ids') ->
    #{
        source => qs_val  ,
        rules => [
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'entity_statuses') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ACTIVE', 'PAUSED', 'ARCHIVED', 'DRAFT', 'DELETED_DRAFT'] },
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'ad_group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'order') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ASCENDING', 'DESCENDING'] },
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ProductGroupPromotionsUpdate', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('ProductGroupPromotionsUpdate', 'ProductGroupPromotionUpdateRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
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
            {enum, ['SPEND_IN_MICRO_DOLLAR', 'PAID_IMPRESSION', 'SPEND_IN_DOLLAR', 'CPC_IN_MICRO_DOLLAR', 'ECPC_IN_MICRO_DOLLAR', 'ECPC_IN_DOLLAR', 'CTR', 'ECTR', 'CAMPAIGN_NAME', 'PIN_ID', 'TOTAL_ENGAGEMENT', 'ENGAGEMENT_1', 'ENGAGEMENT_2', 'ECPE_IN_DOLLAR', 'ENGAGEMENT_RATE', 'EENGAGEMENT_RATE', 'ECPM_IN_MICRO_DOLLAR', 'REPIN_RATE', 'CTR_2', 'CAMPAIGN_ID', 'ADVERTISER_ID', 'AD_ACCOUNT_ID', 'PIN_PROMOTION_ID', 'AD_ID', 'AD_GROUP_ID', 'CAMPAIGN_ENTITY_STATUS', 'CAMPAIGN_OBJECTIVE_TYPE', 'CPM_IN_MICRO_DOLLAR', 'CPM_IN_DOLLAR', 'AD_GROUP_ENTITY_STATUS', 'ORDER_LINE_ID', 'ORDER_LINE_NAME', 'CLICKTHROUGH_1', 'REPIN_1', 'IMPRESSION_1', 'IMPRESSION_1_GROSS', 'CLICKTHROUGH_1_GROSS', 'OUTBOUND_CLICK_1', 'CLICKTHROUGH_2', 'REPIN_2', 'IMPRESSION_2', 'OUTBOUND_CLICK_2', 'TOTAL_CLICKTHROUGH', 'TOTAL_IMPRESSION', 'TOTAL_IMPRESSION_USER', 'TOTAL_IMPRESSION_FREQUENCY', 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR', 'TOTAL_ENGAGEMENT_SIGNUP', 'TOTAL_ENGAGEMENT_CHECKOUT', 'TOTAL_ENGAGEMENT_LEAD', 'TOTAL_CLICK_SIGNUP', 'TOTAL_CLICK_CHECKOUT', 'TOTAL_CLICK_ADD_TO_CART', 'TOTAL_CLICK_LEAD', 'TOTAL_VIEW_SIGNUP', 'TOTAL_VIEW_CHECKOUT', 'TOTAL_VIEW_ADD_TO_CART', 'TOTAL_VIEW_LEAD', 'TOTAL_CONVERSIONS', 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_SESSIONS', 'WEB_SESSIONS_1', 'WEB_SESSIONS_2', 'CAMPAIGN_LIFETIME_SPEND_CAP', 'CAMPAIGN_DAILY_SPEND_CAP', 'TOTAL_PAGE_VISIT', 'TOTAL_SIGNUP', 'TOTAL_CHECKOUT', 'TOTAL_CUSTOM', 'TOTAL_LEAD', 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR', 'PAGE_VISIT_COST_PER_ACTION', 'PAGE_VISIT_ROAS', 'CHECKOUT_ROAS', 'CUSTOM_ROAS', 'VIDEO_MRC_VIEWS_1', 'VIDEO_3SEC_VIEWS_2', 'VIDEO_P100_COMPLETE_2', 'VIDEO_P0_COMBINED_2', 'VIDEO_P25_COMBINED_2', 'VIDEO_P50_COMBINED_2', 'VIDEO_P75_COMBINED_2', 'VIDEO_P95_COMBINED_2', 'VIDEO_MRC_VIEWS_2', 'VIDEO_LENGTH', 'ECPV_IN_DOLLAR', 'ECPCV_IN_DOLLAR', 'ECPCV_P95_IN_DOLLAR', 'TOTAL_VIDEO_3SEC_VIEWS', 'TOTAL_VIDEO_P100_COMPLETE', 'TOTAL_VIDEO_P0_COMBINED', 'TOTAL_VIDEO_P25_COMBINED', 'TOTAL_VIDEO_P50_COMBINED', 'TOTAL_VIDEO_P75_COMBINED', 'TOTAL_VIDEO_P95_COMBINED', 'TOTAL_VIDEO_MRC_VIEWS', 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND', 'TOTAL_REPIN_RATE', 'WEB_CHECKOUT_COST_PER_ACTION', 'WEB_CHECKOUT_ROAS', 'TOTAL_WEB_CHECKOUT', 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_CLICK_CHECKOUT', 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT', 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'TOTAL_WEB_VIEW_CHECKOUT', 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR', 'INAPP_CHECKOUT_COST_PER_ACTION', 'TOTAL_OFFLINE_CHECKOUT', 'IDEA_PIN_PRODUCT_TAG_VISIT_1', 'IDEA_PIN_PRODUCT_TAG_VISIT_2', 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT', 'LEADS', 'COST_PER_LEAD', 'QUIZ_COMPLETED', 'QUIZ_COMPLETION_RATE', 'SHOWCASE_PIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_CLICKTHROUGH', 'SHOWCASE_SUBPIN_CLICKTHROUGH', 'SHOWCASE_SUBPAGE_IMPRESSION', 'SHOWCASE_SUBPIN_IMPRESSION', 'SHOWCASE_SUBPAGE_SWIPE_LEFT', 'SHOWCASE_SUBPAGE_SWIPE_RIGHT', 'SHOWCASE_SUBPIN_SWIPE_LEFT', 'SHOWCASE_SUBPIN_SWIPE_RIGHT', 'SHOWCASE_SUBPAGE_REPIN', 'SHOWCASE_SUBPIN_REPIN', 'SHOWCASE_SUBPAGE_CLOSEUP', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD', 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD', 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION', 'TOTAL_CHECKOUT_CONVERSION_RATE', 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE', 'TOTAL_ADD_TO_CART_CONVERSION_RATE', 'TOTAL_SIGNUP_CONVERSION_RATE', 'TOTAL_PAGE_VISIT_CONVERSION_RATE', 'TOTAL_LEAD_CONVERSION_RATE', 'TOTAL_SEARCH_CONVERSION_RATE', 'TOTAL_WATCH_VIDEO_CONVERSION_RATE', 'TOTAL_UNKNOWN_CONVERSION_RATE', 'TOTAL_CUSTOM_CONVERSION_RATE'] },
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
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'engagement_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
            not_required
        ]
    };

request_param_info('ProductGroupsAnalytics', 'view_window_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['0', '1', '7', '14', '30', '60'] },
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


request_param_info('AdAccountsCatalogsProductGroupsList', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('AdAccountsCatalogsProductGroupsList', 'feed_profile_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };


request_param_info('DeliveryMetricsGet', 'report_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['SYNC', 'ASYNC'] },
            not_required
        ]
    };

request_param_info('InterestTargetingOptionsGet', 'interest_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('MetricsReadyStateGet', 'date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "^(\\d{4})-(\\d{2})-(\\d{2})$" },
            required
        ]
    };

request_param_info('TargetingOptionsGet', 'targeting_type') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {enum, ['APPTYPE', 'GENDER', 'LOCALE', 'AGE_BUCKET', 'LOCATION', 'GEO', 'INTEREST', 'KEYWORD', 'AUDIENCE_INCLUDE', 'AUDIENCE_EXCLUDE'] },
            required
        ]
    };

request_param_info('TargetingOptionsGet', 'client_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('TargetingOptionsGet', 'oauth_signature') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('TargetingOptionsGet', 'timestamp') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {pattern, "\\d+" },
            not_required
        ]
    };


request_param_info('SearchPartnerPins', 'term') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SearchPartnerPins', 'country_code') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SearchPartnerPins', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SearchPartnerPins', 'locale') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SearchPartnerPins', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 50 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('SearchUserBoardsGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('SearchUserBoardsGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SearchUserBoardsGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('SearchUserBoardsGet', 'query') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('SearchUserPinsList', 'query') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('SearchUserPinsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('SearchUserPinsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('TermsRelatedList', 'terms') ->
    #{
        source => qs_val  ,
        rules => [
            required
        ]
    };

request_param_info('TermsSuggestedList', 'term') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('TermsSuggestedList', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 10 }, 
            {min, 1 },
            not_required
        ]
    };


request_param_info('TermsOfServiceGet', 'ad_account_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            required
        ]
    };

request_param_info('TermsOfServiceGet', 'include_html') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('TermsOfServiceGet', 'tos_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };


request_param_info('BoardsUserFollowsList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('BoardsUserFollowsList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('BoardsUserFollowsList', 'explicit_following') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('BoardsUserFollowsList', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('FollowUserUpdate', 'username') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "(?!^\\d+$)^.+$" },
            required
        ]
    };

request_param_info('FollowUserUpdate', 'FollowUserRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('FollowersList', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('FollowersList', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('UnverifyWebsiteDelete', 'website') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
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
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA', 'PRODUCT', 'REGULAR', 'VIDEO'] },
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

request_param_info('UserAccountAnalytics', 'content_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'source') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
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
            {enum, ['NO_SPLIT', 'APP_TYPE', 'OWNED_CONTENT', 'SOURCE', 'PIN_FORMAT'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalytics', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'sort_by') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ENGAGEMENT', 'IMPRESSION', 'OUTBOUND_CLICK', 'PIN_CLICK', 'SAVE'] },
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'from_claimed_content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'pin_format') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA', 'PRODUCT', 'REGULAR', 'VIDEO'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'app_types') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'content_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'source') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'metric_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['ENGAGEMENT', 'ENGAGEMENT_RATE', 'IMPRESSION', 'OUTBOUND_CLICK', 'OUTBOUND_CLICK_RATE', 'PIN_CLICK', 'PIN_CLICK_RATE', 'SAVE', 'SAVE_RATE'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'num_of_pins') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 50 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'created_in_last_n_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['30'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopPins', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'start_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'end_date') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'date'},
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'sort_by') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['IMPRESSION', 'SAVE', 'OUTBOUND_CLICK', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW', 'VIDEO_10S_VIEW', 'VIDEO_START'] },
            required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'from_claimed_content') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['OTHER', 'CLAIMED', 'BOTH'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'pin_format') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'ORGANIC_IMAGE', 'ORGANIC_PRODUCT', 'ORGANIC_VIDEO', 'ADS_STANDARD', 'ADS_PRODUCT', 'ADS_VIDEO', 'ADS_IDEA', 'PRODUCT', 'REGULAR', 'VIDEO'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'app_types') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'MOBILE', 'TABLET', 'WEB'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'content_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'PAID', 'ORGANIC'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'source') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['ALL', 'YOUR_PINS', 'OTHER_PINS'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'metric_types') ->
    #{
        source => qs_val  ,
        rules => [
            {enum, ['IMPRESSION', 'SAVE', 'VIDEO_MRC_VIEW', 'VIDEO_AVG_WATCH_TIME', 'VIDEO_V50_WATCH_TIME', 'QUARTILE_95_PERCENT_VIEW', 'VIDEO_10S_VIEW', 'VIDEO_START', 'OUTBOUND_CLICK'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'num_of_pins') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 50 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'created_in_last_n_days') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {enum, ['30'] },
            not_required
        ]
    };

request_param_info('UserAccountAnalyticsTopVideoPins', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserAccountFollowedInterests', 'username') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            {pattern, "(?!^\\d+$)^.+$" },
            required
        ]
    };

request_param_info('UserAccountFollowedInterests', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UserAccountFollowedInterests', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('UserAccountGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserFollowingGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UserFollowingGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('UserFollowingGet', 'feed_type') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UserFollowingGet', 'explicit_following') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('UserFollowingGet', 'ad_account_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {max_length, 18 },
            {pattern, "^\\d+$" },
            not_required
        ]
    };

request_param_info('UserWebsitesGet', 'bookmark') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('UserWebsitesGet', 'page_size') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            {max, 250 }, 
            {min, 1 },
            not_required
        ]
    };

request_param_info('VerifyWebsiteUpdate', 'UserWebsiteVerifyRequest') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
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
    validate_response_body('list', 'AdAccountAnalyticsResponse_inner', Body, ValidatorState);
validate_response('AdAccountAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountTargetingAnalyticsGet', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('AdAccountTargetingAnalyticsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsCreate', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('AdAccountsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsGet', 200, Body, ValidatorState) ->
    validate_response_body('AdAccount', 'AdAccount', Body, ValidatorState);
validate_response('AdAccountsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsList', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_list_200_response', 'ad_accounts_list_200_response', Body, ValidatorState);
validate_response('AdAccountsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsCreateMmmReport', 200, Body, ValidatorState) ->
    validate_response_body('CreateMMMReportResponse', 'CreateMMMReportResponse', Body, ValidatorState);
validate_response('AnalyticsCreateMmmReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsCreateMmmReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsCreateReport', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('AnalyticsCreateReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsCreateReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsCreateTemplateReport', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsCreateAsyncResponse', 'AdsAnalyticsCreateAsyncResponse', Body, ValidatorState);
validate_response('AnalyticsCreateTemplateReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsCreateTemplateReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsGetMmmReport', 200, Body, ValidatorState) ->
    validate_response_body('GetMMMReportResponse', 'GetMMMReportResponse', Body, ValidatorState);
validate_response('AnalyticsGetMmmReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsGetMmmReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AnalyticsGetReport', 200, Body, ValidatorState) ->
    validate_response_body('AdsAnalyticsGetAsyncResponse', 'AdsAnalyticsGetAsyncResponse', Body, ValidatorState);
validate_response('AnalyticsGetReport', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AnalyticsGetReport', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SandboxDelete', 200, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);
validate_response('SandboxDelete', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SandboxDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('TemplatesList', 200, Body, ValidatorState) ->
    validate_response_body('templates_list_200_response', 'templates_list_200_response', Body, ValidatorState);
validate_response('TemplatesList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('TemplatesList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdGroupsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdGroupsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('AdGroupsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsAudienceSizing', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupAudienceSizingResponse', 'AdGroupAudienceSizingResponse', Body, ValidatorState);
validate_response('AdGroupsAudienceSizing', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsAudienceSizing', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsAudienceSizing', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsBidFloorGet', 200, Body, ValidatorState) ->
    validate_response_body('BidFloor', 'BidFloor', Body, ValidatorState);
validate_response('AdGroupsBidFloorGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsCreate', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupArrayResponse', 'AdGroupArrayResponse', Body, ValidatorState);
validate_response('AdGroupsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsGet', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupResponse', 'AdGroupResponse', Body, ValidatorState);
validate_response('AdGroupsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsList', 200, Body, ValidatorState) ->
    validate_response_body('ad_groups_list_200_response', 'ad_groups_list_200_response', Body, ValidatorState);
validate_response('AdGroupsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdGroupsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsTargetingAnalyticsGet', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('AdGroupsTargetingAnalyticsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdGroupsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('AdGroupArrayResponse', 'AdGroupArrayResponse', Body, ValidatorState);
validate_response('AdGroupsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdPreviewsCreate', 200, Body, ValidatorState) ->
    validate_response_body('AdPreviewURLResponse', 'AdPreviewURLResponse', Body, ValidatorState);
validate_response('AdPreviewsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdPreviewsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdTargetingAnalyticsGet', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('AdTargetingAnalyticsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'AdsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('AdsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsCreate', 200, Body, ValidatorState) ->
    validate_response_body('AdArrayResponse', 'AdArrayResponse', Body, ValidatorState);
validate_response('AdsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsGet', 200, Body, ValidatorState) ->
    validate_response_body('AdResponse', 'AdResponse', Body, ValidatorState);
validate_response('AdsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsList', 200, Body, ValidatorState) ->
    validate_response_body('ads_list_200_response', 'ads_list_200_response', Body, ValidatorState);
validate_response('AdsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('AdArrayResponse', 'AdArrayResponse', Body, ValidatorState);
validate_response('AdsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AudienceInsightsGet', 200, Body, ValidatorState) ->
    validate_response_body('AudienceInsightsResponse', 'AudienceInsightsResponse', Body, ValidatorState);
validate_response('AudienceInsightsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AudienceInsightsScopeAndTypeGet', 200, Body, ValidatorState) ->
    validate_response_body('AudienceDefinitionResponse', 'AudienceDefinitionResponse', Body, ValidatorState);
validate_response('AudienceInsightsScopeAndTypeGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AudiencesCreate', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('AudiencesCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AudiencesCreateCustom', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('AudiencesCreateCustom', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AudiencesGet', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('AudiencesGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AudiencesGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AudiencesList', 200, Body, ValidatorState) ->
    validate_response_body('audiences_list_200_response', 'audiences_list_200_response', Body, ValidatorState);
validate_response('AudiencesList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AudiencesList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AudiencesUpdate', 200, Body, ValidatorState) ->
    validate_response_body('Audience', 'Audience', Body, ValidatorState);
validate_response('AudiencesUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdsCreditRedeem', 200, Body, ValidatorState) ->
    validate_response_body('AdsCreditRedeemResponse', 'AdsCreditRedeemResponse', Body, ValidatorState);
validate_response('AdsCreditRedeem', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdsCreditRedeem', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdsCreditsDiscountsGet', 200, Body, ValidatorState) ->
    validate_response_body('ads_credits_discounts_get_200_response', 'ads_credits_discounts_get_200_response', Body, ValidatorState);
validate_response('AdsCreditsDiscountsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BillingProfilesGet', 200, Body, ValidatorState) ->
    validate_response_body('billing_profiles_get_200_response', 'billing_profiles_get_200_response', Body, ValidatorState);
validate_response('BillingProfilesGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioAccountsGet', 200, Body, ValidatorState) ->
    validate_response_body('SSIOAccountResponse', 'SSIOAccountResponse', Body, ValidatorState);
validate_response('SsioAccountsGet', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioAccountsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioInsertionOrderCreate', 200, Body, ValidatorState) ->
    validate_response_body('SSIOCreateInsertionOrderResponse', 'SSIOCreateInsertionOrderResponse', Body, ValidatorState);
validate_response('SsioInsertionOrderCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioInsertionOrderCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioInsertionOrderEdit', 200, Body, ValidatorState) ->
    validate_response_body('SSIOEditInsertionOrderResponse', 'SSIOEditInsertionOrderResponse', Body, ValidatorState);
validate_response('SsioInsertionOrderEdit', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioInsertionOrderEdit', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioInsertionOrdersStatusGetByAdAccount', 200, Body, ValidatorState) ->
    validate_response_body('ssio_insertion_orders_status_get_by_ad_account_200_response', 'ssio_insertion_orders_status_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('SsioInsertionOrdersStatusGetByAdAccount', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioInsertionOrdersStatusGetByAdAccount', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioInsertionOrdersStatusGetByPinOrderId', 200, Body, ValidatorState) ->
    validate_response_body('SSIOInsertionOrderStatusResponse', 'SSIOInsertionOrderStatusResponse', Body, ValidatorState);
validate_response('SsioInsertionOrdersStatusGetByPinOrderId', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioInsertionOrdersStatusGetByPinOrderId', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SsioOrderLinesGetByAdAccount', 200, Body, ValidatorState) ->
    validate_response_body('ssio_order_lines_get_by_ad_account_200_response', 'ssio_order_lines_get_by_ad_account_200_response', Body, ValidatorState);
validate_response('SsioOrderLinesGetByAdAccount', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SsioOrderLinesGetByAdAccount', 0, Body, ValidatorState) ->
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
    validate_response_body('board_sections_list_200_response', 'board_sections_list_200_response', Body, ValidatorState);
validate_response('BoardSectionsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardSectionsListPins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
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
    validate_response_body('boards_list_200_response', 'boards_list_200_response', Body, ValidatorState);
validate_response('BoardsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BoardsListPins', 200, Body, ValidatorState) ->
    validate_response_body('boards_list_pins_200_response', 'boards_list_pins_200_response', Body, ValidatorState);
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


validate_response('BulkDownloadCreate', 200, Body, ValidatorState) ->
    validate_response_body('BulkDownloadResponse', 'BulkDownloadResponse', Body, ValidatorState);
validate_response('BulkDownloadCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BulkRequestGet', 200, Body, ValidatorState) ->
    validate_response_body('BulkUpsertStatusResponse', 'BulkUpsertStatusResponse', Body, ValidatorState);
validate_response('BulkRequestGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('BulkUpsertCreate', 200, Body, ValidatorState) ->
    validate_response_body('BulkUpsertResponse', 'BulkUpsertResponse', Body, ValidatorState);
validate_response('BulkUpsertCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CampaignTargetingAnalyticsGet', 200, Body, ValidatorState) ->
    validate_response_body('MetricsResponse', 'MetricsResponse', Body, ValidatorState);
validate_response('CampaignTargetingAnalyticsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'CampaignsAnalyticsResponse_inner', Body, ValidatorState);
validate_response('CampaignsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CampaignsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsCreate', 200, Body, ValidatorState) ->
    validate_response_body('CampaignCreateResponse', 'CampaignCreateResponse', Body, ValidatorState);
validate_response('CampaignsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsGet', 200, Body, ValidatorState) ->
    validate_response_body('CampaignResponse', 'CampaignResponse', Body, ValidatorState);
validate_response('CampaignsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsList', 200, Body, ValidatorState) ->
    validate_response_body('campaigns_list_200_response', 'campaigns_list_200_response', Body, ValidatorState);
validate_response('CampaignsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CampaignsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CampaignsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('CampaignUpdateResponse', 'CampaignUpdateResponse', Body, ValidatorState);
validate_response('CampaignsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CatalogsList', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_list_200_response', 'catalogs_list_200_response', Body, ValidatorState);
validate_response('CatalogsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupPinsList', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('CatalogsProductGroupPinsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupPinsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupPinsList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupPinsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsCreate', 201, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_create_201_response', 'catalogs_product_groups_create_201_response', Body, ValidatorState);
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

validate_response('CatalogsProductGroupsGet', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_create_201_response', 'catalogs_product_groups_create_201_response', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsList', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_list_200_response', 'catalogs_product_groups_list_200_response', Body, ValidatorState);
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

validate_response('CatalogsProductGroupsProductCountsGet', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsProductGroupProductCounts', 'CatalogsProductGroupProductCounts', Body, ValidatorState);
validate_response('CatalogsProductGroupsProductCountsGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsProductCountsGet', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsProductCountsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CatalogsProductGroupsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_groups_create_201_response', 'catalogs_product_groups_create_201_response', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('CatalogsProductGroupsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FeedProcessingResultsList', 200, Body, ValidatorState) ->
    validate_response_body('feed_processing_results_list_200_response', 'feed_processing_results_list_200_response', Body, ValidatorState);
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
validate_response('FeedsCreate', 501, Body, ValidatorState) ->
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
    validate_response_body('feeds_list_200_response', 'feeds_list_200_response', Body, ValidatorState);
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
validate_response('ItemsBatchGet', 405, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsBatchPost', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItemsBatch', 'CatalogsItemsBatch', Body, ValidatorState);
validate_response('ItemsBatchPost', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchPost', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchPost', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsBatchPost', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsGet', 200, Body, ValidatorState) ->
    validate_response_body('CatalogsItems', 'CatalogsItems', Body, ValidatorState);
validate_response('ItemsGet', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsGet', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ItemsIssuesList', 200, Body, ValidatorState) ->
    validate_response_body('items_issues_list_200_response', 'items_issues_list_200_response', Body, ValidatorState);
validate_response('ItemsIssuesList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsIssuesList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsIssuesList', 501, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ItemsIssuesList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductsByProductGroupFilterList', 200, Body, ValidatorState) ->
    validate_response_body('catalogs_product_group_pins_list_200_response', 'catalogs_product_group_pins_list_200_response', Body, ValidatorState);
validate_response('ProductsByProductGroupFilterList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ProductsByProductGroupFilterList', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ProductsByProductGroupFilterList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('EventsCreate', 200, Body, ValidatorState) ->
    validate_response_body('ConversionApiResponse', 'ConversionApiResponse', Body, ValidatorState);
validate_response('EventsCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('EventsCreate', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('EventsCreate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('EventsCreate', 422, Body, ValidatorState) ->
    validate_response_body('DetailedError', 'DetailedError', Body, ValidatorState);
validate_response('EventsCreate', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('EventsCreate', 503, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('EventsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('ConversionTagsCreate', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagResponse', 'ConversionTagResponse', Body, ValidatorState);
validate_response('ConversionTagsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ConversionTagsGet', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagResponse', 'ConversionTagResponse', Body, ValidatorState);
validate_response('ConversionTagsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ConversionTagsList', 200, Body, ValidatorState) ->
    validate_response_body('ConversionTagListResponse', 'ConversionTagListResponse', Body, ValidatorState);
validate_response('ConversionTagsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('OcpmEligibleConversionTagsGet', 200, Body, ValidatorState) ->
    validate_response_body('map', 'ConversionEventResponse', Body, ValidatorState);
validate_response('OcpmEligibleConversionTagsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PageVisitConversionTagsGet', 200, Body, ValidatorState) ->
    validate_response_body('page_visit_conversion_tags_get_200_response', 'page_visit_conversion_tags_get_200_response', Body, ValidatorState);
validate_response('PageVisitConversionTagsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CustomerListsCreate', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('CustomerListsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CustomerListsGet', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('CustomerListsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CustomerListsList', 200, Body, ValidatorState) ->
    validate_response_body('customer_lists_list_200_response', 'customer_lists_list_200_response', Body, ValidatorState);
validate_response('CustomerListsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('CustomerListsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('CustomerList', 'CustomerList', Body, ValidatorState);
validate_response('CustomerListsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('IntegrationsCommerceDel', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('IntegrationsCommerceDel', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsCommerceGet', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('IntegrationsCommerceGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommerceGet', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommerceGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsCommercePatch', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('IntegrationsCommercePatch', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommercePatch', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommercePatch', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsCommercePost', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationMetadata', 'IntegrationMetadata', Body, ValidatorState);
validate_response('IntegrationsCommercePost', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommercePost', 409, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsCommercePost', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsGetById', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationRecord', 'IntegrationRecord', Body, ValidatorState);
validate_response('IntegrationsGetById', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('IntegrationsGetById', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsGetList', 200, Body, ValidatorState) ->
    validate_response_body('integrations_get_list_200_response', 'integrations_get_list_200_response', Body, ValidatorState);
validate_response('IntegrationsGetList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('IntegrationsLogsPost', 200, Body, ValidatorState) ->
    validate_response_body('IntegrationLogsSuccessResponse', 'IntegrationLogsSuccessResponse', Body, ValidatorState);
validate_response('IntegrationsLogsPost', 400, Body, ValidatorState) ->
    validate_response_body('DetailedError', 'DetailedError', Body, ValidatorState);
validate_response('IntegrationsLogsPost', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('CountryKeywordsMetricsGet', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsMetricsArrayResponse', 'KeywordsMetricsArrayResponse', Body, ValidatorState);
validate_response('CountryKeywordsMetricsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('KeywordsCreate', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsResponse', 'KeywordsResponse', Body, ValidatorState);
validate_response('KeywordsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('KeywordsGet', 200, Body, ValidatorState) ->
    validate_response_body('keywords_get_200_response', 'keywords_get_200_response', Body, ValidatorState);
validate_response('KeywordsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('KeywordsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('KeywordsResponse', 'KeywordsResponse', Body, ValidatorState);
validate_response('KeywordsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('TrendingKeywordsList', 200, Body, ValidatorState) ->
    validate_response_body('TrendingKeywordsResponse', 'TrendingKeywordsResponse', Body, ValidatorState);
validate_response('TrendingKeywordsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('TrendingKeywordsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdAccountsSubscriptionsDelById', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsDelById', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsDelById', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsDelById', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsDelById', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsSubscriptionsGetById', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountGetSubscriptionResponse', 'AdAccountGetSubscriptionResponse', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetById', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetById', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetById', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetById', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsSubscriptionsGetList', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_subscriptions_get_list_200_response', 'ad_accounts_subscriptions_get_list_200_response', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetList', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsGetList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('AdAccountsSubscriptionsPost', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountCreateSubscriptionResponse', 'AdAccountCreateSubscriptionResponse', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsPost', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsPost', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsSubscriptionsPost', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('LeadFormGet', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormResponse', 'LeadFormResponse', Body, ValidatorState);
validate_response('LeadFormGet', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('LeadFormGet', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('LeadFormGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('LeadFormTestCreate', 200, Body, ValidatorState) ->
    validate_response_body('LeadFormTestResponse', 'LeadFormTestResponse', Body, ValidatorState);
validate_response('LeadFormTestCreate', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('LeadFormTestCreate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('LeadFormTestCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('LeadFormsList', 200, Body, ValidatorState) ->
    validate_response_body('lead_forms_list_200_response', 'lead_forms_list_200_response', Body, ValidatorState);
validate_response('LeadFormsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('LeadFormsList', 0, Body, ValidatorState) ->
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
    validate_response_body('media_list_200_response', 'media_list_200_response', Body, ValidatorState);
validate_response('MediaList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('OauthToken', 200, Body, ValidatorState) ->
    validate_response_body('OauthAccessTokenResponse', 'OauthAccessTokenResponse', Body, ValidatorState);
validate_response('OauthToken', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('OrderLinesGet', 200, Body, ValidatorState) ->
    validate_response_body('OrderLine', 'OrderLine', Body, ValidatorState);
validate_response('OrderLinesGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('OrderLinesList', 200, Body, ValidatorState) ->
    validate_response_body('order_lines_list_200_response', 'order_lines_list_200_response', Body, ValidatorState);
validate_response('OrderLinesList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('PinsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'PinAnalyticsMetricsResponse', Body, ValidatorState);
validate_response('PinsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
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

validate_response('PinsList', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('PinsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PinsSave', 201, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('PinsSave', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsSave', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsSave', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('PinsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('Pin', 'Pin', Body, ValidatorState);
validate_response('PinsUpdate', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsUpdate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsUpdate', 429, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('PinsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('ProductGroupPromotionsCreate', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('ProductGroupPromotionsCreate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductGroupPromotionsGet', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('ProductGroupPromotionsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductGroupPromotionsList', 200, Body, ValidatorState) ->
    validate_response_body('product_group_promotions_list_200_response', 'product_group_promotions_list_200_response', Body, ValidatorState);
validate_response('ProductGroupPromotionsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductGroupPromotionsUpdate', 200, Body, ValidatorState) ->
    validate_response_body('ProductGroupPromotionResponse', 'ProductGroupPromotionResponse', Body, ValidatorState);
validate_response('ProductGroupPromotionsUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('ProductGroupsAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('list', 'ProductGroupAnalyticsResponse_inner', Body, ValidatorState);
validate_response('ProductGroupsAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('ProductGroupsAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdAccountsCatalogsProductGroupsList', 200, Body, ValidatorState) ->
    validate_response_body('ad_accounts_catalogs_product_groups_list_200_response', 'ad_accounts_catalogs_product_groups_list_200_response', Body, ValidatorState);
validate_response('AdAccountsCatalogsProductGroupsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsCatalogsProductGroupsList', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsCatalogsProductGroupsList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('AdAccountsCatalogsProductGroupsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('AdAccountCountriesGet', 200, Body, ValidatorState) ->
    validate_response_body('AdAccountsCountryResponse', 'AdAccountsCountryResponse', Body, ValidatorState);
validate_response('AdAccountCountriesGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('DeliveryMetricsGet', 200, Body, ValidatorState) ->
    validate_response_body('DeliveryMetricsResponse', 'DeliveryMetricsResponse', Body, ValidatorState);
validate_response('DeliveryMetricsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('InterestTargetingOptionsGet', 200, Body, ValidatorState) ->
    validate_response_body('SingleInterestTargetingOptionResponse', 'SingleInterestTargetingOptionResponse', Body, ValidatorState);
validate_response('InterestTargetingOptionsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('LeadFormQuestionsGet', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('LeadFormQuestionsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('MetricsReadyStateGet', 200, Body, ValidatorState) ->
    validate_response_body('BookClosedResponse', 'BookClosedResponse', Body, ValidatorState);
validate_response('MetricsReadyStateGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('TargetingOptionsGet', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('TargetingOptionsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('SearchPartnerPins', 200, Body, ValidatorState) ->
    validate_response_body('search_partner_pins_200_response', 'search_partner_pins_200_response', Body, ValidatorState);
validate_response('SearchPartnerPins', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SearchPartnerPins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SearchUserBoardsGet', 200, Body, ValidatorState) ->
    validate_response_body('search_user_boards_get_200_response', 'search_user_boards_get_200_response', Body, ValidatorState);
validate_response('SearchUserBoardsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('SearchUserPinsList', 200, Body, ValidatorState) ->
    validate_response_body('pins_list_200_response', 'pins_list_200_response', Body, ValidatorState);
validate_response('SearchUserPinsList', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('SearchUserPinsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('TermsRelatedList', 200, Body, ValidatorState) ->
    validate_response_body('RelatedTerms', 'RelatedTerms', Body, ValidatorState);
validate_response('TermsRelatedList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('TermsRelatedList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('TermsSuggestedList', 200, Body, ValidatorState) ->
    validate_response_body('list', 'string', Body, ValidatorState);
validate_response('TermsSuggestedList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('TermsSuggestedList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('TermsOfServiceGet', 200, Body, ValidatorState) ->
    validate_response_body('TermsOfService', 'TermsOfService', Body, ValidatorState);
validate_response('TermsOfServiceGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);


validate_response('BoardsUserFollowsList', 200, Body, ValidatorState) ->
    validate_response_body('boards_user_follows_list_200_response', 'boards_user_follows_list_200_response', Body, ValidatorState);
validate_response('BoardsUserFollowsList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('BoardsUserFollowsList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FollowUserUpdate', 200, Body, ValidatorState) ->
    validate_response_body('UserSummary', 'UserSummary', Body, ValidatorState);
validate_response('FollowUserUpdate', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FollowUserUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('FollowersList', 200, Body, ValidatorState) ->
    validate_response_body('followers_list_200_response', 'followers_list_200_response', Body, ValidatorState);
validate_response('FollowersList', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('FollowersList', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('LinkedBusinessAccountsGet', 200, Body, ValidatorState) ->
    validate_response_body('list', 'LinkedBusiness', Body, ValidatorState);
validate_response('LinkedBusinessAccountsGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UnverifyWebsiteDelete', 204, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('UnverifyWebsiteDelete', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UnverifyWebsiteDelete', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountAnalytics', 200, Body, ValidatorState) ->
    validate_response_body('map', 'AnalyticsMetricsResponse', Body, ValidatorState);
validate_response('UserAccountAnalytics', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountAnalytics', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountAnalytics', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountAnalyticsTopPins', 200, Body, ValidatorState) ->
    validate_response_body('TopPinsAnalyticsResponse', 'TopPinsAnalyticsResponse', Body, ValidatorState);
validate_response('UserAccountAnalyticsTopPins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountAnalyticsTopPins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountAnalyticsTopVideoPins', 200, Body, ValidatorState) ->
    validate_response_body('TopVideoPinsAnalyticsResponse', 'TopVideoPinsAnalyticsResponse', Body, ValidatorState);
validate_response('UserAccountAnalyticsTopVideoPins', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountAnalyticsTopVideoPins', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountFollowedInterests', 200, Body, ValidatorState) ->
    validate_response_body('user_account_followed_interests_200_response', 'user_account_followed_interests_200_response', Body, ValidatorState);
validate_response('UserAccountFollowedInterests', 400, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountFollowedInterests', 401, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountFollowedInterests', 404, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountFollowedInterests', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserAccountGet', 200, Body, ValidatorState) ->
    validate_response_body('Account', 'Account', Body, ValidatorState);
validate_response('UserAccountGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserAccountGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserFollowingGet', 200, Body, ValidatorState) ->
    validate_response_body('user_following_get_200_response', 'user_following_get_200_response', Body, ValidatorState);
validate_response('UserFollowingGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('UserWebsitesGet', 200, Body, ValidatorState) ->
    validate_response_body('user_websites_get_200_response', 'user_websites_get_200_response', Body, ValidatorState);
validate_response('UserWebsitesGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('UserWebsitesGet', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('VerifyWebsiteUpdate', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsiteSummary', 'UserWebsiteSummary', Body, ValidatorState);
validate_response('VerifyWebsiteUpdate', 0, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);

validate_response('WebsiteVerificationGet', 200, Body, ValidatorState) ->
    validate_response_body('UserWebsiteVerificationCode', 'UserWebsiteVerificationCode', Body, ValidatorState);
validate_response('WebsiteVerificationGet', 403, Body, ValidatorState) ->
    validate_response_body('Error', 'Error', Body, ValidatorState);
validate_response('WebsiteVerificationGet', 0, Body, ValidatorState) ->
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
