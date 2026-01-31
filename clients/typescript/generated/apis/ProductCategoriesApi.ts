// TODO: better import syntax?
import {BaseAPIRequestFactory, RequiredError, COLLECTION_FORMATS} from './baseapi';
import {Configuration} from '../configuration';
import {RequestContext, HttpMethod, ResponseContext, HttpFile, HttpInfo} from '../http/http';
import {ObjectSerializer} from '../models/ObjectSerializer';
import {ApiException} from './exception';
import {canConsumeForm, isCodeInRange} from '../util';
import {SecurityAuthentication} from '../auth/auth';


import { AgeTrendsBucket } from '../models/AgeTrendsBucket';
import { FeaturedTrend } from '../models/FeaturedTrend';
import { GenderBucket } from '../models/GenderBucket';
import { InterestsEnum } from '../models/InterestsEnum';
import { PinterestLibError } from '../models/PinterestLibError';
import { ProductCategoriesEngagementType } from '../models/ProductCategoriesEngagementType';
import { ProductCategoryDetailLookbackWindow } from '../models/ProductCategoryDetailLookbackWindow';
import { ProductCategoryDetails } from '../models/ProductCategoryDetails';
import { ProductCategoryEnum } from '../models/ProductCategoryEnum';
import { ProductCategoryRegion } from '../models/ProductCategoryRegion';
import { TrendingProductCategory } from '../models/TrendingProductCategory';
import { VerticalProductCategory } from '../models/VerticalProductCategory';

/**
 * no description
 */
export class ProductCategoriesApiRequestFactory extends BaseAPIRequestFactory {

    /**
     *   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
     * Get featured topics
     * @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * @param interest Interest to filter by
     */
    public async trendsFeaturedTopicsList(region: ProductCategoryRegion, interest?: InterestsEnum, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new RequiredError("ProductCategoriesApi", "trendsFeaturedTopicsList", "region");
        }



        // Path Params
        const localVarPath = '/trends/topics/featured';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (interest !== undefined) {
            requestContext.setQueryParam("interest", ObjectSerializer.serialize(interest, "InterestsEnum", ""));
        }

        // Query Params
        if (region !== undefined) {
            requestContext.setQueryParam("region", ObjectSerializer.serialize(region, "ProductCategoryRegion", ""));
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

    /**
     *   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
     * Get product category details
     * @param productCategories List of product categories
     * @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * @param lookbackWindow    Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years)
     * @param engagementType      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     */
    public async trendsProductCategoriesDetailsList(productCategories: Array<ProductCategoryEnum>, region: ProductCategoryRegion, lookbackWindow?: ProductCategoryDetailLookbackWindow, engagementType?: ProductCategoriesEngagementType, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'productCategories' is not null or undefined
        if (productCategories === null || productCategories === undefined) {
            throw new RequiredError("ProductCategoriesApi", "trendsProductCategoriesDetailsList", "productCategories");
        }


        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new RequiredError("ProductCategoriesApi", "trendsProductCategoriesDetailsList", "region");
        }




        // Path Params
        const localVarPath = '/trends/product_categories/details';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (productCategories !== undefined) {
            const serializedParams = ObjectSerializer.serialize(productCategories, "Array<ProductCategoryEnum>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("product_categories", serializedParam);
            }
        }

        // Query Params
        if (region !== undefined) {
            requestContext.setQueryParam("region", ObjectSerializer.serialize(region, "ProductCategoryRegion", ""));
        }

        // Query Params
        if (lookbackWindow !== undefined) {
            requestContext.setQueryParam("lookback_window", ObjectSerializer.serialize(lookbackWindow, "ProductCategoryDetailLookbackWindow", ""));
        }

        // Query Params
        if (engagementType !== undefined) {
            requestContext.setQueryParam("engagement_type", ObjectSerializer.serialize(engagementType, "ProductCategoriesEngagementType", ""));
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

    /**
     *   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
     * Get a list of growing Shopping Product Categories
     * @param region       The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada
     * @param verticals List of verticals to filter by
     * @param ages Age to filter by. If not provided, the results will be filtered by all ages.
     * @param genders Gender to filter by, If not provided, the results will be filtered by all genders.
     * @param engagementType      Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves
     */
    public async trendsProductCategoriesTrendingList(region: ProductCategoryRegion, verticals?: Array<VerticalProductCategory>, ages?: Array<AgeTrendsBucket>, genders?: Array<GenderBucket>, engagementType?: ProductCategoriesEngagementType, _options?: Configuration): Promise<RequestContext> {
        let _config = _options || this.configuration;

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new RequiredError("ProductCategoriesApi", "trendsProductCategoriesTrendingList", "region");
        }






        // Path Params
        const localVarPath = '/trends/product_categories/trending';

        // Make Request Context
        const requestContext = _config.baseServer.makeRequestContext(localVarPath, HttpMethod.GET);
        requestContext.setHeaderParam("Accept", "application/json, */*;q=0.8")

        // Query Params
        if (region !== undefined) {
            requestContext.setQueryParam("region", ObjectSerializer.serialize(region, "ProductCategoryRegion", ""));
        }

        // Query Params
        if (verticals !== undefined) {
            const serializedParams = ObjectSerializer.serialize(verticals, "Array<VerticalProductCategory>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("verticals", serializedParam);
            }
        }

        // Query Params
        if (ages !== undefined) {
            const serializedParams = ObjectSerializer.serialize(ages, "Array<AgeTrendsBucket>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("ages", serializedParam);
            }
        }

        // Query Params
        if (genders !== undefined) {
            const serializedParams = ObjectSerializer.serialize(genders, "Array<GenderBucket>", "");
            for (const serializedParam of serializedParams) {
                requestContext.appendQueryParam("genders", serializedParam);
            }
        }

        // Query Params
        if (engagementType !== undefined) {
            requestContext.setQueryParam("engagement_type", ObjectSerializer.serialize(engagementType, "ProductCategoriesEngagementType", ""));
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

export class ProductCategoriesApiResponseProcessor {

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to trendsFeaturedTopicsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async trendsFeaturedTopicsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<FeaturedTrend> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<FeaturedTrend> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<FeaturedTrend>", ""
            ) as Array<FeaturedTrend>;
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
            const body: Array<FeaturedTrend> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<FeaturedTrend>", ""
            ) as Array<FeaturedTrend>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to trendsProductCategoriesDetailsList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async trendsProductCategoriesDetailsListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<ProductCategoryDetails> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<ProductCategoryDetails> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ProductCategoryDetails>", ""
            ) as Array<ProductCategoryDetails>;
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
            const body: Array<ProductCategoryDetails> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<ProductCategoryDetails>", ""
            ) as Array<ProductCategoryDetails>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

    /**
     * Unwraps the actual response sent by the server from the response context and deserializes the response content
     * to the expected objects
     *
     * @params response Response returned by the server for a request to trendsProductCategoriesTrendingList
     * @throws ApiException if the response code was not in [200, 299]
     */
     public async trendsProductCategoriesTrendingListWithHttpInfo(response: ResponseContext): Promise<HttpInfo<Array<TrendingProductCategory> >> {
        const contentType = ObjectSerializer.normalizeMediaType(response.headers["content-type"]);
        if (isCodeInRange("200", response.httpStatusCode)) {
            const body: Array<TrendingProductCategory> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<TrendingProductCategory>", ""
            ) as Array<TrendingProductCategory>;
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
            const body: Array<TrendingProductCategory> = ObjectSerializer.deserialize(
                ObjectSerializer.parse(await response.body.text(), contentType),
                "Array<TrendingProductCategory>", ""
            ) as Array<TrendingProductCategory>;
            return new HttpInfo(response.httpStatusCode, response.headers, response.body, body);
        }

        throw new ApiException<string | Blob | undefined>(response.httpStatusCode, "Unknown API Status Code!", await response.getBodyAsAny(), response.headers);
    }

}
