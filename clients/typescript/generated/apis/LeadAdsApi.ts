// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AdAccountsSubscriptionsGetList200Response } from '../models/AdAccountsSubscriptionsGetList200Response';
import { LeadSubscription } from '../models/LeadSubscription';
import { LeadSubscriptionPostParamsCreate } from '../models/LeadSubscriptionPostParamsCreate';
import { PinterestLibError } from '../models/PinterestLibError';

/**
 * no description
 */
export class LeadAdsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Delete lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public async adAccountsSubscriptionsDelById(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsDelById", "adAccountId");
        }


        // verify required parameter 'subscriptionId' is not null or undefined
        if (subscriptionId === null || subscriptionId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsDelById", "subscriptionId");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'subscription_id' + '}', encodeURIComponent(String(subscriptionId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.\'
     * Get lead ads subscription by ID
     * @param adAccountId Unique identifier of an ad account.
     * @param subscriptionId Unique identifier of a subscription.
     */
    public async adAccountsSubscriptionsGetById(adAccountId: string, subscriptionId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsGetById", "adAccountId");
        }


        // verify required parameter 'subscriptionId' is not null or undefined
        if (subscriptionId === null || subscriptionId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsGetById", "subscriptionId");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'subscription_id' + '}', encodeURIComponent(String(subscriptionId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        // Apply auth methods
        authMethod = _config.authMethods["client_credentials"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Get the advertiser\'s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     * Get lead ads subscriptions
     * @param adAccountId Unique identifier of an ad account.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
     */
    public async adAccountsSubscriptionsGetList(adAccountId: string, bookmark?: string, pageSize?: number, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsGetList", "adAccountId");
        }




        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/leads/subscriptions'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     * Create lead ads subscription
     * @param adAccountId Unique identifier of an ad account.
     * @param leadSubscriptionPostParamsCreate 
     */
    public async adAccountsSubscriptionsPost(adAccountId: string, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsPost", "adAccountId");
        }


        // verify required parameter 'leadSubscriptionPostParamsCreate' is not null or undefined
        if (leadSubscriptionPostParamsCreate === null || leadSubscriptionPostParamsCreate === undefined) {
            throw new RequiredError("LeadAdsApi", "adAccountsSubscriptionsPost", "leadSubscriptionPostParamsCreate");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/leads/subscriptions'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(leadSubscriptionPostParamsCreate, "LeadSubscriptionPostParamsCreate", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _config?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class LeadAdsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to adAccountsSubscriptionsDelById
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async adAccountsSubscriptionsDelByIdWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: void = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "void", ""
            ) as void;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to adAccountsSubscriptionsGetById
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async adAccountsSubscriptionsGetByIdWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LeadSubscription >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LeadSubscription = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadSubscription", ""
            ) as LeadSubscription;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LeadSubscription = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadSubscription", ""
            ) as LeadSubscription;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to adAccountsSubscriptionsGetList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async adAccountsSubscriptionsGetListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AdAccountsSubscriptionsGetList200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AdAccountsSubscriptionsGetList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AdAccountsSubscriptionsGetList200Response", ""
            ) as AdAccountsSubscriptionsGetList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("401", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "Authentication is required and has either failed or not been provided.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The requested resource could not be found on this server.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The user has sent too many requests in a given amount of time and is being rate limited.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: AdAccountsSubscriptionsGetList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AdAccountsSubscriptionsGetList200Response", ""
            ) as AdAccountsSubscriptionsGetList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to adAccountsSubscriptionsPost
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async adAccountsSubscriptionsPostWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LeadSubscription >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LeadSubscription = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadSubscription", ""
            ) as LeadSubscription;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request could not be understood by the server due to unexpected data.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: PinterestLibError = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinterestLibError", ""
            ) as PinterestLibError;
            throw new ApiException<PinterestLibError>(response.httpStatusCode, "An unexpected error response.", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LeadSubscription = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadSubscription", ""
            ) as LeadSubscription;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
