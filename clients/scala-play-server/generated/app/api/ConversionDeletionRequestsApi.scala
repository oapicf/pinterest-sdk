package api

import play.api.libs.json._
import model.ConversionDeletionRequest
import model.ConversionDeletionRequestCreate
import model.ConversionDeletionRequestList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait ConversionDeletionRequestsApi {
  /**
    * Create a conversion deletion request
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestCreate(adAccountId: String, conversionDeletionRequestCreate: ConversionDeletionRequestCreate): ConversionDeletionRequest

  /**
    * Delete a conversion deletion request
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
    * @param requestId Unique identifier of the conversion deletion request
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestDelete(requestId: String, adAccountId: String): ConversionDeletionRequest

  /**
    * Get a single conversion deletion request
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
    * @param requestId Unique identifier of the conversion deletion request
    * @param adAccountId Unique identifier of an ad account.
    */
  def conversionDeletionRequestGet(requestId: String, adAccountId: String): ConversionDeletionRequest

  /**
    * List conversion deletion requests
    * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
    * @param adAccountId Unique identifier of an ad account.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    */
  def conversionDeletionRequestList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder]): ConversionDeletionRequestList200Response
}
