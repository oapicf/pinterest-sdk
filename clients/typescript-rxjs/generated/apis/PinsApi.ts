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
    Pin,
    PinAnalyticsMetricsResponse,
    PinCreate,
    PinUpdate,
    PinsAnalyticsMetricTypesParameterInner,
    PinsList200Response,
    PinsSaveRequest,
} from '../models';

export interface MultiPinsAnalyticsRequest {
    pinIds: Array<string>;
    startDate: string;
    endDate: string;
    metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>;
    appTypes?: MultiPinsAnalyticsAppTypesEnum;
    adAccountId?: string;
}

export interface PinsAnalyticsRequest {
    pinId: string;
    startDate: string;
    endDate: string;
    metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>;
    appTypes?: PinsAnalyticsAppTypesEnum;
    splitField?: PinsAnalyticsSplitFieldEnum;
    adAccountId?: string;
}

export interface PinsCreateRequest {
    pinCreate: PinCreate | null;
    adAccountId?: string;
}

export interface PinsDeleteRequest {
    pinId: string;
    adAccountId?: string;
}

export interface PinsGetRequest {
    pinId: string;
    pinMetrics?: boolean;
    adAccountId?: string;
}

export interface PinsListRequest {
    bookmark?: string;
    pageSize?: number;
    pinFilter?: PinsListPinFilterEnum;
    includeProtectedPins?: boolean;
    pinType?: PinsListPinTypeEnum;
    creativeTypes?: Array<PinsListCreativeTypesEnum>;
    adAccountId?: string;
    pinMetrics?: boolean;
}

export interface PinsSaveRequest {
    pinId: string;
    pinsSaveRequest: PinsSaveRequest;
    adAccountId?: string;
}

export interface PinsUpdateRequest {
    pinId: string;
    pinUpdate: PinUpdate | null;
    adAccountId?: string;
}

/**
 * no description
 */
export class PinsApi extends BaseAPI {

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get multiple Pin analytics
     */
    multiPinsAnalytics({ pinIds, startDate, endDate, metricTypes, appTypes, adAccountId }: MultiPinsAnalyticsRequest): Observable<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>
    multiPinsAnalytics({ pinIds, startDate, endDate, metricTypes, appTypes, adAccountId }: MultiPinsAnalyticsRequest, opts?: OperationOpts): Observable<AjaxResponse<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>>
    multiPinsAnalytics({ pinIds, startDate, endDate, metricTypes, appTypes, adAccountId }: MultiPinsAnalyticsRequest, opts?: OperationOpts): Observable<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; } | AjaxResponse<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>> {
        throwIfNullOrUndefined(pinIds, 'pinIds', 'multiPinsAnalytics');
        throwIfNullOrUndefined(startDate, 'startDate', 'multiPinsAnalytics');
        throwIfNullOrUndefined(endDate, 'endDate', 'multiPinsAnalytics');
        throwIfNullOrUndefined(metricTypes, 'metricTypes', 'multiPinsAnalytics');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('client_credentials', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'pin_ids': pinIds,
            'start_date': (startDate as any).toISOString().split('T')[0],
            'end_date': (endDate as any).toISOString().split('T')[0],
            'metric_types': metricTypes.join(COLLECTION_FORMATS['csv']),
        };

        if (appTypes != null) { query['app_types'] = appTypes; }
        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>({
            url: '/pins/analytics',
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     */
    pinsAnalytics({ pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId }: PinsAnalyticsRequest): Observable<{ [key: string]: PinAnalyticsMetricsResponse; }>
    pinsAnalytics({ pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId }: PinsAnalyticsRequest, opts?: OperationOpts): Observable<AjaxResponse<{ [key: string]: PinAnalyticsMetricsResponse; }>>
    pinsAnalytics({ pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId }: PinsAnalyticsRequest, opts?: OperationOpts): Observable<{ [key: string]: PinAnalyticsMetricsResponse; } | AjaxResponse<{ [key: string]: PinAnalyticsMetricsResponse; }>> {
        throwIfNullOrUndefined(pinId, 'pinId', 'pinsAnalytics');
        throwIfNullOrUndefined(startDate, 'startDate', 'pinsAnalytics');
        throwIfNullOrUndefined(endDate, 'endDate', 'pinsAnalytics');
        throwIfNullOrUndefined(metricTypes, 'metricTypes', 'pinsAnalytics');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('client_credentials', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = { // required parameters are used directly since they are already checked by throwIfNullOrUndefined
            'start_date': (startDate as any).toISOString().split('T')[0],
            'end_date': (endDate as any).toISOString().split('T')[0],
            'metric_types': metricTypes.join(COLLECTION_FORMATS['csv']),
        };

        if (appTypes != null) { query['app_types'] = appTypes; }
        if (splitField != null) { query['split_field'] = splitField; }
        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<{ [key: string]: PinAnalyticsMetricsResponse; }>({
            url: '/pins/{pin_id}/analytics'.replace('{pin_id}', encodeURI(pinId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/web-features/add-ons-overview/\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/api-features/content-overview/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     */
    pinsCreate({ pinCreate, adAccountId }: PinsCreateRequest): Observable<Pin>
    pinsCreate({ pinCreate, adAccountId }: PinsCreateRequest, opts?: OperationOpts): Observable<AjaxResponse<Pin>>
    pinsCreate({ pinCreate, adAccountId }: PinsCreateRequest, opts?: OperationOpts): Observable<Pin | AjaxResponse<Pin>> {
        throwIfNullOrUndefined(pinCreate, 'pinCreate', 'pinsCreate');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'boards:write', 'pins:read', 'pins:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<Pin>({
            url: '/pins',
            method: 'POST',
            headers,
            query,
            body: pinCreate,
        }, opts?.responseOpts);
    };

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     */
    pinsDelete({ pinId, adAccountId }: PinsDeleteRequest): Observable<void>
    pinsDelete({ pinId, adAccountId }: PinsDeleteRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>>
    pinsDelete({ pinId, adAccountId }: PinsDeleteRequest, opts?: OperationOpts): Observable<void | AjaxResponse<void>> {
        throwIfNullOrUndefined(pinId, 'pinId', 'pinsDelete');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'boards:write', 'pins:read', 'pins:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<void>({
            url: '/pins/{pin_id}'.replace('{pin_id}', encodeURI(pinId)),
            method: 'DELETE',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     */
    pinsGet({ pinId, pinMetrics, adAccountId }: PinsGetRequest): Observable<Pin>
    pinsGet({ pinId, pinMetrics, adAccountId }: PinsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<Pin>>
    pinsGet({ pinId, pinMetrics, adAccountId }: PinsGetRequest, opts?: OperationOpts): Observable<Pin | AjaxResponse<Pin>> {
        throwIfNullOrUndefined(pinId, 'pinId', 'pinsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('client_credentials', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (pinMetrics != null) { query['pin_metrics'] = pinMetrics; }
        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<Pin>({
            url: '/pins/{pin_id}'.replace('{pin_id}', encodeURI(pinId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href=\'/docs/api/v5/#operation/boards/list_pins\'>GET List Pins on Board</a>.
     * List Pins
     */
    pinsList({ bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics }: PinsListRequest): Observable<PinsList200Response>
    pinsList({ bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics }: PinsListRequest, opts?: OperationOpts): Observable<AjaxResponse<PinsList200Response>>
    pinsList({ bookmark, pageSize, pinFilter, includeProtectedPins, pinType, creativeTypes, adAccountId, pinMetrics }: PinsListRequest, opts?: OperationOpts): Observable<PinsList200Response | AjaxResponse<PinsList200Response>> {

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('client_credentials', ['boards:read', 'pins:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (bookmark != null) { query['bookmark'] = bookmark; }
        if (pageSize != null) { query['page_size'] = pageSize; }
        if (pinFilter != null) { query['pin_filter'] = pinFilter; }
        if (includeProtectedPins != null) { query['include_protected_pins'] = includeProtectedPins; }
        if (pinType != null) { query['pin_type'] = pinType; }
        if (creativeTypes != null) { query['creative_types'] = creativeTypes; }
        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }
        if (pinMetrics != null) { query['pin_metrics'] = pinMetrics; }

        return this.request<PinsList200Response>({
            url: '/pins',
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     */
    pinsSave({ pinId, pinsSaveRequest, adAccountId }: PinsSaveRequest): Observable<Pin>
    pinsSave({ pinId, pinsSaveRequest, adAccountId }: PinsSaveRequest, opts?: OperationOpts): Observable<AjaxResponse<Pin>>
    pinsSave({ pinId, pinsSaveRequest, adAccountId }: PinsSaveRequest, opts?: OperationOpts): Observable<Pin | AjaxResponse<Pin>> {
        throwIfNullOrUndefined(pinId, 'pinId', 'pinsSave');
        throwIfNullOrUndefined(pinsSaveRequest, 'pinsSaveRequest', 'pinsSave');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'boards:write', 'pins:read', 'pins:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<Pin>({
            url: '/pins/{pin_id}/save'.replace('{pin_id}', encodeURI(pinId)),
            method: 'POST',
            headers,
            query,
            body: pinsSaveRequest,
        }, opts?.responseOpts);
    };

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
     * Update Pin
     */
    pinsUpdate({ pinId, pinUpdate, adAccountId }: PinsUpdateRequest): Observable<Pin>
    pinsUpdate({ pinId, pinUpdate, adAccountId }: PinsUpdateRequest, opts?: OperationOpts): Observable<AjaxResponse<Pin>>
    pinsUpdate({ pinId, pinUpdate, adAccountId }: PinsUpdateRequest, opts?: OperationOpts): Observable<Pin | AjaxResponse<Pin>> {
        throwIfNullOrUndefined(pinId, 'pinId', 'pinsUpdate');
        throwIfNullOrUndefined(pinUpdate, 'pinUpdate', 'pinsUpdate');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['boards:read', 'boards:write', 'pins:read', 'pins:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (adAccountId != null) { query['ad_account_id'] = adAccountId; }

        return this.request<Pin>({
            url: '/pins/{pin_id}'.replace('{pin_id}', encodeURI(pinId)),
            method: 'PATCH',
            headers,
            query,
            body: pinUpdate,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum MultiPinsAnalyticsAppTypesEnum {
    All = 'ALL',
    Mobile = 'MOBILE',
    Tablet = 'TABLET',
    Web = 'WEB'
}
/**
 * @export
 * @enum {string}
 */
export enum PinsAnalyticsAppTypesEnum {
    All = 'ALL',
    Mobile = 'MOBILE',
    Tablet = 'TABLET',
    Web = 'WEB'
}
/**
 * @export
 * @enum {string}
 */
export enum PinsAnalyticsSplitFieldEnum {
    NoSplit = 'NO_SPLIT',
    AppType = 'APP_TYPE'
}
/**
 * @export
 * @enum {string}
 */
export enum PinsListPinFilterEnum {
    ExcludeNative = 'exclude_native',
    ExcludeRepins = 'exclude_repins',
    HasBeenPromoted = 'has_been_promoted'
}
/**
 * @export
 * @enum {string}
 */
export enum PinsListPinTypeEnum {
    Private = 'PRIVATE'
}
/**
 * @export
 * @enum {string}
 */
export enum PinsListCreativeTypesEnum {
    Regular = 'REGULAR',
    Video = 'VIDEO',
    Shopping = 'SHOPPING',
    Carousel = 'CAROUSEL',
    MaxVideo = 'MAX_VIDEO',
    ShopThePin = 'SHOP_THE_PIN',
    Collection = 'COLLECTION',
    Idea = 'IDEA'
}
