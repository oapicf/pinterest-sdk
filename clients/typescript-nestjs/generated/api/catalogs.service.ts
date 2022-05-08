/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { HttpService, Inject, Injectable, Optional } from '@nestjs/common';
import { AxiosResponse } from 'axios';
import { Observable } from 'rxjs';
import { CatalogsFeed } from '../model/catalogsFeed';
import { CatalogsFeedsCreateRequest } from '../model/catalogsFeedsCreateRequest';
import { CatalogsFeedsUpdateRequest } from '../model/catalogsFeedsUpdateRequest';
import { CatalogsItems } from '../model/catalogsItems';
import { CatalogsItemsBatch } from '../model/catalogsItemsBatch';
import { CatalogsItemsBatchRequest } from '../model/catalogsItemsBatchRequest';
import { CatalogsProductGroup } from '../model/catalogsProductGroup';
import { CatalogsProductGroupCreateRequest } from '../model/catalogsProductGroupCreateRequest';
import { CatalogsProductGroupUpdateRequest } from '../model/catalogsProductGroupUpdateRequest';
import { Paginated } from '../model/paginated';
import { Configuration } from '../configuration';


@Injectable()
export class CatalogsService {

    protected basePath = 'https://api.pinterest.com/v5';
    public defaultHeaders: Record<string,string> = {};
    public configuration = new Configuration();

    constructor(protected httpClient: HttpService, @Optional() configuration: Configuration) {
        this.configuration = configuration || this.configuration;
        this.basePath = configuration?.basePath || this.basePath;
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        return consumes.includes(form);
    }

    /**
     * Create product group
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create product group to use in Catalogs.
     * @param catalogsProductGroupCreateRequest Request object used to created a catalogs product group.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest, ): Observable<AxiosResponse<object>>;
    public catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest, ): Observable<any> {

        if (catalogsProductGroupCreateRequest === null || catalogsProductGroupCreateRequest === undefined) {
            throw new Error('Required parameter catalogsProductGroupCreateRequest was null or undefined when calling catalogsProductGroupsCreate.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<object>(`${this.basePath}/catalogs/product_groups`,
            catalogsProductGroupCreateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Delete product group
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a product group from being in use in Catalogs.
     * @param productGroupId Unique identifier of a product group
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public catalogsProductGroupsDelete(productGroupId: string, ): Observable<AxiosResponse<any>>;
    public catalogsProductGroupsDelete(productGroupId: string, ): Observable<any> {

        if (productGroupId === null || productGroupId === undefined) {
            throw new Error('Required parameter productGroupId was null or undefined when calling catalogsProductGroupsDelete.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<any>(`${this.basePath}/catalogs/product_groups/${encodeURIComponent(String(product_group_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get product groups list
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a list of product groups for a given Catalogs Feed Id.
     * @param feedId Unique identifier of a feed
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Pagination\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public catalogsProductGroupsList(feedId: string, bookmark?: string, pageSize?: number, ): Observable<AxiosResponse<Paginated & object>>;
    public catalogsProductGroupsList(feedId: string, bookmark?: string, pageSize?: number, ): Observable<any> {

        if (feedId === null || feedId === undefined) {
            throw new Error('Required parameter feedId was null or undefined when calling catalogsProductGroupsList.');
        }



        let queryParameters = {};
        if (feedId !== undefined && feedId !== null) {
            queryParameters['feed_id'] = <any>feedId;
        }
        if (bookmark !== undefined && bookmark !== null) {
            queryParameters['bookmark'] = <any>bookmark;
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters['page_size'] = <any>pageSize;
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Paginated & object>(`${this.basePath}/catalogs/product_groups`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Update product group
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update product group to use in Catalogs.
     * @param productGroupId Unique identifier of a product group
     * @param catalogsProductGroupUpdateRequest Request object used to Update a catalogs product group.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public catalogsProductGroupsUpdate(productGroupId: string, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest, ): Observable<AxiosResponse<CatalogsProductGroup>>;
    public catalogsProductGroupsUpdate(productGroupId: string, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest, ): Observable<any> {

        if (productGroupId === null || productGroupId === undefined) {
            throw new Error('Required parameter productGroupId was null or undefined when calling catalogsProductGroupsUpdate.');
        }

        if (catalogsProductGroupUpdateRequest === null || catalogsProductGroupUpdateRequest === undefined) {
            throw new Error('Required parameter catalogsProductGroupUpdateRequest was null or undefined when calling catalogsProductGroupsUpdate.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.patch<CatalogsProductGroup>(`${this.basePath}/catalogs/product_groups/${encodeURIComponent(String(product_group_id))}`,
            catalogsProductGroupUpdateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * List processing results for a given feed
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch a feed processing results owned by the owner user account.
     * @param feedId Unique identifier of a feed
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Pagination\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedProcessingResultsList(feedId: string, bookmark?: string, pageSize?: number, ): Observable<AxiosResponse<Paginated & object>>;
    public feedProcessingResultsList(feedId: string, bookmark?: string, pageSize?: number, ): Observable<any> {

        if (feedId === null || feedId === undefined) {
            throw new Error('Required parameter feedId was null or undefined when calling feedProcessingResultsList.');
        }



        let queryParameters = {};
        if (bookmark !== undefined && bookmark !== null) {
            queryParameters['bookmark'] = <any>bookmark;
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters['page_size'] = <any>pageSize;
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Paginated & object>(`${this.basePath}/catalogs/feeds/${encodeURIComponent(String(feed_id))}/processing_results`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Create feed
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Create a new feed owned by the \&quot;operating user_account\&quot;.
     * @param catalogsFeedsCreateRequest Request object used to created a feed.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest, ): Observable<AxiosResponse<CatalogsFeed>>;
    public feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest, ): Observable<any> {

        if (catalogsFeedsCreateRequest === null || catalogsFeedsCreateRequest === undefined) {
            throw new Error('Required parameter catalogsFeedsCreateRequest was null or undefined when calling feedsCreate.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<CatalogsFeed>(`${this.basePath}/catalogs/feeds`,
            catalogsFeedsCreateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Delete feed
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Delete a feed owned by the \&quot;operating user_account\&quot;.
     * @param feedId Unique identifier of a feed
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedsDelete(feedId: string, ): Observable<AxiosResponse<any>>;
    public feedsDelete(feedId: string, ): Observable<any> {

        if (feedId === null || feedId === undefined) {
            throw new Error('Required parameter feedId was null or undefined when calling feedsDelete.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.delete<any>(`${this.basePath}/catalogs/feeds/${encodeURIComponent(String(feed_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get feed
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single feed owned by the \&quot;operating user_account\&quot;.
     * @param feedId Unique identifier of a feed
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedsGet(feedId: string, ): Observable<AxiosResponse<CatalogsFeed>>;
    public feedsGet(feedId: string, ): Observable<any> {

        if (feedId === null || feedId === undefined) {
            throw new Error('Required parameter feedId was null or undefined when calling feedsGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<CatalogsFeed>(`${this.basePath}/catalogs/feeds/${encodeURIComponent(String(feed_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * List feeds
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Fetch feeds owned by the \&quot;operating user_account\&quot;.
     * @param bookmark Cursor used to fetch the next page of items
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Pagination\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedsList(bookmark?: string, pageSize?: number, ): Observable<AxiosResponse<Paginated & object>>;
    public feedsList(bookmark?: string, pageSize?: number, ): Observable<any> {



        let queryParameters = {};
        if (bookmark !== undefined && bookmark !== null) {
            queryParameters['bookmark'] = <any>bookmark;
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters['page_size'] = <any>pageSize;
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<Paginated & object>(`${this.basePath}/catalogs/feeds`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Update feed
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Update a feed owned by the \&quot;operating user_account\&quot;.
     * @param feedId Unique identifier of a feed
     * @param catalogsFeedsUpdateRequest Request object used to update a feed.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public feedsUpdate(feedId: string, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest, ): Observable<AxiosResponse<CatalogsFeed>>;
    public feedsUpdate(feedId: string, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest, ): Observable<any> {

        if (feedId === null || feedId === undefined) {
            throw new Error('Required parameter feedId was null or undefined when calling feedsUpdate.');
        }

        if (catalogsFeedsUpdateRequest === null || catalogsFeedsUpdateRequest === undefined) {
            throw new Error('Required parameter catalogsFeedsUpdateRequest was null or undefined when calling feedsUpdate.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.patch<CatalogsFeed>(`${this.basePath}/catalogs/feeds/${encodeURIComponent(String(feed_id))}`,
            catalogsFeedsUpdateRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get catalogs items batch
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get a single catalogs items batch created by the \&quot;operating user_account\&quot;.
     * @param batchId Id of a catalogs items batch to fetch
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public itemsBatchGet(batchId: string, ): Observable<AxiosResponse<CatalogsItemsBatch>>;
    public itemsBatchGet(batchId: string, ): Observable<any> {

        if (batchId === null || batchId === undefined) {
            throw new Error('Required parameter batchId was null or undefined when calling itemsBatchGet.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<CatalogsItemsBatch>(`${this.basePath}/catalogs/items/batch/${encodeURIComponent(String(batch_id))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Perform an operation on an item batch
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;\&#39;/docs/api/v5/#tag/Understanding-catalog-management\&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  This endpoint supports multiple operations on a set of one or more catalog items.
     * @param catalogsItemsBatchRequest Request object used to create catalogs items in a batch
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest, ): Observable<AxiosResponse<CatalogsItemsBatch>>;
    public itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest, ): Observable<any> {

        if (catalogsItemsBatchRequest === null || catalogsItemsBatchRequest === undefined) {
            throw new Error('Required parameter catalogsItemsBatchRequest was null or undefined when calling itemsBatchPost.');
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected != undefined) {
            headers['Content-Type'] = httpContentTypeSelected;
        }
        return this.httpClient.post<CatalogsItemsBatch>(`${this.basePath}/catalogs/items/batch`,
            catalogsItemsBatchRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
    /**
     * Get catalogs items
     * Get the items of the catalog created by the \&quot;operating user_account\&quot;
     * @param country Country for the Catalogs Items
     * @param itemIds Catalos Item ids
     * @param language Language for the Catalogs Items
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public itemsGet(country: string, itemIds: Array<string>, language: string, ): Observable<AxiosResponse<CatalogsItems>>;
    public itemsGet(country: string, itemIds: Array<string>, language: string, ): Observable<any> {

        if (country === null || country === undefined) {
            throw new Error('Required parameter country was null or undefined when calling itemsGet.');
        }

        if (itemIds === null || itemIds === undefined) {
            throw new Error('Required parameter itemIds was null or undefined when calling itemsGet.');
        }

        if (language === null || language === undefined) {
            throw new Error('Required parameter language was null or undefined when calling itemsGet.');
        }

        let queryParameters = {};
        if (country !== undefined && country !== null) {
            queryParameters['country'] = <any>country;
        }
        if (itemIds) {
            itemIds.forEach((element) => {
                queryParameters.append('item_ids', <any>element);
            })
        }
        if (language !== undefined && language !== null) {
            queryParameters['language'] = <any>language;
        }

        let headers = this.defaultHeaders;

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers['Authorization'] = 'Bearer ' + accessToken;
        }

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected != undefined) {
            headers['Accept'] = httpHeaderAcceptSelected;
        }

        // to determine the Content-Type header
        const consumes: string[] = [
        ];
        return this.httpClient.get<CatalogsItems>(`${this.basePath}/catalogs/items`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers
            }
        );
    }
}