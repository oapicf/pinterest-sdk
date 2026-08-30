package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RelatedTermsRelatedTermsListItems.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RelatedTermsRelatedTermsListItems(
  relatedTerms: Option[List[String]],
  term: Option[String]
)

object RelatedTermsRelatedTermsListItems {
  implicit lazy val relatedTermsRelatedTermsListItemsJsonFormat: Format[RelatedTermsRelatedTermsListItems] = Json.format[RelatedTermsRelatedTermsListItems]
}

