/* tslint:disable */
/* eslint-disable */
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


import * as runtime from '../runtime';
import type {
  Pin,
  PinAnalyticsMetricsResponse,
  PinCreate,
  PinUpdate,
  PinsAnalyticsMetricTypesParameterInner,
  PinsList200Response,
  PinsSaveRequest,
} from '../models/index';
import {
    PinFromJSON,
    PinToJSON,
    PinAnalyticsMetricsResponseFromJSON,
    PinAnalyticsMetricsResponseToJSON,
    PinCreateFromJSON,
    PinCreateToJSON,
    PinUpdateFromJSON,
    PinUpdateToJSON,
    PinsAnalyticsMetricTypesParameterInnerFromJSON,
    PinsAnalyticsMetricTypesParameterInnerToJSON,
    PinsList200ResponseFromJSON,
    PinsList200ResponseToJSON,
    PinsSaveRequestFromJSON,
    PinsSaveRequestToJSON,
} from '../models/index';

export interface MultiPinsAnalyticsRequest {
    pinIds: Array<string>;
    startDate: Date;
    endDate: Date;
    metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>;
    appTypes?: MultiPinsAnalyticsAppTypesEnum;
    adAccountId?: string;
}

export interface PinsAnalyticsRequest {
    pinId: string;
    startDate: Date;
    endDate: Date;
    metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>;
    appTypes?: PinsAnalyticsAppTypesEnum;
    splitField?: PinsAnalyticsSplitFieldEnum;
    adAccountId?: string;
}

export interface PinsCreateRequest {
    pinCreate: Omit<PinCreate, 'id'|'created_at'|'board_owner'|'media'> | null;
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

export interface PinsSaveOperationRequest {
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
 * 
 */
export class PinsApi extends runtime.BaseAPI {

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get multiple Pin analytics
     */
    async multiPinsAnalyticsRaw(requestParameters: MultiPinsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }>> {
        if (requestParameters['pinIds'] == null) {
            throw new runtime.RequiredError(
                'pinIds',
                'Required parameter "pinIds" was null or undefined when calling multiPinsAnalytics().'
            );
        }

        if (requestParameters['startDate'] == null) {
            throw new runtime.RequiredError(
                'startDate',
                'Required parameter "startDate" was null or undefined when calling multiPinsAnalytics().'
            );
        }

        if (requestParameters['endDate'] == null) {
            throw new runtime.RequiredError(
                'endDate',
                'Required parameter "endDate" was null or undefined when calling multiPinsAnalytics().'
            );
        }

        if (requestParameters['metricTypes'] == null) {
            throw new runtime.RequiredError(
                'metricTypes',
                'Required parameter "metricTypes" was null or undefined when calling multiPinsAnalytics().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pinIds'] != null) {
            queryParameters['pin_ids'] = requestParameters['pinIds'];
        }

        if (requestParameters['startDate'] != null) {
            queryParameters['start_date'] = (requestParameters['startDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['endDate'] != null) {
            queryParameters['end_date'] = (requestParameters['endDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['appTypes'] != null) {
            queryParameters['app_types'] = requestParameters['appTypes'];
        }

        if (requestParameters['metricTypes'] != null) {
            queryParameters['metric_types'] = requestParameters['metricTypes']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "pins:read"]);
        }

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("client_credentials", ["boards:read", "pins:read"]);
        }

        const response = await this.request({
            path: `/pins/analytics`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse<any>(response);
    }

    /**
     * <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get multiple Pin analytics
     */
    async multiPinsAnalytics(requestParameters: MultiPinsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<{ [key: string]: { [key: string]: PinAnalyticsMetricsResponse; }; }> {
        const response = await this.multiPinsAnalyticsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     */
    async pinsAnalyticsRaw(requestParameters: PinsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<{ [key: string]: PinAnalyticsMetricsResponse; }>> {
        if (requestParameters['pinId'] == null) {
            throw new runtime.RequiredError(
                'pinId',
                'Required parameter "pinId" was null or undefined when calling pinsAnalytics().'
            );
        }

        if (requestParameters['startDate'] == null) {
            throw new runtime.RequiredError(
                'startDate',
                'Required parameter "startDate" was null or undefined when calling pinsAnalytics().'
            );
        }

        if (requestParameters['endDate'] == null) {
            throw new runtime.RequiredError(
                'endDate',
                'Required parameter "endDate" was null or undefined when calling pinsAnalytics().'
            );
        }

        if (requestParameters['metricTypes'] == null) {
            throw new runtime.RequiredError(
                'metricTypes',
                'Required parameter "metricTypes" was null or undefined when calling pinsAnalytics().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['startDate'] != null) {
            queryParameters['start_date'] = (requestParameters['startDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['endDate'] != null) {
            queryParameters['end_date'] = (requestParameters['endDate'] as any).toISOString().substring(0,10);
        }

        if (requestParameters['appTypes'] != null) {
            queryParameters['app_types'] = requestParameters['appTypes'];
        }

        if (requestParameters['metricTypes'] != null) {
            queryParameters['metric_types'] = requestParameters['metricTypes']!.join(runtime.COLLECTION_FORMATS["csv"]);
        }

        if (requestParameters['splitField'] != null) {
            queryParameters['split_field'] = requestParameters['splitField'];
        }

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "pins:read"]);
        }

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("client_credentials", ["boards:read", "pins:read"]);
        }

        const response = await this.request({
            path: `/pins/{pin_id}/analytics`.replace(`{${"pin_id"}}`, encodeURIComponent(String(requestParameters['pinId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => runtime.mapValues(jsonValue, PinAnalyticsMetricsResponseFromJSON));
    }

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     */
    async pinsAnalytics(requestParameters: PinsAnalyticsRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<{ [key: string]: PinAnalyticsMetricsResponse; }> {
        const response = await this.pinsAnalyticsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/web-features/add-ons-overview/\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/api-features/content-overview/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     */
    async pinsCreateRaw(requestParameters: PinsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Pin>> {
        if (requestParameters['pinCreate'] == null) {
            throw new runtime.RequiredError(
                'pinCreate',
                'Required parameter "pinCreate" was null or undefined when calling pinsCreate().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "boards:write", "pins:read", "pins:write"]);
        }

        const response = await this.request({
            path: `/pins`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PinCreateToJSON(requestParameters['pinCreate']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PinFromJSON(jsonValue));
    }

    /**
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/web-features/add-ons-overview/\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/api-features/content-overview/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/api-features/creating-boards-and-pins/#creating-video-pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     */
    async pinsCreate(requestParameters: PinsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Pin> {
        const response = await this.pinsCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     */
    async pinsDeleteRaw(requestParameters: PinsDeleteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['pinId'] == null) {
            throw new runtime.RequiredError(
                'pinId',
                'Required parameter "pinId" was null or undefined when calling pinsDelete().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "boards:write", "pins:read", "pins:write"]);
        }

        const response = await this.request({
            path: `/pins/{pin_id}`.replace(`{${"pin_id"}}`, encodeURIComponent(String(requestParameters['pinId']))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     */
    async pinsDelete(requestParameters: PinsDeleteRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.pinsDeleteRaw(requestParameters, initOverrides);
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     */
    async pinsGetRaw(requestParameters: PinsGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Pin>> {
        if (requestParameters['pinId'] == null) {
            throw new runtime.RequiredError(
                'pinId',
                'Required parameter "pinId" was null or undefined when calling pinsGet().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pinMetrics'] != null) {
            queryParameters['pin_metrics'] = requestParameters['pinMetrics'];
        }

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "pins:read"]);
        }

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("client_credentials", ["boards:read", "pins:read"]);
        }

        const response = await this.request({
            path: `/pins/{pin_id}`.replace(`{${"pin_id"}}`, encodeURIComponent(String(requestParameters['pinId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PinFromJSON(jsonValue));
    }

    /**
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     */
    async pinsGet(requestParameters: PinsGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Pin> {
        const response = await this.pinsGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href=\'/docs/api/v5/#operation/boards/list_pins\'>GET List Pins on Board</a>.
     * List Pins
     */
    async pinsListRaw(requestParameters: PinsListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<PinsList200Response>> {
        const queryParameters: any = {};

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['pinFilter'] != null) {
            queryParameters['pin_filter'] = requestParameters['pinFilter'];
        }

        if (requestParameters['includeProtectedPins'] != null) {
            queryParameters['include_protected_pins'] = requestParameters['includeProtectedPins'];
        }

        if (requestParameters['pinType'] != null) {
            queryParameters['pin_type'] = requestParameters['pinType'];
        }

        if (requestParameters['creativeTypes'] != null) {
            queryParameters['creative_types'] = requestParameters['creativeTypes'];
        }

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        if (requestParameters['pinMetrics'] != null) {
            queryParameters['pin_metrics'] = requestParameters['pinMetrics'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "pins:read"]);
        }

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("client_credentials", ["boards:read", "pins:read"]);
        }

        const response = await this.request({
            path: `/pins`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PinsList200ResponseFromJSON(jsonValue));
    }

    /**
     * Get a list of the Pins owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".  Disclaimer: there are known performance issues when filtering by field <code>creative_type</code> and including protected pins. If your request is timing out in this scenario we encourage you to use <a href=\'/docs/api/v5/#operation/boards/list_pins\'>GET List Pins on Board</a>.
     * List Pins
     */
    async pinsList(requestParameters: PinsListRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<PinsList200Response> {
        const response = await this.pinsListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     */
    async pinsSaveRaw(requestParameters: PinsSaveOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Pin>> {
        if (requestParameters['pinId'] == null) {
            throw new runtime.RequiredError(
                'pinId',
                'Required parameter "pinId" was null or undefined when calling pinsSave().'
            );
        }

        if (requestParameters['pinsSaveRequest'] == null) {
            throw new runtime.RequiredError(
                'pinsSaveRequest',
                'Required parameter "pinsSaveRequest" was null or undefined when calling pinsSave().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "boards:write", "pins:read", "pins:write"]);
        }

        const response = await this.request({
            path: `/pins/{pin_id}/save`.replace(`{${"pin_id"}}`, encodeURIComponent(String(requestParameters['pinId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: PinsSaveRequestToJSON(requestParameters['pinsSaveRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PinFromJSON(jsonValue));
    }

    /**
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     */
    async pinsSave(requestParameters: PinsSaveOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Pin> {
        const response = await this.pinsSaveRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
     * Update Pin
     */
    async pinsUpdateRaw(requestParameters: PinsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Pin>> {
        if (requestParameters['pinId'] == null) {
            throw new runtime.RequiredError(
                'pinId',
                'Required parameter "pinId" was null or undefined when calling pinsUpdate().'
            );
        }

        if (requestParameters['pinUpdate'] == null) {
            throw new runtime.RequiredError(
                'pinUpdate',
                'Required parameter "pinUpdate" was null or undefined when calling pinsUpdate().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['adAccountId'] != null) {
            queryParameters['ad_account_id'] = requestParameters['adAccountId'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["boards:read", "boards:write", "pins:read", "pins:write"]);
        }

        const response = await this.request({
            path: `/pins/{pin_id}`.replace(`{${"pin_id"}}`, encodeURIComponent(String(requestParameters['pinId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: PinUpdateToJSON(requestParameters['pinUpdate']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => PinFromJSON(jsonValue));
    }

    /**
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
     * Update Pin
     */
    async pinsUpdate(requestParameters: PinsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Pin> {
        const response = await this.pinsUpdateRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const MultiPinsAnalyticsAppTypesEnum = {
    All: 'ALL',
    Mobile: 'MOBILE',
    Tablet: 'TABLET',
    Web: 'WEB'
} as const;
export type MultiPinsAnalyticsAppTypesEnum = typeof MultiPinsAnalyticsAppTypesEnum[keyof typeof MultiPinsAnalyticsAppTypesEnum];
/**
 * @export
 */
export const PinsAnalyticsAppTypesEnum = {
    All: 'ALL',
    Mobile: 'MOBILE',
    Tablet: 'TABLET',
    Web: 'WEB'
} as const;
export type PinsAnalyticsAppTypesEnum = typeof PinsAnalyticsAppTypesEnum[keyof typeof PinsAnalyticsAppTypesEnum];
/**
 * @export
 */
export const PinsAnalyticsSplitFieldEnum = {
    NoSplit: 'NO_SPLIT',
    AppType: 'APP_TYPE'
} as const;
export type PinsAnalyticsSplitFieldEnum = typeof PinsAnalyticsSplitFieldEnum[keyof typeof PinsAnalyticsSplitFieldEnum];
/**
 * @export
 */
export const PinsListPinFilterEnum = {
    ExcludeNative: 'exclude_native',
    ExcludeRepins: 'exclude_repins',
    HasBeenPromoted: 'has_been_promoted'
} as const;
export type PinsListPinFilterEnum = typeof PinsListPinFilterEnum[keyof typeof PinsListPinFilterEnum];
/**
 * @export
 */
export const PinsListPinTypeEnum = {
    Private: 'PRIVATE'
} as const;
export type PinsListPinTypeEnum = typeof PinsListPinTypeEnum[keyof typeof PinsListPinTypeEnum];
/**
 * @export
 */
export const PinsListCreativeTypesEnum = {
    Regular: 'REGULAR',
    Video: 'VIDEO',
    Shopping: 'SHOPPING',
    Carousel: 'CAROUSEL',
    MaxVideo: 'MAX_VIDEO',
    ShopThePin: 'SHOP_THE_PIN',
    Collection: 'COLLECTION',
    Idea: 'IDEA'
} as const;
export type PinsListCreativeTypesEnum = typeof PinsListCreativeTypesEnum[keyof typeof PinsListCreativeTypesEnum];
