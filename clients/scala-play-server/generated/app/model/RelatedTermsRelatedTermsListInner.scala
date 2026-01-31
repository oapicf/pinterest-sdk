package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RelatedTerms_related_terms_list_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RelatedTermsRelatedTermsListInner(
  term: Option[String],
  relatedTerms: Option[List[String]]
)

object RelatedTermsRelatedTermsListInner {
  implicit lazy val relatedTermsRelatedTermsListInnerJsonFormat: Format[RelatedTermsRelatedTermsListInner] = Json.format[RelatedTermsRelatedTermsListInner]
}

