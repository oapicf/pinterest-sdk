// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    Granularity,
    GranularityFromJSON,
    GranularityToJSON,
    ProductGroupAnalyticsResponseInner,
    ProductGroupAnalyticsResponseInnerFromJSON,
    ProductGroupAnalyticsResponseInnerToJSON,
    ProductGroupPromotionCreateRequest,
    ProductGroupPromotionCreateRequestFromJSON,
    ProductGroupPromotionCreateRequestToJSON,
    ProductGroupPromotionResponse,
    ProductGroupPromotionResponseFromJSON,
    ProductGroupPromotionResponseToJSON,
    ProductGroupPromotionUpdateRequest,
    ProductGroupPromotionUpdateRequestFromJSON,
    ProductGroupPromotionUpdateRequestToJSON,
    ProductGroupPromotionsList200Response,
    ProductGroupPromotionsList200ResponseFromJSON,
    ProductGroupPromotionsList200ResponseToJSON,
} from '../models';

export interface ProductGroupPromotionsCreateRequest {
    adAccountId: string;
    productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest;
}

export interface ProductGroupPromotionsGetRequest {
    adAccountId: string;
    productGroupPromotionId: string;
}

export interface ProductGroupPromotionsListRequest {
    adAccountId: string;
    productGroupPromotionIds?: Array<string>;
    entityStatuses?: Array<ProductGroupPromotionsListEntityStatusesEnum>;
    adGroupId?: string;
    pageSize?: number;
    order?: ProductGroupPromotionsListOrderEnum;
    bookmark?: string;
}

export interface ProductGroupPromotionsUpdateRequest {
    adAccountId: string;
    productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest;
}

export interface ProductGroupsAnalyticsRequest {
    adAccountId: string;
    startDate: Date;
    endDate: Date;
    productGroupIds: Array<string>;
    columns: Array<ProductGroupsAnalyticsColumnsEnum>;
    granularity: Granularity;
    clickWindowDays?: ProductGroupsAnalyticsClickWindowDaysEnum;
    engagementWindowDays?: ProductGroupsAnalyticsEngagementWindowDaysEnum;
    viewWindowDays?: ProductGroupsAnalyticsViewWindowDaysEnum;
    conversionReportTime?: ProductGroupsAnalyticsConversionReportTimeEnum;
}


/**
 * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
 * Create product group promotions
 */
function productGroupPromotionsCreateRaw<T>(requestParameters: ProductGroupPromotionsCreateRequest, requestConfig: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling productGroupPromotionsCreate.');
    }

    if (requestParameters.productGroupPromotionCreateRequest === null || requestParameters.productGroupPromotionCreateRequest === undefined) {
        throw new runtime.RequiredError('productGroupPromotionCreateRequest','Required parameter requestParameters.productGroupPromotionCreateRequest was null or undefined when calling productGroupPromotionsCreate.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/product_group_promotions`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || ProductGroupPromotionCreateRequestToJSON(requestParameters.productGroupPromotionCreateRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ProductGroupPromotionResponseFromJSON(body), text);
    }

    return config;
}

/**
* Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
* Create product group promotions
*/
export function productGroupPromotionsCreate<T>(requestParameters: ProductGroupPromotionsCreateRequest, requestConfig?: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse>): QueryConfig<T> {
    return productGroupPromotionsCreateRaw(requestParameters, requestConfig);
}

/**
 * Get a product group promotion by id
 * Get a product group promotion by id
 */
function productGroupPromotionsGetRaw<T>(requestParameters: ProductGroupPromotionsGetRequest, requestConfig: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling productGroupPromotionsGet.');
    }

    if (requestParameters.productGroupPromotionId === null || requestParameters.productGroupPromotionId === undefined) {
        throw new runtime.RequiredError('productGroupPromotionId','Required parameter requestParameters.productGroupPromotionId was null or undefined when calling productGroupPromotionsGet.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))).replace(`{${"product_group_promotion_id"}}`, encodeURIComponent(String(requestParameters.productGroupPromotionId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ProductGroupPromotionResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get a product group promotion by id
* Get a product group promotion by id
*/
export function productGroupPromotionsGet<T>(requestParameters: ProductGroupPromotionsGetRequest, requestConfig?: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse>): QueryConfig<T> {
    return productGroupPromotionsGetRaw(requestParameters, requestConfig);
}

/**
 * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
 * Get product group promotions
 */
function productGroupPromotionsListRaw<T>(requestParameters: ProductGroupPromotionsListRequest, requestConfig: runtime.TypedQueryConfig<T, ProductGroupPromotionsList200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling productGroupPromotionsList.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.productGroupPromotionIds) {
        queryParameters['product_group_promotion_ids'] = requestParameters.productGroupPromotionIds;
    }


    if (requestParameters.entityStatuses) {
        queryParameters['entity_statuses'] = requestParameters.entityStatuses;
    }


    if (requestParameters.adGroupId !== undefined) {
        queryParameters['ad_group_id'] = requestParameters.adGroupId;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['page_size'] = requestParameters.pageSize;
    }


    if (requestParameters.order !== undefined) {
        queryParameters['order'] = requestParameters.order;
    }


    if (requestParameters.bookmark !== undefined) {
        queryParameters['bookmark'] = requestParameters.bookmark;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/product_group_promotions`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ProductGroupPromotionsList200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
* Get product group promotions
*/
export function productGroupPromotionsList<T>(requestParameters: ProductGroupPromotionsListRequest, requestConfig?: runtime.TypedQueryConfig<T, ProductGroupPromotionsList200Response>): QueryConfig<T> {
    return productGroupPromotionsListRaw(requestParameters, requestConfig);
}

/**
 * Update multiple existing Product Group Promotions (by product_group_id)
 * Update product group promotions
 */
function productGroupPromotionsUpdateRaw<T>(requestParameters: ProductGroupPromotionsUpdateRequest, requestConfig: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling productGroupPromotionsUpdate.');
    }

    if (requestParameters.productGroupPromotionUpdateRequest === null || requestParameters.productGroupPromotionUpdateRequest === undefined) {
        throw new runtime.RequiredError('productGroupPromotionUpdateRequest','Required parameter requestParameters.productGroupPromotionUpdateRequest was null or undefined when calling productGroupPromotionsUpdate.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/product_group_promotions`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'PATCH',
            headers: headerParameters,
        },
        body: queryParameters || ProductGroupPromotionUpdateRequestToJSON(requestParameters.productGroupPromotionUpdateRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ProductGroupPromotionResponseFromJSON(body), text);
    }

    return config;
}

/**
* Update multiple existing Product Group Promotions (by product_group_id)
* Update product group promotions
*/
export function productGroupPromotionsUpdate<T>(requestParameters: ProductGroupPromotionsUpdateRequest, requestConfig?: runtime.TypedQueryConfig<T, ProductGroupPromotionResponse>): QueryConfig<T> {
    return productGroupPromotionsUpdateRaw(requestParameters, requestConfig);
}

/**
 * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
 * Get product group analytics
 */
function productGroupsAnalyticsRaw<T>(requestParameters: ProductGroupsAnalyticsRequest, requestConfig: runtime.TypedQueryConfig<T, Array<ProductGroupAnalyticsResponseInner>> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling productGroupsAnalytics.');
    }

    if (requestParameters.startDate === null || requestParameters.startDate === undefined) {
        throw new runtime.RequiredError('startDate','Required parameter requestParameters.startDate was null or undefined when calling productGroupsAnalytics.');
    }

    if (requestParameters.endDate === null || requestParameters.endDate === undefined) {
        throw new runtime.RequiredError('endDate','Required parameter requestParameters.endDate was null or undefined when calling productGroupsAnalytics.');
    }

    if (requestParameters.productGroupIds === null || requestParameters.productGroupIds === undefined) {
        throw new runtime.RequiredError('productGroupIds','Required parameter requestParameters.productGroupIds was null or undefined when calling productGroupsAnalytics.');
    }

    if (requestParameters.columns === null || requestParameters.columns === undefined) {
        throw new runtime.RequiredError('columns','Required parameter requestParameters.columns was null or undefined when calling productGroupsAnalytics.');
    }

    if (requestParameters.granularity === null || requestParameters.granularity === undefined) {
        throw new runtime.RequiredError('granularity','Required parameter requestParameters.granularity was null or undefined when calling productGroupsAnalytics.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.startDate !== undefined) {
        queryParameters['start_date'] = (requestParameters.startDate as any).toISOString().substring(0,10);
    }


    if (requestParameters.endDate !== undefined) {
        queryParameters['end_date'] = (requestParameters.endDate as any).toISOString().substring(0,10);
    }


    if (requestParameters.productGroupIds) {
        queryParameters['product_group_ids'] = requestParameters.productGroupIds;
    }


    if (requestParameters.columns) {
        queryParameters['columns'] = requestParameters.columns?.join(runtime.COLLECTION_FORMATS["csv"]);
    }


    if (requestParameters.granularity !== undefined) {
        queryParameters['granularity'] = requestParameters.granularity;
    }


    if (requestParameters.clickWindowDays !== undefined) {
        queryParameters['click_window_days'] = requestParameters.clickWindowDays;
    }


    if (requestParameters.engagementWindowDays !== undefined) {
        queryParameters['engagement_window_days'] = requestParameters.engagementWindowDays;
    }


    if (requestParameters.viewWindowDays !== undefined) {
        queryParameters['view_window_days'] = requestParameters.viewWindowDays;
    }


    if (requestParameters.conversionReportTime !== undefined) {
        queryParameters['conversion_report_time'] = requestParameters.conversionReportTime;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/product_groups/analytics`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(body.map(ProductGroupAnalyticsResponseInnerFromJSON), text);
    }

    return config;
}

/**
* Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
* Get product group analytics
*/
export function productGroupsAnalytics<T>(requestParameters: ProductGroupsAnalyticsRequest, requestConfig?: runtime.TypedQueryConfig<T, Array<ProductGroupAnalyticsResponseInner>>): QueryConfig<T> {
    return productGroupsAnalyticsRaw(requestParameters, requestConfig);
}


/**
    * @export
    * @enum {string}
    */
export enum ProductGroupPromotionsListEntityStatusesEnum {
    Active = 'ACTIVE',
    Paused = 'PAUSED',
    Archived = 'ARCHIVED',
    Draft = 'DRAFT',
    DeletedDraft = 'DELETED_DRAFT'
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupPromotionsListOrderEnum {
    Ascending = 'ASCENDING',
    Descending = 'DESCENDING'
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupsAnalyticsColumnsEnum {
    SpendInMicroDollar = 'SPEND_IN_MICRO_DOLLAR',
    PaidImpression = 'PAID_IMPRESSION',
    SpendInDollar = 'SPEND_IN_DOLLAR',
    CpcInMicroDollar = 'CPC_IN_MICRO_DOLLAR',
    EcpcInMicroDollar = 'ECPC_IN_MICRO_DOLLAR',
    EcpcInDollar = 'ECPC_IN_DOLLAR',
    Ctr = 'CTR',
    Ectr = 'ECTR',
    CampaignName = 'CAMPAIGN_NAME',
    PinId = 'PIN_ID',
    TotalEngagement = 'TOTAL_ENGAGEMENT',
    Engagement1 = 'ENGAGEMENT_1',
    Engagement2 = 'ENGAGEMENT_2',
    EcpeInDollar = 'ECPE_IN_DOLLAR',
    EngagementRate = 'ENGAGEMENT_RATE',
    EengagementRate = 'EENGAGEMENT_RATE',
    EcpmInMicroDollar = 'ECPM_IN_MICRO_DOLLAR',
    RepinRate = 'REPIN_RATE',
    Ctr2 = 'CTR_2',
    CampaignId = 'CAMPAIGN_ID',
    AdvertiserId = 'ADVERTISER_ID',
    AdAccountId = 'AD_ACCOUNT_ID',
    PinPromotionId = 'PIN_PROMOTION_ID',
    AdId = 'AD_ID',
    AdGroupId = 'AD_GROUP_ID',
    CampaignEntityStatus = 'CAMPAIGN_ENTITY_STATUS',
    CampaignObjectiveType = 'CAMPAIGN_OBJECTIVE_TYPE',
    CpmInMicroDollar = 'CPM_IN_MICRO_DOLLAR',
    CpmInDollar = 'CPM_IN_DOLLAR',
    AdGroupEntityStatus = 'AD_GROUP_ENTITY_STATUS',
    OrderLineId = 'ORDER_LINE_ID',
    OrderLineName = 'ORDER_LINE_NAME',
    Clickthrough1 = 'CLICKTHROUGH_1',
    Repin1 = 'REPIN_1',
    Impression1 = 'IMPRESSION_1',
    Impression1Gross = 'IMPRESSION_1_GROSS',
    Clickthrough1Gross = 'CLICKTHROUGH_1_GROSS',
    OutboundClick1 = 'OUTBOUND_CLICK_1',
    Clickthrough2 = 'CLICKTHROUGH_2',
    Repin2 = 'REPIN_2',
    Impression2 = 'IMPRESSION_2',
    OutboundClick2 = 'OUTBOUND_CLICK_2',
    TotalClickthrough = 'TOTAL_CLICKTHROUGH',
    TotalImpression = 'TOTAL_IMPRESSION',
    TotalImpressionUser = 'TOTAL_IMPRESSION_USER',
    TotalImpressionFrequency = 'TOTAL_IMPRESSION_FREQUENCY',
    CostPerOutboundClickInDollar = 'COST_PER_OUTBOUND_CLICK_IN_DOLLAR',
    TotalEngagementSignup = 'TOTAL_ENGAGEMENT_SIGNUP',
    TotalEngagementCheckout = 'TOTAL_ENGAGEMENT_CHECKOUT',
    TotalEngagementLead = 'TOTAL_ENGAGEMENT_LEAD',
    TotalClickSignup = 'TOTAL_CLICK_SIGNUP',
    TotalClickCheckout = 'TOTAL_CLICK_CHECKOUT',
    TotalClickAddToCart = 'TOTAL_CLICK_ADD_TO_CART',
    TotalClickLead = 'TOTAL_CLICK_LEAD',
    TotalViewSignup = 'TOTAL_VIEW_SIGNUP',
    TotalViewCheckout = 'TOTAL_VIEW_CHECKOUT',
    TotalViewAddToCart = 'TOTAL_VIEW_ADD_TO_CART',
    TotalViewLead = 'TOTAL_VIEW_LEAD',
    TotalConversions = 'TOTAL_CONVERSIONS',
    TotalEngagementSignupValueInMicroDollar = 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalEngagementCheckoutValueInMicroDollar = 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalClickSignupValueInMicroDollar = 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalClickCheckoutValueInMicroDollar = 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalViewSignupValueInMicroDollar = 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalViewCheckoutValueInMicroDollar = 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebSessions = 'TOTAL_WEB_SESSIONS',
    WebSessions1 = 'WEB_SESSIONS_1',
    WebSessions2 = 'WEB_SESSIONS_2',
    CampaignLifetimeSpendCap = 'CAMPAIGN_LIFETIME_SPEND_CAP',
    CampaignDailySpendCap = 'CAMPAIGN_DAILY_SPEND_CAP',
    TotalPageVisit = 'TOTAL_PAGE_VISIT',
    TotalSignup = 'TOTAL_SIGNUP',
    TotalCheckout = 'TOTAL_CHECKOUT',
    TotalCustom = 'TOTAL_CUSTOM',
    TotalLead = 'TOTAL_LEAD',
    TotalSignupValueInMicroDollar = 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalCheckoutValueInMicroDollar = 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalCustomValueInMicroDollar = 'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR',
    PageVisitCostPerAction = 'PAGE_VISIT_COST_PER_ACTION',
    PageVisitRoas = 'PAGE_VISIT_ROAS',
    CheckoutRoas = 'CHECKOUT_ROAS',
    CustomRoas = 'CUSTOM_ROAS',
    VideoMrcViews1 = 'VIDEO_MRC_VIEWS_1',
    Video3SecViews2 = 'VIDEO_3SEC_VIEWS_2',
    VideoP100Complete2 = 'VIDEO_P100_COMPLETE_2',
    VideoP0Combined2 = 'VIDEO_P0_COMBINED_2',
    VideoP25Combined2 = 'VIDEO_P25_COMBINED_2',
    VideoP50Combined2 = 'VIDEO_P50_COMBINED_2',
    VideoP75Combined2 = 'VIDEO_P75_COMBINED_2',
    VideoP95Combined2 = 'VIDEO_P95_COMBINED_2',
    VideoMrcViews2 = 'VIDEO_MRC_VIEWS_2',
    PaidVideoViewableRate = 'PAID_VIDEO_VIEWABLE_RATE',
    VideoLength = 'VIDEO_LENGTH',
    EcpvInDollar = 'ECPV_IN_DOLLAR',
    EcpcvInDollar = 'ECPCV_IN_DOLLAR',
    EcpcvP95InDollar = 'ECPCV_P95_IN_DOLLAR',
    TotalVideo3SecViews = 'TOTAL_VIDEO_3SEC_VIEWS',
    TotalVideoP100Complete = 'TOTAL_VIDEO_P100_COMPLETE',
    TotalVideoP0Combined = 'TOTAL_VIDEO_P0_COMBINED',
    TotalVideoP25Combined = 'TOTAL_VIDEO_P25_COMBINED',
    TotalVideoP50Combined = 'TOTAL_VIDEO_P50_COMBINED',
    TotalVideoP75Combined = 'TOTAL_VIDEO_P75_COMBINED',
    TotalVideoP95Combined = 'TOTAL_VIDEO_P95_COMBINED',
    TotalVideoMrcViews = 'TOTAL_VIDEO_MRC_VIEWS',
    TotalVideoAvgWatchtimeInSecond = 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND',
    TotalRepinRate = 'TOTAL_REPIN_RATE',
    WebCheckoutCostPerAction = 'WEB_CHECKOUT_COST_PER_ACTION',
    WebCheckoutRoas = 'WEB_CHECKOUT_ROAS',
    TotalWebCheckout = 'TOTAL_WEB_CHECKOUT',
    TotalWebCheckoutValueInMicroDollar = 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebClickCheckout = 'TOTAL_WEB_CLICK_CHECKOUT',
    TotalWebClickCheckoutValueInMicroDollar = 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebEngagementCheckout = 'TOTAL_WEB_ENGAGEMENT_CHECKOUT',
    TotalWebEngagementCheckoutValueInMicroDollar = 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebViewCheckout = 'TOTAL_WEB_VIEW_CHECKOUT',
    TotalWebViewCheckoutValueInMicroDollar = 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    InappCheckoutCostPerAction = 'INAPP_CHECKOUT_COST_PER_ACTION',
    TotalOfflineCheckout = 'TOTAL_OFFLINE_CHECKOUT',
    IdeaPinProductTagVisit1 = 'IDEA_PIN_PRODUCT_TAG_VISIT_1',
    IdeaPinProductTagVisit2 = 'IDEA_PIN_PRODUCT_TAG_VISIT_2',
    TotalIdeaPinProductTagVisit = 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT',
    Leads = 'LEADS',
    CostPerLead = 'COST_PER_LEAD',
    QuizCompleted = 'QUIZ_COMPLETED',
    QuizPinResultOpen = 'QUIZ_PIN_RESULT_OPEN',
    QuizCompletionRate = 'QUIZ_COMPLETION_RATE',
    ShowcasePinClickthrough = 'SHOWCASE_PIN_CLICKTHROUGH',
    ShowcaseSubpageClickthrough = 'SHOWCASE_SUBPAGE_CLICKTHROUGH',
    ShowcaseSubpinClickthrough = 'SHOWCASE_SUBPIN_CLICKTHROUGH',
    ShowcaseSubpageImpression = 'SHOWCASE_SUBPAGE_IMPRESSION',
    ShowcaseSubpinImpression = 'SHOWCASE_SUBPIN_IMPRESSION',
    ShowcaseSubpageSwipeLeft = 'SHOWCASE_SUBPAGE_SWIPE_LEFT',
    ShowcaseSubpageSwipeRight = 'SHOWCASE_SUBPAGE_SWIPE_RIGHT',
    ShowcaseSubpinSwipeLeft = 'SHOWCASE_SUBPIN_SWIPE_LEFT',
    ShowcaseSubpinSwipeRight = 'SHOWCASE_SUBPIN_SWIPE_RIGHT',
    ShowcaseSubpageRepin = 'SHOWCASE_SUBPAGE_REPIN',
    ShowcaseSubpinRepin = 'SHOWCASE_SUBPIN_REPIN',
    ShowcaseSubpageCloseup = 'SHOWCASE_SUBPAGE_CLOSEUP',
    ShowcaseCardThumbnailSwipeForward = 'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD',
    ShowcaseCardThumbnailSwipeBackward = 'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD',
    ShowcaseAverageSubpageCloseupPerSession = 'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION',
    TotalCheckoutConversionRate = 'TOTAL_CHECKOUT_CONVERSION_RATE',
    TotalViewCategoryConversionRate = 'TOTAL_VIEW_CATEGORY_CONVERSION_RATE',
    TotalAddToCartConversionRate = 'TOTAL_ADD_TO_CART_CONVERSION_RATE',
    TotalSignupConversionRate = 'TOTAL_SIGNUP_CONVERSION_RATE',
    TotalPageVisitConversionRate = 'TOTAL_PAGE_VISIT_CONVERSION_RATE',
    TotalLeadConversionRate = 'TOTAL_LEAD_CONVERSION_RATE',
    TotalSearchConversionRate = 'TOTAL_SEARCH_CONVERSION_RATE',
    TotalWatchVideoConversionRate = 'TOTAL_WATCH_VIDEO_CONVERSION_RATE',
    TotalUnknownConversionRate = 'TOTAL_UNKNOWN_CONVERSION_RATE',
    TotalCustomConversionRate = 'TOTAL_CUSTOM_CONVERSION_RATE'
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupsAnalyticsClickWindowDaysEnum {
    NUMBER_0 = 0,
    NUMBER_1 = 1,
    NUMBER_7 = 7,
    NUMBER_14 = 14,
    NUMBER_30 = 30,
    NUMBER_60 = 60
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupsAnalyticsEngagementWindowDaysEnum {
    NUMBER_0 = 0,
    NUMBER_1 = 1,
    NUMBER_7 = 7,
    NUMBER_14 = 14,
    NUMBER_30 = 30,
    NUMBER_60 = 60
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupsAnalyticsViewWindowDaysEnum {
    NUMBER_0 = 0,
    NUMBER_1 = 1,
    NUMBER_7 = 7,
    NUMBER_14 = 14,
    NUMBER_30 = 30,
    NUMBER_60 = 60
}
/**
    * @export
    * @enum {string}
    */
export enum ProductGroupsAnalyticsConversionReportTimeEnum {
    AdAction = 'TIME_OF_AD_ACTION',
    Conversion = 'TIME_OF_CONVERSION'
}
