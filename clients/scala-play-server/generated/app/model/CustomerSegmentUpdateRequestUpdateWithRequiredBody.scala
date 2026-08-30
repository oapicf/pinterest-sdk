package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param audienceIds Audience IDs to update the customer segment to. Only applicable for UPDATE operations.
  * @param id Customer segment ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerSegmentUpdateRequestUpdateWithRequiredBody(
  audienceIds: Option[List[String]],
  id: String,
  operationType: AudienceUpdateOperationType
)

object CustomerSegmentUpdateRequestUpdateWithRequiredBody {
  implicit lazy val customerSegmentUpdateRequestUpdateWithRequiredBodyJsonFormat: Format[CustomerSegmentUpdateRequestUpdateWithRequiredBody] = Json.format[CustomerSegmentUpdateRequestUpdateWithRequiredBody]
}

