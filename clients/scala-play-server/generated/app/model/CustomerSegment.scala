package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CustomerSegment.
  * @param adAccountId The ID of the ad account that this customer segment belongs to.
  * @param audienceIds Audience IDs included in the customer segment.
  * @param createdTime Customer segment created time. Unix timestamp in seconds.
  * @param id Customer segment ID.
  * @param name Customer segment name.
  * @param status Indicates whether the customer segment is active or deleted.
  * @param updatedTime Customer segment updated time. Unix timestamp in seconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerSegment(
  adAccountId: Option[String],
  audienceIds: List[String],
  createdTime: Option[Int],
  id: Option[String],
  name: String,
  status: Option[TargetingTemplateStatus],
  updatedTime: Option[Int]
)

object CustomerSegment {
  implicit lazy val customerSegmentJsonFormat: Format[CustomerSegment] = Json.format[CustomerSegment]
}

