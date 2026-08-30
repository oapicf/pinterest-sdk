package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_groups_create_200_response_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupsCreate200ResponseItemsInner(
  data: Option[AdGroup],
  exceptions: Option[List[BatchItemException]]
)

object AdGroupsCreate200ResponseItemsInner {
  implicit lazy val adGroupsCreate200ResponseItemsInnerJsonFormat: Format[AdGroupsCreate200ResponseItemsInner] = Json.format[AdGroupsCreate200ResponseItemsInner]
}

