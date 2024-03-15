// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { BulkDownloadRequest } from '../models/BulkDownloadRequest';
import { BulkDownloadResponse } from '../models/BulkDownloadResponse';
import { BulkUpsertRequest } from '../models/BulkUpsertRequest';
import { BulkUpsertResponse } from '../models/BulkUpsertResponse';
import { BulkUpsertStatusResponse } from '../models/BulkUpsertStatusResponse';

/**
 * no description
 */
export class BulkApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     * Get advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkDownloadRequest Parameters to get ad entities in bulk
     */
    public async bulkDownloadCreate(adAccountId: string, bulkDownloadRequest: BulkDownloadRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("BulkApi", "bulkDownloadCreate", "adAccountId");
        }


        // verify required parameter 'bulkDownloadRequest' is not null or undefined
        if (bulkDownloadRequest === null || bulkDownloadRequest === undefined) {
            throw new RequiredError("BulkApi", "bulkDownloadCreate", "bulkDownloadRequest");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/bulk/download'
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
            ObjectSerializer.serialize(bulkDownloadRequest, "BulkDownloadRequest", ""),
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
     * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     * Download advertiser entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkRequestId Unique identifier of a bulk upsert request.
     * @param includeDetails if set to True then attach the errors/details to all the requests
     */
    public async bulkRequestGet(adAccountId: string, bulkRequestId: string, includeDetails?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("BulkApi", "bulkRequestGet", "adAccountId");
        }


        // verify required parameter 'bulkRequestId' is not null or undefined
        if (bulkRequestId === null || bulkRequestId === undefined) {
            throw new RequiredError("BulkApi", "bulkRequestGet", "bulkRequestId");
        }



        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'bulk_request_id' + '}', encodeURIComponent(String(bulkRequestId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (includeDetails !== undefined) {
            requestContext.setQueryParam("include_details", ObjectSerializer.serialize(includeDetails, "boolean", ""));
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

    /**
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
     * Create/update ad entities in bulk
     * @param adAccountId Unique identifier of an ad account.
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk
     */
    public async bulkUpsertCreate(adAccountId: string, bulkUpsertRequest: BulkUpsertRequest, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("BulkApi", "bulkUpsertCreate", "adAccountId");
        }


        // verify required parameter 'bulkUpsertRequest' is not null or undefined
        if (bulkUpsertRequest === null || bulkUpsertRequest === undefined) {
            throw new RequiredError("BulkApi", "bulkUpsertCreate", "bulkUpsertRequest");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/bulk/upsert'
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
            ObjectSerializer.serialize(bulkUpsertRequest, "BulkUpsertRequest", ""),
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

}

export class BulkApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to bulkDownloadCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async bulkDownloadCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BulkDownloadResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BulkDownloadResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkDownloadResponse", ""
            ) as BulkDownloadResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
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
            const body: BulkDownloadResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkDownloadResponse", ""
            ) as BulkDownloadResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to bulkRequestGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async bulkRequestGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BulkUpsertStatusResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BulkUpsertStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkUpsertStatusResponse", ""
            ) as BulkUpsertStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
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
            const body: BulkUpsertStatusResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkUpsertStatusResponse", ""
            ) as BulkUpsertStatusResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to bulkUpsertCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async bulkUpsertCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<BulkUpsertResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: BulkUpsertResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkUpsertResponse", ""
            ) as BulkUpsertResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
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
            const body: BulkUpsertResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "BulkUpsertResponse", ""
            ) as BulkUpsertResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
