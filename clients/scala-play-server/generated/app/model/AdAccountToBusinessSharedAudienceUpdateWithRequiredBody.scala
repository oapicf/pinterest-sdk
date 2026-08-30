package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param audienceId Unique identifier of an audience
  * @param recipientBusinessIds Business IDs to share with or revoke from (request) / that received the audience (response).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody(
  audienceId: String,
  operationType: OperationType,
  recipientBusinessIds: List[String]
)

object AdAccountToBusinessSharedAudienceUpdateWithRequiredBody {
  implicit lazy val adAccountToBusinessSharedAudienceUpdateWithRequiredBodyJsonFormat: Format[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] = Json.format[AdAccountToBusinessSharedAudienceUpdateWithRequiredBody]
}

