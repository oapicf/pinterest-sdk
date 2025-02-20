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
  CustomerList,
  CustomerListRequest,
  CustomerListUpdateRequest,
  CustomerListsList200Response,
} from '../models/index';
import {
    CustomerListFromJSON,
    CustomerListToJSON,
    CustomerListRequestFromJSON,
    CustomerListRequestToJSON,
    CustomerListUpdateRequestFromJSON,
    CustomerListUpdateRequestToJSON,
    CustomerListsList200ResponseFromJSON,
    CustomerListsList200ResponseToJSON,
} from '../models/index';

export interface CustomerListsCreateRequest {
    adAccountId: string;
    customerListRequest: CustomerListRequest;
}

export interface CustomerListsGetRequest {
    adAccountId: string;
    customerListId: string;
}

export interface CustomerListsListRequest {
    adAccountId: string;
    pageSize?: number;
    order?: CustomerListsListOrderEnum;
    bookmark?: string;
}

export interface CustomerListsUpdateRequest {
    adAccountId: string;
    customerListId: string;
    customerListUpdateRequest: CustomerListUpdateRequest;
}

/**
 * 
 */
export class CustomerListsApi extends runtime.BaseAPI {

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/>  <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     */
    async customerListsCreateRaw(requestParameters: CustomerListsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CustomerList>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling customerListsCreate().'
            );
        }

        if (requestParameters['customerListRequest'] == null) {
            throw new runtime.RequiredError(
                'customerListRequest',
                'Required parameter "customerListRequest" was null or undefined when calling customerListsCreate().'
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
            path: `/ad_accounts/{ad_account_id}/customer_lists`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: CustomerListRequestToJSON(requestParameters['customerListRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CustomerListFromJSON(jsonValue));
    }

    /**
     * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/>  <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
     * Create customer lists
     */
    async customerListsCreate(requestParameters: CustomerListsCreateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CustomerList> {
        const response = await this.customerListsCreateRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     */
    async customerListsGetRaw(requestParameters: CustomerListsGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CustomerList>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling customerListsGet().'
            );
        }

        if (requestParameters['customerListId'] == null) {
            throw new runtime.RequiredError(
                'customerListId',
                'Required parameter "customerListId" was null or undefined when calling customerListsGet().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.accessToken) {
            // oauth required
            headerParameters["Authorization"] = await this.configuration.accessToken("pinterest_oauth2", ["ads:read"]);
        }

        const response = await this.request({
            path: `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))).replace(`{${"customer_list_id"}}`, encodeURIComponent(String(requestParameters['customerListId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CustomerListFromJSON(jsonValue));
    }

    /**
     * Gets a specific customer list given the customer list ID.
     * Get customer list
     */
    async customerListsGet(requestParameters: CustomerListsGetRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CustomerList> {
        const response = await this.customerListsGetRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     */
    async customerListsListRaw(requestParameters: CustomerListsListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CustomerListsList200Response>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling customerListsList().'
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
            path: `/ad_accounts/{ad_account_id}/customer_lists`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CustomerListsList200ResponseFromJSON(jsonValue));
    }

    /**
     * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Get customer lists
     */
    async customerListsList(requestParameters: CustomerListsListRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CustomerListsList200Response> {
        const response = await this.customerListsListRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     */
    async customerListsUpdateRaw(requestParameters: CustomerListsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<CustomerList>> {
        if (requestParameters['adAccountId'] == null) {
            throw new runtime.RequiredError(
                'adAccountId',
                'Required parameter "adAccountId" was null or undefined when calling customerListsUpdate().'
            );
        }

        if (requestParameters['customerListId'] == null) {
            throw new runtime.RequiredError(
                'customerListId',
                'Required parameter "customerListId" was null or undefined when calling customerListsUpdate().'
            );
        }

        if (requestParameters['customerListUpdateRequest'] == null) {
            throw new runtime.RequiredError(
                'customerListUpdateRequest',
                'Required parameter "customerListUpdateRequest" was null or undefined when calling customerListsUpdate().'
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
            path: `/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters['adAccountId']))).replace(`{${"customer_list_id"}}`, encodeURIComponent(String(requestParameters['customerListId']))),
            method: 'PATCH',
            headers: headerParameters,
            query: queryParameters,
            body: CustomerListUpdateRequestToJSON(requestParameters['customerListUpdateRequest']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => CustomerListFromJSON(jsonValue));
    }

    /**
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
     * Update customer list
     */
    async customerListsUpdate(requestParameters: CustomerListsUpdateRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<CustomerList> {
        const response = await this.customerListsUpdateRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const CustomerListsListOrderEnum = {
    Ascending: 'ASCENDING',
    Descending: 'DESCENDING'
} as const;
export type CustomerListsListOrderEnum = typeof CustomerListsListOrderEnum[keyof typeof CustomerListsListOrderEnum];
