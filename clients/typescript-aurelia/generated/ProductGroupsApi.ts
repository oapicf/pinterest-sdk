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
  AdAccountsCatalogsProductGroupsList200Response,
} from './models';

/**
 * adAccountsCatalogsProductGroupsList - parameters interface
 */
export interface IAdAccountsCatalogsProductGroupsListParams {
  adAccountId: string;
  feedProfileId?: string;
}

/**
 * ProductGroupsApi - API class
 */
@autoinject()
export class ProductGroupsApi extends Api {

  /**
   * Creates a new ProductGroupsApi class.
   *
   * @param httpClient The Aurelia HTTP client to be injected.
   * @param authStorage A storage for authentication data.
   */
  constructor(httpClient: HttpClient, authStorage: AuthStorage) {
    super(httpClient, authStorage);
  }

  /**
   * Get catalog product groups
   * This endpoint is completely deprecated. Please use &lt;a href&#x3D;\&#39;/docs/api/v5/#operation/catalogs_product_groups/list\&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
   * @param params.adAccountId Unique identifier of an ad account.
   * @param params.feedProfileId The feed profile id whose catalog product groups we want to return.
   */
  async adAccountsCatalogsProductGroupsList(params: IAdAccountsCatalogsProductGroupsListParams): Promise<AdAccountsCatalogsProductGroupsList200Response> {
    // Verify required parameters are set
    this.ensureParamIsSet('adAccountsCatalogsProductGroupsList', params, 'adAccountId');

    // Create URL to call
    const url = `${this.basePath}/ad_accounts/{ad_account_id}/product_groups/catalogs`
      .replace(`{${'ad_account_id'}}`, encodeURIComponent(`${params['adAccountId']}`));

    const response = await this.httpClient.createRequest(url)
      // Set HTTP method
      .asGet()
      // Set query parameters
      .withParams({ 
        'feed_profile_id': params['feedProfileId'],
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
