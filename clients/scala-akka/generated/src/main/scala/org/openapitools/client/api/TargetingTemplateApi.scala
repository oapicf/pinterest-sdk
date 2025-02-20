/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Error
import org.openapitools.client.model.TargetingTemplateCreate
import org.openapitools.client.model.TargetingTemplateGetResponseData
import org.openapitools.client.model.TargetingTemplateList200Response
import org.openapitools.client.model.TargetingTemplateUpdateRequest
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object TargetingTemplateApi {

  def apply(baseUrl: String = "https://api.pinterest.com/v5") = new TargetingTemplateApi(baseUrl)
}

class TargetingTemplateApi(baseUrl: String) {

  /**
   * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
   * 
   * Expected answers:
   *   code 200 : TargetingTemplateGetResponseData (Success)
   *   code 400 : Error (Invalid ad account id.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param targetingTemplateCreate targeting template creation entity
   */
  def targetingTemplateCreate(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): ApiRequest[TargetingTemplateGetResponseData] =
    ApiRequest[TargetingTemplateGetResponseData](ApiMethods.POST, baseUrl, "/ad_accounts/{ad_account_id}/targeting_templates", "application/json")
      .withBody(targetingTemplateCreate)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[TargetingTemplateGetResponseData](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * Get a list of the targeting templates in the specified <code>ad_account_id</code>
   * 
   * Expected answers:
   *   code 200 : TargetingTemplateList200Response (Success)
   *   code 400 : Error (Invalid ad account id.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
   * @param includeSizing Include audience sizing in result or not
   * @param searchQuery Search keyword for targeting templates
   * @param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
   * @param bookmark Cursor used to fetch the next page of items
   */
  def targetingTemplateList(adAccountId: String, order: Option[String] = None, includeSizing: Option[Boolean] = None, searchQuery: Option[String] = None, pageSize: Option[Int] = None, bookmark: Option[String] = None): ApiRequest[TargetingTemplateList200Response] =
    ApiRequest[TargetingTemplateList200Response](ApiMethods.GET, baseUrl, "/ad_accounts/{ad_account_id}/targeting_templates", "application/json")
      .withQueryParam("order", order)
      .withQueryParam("include_sizing", includeSizing)
      .withQueryParam("search_query", searchQuery)
      .withQueryParam("page_size", pageSize)
      .withQueryParam("bookmark", bookmark)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[TargetingTemplateList200Response](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      

  /**
   * <p>Update the targeting template given advertiser ID and targeting template ID</p>
   * 
   * Expected answers:
   *   code 200 :  (Success)
   *   code 400 : Error (Invalid ad account id.)
   *   code 0 : Error (Unexpected error)
   * 
   * @param adAccountId Unique identifier of an ad account.
   * @param targetingTemplateUpdateRequest Operation type and targeting template ID
   */
  def targetingTemplateUpdate(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PATCH, baseUrl, "/ad_accounts/{ad_account_id}/targeting_templates", "application/json")
      .withBody(targetingTemplateUpdateRequest)
      .withPathParam("ad_account_id", adAccountId)
      .withSuccessResponse[Unit](200)
      .withErrorResponse[Error](400)
      .withDefaultErrorResponse[Error]
      



}

