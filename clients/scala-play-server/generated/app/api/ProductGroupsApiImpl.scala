package api

import model.AdAccountsCatalogsProductGroupsList200Response
import model.Error

/**
  * Provides a default implementation for [[ProductGroupsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
class ProductGroupsApiImpl extends ProductGroupsApi {
  /**
    * @inheritdoc
    */
  override def adAccountsCatalogsProductGroupsList(adAccountId: String, feedProfileId: Option[String]): AdAccountsCatalogsProductGroupsList200Response = {
    // TODO: Implement better logic

    AdAccountsCatalogsProductGroupsList200Response(List.empty[CatalogProductGroup], None)
  }
}
