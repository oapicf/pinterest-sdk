// tslint:disable
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    ConversionEventResponse,
    ConversionTagCreate,
    ConversionTagListResponse,
    ConversionTagResponse,
    PageVisitConversionTagsGet200Response,
} from '../models';

export interface ConversionTagsCreateRequest {
    adAccountId: string;
    conversionTagCreate: ConversionTagCreate;
}

export interface ConversionTagsGetRequest {
    adAccountId: string;
    conversionTagId: string;
}

export interface ConversionTagsListRequest {
    adAccountId: string;
    filterDeleted?: boolean;
}

export interface OcpmEligibleConversionTagsGetRequest {
    adAccountId: string;
}

export interface PageVisitConversionTagsGetRequest {
    adAccountId: string;
    pageSize?: number;
    order?: PageVisitConversionTagsGetOrderEnum;
    bookmark?: string;
}

/**
 * no description
 */
export class ConversionTagsApi extends BaseAPI {

    /**
     * Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\'s ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"https://developers.pinterest.com/docs/conversions/enhanced-match/\">Enhanced match</a>
     * Create conversion tag
     */
    conversionTagsCreate({ adAccountId, conversionTagCreate }: ConversionTagsCreateRequest): Observable<ConversionTagResponse>
    conversionTagsCreate({ adAccountId, conversionTagCreate }: ConversionTagsCreateRequest, opts?: OperationOpts): Observable<AjaxResponse<ConversionTagResponse>>
    conversionTagsCreate({ adAccountId, conversionTagCreate }: ConversionTagsCreateRequest, opts?: OperationOpts): Observable<ConversionTagResponse | AjaxResponse<ConversionTagResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'conversionTagsCreate');
        throwIfNullOrUndefined(conversionTagCreate, 'conversionTagCreate', 'conversionTagsCreate');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:write'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<ConversionTagResponse>({
            url: '/ad_accounts/{ad_account_id}/conversion_tags'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'POST',
            headers,
            body: conversionTagCreate,
        }, opts?.responseOpts);
    };

    /**
     * Get information about an existing conversion tag.
     * Get conversion tag
     */
    conversionTagsGet({ adAccountId, conversionTagId }: ConversionTagsGetRequest): Observable<ConversionTagResponse>
    conversionTagsGet({ adAccountId, conversionTagId }: ConversionTagsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<ConversionTagResponse>>
    conversionTagsGet({ adAccountId, conversionTagId }: ConversionTagsGetRequest, opts?: OperationOpts): Observable<ConversionTagResponse | AjaxResponse<ConversionTagResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'conversionTagsGet');
        throwIfNullOrUndefined(conversionTagId, 'conversionTagId', 'conversionTagsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<ConversionTagResponse>({
            url: '/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}'.replace('{ad_account_id}', encodeURI(adAccountId)).replace('{conversion_tag_id}', encodeURI(conversionTagId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * List conversion tags associated with an ad account.
     * Get conversion tags
     */
    conversionTagsList({ adAccountId, filterDeleted }: ConversionTagsListRequest): Observable<ConversionTagListResponse>
    conversionTagsList({ adAccountId, filterDeleted }: ConversionTagsListRequest, opts?: OperationOpts): Observable<AjaxResponse<ConversionTagListResponse>>
    conversionTagsList({ adAccountId, filterDeleted }: ConversionTagsListRequest, opts?: OperationOpts): Observable<ConversionTagListResponse | AjaxResponse<ConversionTagListResponse>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'conversionTagsList');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (filterDeleted != null) { query['filter_deleted'] = filterDeleted; }

        return this.request<ConversionTagListResponse>({
            url: '/ad_accounts/{ad_account_id}/conversion_tags'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

    /**
     * Get Ocpm eligible conversion tag events for an ad account.
     * Get Ocpm eligible conversion tags
     */
    ocpmEligibleConversionTagsGet({ adAccountId }: OcpmEligibleConversionTagsGetRequest): Observable<{ [key: string]: Array<ConversionEventResponse>; }>
    ocpmEligibleConversionTagsGet({ adAccountId }: OcpmEligibleConversionTagsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<{ [key: string]: Array<ConversionEventResponse>; }>>
    ocpmEligibleConversionTagsGet({ adAccountId }: OcpmEligibleConversionTagsGetRequest, opts?: OperationOpts): Observable<{ [key: string]: Array<ConversionEventResponse>; } | AjaxResponse<{ [key: string]: Array<ConversionEventResponse>; }>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'ocpmEligibleConversionTagsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        return this.request<{ [key: string]: Array<ConversionEventResponse>; }>({
            url: '/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
        }, opts?.responseOpts);
    };

    /**
     * Get all page visit conversion tag events for an ad account.
     * Get page visit conversion tags
     */
    pageVisitConversionTagsGet({ adAccountId, pageSize, order, bookmark }: PageVisitConversionTagsGetRequest): Observable<PageVisitConversionTagsGet200Response>
    pageVisitConversionTagsGet({ adAccountId, pageSize, order, bookmark }: PageVisitConversionTagsGetRequest, opts?: OperationOpts): Observable<AjaxResponse<PageVisitConversionTagsGet200Response>>
    pageVisitConversionTagsGet({ adAccountId, pageSize, order, bookmark }: PageVisitConversionTagsGetRequest, opts?: OperationOpts): Observable<PageVisitConversionTagsGet200Response | AjaxResponse<PageVisitConversionTagsGet200Response>> {
        throwIfNullOrUndefined(adAccountId, 'adAccountId', 'pageVisitConversionTagsGet');

        const headers: HttpHeaders = {
            // oauth required
            ...(this.configuration.accessToken != null
                ? { Authorization: typeof this.configuration.accessToken === 'function'
                    ? this.configuration.accessToken('pinterest_oauth2', ['ads:read'])
                    : this.configuration.accessToken }
                : undefined
            ),
        };

        const query: HttpQuery = {};

        if (pageSize != null) { query['page_size'] = pageSize; }
        if (order != null) { query['order'] = order; }
        if (bookmark != null) { query['bookmark'] = bookmark; }

        return this.request<PageVisitConversionTagsGet200Response>({
            url: '/ad_accounts/{ad_account_id}/conversion_tags/page_visit'.replace('{ad_account_id}', encodeURI(adAccountId)),
            method: 'GET',
            headers,
            query,
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum PageVisitConversionTagsGetOrderEnum {
    Ascending = 'ASCENDING',
    Descending = 'DESCENDING'
}