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
  LeadFormArrayResponse,
  LeadFormCreateRequest,
  LeadFormResponse,
  LeadFormTestRequest,
  LeadFormTestResponse,
  LeadFormUpdateRequest,
  LeadFormsList200Response,
} from '../models/index';
import {
    LeadFormArrayResponseFromJSON,
    LeadFormArrayResponseToJSON,
    LeadFormCreateRequestFromJSON,
    LeadFormCreateRequestToJSON,
    LeadFormResponseFromJSON,
    LeadFormResponseToJSON,
    LeadFormTestRequestFromJSON,
    LeadFormTestRequestToJSON,
    LeadFormTestResponseFromJSON,
    LeadFormTestResponseToJSON,
    LeadFormUpdateRequestFromJSON,
    LeadFormUpdateRequestToJSON,
    LeadFormsList200ResponseFromJSON,
    LeadFormsList200ResponseToJSON,
} from '../models/index';

export interface LeadFormGetRequest {
    adAccountId: string;
    leadFormId: string;
}

export interface LeadFormTestCreateRequest {
    adAccountId: string;
    leadFormId: string;
    leadFormTestRequest: LeadFormTestRequest;
}

export interface LeadFormsCreateRequest {
    adAccountId: string;
    leadFormCreateRequest: Array<LeadFormCreateRequest>;
}

export interface LeadFormsListRequest {
    adAccountId: string;
    pageSize?: number;
    order?: LeadFormsListOrderEnum;
    bookmark?: string;
}

export interface LeadFormsUpdateRequest {
    adAccountId: string;
    leadFormUpdateRequest: Array<LeadFormUpdateRequest>;
}

/**
 * 
 */
export class LeadFormsApi extends runtime.BaseAPI {

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get lead form by id
     */
    async leadFormGetRaw(requestParameters: LeadFormGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LeadFormResponse>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling leadFormGet().'
            );
        }

        if (requestParameters['leadFormId'] == null) {
            throw new runtime.RequiredError(
                'leadFormId',
                'Required parameter "leadFormId" was null or undefined when calling leadFormGet().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))).replace(`{${"lead_form_id"}}`, encodeURIComponent(String(requestParameters['leadFormId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LeadFormResponseFromJSON(jsonValue));
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Get lead form by id
     */
    async leadFormGet(requestParameters: LeadFormGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LeadFormResponse> {
        const response = await this.leadFormGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     */
    async leadFormTestCreateRaw(requestParameters: LeadFormTestCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LeadFormTestResponse>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling leadFormTestCreate().'
            );
        }

        if (requestParameters['leadFormId'] == null) {
            throw new runtime.RequiredError(
                'leadFormId',
                'Required parameter "leadFormId" was null or undefined when calling leadFormTestCreate().'
            );
        }

        if (requestParameters['leadFormTestRequest'] == null) {
            throw new runtime.RequiredError(
                'leadFormTestRequest',
                'Required parameter "leadFormTestRequest" was null or undefined when calling leadFormTestCreate().'
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
            path: `/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))).replace(`{${"lead_form_id"}}`, encodeURIComponent(String(requestParameters['leadFormId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: LeadFormTestRequestToJSON(requestParameters['leadFormTestRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LeadFormTestResponseFromJSON(jsonValue));
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     */
    async leadFormTestCreate(requestParameters: LeadFormTestCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LeadFormTestResponse> {
        const response = await this.leadFormTestCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create lead forms
     */
    async leadFormsCreateRaw(requestParameters: LeadFormsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LeadFormArrayResponse>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling leadFormsCreate().'
            );
        }

        if (requestParameters['leadFormCreateRequest'] == null) {
            throw new runtime.RequiredError(
                'leadFormCreateRequest',
                'Required parameter "leadFormCreateRequest" was null or undefined when calling leadFormsCreate().'
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
            path: `/ad_accounts/{ad_account_id}/lead_forms`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters['leadFormCreateRequest']!.map(LeadFormCreateRequestToJSON),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LeadFormArrayResponseFromJSON(jsonValue));
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Create lead forms
     */
    async leadFormsCreate(requestParameters: LeadFormsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LeadFormArrayResponse> {
        const response = await this.leadFormsCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * List lead forms
     */
    async leadFormsListRaw(requestParameters: LeadFormsListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LeadFormsList200Response>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling leadFormsList().'
            );
        }

        const queryParameters: any = {};

        if (requestParameters['pageSize'] != null) {
            queryParameters['page_size'] = requestParameters['pageSize'];
        }

        if (requestParameters['order'] != null) {
            queryParameters['order'] = requestParameters['order'];
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
            path: `/ad_accounts/{ad_account_id}/lead_forms`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LeadFormsList200ResponseFromJSON(jsonValue));
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * List lead forms
     */
    async leadFormsList(requestParameters: LeadFormsListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LeadFormsList200Response> {
        const response = await this.leadFormsListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Update lead forms
     */
    async leadFormsUpdateRaw(requestParameters: LeadFormsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<LeadFormArrayResponse>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling leadFormsUpdate().'
            );
        }

        if (requestParameters['leadFormUpdateRequest'] == null) {
            throw new runtime.RequiredError(
                'leadFormUpdateRequest',
                'Required parameter "leadFormUpdateRequest" was null or undefined when calling leadFormsUpdate().'
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
            path: `/ad_accounts/{ad_account_id}/lead_forms`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: requestParameters['leadFormUpdateRequest']!.map(LeadFormUpdateRequestToJSON),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => LeadFormArrayResponseFromJSON(jsonValue));
    }

    /**
     * <strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
     * Update lead forms
     */
    async leadFormsUpdate(requestParameters: LeadFormsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<LeadFormArrayResponse> {
        const response = await this.leadFormsUpdateRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const LeadFormsListOrderEnum = {
    Ascending: 'ASCENDING',
    Descending: 'DESCENDING'
} as const;
export type LeadFormsListOrderEnum = typeof LeadFormsListOrderEnum[keyof typeof LeadFormsListOrderEnum];
