package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerResultsResponseArray_items_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdatePartnerResultsResponseArrayItemsInner(
  exception: Option[BusinessAccessError],
  memberOrPartnerId: Option[String]
)

object UpdatePartnerResultsResponseArrayItemsInner {
  implicit lazy val updatePartnerResultsResponseArrayItemsInnerJsonFormat: Format[UpdatePartnerResultsResponseArrayItemsInner] = Json.format[UpdatePartnerResultsResponseArrayItemsInner]
}

