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

import { autoinject } from 'aurelia-framework';
import { HttpClient } from 'aurelia-http-client';
import { Api } from './Api';
import { AuthStorage } from './AuthStorage';
import {
  ConversionTagResponse,
  PageVisitConversionTagsGet200Response,
  ConversionTagCreate,
  ConversionTagListResponse,
} from './models';

/**
 * conversionTagsCreate - parameters interface
 */
export interface IConversionTagsCreateParams {
  adAccountId: string;
  conversionTagCreate: ConversionTagCreate;
}

/**
 * conversionTagsGet - parameters interface
 */
export interface IConversionTagsGetParams {
  adAccountId: string;
  conversionTagId: string;
}

/**
 * conversionTagsList - parameters interface
 */
export interface IConversionTagsListParams {
  adAccountId: string;
  filterDeleted?: boolean;
}

/**
 * ocpmEligibleConversionTagsGet - parameters interface
 */
export interface IOcpmEligibleConversionTagsGetParams {
  adAccountId: string;
}

/**
 * pageVisitConversionTagsGet - parameters interface
 */
export interface IPageVisitConversionTagsGetParams {
  adAccountId: string;
  pageSize?: number;
  order?: 'ASCENDING' | 'DESCENDING';
  bookmark?: string;
}

/**
 * ConversionTagsApi - API class
 */
@autoinject()
export class ConversionTagsApi extends Api {

  /**
   * Creates a new ConversionTagsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Create conversion tag
   * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account\&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;
   * @param params.adAccountId Unique identifier of an ad account.
   * @param params.conversionTagCreate Conversion Tag to create
   */
  async conversionTagsCreate(params: IConversionTagsCreateParams): Promise<ConversionTagResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('conversionTagsCreate', params, 'adAccountId');
    this.ensureParamIsSet('conversionTagsCreate', params, 'conversionTagCreate');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/conversion_tags`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asPost()
      // Encode body parameter
      .withHeader('content-type', 'application/json')
      .withContent(JSON.stringify(params['conversionTagCreate'] || {}))

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get conversion tag
   * Get information about an existing conversion tag.
   * @param params.adAccountId Unique identifier of an ad account.
   * @param params.conversionTagId Id of the conversion tag.
   */
  async conversionTagsGet(params: IConversionTagsGetParams): Promise<ConversionTagResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('conversionTagsGet', params, 'adAccountId');
    this.ensureParamIsSet('conversionTagsGet', params, 'conversionTagId');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`))
      .replace(`{${'conversion_tag_id'}}`, encodeURIComponent(`${params['conversionTagId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get conversion tags
   * List conversion tags associated with an ad account.
   * @param params.adAccountId Unique identifier of an ad account.
   * @param params.filterDeleted Filter out deleted tags.
   */
  async conversionTagsList(params: IConversionTagsListParams): Promise<ConversionTagListResponse> {
    // Verify required parameters are set
    this.ensureParamIsSet('conversionTagsList', params, 'adAccountId');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/conversion_tags`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'filter_deleted': params['filterDeleted'],
      })

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get Ocpm eligible conversion tags
   * Get Ocpm eligible conversion tag events for an ad account.
   * @param params.adAccountId Unique identifier of an ad account.
   */
  async ocpmEligibleConversionTagsGet(params: IOcpmEligibleConversionTagsGetParams): Promise<{ [key: string]: Array<ConversionEventResponse>; }> {
    // Verify required parameters are set
    this.ensureParamIsSet('ocpmEligibleConversionTagsGet', params, 'adAccountId');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

  /**
   * Get page visit conversion tags
   * Get all page visit conversion tag events for an ad account.
   * @param params.adAccountId Unique identifier of an ad account.
   * @param params.pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information.
   * @param params.order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
   * @param params.bookmark Cursor used to fetch the next page of items
   */
  async pageVisitConversionTagsGet(params: IPageVisitConversionTagsGetParams): Promise<PageVisitConversionTagsGet200Response> {
    // Verify required parameters are set
    this.ensureParamIsSet('pageVisitConversionTagsGet', params, 'adAccountId');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/conversion_tags/page_visit`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'page_size': params['pageSize'],
        'order': params['order'],
        'bookmark': params['bookmark'],
      })

      // Authentication 'pinterest_oauth2' required
      // Send the request
      .send();

    if (response.statusCode < 200 || response.statusCode >= 300) {
      throw new Error(response.content);
    }

    // Extract the content
    return response.content;
  }

}
