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
/* tslint:disable:no-unused-variable member-ordering */

import { Injectable, Optional } from '@nestjs/common';
import { HttpService } from '@nestjs/axios';
import { AxiosResponse } from 'axios';
import { Observable, from, of, switchMap } from 'rxjs';
import { ConversionEventResponse } from '../model/conversionEventResponse';
import { ConversionTagCreate } from '../model/conversionTagCreate';
import { ConversionTagListResponse } from '../model/conversionTagListResponse';
import { ConversionTagResponse } from '../model/conversionTagResponse';
import { PageVisitConversionTagsGet200Response } from '../model/pageVisitConversionTagsGet200Response';
import { Configuration } from '../configuration';
import { COLLECTION_FORMATS } from '../variables';


@Injectable()
export class ConversionTagsService {

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
     * Create conversion tag
     * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account\&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;/docs/api-features/pinterest-tag/#enhanced-match\&quot;&gt;Enhanced match&lt;/a&gt;
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagCreate Conversion Tag to create
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public conversionTagsCreate(adAccountId: string, conversionTagCreate: ConversionTagCreate, ): Observable<AxiosResponse<ConversionTagResponse>>;
    public conversionTagsCreate(adAccountId: string, conversionTagCreate: ConversionTagCreate, ): Observable<any> {
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling conversionTagsCreate.');
        }

        if (conversionTagCreate === null || conversionTagCreate === undefined) {
            throw new Error('Required parameter conversionTagCreate was null or undefined when calling conversionTagsCreate.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
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
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.post<ConversionTagResponse>(`${this.basePath}/ad_accounts/${encodeURIComponent(String(ad_account_id))}/conversion_tags`,
                    conversionTagCreate,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get conversion tag
     * Get information about an existing conversion tag.
     * @param adAccountId Unique identifier of an ad account.
     * @param conversionTagId Id of the conversion tag.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public conversionTagsGet(adAccountId: string, conversionTagId: string, ): Observable<AxiosResponse<ConversionTagResponse>>;
    public conversionTagsGet(adAccountId: string, conversionTagId: string, ): Observable<any> {
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling conversionTagsGet.');
        }

        if (conversionTagId === null || conversionTagId === undefined) {
            throw new Error('Required parameter conversionTagId was null or undefined when calling conversionTagsGet.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
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
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<ConversionTagResponse>(`${this.basePath}/ad_accounts/${encodeURIComponent(String(ad_account_id))}/conversion_tags/${encodeURIComponent(String(conversion_tag_id))}`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get conversion tags
     * List conversion tags associated with an ad account.
     * @param adAccountId Unique identifier of an ad account.
     * @param filterDeleted Filter out deleted tags.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public conversionTagsList(adAccountId: string, filterDeleted?: boolean, ): Observable<AxiosResponse<ConversionTagListResponse>>;
    public conversionTagsList(adAccountId: string, filterDeleted?: boolean, ): Observable<any> {
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling conversionTagsList.');
        }

        let queryParameters = new URLSearchParams();
        if (filterDeleted !== undefined && filterDeleted !== null) {
            queryParameters.append('filter_deleted', <any>filterDeleted);
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
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
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<ConversionTagListResponse>(`${this.basePath}/ad_accounts/${encodeURIComponent(String(ad_account_id))}/conversion_tags`,
                    {
                        params: queryParameters,
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get Ocpm eligible conversion tags
     * Get Ocpm eligible conversion tag events for an ad account.
     * @param adAccountId Unique identifier of an ad account.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public ocpmEligibleConversionTagsGet(adAccountId: string, ): Observable<AxiosResponse<{ [key: string]: Array<ConversionEventResponse>; }>>;
    public ocpmEligibleConversionTagsGet(adAccountId: string, ): Observable<any> {
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling ocpmEligibleConversionTagsGet.');
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
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
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<{ [key: string]: Array<ConversionEventResponse>; }>(`${this.basePath}/ad_accounts/${encodeURIComponent(String(ad_account_id))}/conversion_tags/ocpm_eligible`,
                    {
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
    /**
     * Get page visit conversion tags
     * Get all page visit conversion tag events for an ad account.
     * @param adAccountId Unique identifier of an ad account.
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
     * @param bookmark Cursor used to fetch the next page of items
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public pageVisitConversionTagsGet(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, ): Observable<AxiosResponse<PageVisitConversionTagsGet200Response>>;
    public pageVisitConversionTagsGet(adAccountId: string, pageSize?: number, order?: 'ASCENDING' | 'DESCENDING', bookmark?: string, ): Observable<any> {
        if (adAccountId === null || adAccountId === undefined) {
            throw new Error('Required parameter adAccountId was null or undefined when calling pageVisitConversionTagsGet.');
        }

        let queryParameters = new URLSearchParams();
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters.append('page_size', <any>pageSize);
        }
        if (order !== undefined && order !== null) {
            queryParameters.append('order', <any>order);
        }
        if (bookmark !== undefined && bookmark !== null) {
            queryParameters.append('bookmark', <any>bookmark);
        }

        let headers = {...this.defaultHeaders};

        let accessTokenObservable: Observable<any> = of(null);

        // authentication (pinterest_oauth2) required
        if (this.configuration.accessToken) {
            accessTokenObservable = typeof this.configuration.accessToken === 'function'
                ? from(Promise.resolve(this.configuration.accessToken()))
                : from(Promise.resolve(this.configuration.accessToken))
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
        return accessTokenObservable.pipe(
            switchMap((accessToken) => {
                if (accessToken) {
                    headers['Authorization'] = `Bearer ${accessToken}`;
                }

                return this.httpClient.get<PageVisitConversionTagsGet200Response>(`${this.basePath}/ad_accounts/${encodeURIComponent(String(ad_account_id))}/conversion_tags/page_visit`,
                    {
                        params: queryParameters,
                        withCredentials: this.configuration.withCredentials,
                        headers: headers
                    }
                );
            })
        );
    }
}
