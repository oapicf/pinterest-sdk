// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    CustomerList,
    CustomerListFromJSON,
    CustomerListToJSON,
    CustomerListRequest,
    CustomerListRequestFromJSON,
    CustomerListRequestToJSON,
    CustomerListUpdateRequest,
    CustomerListUpdateRequestFromJSON,
    CustomerListUpdateRequestToJSON,
    CustomerListsList200Response,
    CustomerListsList200ResponseFromJSON,
    CustomerListsList200ResponseToJSON,
} from '../models';

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
 * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
 * Create customer lists
 */
function customerListsCreateRaw<T>(requestParameters: CustomerListsCreateRequest, requestConfig: runtime.TypedQueryConfig<T, CustomerList> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling customerListsCreate.');
    }

    if (requestParameters.customerListRequest === null || requestParameters.customerListRequest === undefined) {
        throw new runtime.RequiredError('customerListRequest','Required parameter requestParameters.customerListRequest was null or undefined when calling customerListsCreate.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/customer_lists`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        body: queryParameters || CustomerListRequestToJSON(requestParameters.customerListRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CustomerListFromJSON(body), text);
    }

    return config;
}

/**
* <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
* Create customer lists
*/
export function customerListsCreate<T>(requestParameters: CustomerListsCreateRequest, requestConfig?: runtime.TypedQueryConfig<T, CustomerList>): QueryConfig<T> {
    return customerListsCreateRaw(requestParameters, requestConfig);
}

/**
 * Gets a specific customer list given the customer list ID.
 * Get customer list
 */
function customerListsGetRaw<T>(requestParameters: CustomerListsGetRequest, requestConfig: runtime.TypedQueryConfig<T, CustomerList> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling customerListsGet.');
    }

    if (requestParameters.customerListId === null || requestParameters.customerListId === undefined) {
        throw new runtime.RequiredError('customerListId','Required parameter requestParameters.customerListId was null or undefined when calling customerListsGet.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))).replace(`{${"customer_list_id"}}`, encodeURIComponent(String(requestParameters.customerListId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CustomerListFromJSON(body), text);
    }

    return config;
}

/**
* Gets a specific customer list given the customer list ID.
* Get customer list
*/
export function customerListsGet<T>(requestParameters: CustomerListsGetRequest, requestConfig?: runtime.TypedQueryConfig<T, CustomerList>): QueryConfig<T> {
    return customerListsGetRaw(requestParameters, requestConfig);
}

/**
 * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * Get customer lists
 */
function customerListsListRaw<T>(requestParameters: CustomerListsListRequest, requestConfig: runtime.TypedQueryConfig<T, CustomerListsList200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling customerListsList.');
    }

    let queryParameters = null;

    queryParameters = {};


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
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/customer_lists`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CustomerListsList200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
* Get customer lists
*/
export function customerListsList<T>(requestParameters: CustomerListsListRequest, requestConfig?: runtime.TypedQueryConfig<T, CustomerListsList200Response>): QueryConfig<T> {
    return customerListsListRaw(requestParameters, requestConfig);
}

/**
 * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * Update customer list
 */
function customerListsUpdateRaw<T>(requestParameters: CustomerListsUpdateRequest, requestConfig: runtime.TypedQueryConfig<T, CustomerList> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling customerListsUpdate.');
    }

    if (requestParameters.customerListId === null || requestParameters.customerListId === undefined) {
        throw new runtime.RequiredError('customerListId','Required parameter requestParameters.customerListId was null or undefined when calling customerListsUpdate.');
    }

    if (requestParameters.customerListUpdateRequest === null || requestParameters.customerListUpdateRequest === undefined) {
        throw new runtime.RequiredError('customerListUpdateRequest','Required parameter requestParameters.customerListUpdateRequest was null or undefined when calling customerListsUpdate.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))).replace(`{${"customer_list_id"}}`, encodeURIComponent(String(requestParameters.customerListId))),
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
        body: queryParameters || CustomerListUpdateRequestToJSON(requestParameters.customerListUpdateRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(CustomerListFromJSON(body), text);
    }

    return config;
}

/**
* <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
* Update customer list
*/
export function customerListsUpdate<T>(requestParameters: CustomerListsUpdateRequest, requestConfig?: runtime.TypedQueryConfig<T, CustomerList>): QueryConfig<T> {
    return customerListsUpdateRaw(requestParameters, requestConfig);
}


/**
    * @export
    * @enum {string}
    */
export enum CustomerListsListOrderEnum {
    Ascending = 'ASCENDING',
    Descending = 'DESCENDING'
}