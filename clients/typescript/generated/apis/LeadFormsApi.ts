// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { LeadFormResponse } from '../models/LeadFormResponse';
import { LeadFormTestRequest } from '../models/LeadFormTestRequest';
import { LeadFormTestResponse } from '../models/LeadFormTestResponse';
import { LeadFormsList200Response } from '../models/LeadFormsList200Response';

/**
 * no description
 */
export class LeadFormsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead form by id
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     */
    public async leadFormGet(adAccountId: string, leadFormId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormGet", "adAccountId");
        }


        // verify required parameter 'leadFormId' is not null or undefined
        if (leadFormId === null || leadFormId === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormGet", "leadFormId");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'lead_form_id' + '}', encodeURIComponent(String(leadFormId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Create lead form test data
     * @param adAccountId Unique identifier of an ad account.
     * @param leadFormId Unique identifier of a lead form.
     * @param leadFormTestRequest Subscription to create.
     */
    public async leadFormTestCreate(adAccountId: string, leadFormId: string, leadFormTestRequest: LeadFormTestRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormTestCreate", "adAccountId");
        }


        // verify required parameter 'leadFormId' is not null or undefined
        if (leadFormId === null || leadFormId === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormTestCreate", "leadFormId");
        }


        // verify required parameter 'leadFormTestRequest' is not null or undefined
        if (leadFormTestRequest === null || leadFormTestRequest === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormTestCreate", "leadFormTestRequest");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'lead_form_id' + '}', encodeURIComponent(String(leadFormId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(leadFormTestRequest, "LeadFormTestRequest", ""),
            contentType
        );
        requestContext.setBody(serializedBody);

        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

    /**
     * Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.
     * Get lead forms
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async leadFormsList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("LeadFormsApi", "leadFormsList", "adAccountId");
        }





        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/lead_forms'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (pageSize !== undefined) {
            requestContext.setQueryParam("page_size", ObjectSerializer.serialize(pageSize, "number", ""));
        }

        // Query Params
        if (order !== undefined) {
            requestContext.setQueryParam("order", ObjectSerializer.serialize(order, "'ASCENDING' | 'DESCENDING'", ""));
        }

        // Query Params
        if (bookmark !== undefined) {
            requestContext.setQueryParam("bookmark", ObjectSerializer.serialize(bookmark, "string", ""));
        }


        let authMethod: SecurityAuthentication | undefined;
        // Apply auth methods
        authMethod = _config.authMethods["pinterest_oauth2"]
        if (authMethod?.applySecurityAuthentication) {
            await authMethod?.applySecurityAuthentication(requestContext);
        }
        
        const defaultAuth: SecurityAuthentication | undefined = _options?.authMethods?.default || this.configuration?.authMethods?.default
        if (defaultAuth?.applySecurityAuthentication) {
            await defaultAuth?.applySecurityAuthentication(requestContext);
        }

        return requestContext;
    }

}

export class LeadFormsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to leadFormGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async leadFormGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LeadFormResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LeadFormResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormResponse", ""
            ) as LeadFormResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid ad account lead forms parameters.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "The lead form ID for the given ad account ID does not exist.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LeadFormResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormResponse", ""
            ) as LeadFormResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to leadFormTestCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async leadFormTestCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LeadFormTestResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LeadFormTestResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormTestResponse", ""
            ) as LeadFormTestResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid parameters.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Lead not found.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LeadFormTestResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormTestResponse", ""
            ) as LeadFormTestResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to leadFormsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async leadFormsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<LeadFormsList200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: LeadFormsList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormsList200Response", ""
            ) as LeadFormsList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid ad account lead forms parameters.", body, response.headers);
        }
        if (isCodeInRange("0", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Unexpected error", body, response.headers);
        }

        // Work around for missing responses in specification, e.g. for petstore.yaml
        if (response.httpStatusCode >= 200 && response.httpStatusCode <= 299) {
            const body: LeadFormsList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "LeadFormsList200Response", ""
            ) as LeadFormsList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
