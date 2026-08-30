package api

import play.api.libs.json._
import model.CustomerList
import model.CustomerListCreate
import model.CustomerListUpdateWithRequiredBody
import model.CustomerListsList200Response
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
trait CustomerListsApi {
  /**
    * Create customer lists
    * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
    */
  def customerListsCreate(adAccountId: String, customerListCreate: CustomerListCreate): CustomerList

  /**
    * Get customer list
    * Gets a specific customer list given the customer list ID.
    * @param customerListId Customer list ID.
    */
  def customerListsGet(adAccountId: String, customerListId: String): CustomerList

  /**
    * Get customer lists
    * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    * @param bookmark Cursor used to fetch the next page of items
    * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items.
    * @param excludeNca When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
    */
  def customerListsList(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], order: Option[PaginationOrder], excludeNca: Option[Boolean]): CustomerListsList200Response

  /**
    * Update customer list
    * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    * @param customerListId Customer list ID.
    */
  def customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody): CustomerList
}
