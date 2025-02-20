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

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI, COLLECTION_FORMATS } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    AdsAnalyticsCampaignTargetingType,
    CampaignCreateRequest,
    CampaignCreateResponse,
    CampaignResponse,
    CampaignUpdateRequest,
    CampaignUpdateResponse,
    CampaignsAnalyticsResponseInner,
    CampaignsList200Response,
    ConversionReportAttributionType,
    Granularity,
    MetricsResponse,
} from '../models';

export interface CampaignTargetingAnalyticsGetRequest {
    adAccountId: string;
    campaignIds: Array<string>;
    startDate: string;
    endDate: string;
    targetingTypes: Array<AdsAnalyticsCampaignTargetingType>;
    columns: Array<CampaignTargetingAnalyticsGetColumnsEnum>;
    granularity: Granularity;
    clickWindowDays?: CampaignTargetingAnalyticsGetClickWindowDaysEnum;
    engagementWindowDays?: CampaignTargetingAnalyticsGetEngagementWindowDaysEnum;
    viewWindowDays?: CampaignTargetingAnalyticsGetViewWindowDaysEnum;
    conversionReportTime?: CampaignTargetingAnalyticsGetConversionReportTimeEnum;
    attributionTypes?: ConversionReportAttributionType;
}

export interface CampaignsAnalyticsRequest {
    adAccountId: string;
    startDate: string;
    endDate: string;
    campaignIds: Array<string>;
    columns: Array<CampaignsAnalyticsColumnsEnum>;
    granularity: Granularity;
    clickWindowDays?: CampaignsAnalyticsClickWindowDaysEnum;
    engagementWindowDays?: CampaignsAnalyticsEngagementWindowDaysEnum;
    viewWindowDays?: CampaignsAnalyticsViewWindowDaysEnum;
    conversionReportTime?: CampaignsAnalyticsConversionReportTimeEnum;
}

export interface CampaignsCreateRequest {
    adAccountId: string;
    campaignCreateRequest: Array<CampaignCreateRequest>;
}

export interface CampaignsGetRequest {
    adAccountId: string;
    campaignId: string;
}

export interface CampaignsListRequest {
    adAccountId: string;
    campaignIds?: Array<string>;
    entityStatuses?: Array<CampaignsListEntityStatusesEnum>;
    pageSize?: number;
    order?: CampaignsListOrderEnum;
    bookmark?: string;
}

export interface CampaignsUpdateRequest {
    adAccountId: string;
    campaignUpdateRequest: Array<CampaignUpdateRequest>;
}

/**
 * no description
 */
export class CampaignsApi extends BaseAPI {

    /**
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get targeting analytics for campaigns
     */
    campaignTargetingAnalyticsGet({ adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes }: CampaignTargetingAnalyticsGetRequest): Observable<MetricsResponse>
    campaignTargetingAnalyticsGet({ adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes }: CampaignTargetingAnalyticsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<MetricsResponse>>
    campaignTargetingAnalyticsGet({ adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes }: CampaignTargetingAnalyticsGetRequest, opts?: OperationOpts): Observable<MetricsResponse | AjaxResponse<MetricsResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(campaignIds, 'campaignIds', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(startDate, 'startDate', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(endDate, 'endDate', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(targetingTypes, 'targetingTypes', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(columns, 'columns', 'campaignTargetingAnalyticsGet');
        throwIfNullOrUndefined(granularity, 'granularity', 'campaignTargetingAnalyticsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'campaign_ids': campaignIds,
            'start_date': (startDate as any).toISOString().split('T')[0],
            'end_date': (endDate as any).toISOString().split('T')[0],
            'targeting_types': targetingTypes.join(COLLECTION_FORMATS['csv']),
            'columns': columns.join(COLLECTION_FORMATS['csv']),
            'granularity': granularity,
        };

        if (clickWindowDays != null) { query['click_window_days'] = clickWindowDays; }
        if (engagementWindowDays != null) { query['engagement_window_days'] = engagementWindowDays; }
        if (viewWindowDays != null) { query['view_window_days'] = viewWindowDays; }
        if (conversionReportTime != null) { query['conversion_report_time'] = conversionReportTime; }
        if (attributionTypes != null) { query['attribution_types'] = attributionTypes; }

        return this.request<MetricsResponse>({
            url: '/ad_accounts/{ad_account_id}/campaigns/targeting_analytics'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
     * Get campaign analytics
     */
    campaignsAnalytics({ adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime }: CampaignsAnalyticsRequest): Observable<Array<CampaignsAnalyticsResponseInner>>
    campaignsAnalytics({ adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime }: CampaignsAnalyticsRequest, opts?: OperationOpts): Observable<AjaxResponse<Array<CampaignsAnalyticsResponseInner>>>
    campaignsAnalytics({ adAccountId, startDate, endDate, campaignIds, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime }: CampaignsAnalyticsRequest, opts?: OperationOpts): Observable<Array<CampaignsAnalyticsResponseInner> | AjaxResponse<Array<CampaignsAnalyticsResponseInner>>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignsAnalytics');
        throwIfNullOrUndefined(startDate, 'startDate', 'campaignsAnalytics');
        throwIfNullOrUndefined(endDate, 'endDate', 'campaignsAnalytics');
        throwIfNullOrUndefined(campaignIds, 'campaignIds', 'campaignsAnalytics');
        throwIfNullOrUndefined(columns, 'columns', 'campaignsAnalytics');
        throwIfNullOrUndefined(granularity, 'granularity', 'campaignsAnalytics');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'start_date': (startDate as any).toISOString().split('T')[0],
            'end_date': (endDate as any).toISOString().split('T')[0],
            'campaign_ids': campaignIds,
            'columns': columns.join(COLLECTION_FORMATS['csv']),
            'granularity': granularity,
        };

        if (clickWindowDays != null) { query['click_window_days'] = clickWindowDays; }
        if (engagementWindowDays != null) { query['engagement_window_days'] = engagementWindowDays; }
        if (viewWindowDays != null) { query['view_window_days'] = viewWindowDays; }
        if (conversionReportTime != null) { query['conversion_report_time'] = conversionReportTime; }

        return this.request<Array<CampaignsAnalyticsResponseInner>>({
            url: '/ad_accounts/{ad_account_id}/campaigns/analytics'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p>  <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Create campaigns
     */
    campaignsCreate({ adAccountId, campaignCreateRequest }: CampaignsCreateRequest): Observable<CampaignCreateResponse>
    campaignsCreate({ adAccountId, campaignCreateRequest }: CampaignsCreateRequest, opts?: OperationOpts): Observable<AjaxResponse<CampaignCreateResponse>>
    campaignsCreate({ adAccountId, campaignCreateRequest }: CampaignsCreateRequest, opts?: OperationOpts): Observable<CampaignCreateResponse | AjaxResponse<CampaignCreateResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignsCreate');
        throwIfNullOrUndefined(campaignCreateRequest, 'campaignCreateRequest', 'campaignsCreate');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<CampaignCreateResponse>({
            url: '/ad_accounts/{ad_account_id}/campaigns'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'POST',
            headers,
            body: campaignCreateRequest,
        }, opts?.responseOpts);
    };

    /**
     * Get a specific campaign given the campaign ID.
     * Get campaign
     */
    campaignsGet({ adAccountId, campaignId }: CampaignsGetRequest): Observable<CampaignResponse>
    campaignsGet({ adAccountId, campaignId }: CampaignsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<CampaignResponse>>
    campaignsGet({ adAccountId, campaignId }: CampaignsGetRequest, opts?: OperationOpts): Observable<CampaignResponse | AjaxResponse<CampaignResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignsGet');
        throwIfNullOrUndefined(campaignId, 'campaignId', 'campaignsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<CampaignResponse>({
            url: '/ad_accounts/{ad_account_id}/campaigns/{campaign_id}'.replace('{ad_account_id}', encodeURI(adAccountId)).replace('{campaign_id}', encodeURI(campaignId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
     * List campaigns
     */
    campaignsList({ adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark }: CampaignsListRequest): Observable<CampaignsList200Response>
    campaignsList({ adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark }: CampaignsListRequest, opts?: OperationOpts): Observable<AjaxResponse<CampaignsList200Response>>
    campaignsList({ adAccountId, campaignIds, entityStatuses, pageSize, order, bookmark }: CampaignsListRequest, opts?: OperationOpts): Observable<CampaignsList200Response | AjaxResponse<CampaignsList200Response>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignsList');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (campaignIds != null) { query['campaign_ids'] = campaignIds; }
        if (entityStatuses != null) { query['entity_statuses'] = entityStatuses; }
        if (pageSize != null) { query['page_size'] = pageSize; }
        if (order != null) { query['order'] = order; }
        if (bookmark != null) { query['bookmark'] = bookmark; }

        return this.request<CampaignsList200Response>({
            url: '/ad_accounts/{ad_account_id}/campaigns'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/>  - <p>The values for \'lifetime_spend_cap\' and \'daily_spend_cap\' are microcurrency amounts based on the currency field set in the advertiser\'s profile. (e.g. USD) <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’ s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul>
     * Update campaigns
     */
    campaignsUpdate({ adAccountId, campaignUpdateRequest }: CampaignsUpdateRequest): Observable<CampaignUpdateResponse>
    campaignsUpdate({ adAccountId, campaignUpdateRequest }: CampaignsUpdateRequest, opts?: OperationOpts): Observable<AjaxResponse<CampaignUpdateResponse>>
    campaignsUpdate({ adAccountId, campaignUpdateRequest }: CampaignsUpdateRequest, opts?: OperationOpts): Observable<CampaignUpdateResponse | AjaxResponse<CampaignUpdateResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'campaignsUpdate');
        throwIfNullOrUndefined(campaignUpdateRequest, 'campaignUpdateRequest', 'campaignsUpdate');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<CampaignUpdateResponse>({
            url: '/ad_accounts/{ad_account_id}/campaigns'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'PATCH',
            headers,
            body: campaignUpdateRequest,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum CampaignTargetingAnalyticsGetColumnsEnum {
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
export enum CampaignTargetingAnalyticsGetClickWindowDaysEnum {
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
export enum CampaignTargetingAnalyticsGetEngagementWindowDaysEnum {
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
export enum CampaignTargetingAnalyticsGetViewWindowDaysEnum {
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
export enum CampaignTargetingAnalyticsGetConversionReportTimeEnum {
    AdAction = 'TIME_OF_AD_ACTION',
    Conversion = 'TIME_OF_CONVERSION'
}
/**
 * @export
 * @enum {string}
 */
export enum CampaignsAnalyticsColumnsEnum {
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
export enum CampaignsAnalyticsClickWindowDaysEnum {
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
export enum CampaignsAnalyticsEngagementWindowDaysEnum {
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
export enum CampaignsAnalyticsViewWindowDaysEnum {
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
export enum CampaignsAnalyticsConversionReportTimeEnum {
    AdAction = 'TIME_OF_AD_ACTION',
    Conversion = 'TIME_OF_CONVERSION'
}
/**
 * @export
 * @enum {string}
 */
export enum CampaignsListEntityStatusesEnum {
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
export enum CampaignsListOrderEnum {
    Ascending = 'ASCENDING',
    Descending = 'DESCENDING'
}
