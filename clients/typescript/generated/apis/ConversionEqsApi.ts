// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { EventQualityScore } from '../models/EventQualityScore';
import { IngestionSourceOptions } from '../models/IngestionSourceOptions';
import { LookbackPeriodOptions } from '../models/LookbackPeriodOptions';
import { PinterestLibError } from '../models/PinterestLibError';
import { SourcePlatformOptions } from '../models/SourcePlatformOptions';

/**
 * no description
 */
export class ConversionEqsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     * Get event quality score (EQS)
     * @param lookbackPeriod Lookback window (number of days).
     * @param adAccountId Unique identifier of an ad account.
     * @param sourcePlatform Source platform of event.
     * @param ingestionSource Ingestion source of event.
     */
    public async conversionEqsList(lookbackPeriod: LookbackPeriodOptions, adAccountId: string, sourcePlatform?: SourcePlatformOptions, ingestionSource?: IngestionSourceOptions, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'lookbackPeriod' is not null or undefined
        if (lookbackPeriod === null || lookbackPeriod === undefined) {
            throw new RequiredError("ConversionEqsApi", "conversionEqsList", "lookbackPeriod");
        }


        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("ConversionEqsApi", "conversionEqsList", "adAccountId");
        }




        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/conversion_eqs'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (lookbackPeriod !== undefined) {
            requestContext.setQueryParam("lookback_period", ObjectSerializer.serialize(lookbackPeriod, "LookbackPeriodOptions", ""));
        }

        // Query Params
        if (sourcePlatform !== undefined) {
            requestContext.setQueryParam("source_platform", ObjectSerializer.serialize(sourcePlatform, "SourcePlatformOptions", ""));
        }

        // Query Params
        if (ingestionSource !== undefined) {
            requestContext.setQueryParam("ingestion_source", ObjectSerializer.serialize(ingestionSource, "IngestionSourceOptions", ""));
        }


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

}

export class ConversionEqsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to conversionEqsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async conversionEqsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<EventQualityScore> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<EventQualityScore> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<EventQualityScore>", ""
            ) as Array<EventQualityScore>;
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
            const body: Array<EventQualityScore> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<EventQualityScore>", ""
            ) as Array<EventQualityScore>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
