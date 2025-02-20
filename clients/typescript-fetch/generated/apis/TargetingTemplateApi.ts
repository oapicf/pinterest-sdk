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
  TargetingTemplateCreate,
  TargetingTemplateGetResponseData,
  TargetingTemplateList200Response,
  TargetingTemplateUpdateRequest,
} from '../models/index';
import {
    TargetingTemplateCreateFromJSON,
    TargetingTemplateCreateToJSON,
    TargetingTemplateGetResponseDataFromJSON,
    TargetingTemplateGetResponseDataToJSON,
    TargetingTemplateList200ResponseFromJSON,
    TargetingTemplateList200ResponseToJSON,
    TargetingTemplateUpdateRequestFromJSON,
    TargetingTemplateUpdateRequestToJSON,
} from '../models/index';

export interface TargetingTemplateCreateRequest {
    adAccountId: string;
    targetingTemplateCreate: TargetingTemplateCreate;
}

export interface TargetingTemplateListRequest {
    adAccountId: string;
    order?: TargetingTemplateListOrderEnum;
    includeSizing?: boolean;
    searchQuery?: string;
    pageSize?: number;
    bookmark?: string;
}

export interface TargetingTemplateUpdateOperationRequest {
    adAccountId: string;
    targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest;
}

/**
 * 
 */
export class TargetingTemplateApi extends runtime.BaseAPI {

    /**
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * Create targeting templates
     */
    async targetingTemplateCreateRaw(requestParameters: TargetingTemplateCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<TargetingTemplateGetResponseData>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling targetingTemplateCreate().'
            );
        }

        if (requestParameters['targetingTemplateCreate'] == null) {
            throw new runtime.RequiredError(
                'targetingTemplateCreate',
                'Required parameter "targetingTemplateCreate" was null or undefined when calling targetingTemplateCreate().'
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
            path: `/ad_accounts/{ad_account_id}/targeting_templates`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: TargetingTemplateCreateToJSON(requestParameters['targetingTemplateCreate']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => TargetingTemplateGetResponseDataFromJSON(jsonValue));
    }

    /**
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
     * Create targeting templates
     */
    async targetingTemplateCreate(requestParameters: TargetingTemplateCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<TargetingTemplateGetResponseData> {
        const response = await this.targetingTemplateCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * List targeting templates
     */
    async targetingTemplateListRaw(requestParameters: TargetingTemplateListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<TargetingTemplateList200Response>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling targetingTemplateList().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['order'] != null) {
            queryParameters['order'] = requestParameters['order'];
        }

        if (requestParameters['includeSizing'] != null) {
            queryParameters['include_sizing'] = requestParameters['includeSizing'];
        }

        if (requestParameters['searchQuery'] != null) {
            queryParameters['search_query'] = requestParameters['searchQuery'];
        }

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['bookmark'] != null) {
            queryParameters['bookmark'] = requestParameters['bookmark'];
        }

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/targeting_templates`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => TargetingTemplateList200ResponseFromJSON(jsonValue));
    }

    /**
     * Get a list of the targeting templates in the specified <code>ad_account_id</code>
     * List targeting templates
     */
    async targetingTemplateList(requestParameters: TargetingTemplateListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<TargetingTemplateList200Response> {
        const response = await this.targetingTemplateListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * Update targeting templates
     */
    async targetingTemplateUpdateRaw(requestParameters: TargetingTemplateUpdateOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling targetingTemplateUpdate().'
            );
        }

        if (requestParameters['targetingTemplateUpdateRequest'] == null) {
            throw new runtime.RequiredError(
                'targetingTemplateUpdateRequest',
                'Required parameter "targetingTemplateUpdateRequest" was null or undefined when calling targetingTemplateUpdate().'
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
            path: `/ad_accounts/{ad_account_id}/targeting_templates`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: TargetingTemplateUpdateRequestToJSON(requestParameters['targetingTemplateUpdateRequest']),
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     * Update targeting templates
     */
    async targetingTemplateUpdate(requestParameters: TargetingTemplateUpdateOperationRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<void> {
        await this.targetingTemplateUpdateRaw(requestParameters, initOverrides);
    }

}

/**
 * @export
 */
export const TargetingTemplateListOrderEnum = {
    Ascending: 'ASCENDING',
    Descending: 'DESCENDING'
} as const;
export type TargetingTemplateListOrderEnum = typeof TargetingTemplateListOrderEnum[keyof typeof TargetingTemplateListOrderEnum];
