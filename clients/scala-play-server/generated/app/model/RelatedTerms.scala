package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RelatedTerms.
  * @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
  * @param relatedTermCount Total number of related terms returned
  * @param relatedTermsList The id of the advertiser.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RelatedTerms(
  id: Option[String],
  relatedTermCount: Option[Int],
  relatedTermsList: Option[List[RelatedTermsRelatedTermsListInner]]
)

object RelatedTerms {
  implicit lazy val relatedTermsJsonFormat: Format[RelatedTerms] = Json.format[RelatedTerms]
}

