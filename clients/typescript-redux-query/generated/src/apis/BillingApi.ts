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
    AdsCreditRedeemRequest,
    AdsCreditRedeemRequestFromJSON,
    AdsCreditRedeemRequestToJSON,
    AdsCreditRedeemResponse,
    AdsCreditRedeemResponseFromJSON,
    AdsCreditRedeemResponseToJSON,
    AdsCreditsDiscountsGet200Response,
    AdsCreditsDiscountsGet200ResponseFromJSON,
    AdsCreditsDiscountsGet200ResponseToJSON,
    BillingProfilesGet200Response,
    BillingProfilesGet200ResponseFromJSON,
    BillingProfilesGet200ResponseToJSON,
    SSIOAccountResponse,
    SSIOAccountResponseFromJSON,
    SSIOAccountResponseToJSON,
    SSIOCreateInsertionOrderRequest,
    SSIOCreateInsertionOrderRequestFromJSON,
    SSIOCreateInsertionOrderRequestToJSON,
    SSIOCreateInsertionOrderResponse,
    SSIOCreateInsertionOrderResponseFromJSON,
    SSIOCreateInsertionOrderResponseToJSON,
    SSIOEditInsertionOrderRequest,
    SSIOEditInsertionOrderRequestFromJSON,
    SSIOEditInsertionOrderRequestToJSON,
    SSIOEditInsertionOrderResponse,
    SSIOEditInsertionOrderResponseFromJSON,
    SSIOEditInsertionOrderResponseToJSON,
    SSIOInsertionOrderStatusResponse,
    SSIOInsertionOrderStatusResponseFromJSON,
    SSIOInsertionOrderStatusResponseToJSON,
    SsioInsertionOrdersStatusGetByAdAccount200Response,
    SsioInsertionOrdersStatusGetByAdAccount200ResponseFromJSON,
    SsioInsertionOrdersStatusGetByAdAccount200ResponseToJSON,
    SsioOrderLinesGetByAdAccount200Response,
    SsioOrderLinesGetByAdAccount200ResponseFromJSON,
    SsioOrderLinesGetByAdAccount200ResponseToJSON,
} from '../models';

export interface AdsCreditRedeemRequest {
    adAccountId: string;
    adsCreditRedeemRequest: AdsCreditRedeemRequest;
}

export interface AdsCreditsDiscountsGetRequest {
    adAccountId: string;
    bookmark?: string;
    pageSize?: number;
}

export interface BillingProfilesGetRequest {
    adAccountId: string;
    isActive: boolean;
    bookmark?: string;
    pageSize?: number;
}

export interface SsioAccountsGetRequest {
    adAccountId: string;
}

export interface SsioInsertionOrderCreateRequest {
    adAccountId: string;
    sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest;
}

export interface SsioInsertionOrderEditRequest {
    adAccountId: string;
    sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest;
}

export interface SsioInsertionOrdersStatusGetByAdAccountRequest {
    adAccountId: string;
    bookmark?: string;
    pageSize?: number;
}

export interface SsioInsertionOrdersStatusGetByPinOrderIdRequest {
    adAccountId: string;
    pinOrderId: string;
}

export interface SsioOrderLinesGetByAdAccountRequest {
    adAccountId: string;
    bookmark?: string;
    pageSize?: number;
    pinOrderId?: string;
}


/**
 * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
 * Redeem ad credits
 */
function adsCreditRedeemRaw<T>(requestParameters: AdsCreditRedeemRequest, requestConfig: runtime.TypedQueryConfig<T, AdsCreditRedeemResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling adsCreditRedeem.');
    }

    if (requestParameters.adsCreditRedeemRequest === null || requestParameters.adsCreditRedeemRequest === undefined) {
        throw new runtime.RequiredError('adsCreditRedeemRequest','Required parameter requestParameters.adsCreditRedeemRequest was null or undefined when calling adsCreditRedeem.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write", "billing:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ads_credit/redeem`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        body: queryParameters || AdsCreditRedeemRequestToJSON(requestParameters.adsCreditRedeemRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(AdsCreditRedeemResponseFromJSON(body), text);
    }

    return config;
}

/**
* Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
* Redeem ad credits
*/
export function adsCreditRedeem<T>(requestParameters: AdsCreditRedeemRequest, requestConfig?: runtime.TypedQueryConfig<T, AdsCreditRedeemResponse>): QueryConfig<T> {
    return adsCreditRedeemRaw(requestParameters, requestConfig);
}

/**
 * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
 * Get ads credit discounts
 */
function adsCreditsDiscountsGetRaw<T>(requestParameters: AdsCreditsDiscountsGetRequest, requestConfig: runtime.TypedQueryConfig<T, AdsCreditsDiscountsGet200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling adsCreditsDiscountsGet.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.bookmark !== undefined) {
        queryParameters['bookmark'] = requestParameters.bookmark;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['page_size'] = requestParameters.pageSize;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read", "billing:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ads_credit/discounts`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(AdsCreditsDiscountsGet200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
* Get ads credit discounts
*/
export function adsCreditsDiscountsGet<T>(requestParameters: AdsCreditsDiscountsGetRequest, requestConfig?: runtime.TypedQueryConfig<T, AdsCreditsDiscountsGet200Response>): QueryConfig<T> {
    return adsCreditsDiscountsGetRaw(requestParameters, requestConfig);
}

/**
 * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
 * Get billing profiles
 */
function billingProfilesGetRaw<T>(requestParameters: BillingProfilesGetRequest, requestConfig: runtime.TypedQueryConfig<T, BillingProfilesGet200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling billingProfilesGet.');
    }

    if (requestParameters.isActive === null || requestParameters.isActive === undefined) {
        throw new runtime.RequiredError('isActive','Required parameter requestParameters.isActive was null or undefined when calling billingProfilesGet.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.isActive !== undefined) {
        queryParameters['is_active'] = requestParameters.isActive;
    }


    if (requestParameters.bookmark !== undefined) {
        queryParameters['bookmark'] = requestParameters.bookmark;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['page_size'] = requestParameters.pageSize;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read", "billing:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/billing_profiles`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(BillingProfilesGet200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>
* Get billing profiles
*/
export function billingProfilesGet<T>(requestParameters: BillingProfilesGetRequest, requestConfig?: runtime.TypedQueryConfig<T, BillingProfilesGet200Response>): QueryConfig<T> {
    return billingProfilesGetRaw(requestParameters, requestConfig);
}

/**
 * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Get Salesforce account details including bill-to information.
 */
function ssioAccountsGetRaw<T>(requestParameters: SsioAccountsGetRequest, requestConfig: runtime.TypedQueryConfig<T, SSIOAccountResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioAccountsGet.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/accounts`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SSIOAccountResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Get Salesforce account details including bill-to information.
*/
export function ssioAccountsGet<T>(requestParameters: SsioAccountsGetRequest, requestConfig?: runtime.TypedQueryConfig<T, SSIOAccountResponse>): QueryConfig<T> {
    return ssioAccountsGetRaw(requestParameters, requestConfig);
}

/**
 * Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Create insertion order through SSIO.
 */
function ssioInsertionOrderCreateRaw<T>(requestParameters: SsioInsertionOrderCreateRequest, requestConfig: runtime.TypedQueryConfig<T, SSIOCreateInsertionOrderResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioInsertionOrderCreate.');
    }

    if (requestParameters.sSIOCreateInsertionOrderRequest === null || requestParameters.sSIOCreateInsertionOrderRequest === undefined) {
        throw new runtime.RequiredError('sSIOCreateInsertionOrderRequest','Required parameter requestParameters.sSIOCreateInsertionOrderRequest was null or undefined when calling ssioInsertionOrderCreate.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/insertion_orders`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        body: queryParameters || SSIOCreateInsertionOrderRequestToJSON(requestParameters.sSIOCreateInsertionOrderRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SSIOCreateInsertionOrderResponseFromJSON(body), text);
    }

    return config;
}

/**
* Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Create insertion order through SSIO.
*/
export function ssioInsertionOrderCreate<T>(requestParameters: SsioInsertionOrderCreateRequest, requestConfig?: runtime.TypedQueryConfig<T, SSIOCreateInsertionOrderResponse>): QueryConfig<T> {
    return ssioInsertionOrderCreateRaw(requestParameters, requestConfig);
}

/**
 * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Edit insertion order through SSIO.
 */
function ssioInsertionOrderEditRaw<T>(requestParameters: SsioInsertionOrderEditRequest, requestConfig: runtime.TypedQueryConfig<T, SSIOEditInsertionOrderResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioInsertionOrderEdit.');
    }

    if (requestParameters.sSIOEditInsertionOrderRequest === null || requestParameters.sSIOEditInsertionOrderRequest === undefined) {
        throw new runtime.RequiredError('sSIOEditInsertionOrderRequest','Required parameter requestParameters.sSIOEditInsertionOrderRequest was null or undefined when calling ssioInsertionOrderEdit.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:write"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/insertion_orders`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        body: queryParameters || SSIOEditInsertionOrderRequestToJSON(requestParameters.sSIOEditInsertionOrderRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SSIOEditInsertionOrderResponseFromJSON(body), text);
    }

    return config;
}

/**
* Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Edit insertion order through SSIO.
*/
export function ssioInsertionOrderEdit<T>(requestParameters: SsioInsertionOrderEditRequest, requestConfig?: runtime.TypedQueryConfig<T, SSIOEditInsertionOrderResponse>): QueryConfig<T> {
    return ssioInsertionOrderEditRaw(requestParameters, requestConfig);
}

/**
 * Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Get insertion order status by ad account id.
 */
function ssioInsertionOrdersStatusGetByAdAccountRaw<T>(requestParameters: SsioInsertionOrdersStatusGetByAdAccountRequest, requestConfig: runtime.TypedQueryConfig<T, SsioInsertionOrdersStatusGetByAdAccount200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioInsertionOrdersStatusGetByAdAccount.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.bookmark !== undefined) {
        queryParameters['bookmark'] = requestParameters.bookmark;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['page_size'] = requestParameters.pageSize;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/insertion_orders/status`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SsioInsertionOrdersStatusGetByAdAccount200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Get insertion order status by ad account id.
*/
export function ssioInsertionOrdersStatusGetByAdAccount<T>(requestParameters: SsioInsertionOrdersStatusGetByAdAccountRequest, requestConfig?: runtime.TypedQueryConfig<T, SsioInsertionOrdersStatusGetByAdAccount200Response>): QueryConfig<T> {
    return ssioInsertionOrdersStatusGetByAdAccountRaw(requestParameters, requestConfig);
}

/**
 * Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Get insertion order status by pin order id.
 */
function ssioInsertionOrdersStatusGetByPinOrderIdRaw<T>(requestParameters: SsioInsertionOrdersStatusGetByPinOrderIdRequest, requestConfig: runtime.TypedQueryConfig<T, SSIOInsertionOrderStatusResponse> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioInsertionOrdersStatusGetByPinOrderId.');
    }

    if (requestParameters.pinOrderId === null || requestParameters.pinOrderId === undefined) {
        throw new runtime.RequiredError('pinOrderId','Required parameter requestParameters.pinOrderId was null or undefined when calling ssioInsertionOrdersStatusGetByPinOrderId.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))).replace(`{${"pin_order_id"}}`, encodeURIComponent(String(requestParameters.pinOrderId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SSIOInsertionOrderStatusResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Get insertion order status by pin order id.
*/
export function ssioInsertionOrdersStatusGetByPinOrderId<T>(requestParameters: SsioInsertionOrdersStatusGetByPinOrderIdRequest, requestConfig?: runtime.TypedQueryConfig<T, SSIOInsertionOrderStatusResponse>): QueryConfig<T> {
    return ssioInsertionOrdersStatusGetByPinOrderIdRaw(requestParameters, requestConfig);
}

/**
 * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * Get Salesforce order lines by ad account id.
 */
function ssioOrderLinesGetByAdAccountRaw<T>(requestParameters: SsioOrderLinesGetByAdAccountRequest, requestConfig: runtime.TypedQueryConfig<T, SsioOrderLinesGetByAdAccount200Response> = {}): QueryConfig<T> {
    if (requestParameters.adAccountId === null || requestParameters.adAccountId === undefined) {
        throw new runtime.RequiredError('adAccountId','Required parameter requestParameters.adAccountId was null or undefined when calling ssioOrderLinesGetByAdAccount.');
    }

    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.bookmark !== undefined) {
        queryParameters['bookmark'] = requestParameters.bookmark;
    }


    if (requestParameters.pageSize !== undefined) {
        queryParameters['page_size'] = requestParameters.pageSize;
    }


    if (requestParameters.pinOrderId !== undefined) {
        queryParameters['pin_order_id'] = requestParameters.pinOrderId;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['oauth', ["ads:read"]];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ad_accounts/{ad_account_id}/ssio/order_lines`.replace(`{${"ad_account_id"}}`, encodeURIComponent(String(requestParameters.adAccountId))),
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
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(SsioOrderLinesGetByAdAccount200ResponseFromJSON(body), text);
    }

    return config;
}

/**
* Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
* Get Salesforce order lines by ad account id.
*/
export function ssioOrderLinesGetByAdAccount<T>(requestParameters: SsioOrderLinesGetByAdAccountRequest, requestConfig?: runtime.TypedQueryConfig<T, SsioOrderLinesGetByAdAccount200Response>): QueryConfig<T> {
    return ssioOrderLinesGetByAdAccountRaw(requestParameters, requestConfig);
}

