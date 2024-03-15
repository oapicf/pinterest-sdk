// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AudienceDefinitionResponse } from '../models/AudienceDefinitionResponse';
import { AudienceInsightType } from '../models/AudienceInsightType';
import { AudienceInsightsResponse } from '../models/AudienceInsightsResponse';

/**
 * no description
 */
export class AudienceInsightsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account\'s engaged audience on Pinterest, the ad account\'s total audience on Pinterest and Pinterest\'s total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
     * Get audience insights
     * @param adAccountId Unique identifier of an ad account.
     * @param audienceInsightType Type of audience insights.
     */
    public async audienceInsightsGet(adAccountId: string, audienceInsightType: AudienceInsightType, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("AudienceInsightsApi", "audienceInsightsGet", "adAccountId");
        }


        // verify required parameter 'audienceInsightType' is not null or undefined
        if (audienceInsightType === null || audienceInsightType === undefined) {
            throw new RequiredError("AudienceInsightsApi", "audienceInsightsGet", "audienceInsightType");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/audience_insights'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (audienceInsightType !== undefined) {
            requestContext.setQueryParam("audience_insight_type", ObjectSerializer.serialize(audienceInsightType, "AudienceInsightType", ""));
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
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     * Get audience insights scope and type
     * @param adAccountId Unique identifier of an ad account.
     */
    public async audienceInsightsScopeAndTypeGet(adAccountId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("AudienceInsightsApi", "audienceInsightsScopeAndTypeGet", "adAccountId");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/insights/audiences'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)));

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

}

export class AudienceInsightsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to audienceInsightsGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async audienceInsightsGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AudienceInsightsResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AudienceInsightsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AudienceInsightsResponse", ""
            ) as AudienceInsightsResponse;
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
            const body: AudienceInsightsResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AudienceInsightsResponse", ""
            ) as AudienceInsightsResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to audienceInsightsScopeAndTypeGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async audienceInsightsScopeAndTypeGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<AudienceDefinitionResponse >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: AudienceDefinitionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AudienceDefinitionResponse", ""
            ) as AudienceDefinitionResponse;
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
            const body: AudienceDefinitionResponse = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "AudienceDefinitionResponse", ""
            ) as AudienceDefinitionResponse;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
