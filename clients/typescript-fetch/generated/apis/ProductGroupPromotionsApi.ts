/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  Granularity,
  ProductGroupAnalyticsResponseInner,
  ProductGroupPromotion,
  ProductGroupPromotionArrayElement,
  ProductGroupPromotionCreateRequest,
  ProductGroupPromotionUpdateRequest,
  ProductGroupPromotionUpdateResponseItem,
} from '../models/index';
import {
    GranularityFromJSON,
    GranularityToJSON,
    ProductGroupAnalyticsResponseInnerFromJSON,
    ProductGroupAnalyticsResponseInnerToJSON,
    ProductGroupPromotionFromJSON,
    ProductGroupPromotionToJSON,
    ProductGroupPromotionArrayElementFromJSON,
    ProductGroupPromotionArrayElementToJSON,
    ProductGroupPromotionCreateRequestFromJSON,
    ProductGroupPromotionCreateRequestToJSON,
    ProductGroupPromotionUpdateRequestFromJSON,
    ProductGroupPromotionUpdateRequestToJSON,
    ProductGroupPromotionUpdateResponseItemFromJSON,
    ProductGroupPromotionUpdateResponseItemToJSON,
} from '../models/index';

export interface ProductGroupPromotionGetRequest {
    adAccountId: string;
    productGroupPromotionId: string;
}

export interface ProductGroupPromotionsCreateRequest {
    adAccountId: string;
    productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest;
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
 * 
 */
export class ProductGroupPromotionsApi extends runtime.BaseAPI {

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     */
    async productGroupPromotionGetRaw(requestParameters: ProductGroupPromotionGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<ProductGroupPromotion>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling productGroupPromotionGet().'
            );
        }

        if (requestParameters['productGroupPromotionId'] == null) {
            throw new runtime.RequiredError(
                'productGroupPromotionId',
                'Required parameter "productGroupPromotionId" was null or undefined when calling productGroupPromotionGet().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))).replace(`{${"product_group_promotion_id"}}`, encodeURIComponent(String(requestParameters['productGroupPromotionId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ProductGroupPromotionFromJSON(jsonValue));
    }

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     */
    async productGroupPromotionGet(requestParameters: ProductGroupPromotionGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<ProductGroupPromotion> {
        const response = await this.productGroupPromotionGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     */
    async productGroupPromotionsCreateRaw(requestParameters: ProductGroupPromotionsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProductGroupPromotionArrayElement>>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling productGroupPromotionsCreate().'
            );
        }

        if (requestParameters['productGroupPromotionCreateRequest'] == null) {
            throw new runtime.RequiredError(
                'productGroupPromotionCreateRequest',
                'Required parameter "productGroupPromotionCreateRequest" was null or undefined when calling productGroupPromotionsCreate().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/product_group_promotions`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: ProductGroupPromotionCreateRequestToJSON(requestParameters['productGroupPromotionCreateRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProductGroupPromotionArrayElementFromJSON));
    }

    /**
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a \'product group promotion.\')
     * Create product group promotions
     */
    async productGroupPromotionsCreate(requestParameters: ProductGroupPromotionsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProductGroupPromotionArrayElement>> {
        const response = await this.productGroupPromotionsCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     */
    async productGroupPromotionsUpdateRaw(requestParameters: ProductGroupPromotionsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProductGroupPromotionUpdateResponseItem>>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling productGroupPromotionsUpdate().'
            );
        }

        if (requestParameters['productGroupPromotionUpdateRequest'] == null) {
            throw new runtime.RequiredError(
                'productGroupPromotionUpdateRequest',
                'Required parameter "productGroupPromotionUpdateRequest" was null or undefined when calling productGroupPromotionsUpdate().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:write"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/product_group_promotions`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: ProductGroupPromotionUpdateRequestToJSON(requestParameters['productGroupPromotionUpdateRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProductGroupPromotionUpdateResponseItemFromJSON));
    }

    /**
     * Update multiple existing Product Group Promotions (by product_group_id)
     * Update product group promotions
     */
    async productGroupPromotionsUpdate(requestParameters: ProductGroupPromotionsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProductGroupPromotionUpdateResponseItem>> {
        const response = await this.productGroupPromotionsUpdateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get product group analytics
     */
    async productGroupsAnalyticsRaw(requestParameters: ProductGroupsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<ProductGroupAnalyticsResponseInner>>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        if (requestParameters['startDate'] == null) {
            throw new runtime.RequiredError(
                'startDate',
                'Required parameter "startDate" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        if (requestParameters['endDate'] == null) {
            throw new runtime.RequiredError(
                'endDate',
                'Required parameter "endDate" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        if (requestParameters['productGroupIds'] == null) {
            throw new runtime.RequiredError(
                'productGroupIds',
                'Required parameter "productGroupIds" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        if (requestParameters['columns'] == null) {
            throw new runtime.RequiredError(
                'columns',
                'Required parameter "columns" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        if (requestParameters['granularity'] == null) {
            throw new runtime.RequiredError(
                'granularity',
                'Required parameter "granularity" was null or undefined when calling productGroupsAnalytics().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['startDate'] != null) {
            queryParameters['start_date'] = (requestParameters['startDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['endDate'] != null) {
            queryParameters['end_date'] = (requestParameters['endDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['productGroupIds'] != null) {
            queryParameters['product_group_ids'] = requestParameters['productGroupIds'];
        }

        if (requestParameters['columns'] != null) {
            queryParameters['columns'] = requestParameters['columns']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['granularity'] != null) {
            queryParameters['granularity'] = requestParameters['granularity'];
        }

        if (requestParameters['clickWindowDays'] != null) {
            queryParameters['click_window_days'] = requestParameters['clickWindowDays'];
        }

        if (requestParameters['engagementWindowDays'] != null) {
            queryParameters['engagement_window_days'] = requestParameters['engagementWindowDays'];
        }

        if (requestParameters['viewWindowDays'] != null) {
            queryParameters['view_window_days'] = requestParameters['viewWindowDays'];
        }

        if (requestParameters['conversionReportTime'] != null) {
            queryParameters['conversion_report_time'] = requestParameters['conversionReportTime'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/product_groups/analytics`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(ProductGroupAnalyticsResponseInnerFromJSON));
    }

    /**
     * Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * Get product group analytics
     */
    async productGroupsAnalytics(requestParameters: ProductGroupsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<ProductGroupAnalyticsResponseInner>> {
        const response = await this.productGroupsAnalyticsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const ProductGroupsAnalyticsColumnsEnum = {
    AdvertiserId: 'ADVERTISER_ID',
    PinPromotionId: 'PIN_PROMOTION_ID',
    AdAccountId: 'AD_ACCOUNT_ID',
    AdGroupEntityStatus: 'AD_GROUP_ENTITY_STATUS',
    AdGroupId: 'AD_GROUP_ID',
    AdId: 'AD_ID',
    CampaignDailySpendCap: 'CAMPAIGN_DAILY_SPEND_CAP',
    CampaignEntityStatus: 'CAMPAIGN_ENTITY_STATUS',
    CampaignId: 'CAMPAIGN_ID',
    CampaignLifetimeSpendCap: 'CAMPAIGN_LIFETIME_SPEND_CAP',
    CampaignName: 'CAMPAIGN_NAME',
    CheckoutRoas: 'CHECKOUT_ROAS',
    Clickthrough1: 'CLICKTHROUGH_1',
    Clickthrough1Gross: 'CLICKTHROUGH_1_GROSS',
    Clickthrough2: 'CLICKTHROUGH_2',
    CpcInMicroDollar: 'CPC_IN_MICRO_DOLLAR',
    CpmInDollar: 'CPM_IN_DOLLAR',
    CpmInMicroDollar: 'CPM_IN_MICRO_DOLLAR',
    Ctr: 'CTR',
    Ctr2: 'CTR_2',
    EcpcvInDollar: 'ECPCV_IN_DOLLAR',
    EcpcvP95InDollar: 'ECPCV_P95_IN_DOLLAR',
    EcpcInDollar: 'ECPC_IN_DOLLAR',
    EcpcInMicroDollar: 'ECPC_IN_MICRO_DOLLAR',
    EcpeInDollar: 'ECPE_IN_DOLLAR',
    EcpmInMicroDollar: 'ECPM_IN_MICRO_DOLLAR',
    EcpvInDollar: 'ECPV_IN_DOLLAR',
    Ectr: 'ECTR',
    EengagementRate: 'EENGAGEMENT_RATE',
    Engagement1: 'ENGAGEMENT_1',
    Engagement2: 'ENGAGEMENT_2',
    EngagementRate: 'ENGAGEMENT_RATE',
    IdeaPinProductTagVisit1: 'IDEA_PIN_PRODUCT_TAG_VISIT_1',
    IdeaPinProductTagVisit2: 'IDEA_PIN_PRODUCT_TAG_VISIT_2',
    Impression1: 'IMPRESSION_1',
    Impression1Gross: 'IMPRESSION_1_GROSS',
    Impression2: 'IMPRESSION_2',
    InappCheckoutCostPerAction: 'INAPP_CHECKOUT_COST_PER_ACTION',
    OutboundClick1: 'OUTBOUND_CLICK_1',
    OutboundClick2: 'OUTBOUND_CLICK_2',
    PageVisitCostPerAction: 'PAGE_VISIT_COST_PER_ACTION',
    PageVisitRoas: 'PAGE_VISIT_ROAS',
    PaidImpression: 'PAID_IMPRESSION',
    PinId: 'PIN_ID',
    Repin1: 'REPIN_1',
    Repin2: 'REPIN_2',
    RepinRate: 'REPIN_RATE',
    SpendInDollar: 'SPEND_IN_DOLLAR',
    SpendInMicroDollar: 'SPEND_IN_MICRO_DOLLAR',
    TotalCheckout: 'TOTAL_CHECKOUT',
    TotalCheckoutValueInMicroDollar: 'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalClickthrough: 'TOTAL_CLICKTHROUGH',
    TotalClickAddToCart: 'TOTAL_CLICK_ADD_TO_CART',
    TotalClickCheckout: 'TOTAL_CLICK_CHECKOUT',
    TotalClickCheckoutValueInMicroDollar: 'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalClickLead: 'TOTAL_CLICK_LEAD',
    TotalClickSignup: 'TOTAL_CLICK_SIGNUP',
    TotalClickSignupValueInMicroDollar: 'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalConversions: 'TOTAL_CONVERSIONS',
    TotalCustom: 'TOTAL_CUSTOM',
    TotalEngagement: 'TOTAL_ENGAGEMENT',
    TotalEngagementCheckout: 'TOTAL_ENGAGEMENT_CHECKOUT',
    TotalEngagementCheckoutValueInMicroDollar: 'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalEngagementLead: 'TOTAL_ENGAGEMENT_LEAD',
    TotalEngagementSignup: 'TOTAL_ENGAGEMENT_SIGNUP',
    TotalEngagementSignupValueInMicroDollar: 'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalIdeaPinProductTagVisit: 'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT',
    TotalImpressionFrequency: 'TOTAL_IMPRESSION_FREQUENCY',
    TotalImpressionUser: 'TOTAL_IMPRESSION_USER',
    TotalLead: 'TOTAL_LEAD',
    TotalOfflineCheckout: 'TOTAL_OFFLINE_CHECKOUT',
    TotalPageVisit: 'TOTAL_PAGE_VISIT',
    TotalRepinRate: 'TOTAL_REPIN_RATE',
    TotalSignup: 'TOTAL_SIGNUP',
    TotalSignupValueInMicroDollar: 'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalVideo3SecViews: 'TOTAL_VIDEO_3SEC_VIEWS',
    TotalVideoAvgWatchtimeInSecond: 'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND',
    TotalVideoMrcViews: 'TOTAL_VIDEO_MRC_VIEWS',
    TotalVideoP0Combined: 'TOTAL_VIDEO_P0_COMBINED',
    TotalVideoP100Complete: 'TOTAL_VIDEO_P100_COMPLETE',
    TotalVideoP25Combined: 'TOTAL_VIDEO_P25_COMBINED',
    TotalVideoP50Combined: 'TOTAL_VIDEO_P50_COMBINED',
    TotalVideoP75Combined: 'TOTAL_VIDEO_P75_COMBINED',
    TotalVideoP95Combined: 'TOTAL_VIDEO_P95_COMBINED',
    TotalViewAddToCart: 'TOTAL_VIEW_ADD_TO_CART',
    TotalViewCheckout: 'TOTAL_VIEW_CHECKOUT',
    TotalViewCheckoutValueInMicroDollar: 'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalViewLead: 'TOTAL_VIEW_LEAD',
    TotalViewSignup: 'TOTAL_VIEW_SIGNUP',
    TotalViewSignupValueInMicroDollar: 'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR',
    TotalWebCheckout: 'TOTAL_WEB_CHECKOUT',
    TotalWebCheckoutValueInMicroDollar: 'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebClickCheckout: 'TOTAL_WEB_CLICK_CHECKOUT',
    TotalWebClickCheckoutValueInMicroDollar: 'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebEngagementCheckout: 'TOTAL_WEB_ENGAGEMENT_CHECKOUT',
    TotalWebEngagementCheckoutValueInMicroDollar: 'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    TotalWebSessions: 'TOTAL_WEB_SESSIONS',
    TotalWebViewCheckout: 'TOTAL_WEB_VIEW_CHECKOUT',
    TotalWebViewCheckoutValueInMicroDollar: 'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR',
    Video3SecViews2: 'VIDEO_3SEC_VIEWS_2',
    VideoLength: 'VIDEO_LENGTH',
    VideoMrcViews2: 'VIDEO_MRC_VIEWS_2',
    VideoP0Combined2: 'VIDEO_P0_COMBINED_2',
    VideoP100Complete2: 'VIDEO_P100_COMPLETE_2',
    VideoP25Combined2: 'VIDEO_P25_COMBINED_2',
    VideoP50Combined2: 'VIDEO_P50_COMBINED_2',
    VideoP75Combined2: 'VIDEO_P75_COMBINED_2',
    VideoP95Combined2: 'VIDEO_P95_COMBINED_2',
    WebCheckoutCostPerAction: 'WEB_CHECKOUT_COST_PER_ACTION',
    WebCheckoutRoas: 'WEB_CHECKOUT_ROAS',
    WebSessions1: 'WEB_SESSIONS_1',
    WebSessions2: 'WEB_SESSIONS_2'
} as const;
export type ProductGroupsAnalyticsColumnsEnum = typeof ProductGroupsAnalyticsColumnsEnum[keyof typeof ProductGroupsAnalyticsColumnsEnum];
/**
 * @export
 */
export const ProductGroupsAnalyticsClickWindowDaysEnum = {
    NUMBER_1: 1,
    NUMBER_7: 7,
    NUMBER_30: 30,
    NUMBER_60: 60
} as const;
export type ProductGroupsAnalyticsClickWindowDaysEnum = typeof ProductGroupsAnalyticsClickWindowDaysEnum[keyof typeof ProductGroupsAnalyticsClickWindowDaysEnum];
/**
 * @export
 */
export const ProductGroupsAnalyticsEngagementWindowDaysEnum = {
    NUMBER_1: 1,
    NUMBER_7: 7,
    NUMBER_30: 30,
    NUMBER_60: 60
} as const;
export type ProductGroupsAnalyticsEngagementWindowDaysEnum = typeof ProductGroupsAnalyticsEngagementWindowDaysEnum[keyof typeof ProductGroupsAnalyticsEngagementWindowDaysEnum];
/**
 * @export
 */
export const ProductGroupsAnalyticsViewWindowDaysEnum = {
    NUMBER_1: 1,
    NUMBER_7: 7,
    NUMBER_30: 30,
    NUMBER_60: 60
} as const;
export type ProductGroupsAnalyticsViewWindowDaysEnum = typeof ProductGroupsAnalyticsViewWindowDaysEnum[keyof typeof ProductGroupsAnalyticsViewWindowDaysEnum];
/**
 * @export
 */
export const ProductGroupsAnalyticsConversionReportTimeEnum = {
    AdAction: 'TIME_OF_AD_ACTION',
    Conversion: 'TIME_OF_CONVERSION'
} as const;
export type ProductGroupsAnalyticsConversionReportTimeEnum = typeof ProductGroupsAnalyticsConversionReportTimeEnum[keyof typeof ProductGroupsAnalyticsConversionReportTimeEnum];