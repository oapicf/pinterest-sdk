// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { Pin } from '../models/Pin';
import { PinAnalyticsMetricsResponse } from '../models/PinAnalyticsMetricsResponse';
import { PinCreate } from '../models/PinCreate';
import { PinUpdate } from '../models/PinUpdate';
import { PinsAnalyticsMetricTypesParameterInner } from '../models/PinsAnalyticsMetricTypesParameterInner';
import { PinsList200Response } from '../models/PinsList200Response';
import { PinsSaveRequest } from '../models/PinsSaveRequest';

/**
 * no description
 */
export class PinsApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * Get Pin analytics
     * @param pinId Unique identifier of a Pin.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
     * @param metricTypes Pin metric types to get data for, default is all.
     * @param appTypes Apps or devices to get data for, default is all.
     * @param splitField How to split the data into groups. Not including this param means data won\&#39;t be split.
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsAnalytics(pinId: string, startDate: string, endDate: string, metricTypes: Array<PinsAnalyticsMetricTypesParameterInner>, appTypes?: 'ALL' | 'MOBILE' | 'TABLET' | 'WEB', splitField?: 'NO_SPLIT' | 'APP_TYPE', adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinId' is not null or undefined
        if (pinId === null || pinId === undefined) {
            throw new RequiredError("PinsApi", "pinsAnalytics", "pinId");
        }


        // verify required parameter 'startDate' is not null or undefined
        if (startDate === null || startDate === undefined) {
            throw new RequiredError("PinsApi", "pinsAnalytics", "startDate");
        }


        // verify required parameter 'endDate' is not null or undefined
        if (endDate === null || endDate === undefined) {
            throw new RequiredError("PinsApi", "pinsAnalytics", "endDate");
        }


        // verify required parameter 'metricTypes' is not null or undefined
        if (metricTypes === null || metricTypes === undefined) {
            throw new RequiredError("PinsApi", "pinsAnalytics", "metricTypes");
        }





        // Path Params
        const localVarPath = '/pins/{pin_id}/analytics'
            .replace('{' + 'pin_id' + '}', encodeURIComponent(String(pinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (startDate !== undefined) {
            requestContext.setQueryParam("start_date", ObjectSerializer.serialize(startDate, "string", "date"));
        }

        // Query Params
        if (endDate !== undefined) {
            requestContext.setQueryParam("end_date", ObjectSerializer.serialize(endDate, "string", "date"));
        }

        // Query Params
        if (appTypes !== undefined) {
            requestContext.setQueryParam("app_types", ObjectSerializer.serialize(appTypes, "'ALL' | 'MOBILE' | 'TABLET' | 'WEB'", ""));
        }

        // Query Params
        if (metricTypes !== undefined) {
            requestContext.setQueryParam("metric_types", ObjectSerializer.serialize(metricTypes, "Array<PinsAnalyticsMetricTypesParameterInner>", ""));
        }

        // Query Params
        if (splitField !== undefined) {
            requestContext.setQueryParam("split_field", ObjectSerializer.serialize(splitField, "'NO_SPLIT' | 'APP_TYPE'", ""));
        }

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
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
     * Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user\'s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account\'s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called \'curated content\', please use our <a href=\'/docs/add-ons/save-button\'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href=\'/docs/content/content-creation/\'>Content App Solutions Guide</a>.  <strong><a href=\'/docs/content/content-creation/#Creating%20video%20Pins\'>Learn more</a></strong> about video Pin creation.
     * Create Pin
     * @param pinCreate Create a new Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsCreate(pinCreate: PinCreate, adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinCreate' is not null or undefined
        if (pinCreate === null || pinCreate === undefined) {
            throw new RequiredError("PinsApi", "pinsCreate", "pinCreate");
        }



        // Path Params
        const localVarPath = '/pins';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
        }


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(pinCreate, "PinCreate", ""),
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
     * Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Delete Pin
     * @param pinId Unique identifier of a Pin.
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsDelete(pinId: string, adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinId' is not null or undefined
        if (pinId === null || pinId === undefined) {
            throw new RequiredError("PinsApi", "pinsDelete", "pinId");
        }



        // Path Params
        const localVarPath = '/pins/{pin_id}'
            .replace('{' + 'pin_id' + '}', encodeURIComponent(String(pinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.DELETE);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
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
     * Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     * Get Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsGet(pinId: string, pinMetrics?: boolean, adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinId' is not null or undefined
        if (pinId === null || pinId === undefined) {
            throw new RequiredError("PinsApi", "pinsGet", "pinId");
        }




        // Path Params
        const localVarPath = '/pins/{pin_id}'
            .replace('{' + 'pin_id' + '}', encodeURIComponent(String(pinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (pinMetrics !== undefined) {
            requestContext.setQueryParam("pin_metrics", ObjectSerializer.serialize(pinMetrics, "boolean", ""));
        }

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
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
     * Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".
     * List Pins
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param pinFilter Pin filter.
     * @param includeProtectedPins Specify if return pins from protected boards
     * @param pinType The type of pins to return, currently only enabled for private pins
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
     * @param adAccountId Unique identifier of an ad account.
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     */
    public async pinsList(bookmark?: string, pageSize?: number, pinFilter?: 'exclude_native' | 'exclude_repins' | 'has_been_promoted', includeProtectedPins?: boolean, pinType?: 'PRIVATE', creativeTypes?: Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>, adAccountId?: string, pinMetrics?: boolean, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;









        // Path Params
        const localVarPath = '/pins';

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

        // Query Params
        if (pinFilter !== undefined) {
            requestContext.setQueryParam("pin_filter", ObjectSerializer.serialize(pinFilter, "'exclude_native' | 'exclude_repins' | 'has_been_promoted'", ""));
        }

        // Query Params
        if (includeProtectedPins !== undefined) {
            requestContext.setQueryParam("include_protected_pins", ObjectSerializer.serialize(includeProtectedPins, "boolean", ""));
        }

        // Query Params
        if (pinType !== undefined) {
            requestContext.setQueryParam("pin_type", ObjectSerializer.serialize(pinType, "'PRIVATE'", ""));
        }

        // Query Params
        if (creativeTypes !== undefined) {
            requestContext.setQueryParam("creative_types", ObjectSerializer.serialize(creativeTypes, "Array<'REGULAR' | 'VIDEO' | 'SHOPPING' | 'CAROUSEL' | 'MAX_VIDEO' | 'SHOP_THE_PIN' | 'COLLECTION' | 'IDEA'>", ""));
        }

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
        }

        // Query Params
        if (pinMetrics !== undefined) {
            requestContext.setQueryParam("pin_metrics", ObjectSerializer.serialize(pinMetrics, "boolean", ""));
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
     * Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     * Save Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinsSaveRequest Request object used to save an existing pin
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsSave(pinId: string, pinsSaveRequest: PinsSaveRequest, adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinId' is not null or undefined
        if (pinId === null || pinId === undefined) {
            throw new RequiredError("PinsApi", "pinsSave", "pinId");
        }


        // verify required parameter 'pinsSaveRequest' is not null or undefined
        if (pinsSaveRequest === null || pinsSaveRequest === undefined) {
            throw new RequiredError("PinsApi", "pinsSave", "pinsSaveRequest");
        }



        // Path Params
        const localVarPath = '/pins/{pin_id}/save'
            .replace('{' + 'pin_id' + '}', encodeURIComponent(String(pinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.POST);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
        }


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(pinsSaveRequest, "PinsSaveRequest", ""),
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
     * Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\'/docs/api/v5/#operation/ad_accounts/list\'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>
     * Update Pin
     * @param pinId Unique identifier of a Pin.
     * @param pinUpdate 
     * @param adAccountId Unique identifier of an ad account.
     */
    public async pinsUpdate(pinId: string, pinUpdate: PinUpdate, adAccountId?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'pinId' is not null or undefined
        if (pinId === null || pinId === undefined) {
            throw new RequiredError("PinsApi", "pinsUpdate", "pinId");
        }


        // verify required parameter 'pinUpdate' is not null or undefined
        if (pinUpdate === null || pinUpdate === undefined) {
            throw new RequiredError("PinsApi", "pinsUpdate", "pinUpdate");
        }



        // Path Params
        const localVarPath = '/pins/{pin_id}'
            .replace('{' + 'pin_id' + '}', encodeURIComponent(String(pinId)));

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.PATCH);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (adAccountId !== undefined) {
            requestContext.setQueryParam("ad_account_id", ObjectSerializer.serialize(adAccountId, "string", ""));
        }


        // Body Params
        const contentType = ObjectSerializer.getPreferredMediaType([
            "application/json"
        ]);
        requestContext.setHeaderParam("Content-Type", contentType);
        const serializedBody = ObjectSerializer.stringify(
            ObjectSerializer.serialize(pinUpdate, "PinUpdate", ""),
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

export class PinsApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsAnalytics
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsAnalyticsWithHttpInfo(response: ResponseContext): Promise<HttpInfo<{ [key: string]: PinAnalyticsMetricsResponse; } >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: { [key: string]: PinAnalyticsMetricsResponse; } = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "{ [key: string]: PinAnalyticsMetricsResponse; }", ""
            ) as { [key: string]: PinAnalyticsMetricsResponse; };
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid pins analytics parameters.", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Not authorized to access board or Pin.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Pin not found.", body, response.headers);
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
            const body: { [key: string]: PinAnalyticsMetricsResponse; } = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "{ [key: string]: PinAnalyticsMetricsResponse; }", ""
            ) as { [key: string]: PinAnalyticsMetricsResponse; };
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsCreate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsCreateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Pin >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid Pin parameters response", body, response.headers);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "The Pin\&#39;s image is too small, too large or is broken", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Board or section not found", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", body, response.headers);
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
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsDelete
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsDeleteWithHttpInfo(response: ResponseContext): Promise<HttpInfo<void >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("204", response.httpStatusCode)) {
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, undefined);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Not authorized to access board or Pin.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Pin not found.", body, response.headers);
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
     * @params response Response returned by the server for a request to pinsGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Pin >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Not authorized to access board or Pin.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Pin not found.", body, response.headers);
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
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<PinsList200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: PinsList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinsList200Response", ""
            ) as PinsList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("400", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Invalid pin filter value", body, response.headers);
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
            const body: PinsList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "PinsList200Response", ""
            ) as PinsList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsSave
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsSaveWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Pin >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("201", response.httpStatusCode)) {
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Not authorized to access Board or Pin.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Board or Pin not found.", body, response.headers);
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
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to pinsUpdate
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async pinsUpdateWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Pin >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }
        if (isCodeInRange("403", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Not authorized to update Pin.", body, response.headers);
        }
        if (isCodeInRange("404", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "Pin not found.", body, response.headers);
        }
        if (isCodeInRange("429", response.httpStatusCode)) {
            const body: Error = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Error", ""
            ) as Error;
            throw new ApiException<Error>(response.httpStatusCode, "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.", body, response.headers);
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
            const body: Pin = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Pin", ""
            ) as Pin;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
