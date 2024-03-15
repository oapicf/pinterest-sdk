// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { OrderLine } from '../models/OrderLine';
import { OrderLinesList200Response } from '../models/OrderLinesList200Response';

/**
 * no description
 */
export class OrderLinesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     * Get a specific existing order line associated with an ad account.
     * Get order line
     * @param adAccountId Unique identifier of an ad account.
     * @param orderLineId Unique identifier of an order line.
     */
    public async orderLinesGet(adAccountId: string, orderLineId: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("OrderLinesApi", "orderLinesGet", "adAccountId");
        }


        // verify required parameter 'orderLineId' is not null or undefined
        if (orderLineId === null || orderLineId === undefined) {
            throw new RequiredError("OrderLinesApi", "orderLinesGet", "orderLineId");
        }


        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/order_lines/{order_line_id}'
            .replace('{' + 'ad_account_id' + '}', encodeURIComponent(String(adAccountId)))
            .replace('{' + 'order_line_id' + '}', encodeURIComponent(String(orderLineId)));

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
     * List existing order lines associated with an ad account.
     * Get order lines
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     */
    public async orderLinesList(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'adAccountId' is not null or undefined
        if (adAccountId === null || adAccountId === undefined) {
            throw new RequiredError("OrderLinesApi", "orderLinesList", "adAccountId");
        }





        // Path Params
        const localVarPath = '/ad_accounts/{ad_account_id}/order_lines'
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

export class OrderLinesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to orderLinesGet
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async orderLinesGetWithHttpInfo(response: ResponseContext): Promise<HttpInfo<OrderLine >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: OrderLine = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrderLine", ""
            ) as OrderLine;
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
            const body: OrderLine = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrderLine", ""
            ) as OrderLine;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to orderLinesList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async orderLinesListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<OrderLinesList200Response >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: OrderLinesList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrderLinesList200Response", ""
            ) as OrderLinesList200Response;
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
            const body: OrderLinesList200Response = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "OrderLinesList200Response", ""
            ) as OrderLinesList200Response;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
