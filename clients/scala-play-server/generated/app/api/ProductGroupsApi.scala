package api

import play.api.libs.json._
import model.AdAccountsCatalogsProductGroupsList200Response
import model.Error

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait ProductGroupsApi {
  /**
    * Get catalog product groups
    * This endpoint is completely deprecated. Please use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/catalogs_product_groups/list&#39;&gt;List product groups&lt;/a&gt; from Catalogs API instead.
    * @param adAccountId Unique identifier of an ad account.
    * @param feedProfileId The feed profile id whose catalog product groups we want to return.
    */
  def adAccountsCatalogsProductGroupsList(adAccountId: String, feedProfileId: Option[String]): AdAccountsCatalogsProductGroupsList200Response
}
